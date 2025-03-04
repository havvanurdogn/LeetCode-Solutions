class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        
        list1 = list(s)
        list1.sort()

        list2 = list(t)
        list2.sort()

        if list1 != list2 :
            return False

        return True

        