class Solution {
    public int firstUniqChar(String s) {
        int[] counter = new int[26];
        for (char ch : s.toCharArray()) {
            ++counter[ch - 'a'];
        }
        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            if (counter[ch - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}
