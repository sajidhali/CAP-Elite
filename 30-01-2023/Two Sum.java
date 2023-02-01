class Solution {
	    public int[] twoSum(int[] nums, int target) {
	        HashMap<Integer,Integer> map = new HashMap<>();
	        int[] res = new int[2];
	        for(int i=0;i<nums.length;i++){
	            map.put(nums[i],i);
	        }
	        System.out.print(l);
	        for(int j=0;j<nums.length;j++){
	            int r = target-nums[j];
	            if(map.containsKey(r) && j!=map.get(r)){
	                res[0]=j;
	                res[1]=map.get(r);
	            }
	        }return res;
	    }
	}
