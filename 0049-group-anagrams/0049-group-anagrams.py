class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        dict1 = defaultdict(list)

        for i in strs :

            key = "".join(sorted(i))

            dict1[key].append(i)

        list1 = list(dict1.values())

        return list1