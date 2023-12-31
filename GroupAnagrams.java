import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String string : strs) {
            char[] sortedword = string.toCharArray();
            Arrays.sort(sortedword);
            String sortedString = new String(sortedword);

            if (map.containsKey(sortedString)) {
                map.get(sortedString).add(string);
            } else {
                map.put(sortedString, new ArrayList<>());
                map.get(sortedString).add(string);
            }
        }
        return new ArrayList<>(map.values());
    }
}