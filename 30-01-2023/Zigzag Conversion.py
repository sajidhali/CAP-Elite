class Solution:
    
    def check_m(self, m, r, e):
        if r not in m:
            m[r] = e
        else:
            m[r] += e
        
    def convert(self, s: str, numRows: int) -> str:
        if numRows == 1:
            return s
        m = {}
        r = 0
        diagonal = False
        result = ""
        for i in range(len(s)):
            if r == numRows:
                diagonal = True
                r -= 2
                self.check_m(m, r, s[i])
                    
                if r - 1 >= 0:
                    r -= 1
                else:
                    r += 1
                    diagonal = False
            else:
                if diagonal:
                    self.check_m(m, r, s[i])
                    if r == 0:
                        diagonal = False
                        r += 1
                    else:
                        r -= 1
                else:
                    self.check_m(m, r, s[i])
                    r += 1
        
        for key in m:
            result += m[key]
        return result
    
