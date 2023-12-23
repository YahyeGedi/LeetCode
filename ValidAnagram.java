import java.util.*;

class Solution {
    public boolean isAnagram(String s, String t) {

        if (t.length() != s.length()) {
            return false;
        }

        HashMap<Character, Integer> arr = new HashMap<>();
        HashMap<Character, Integer> arr2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            arr.put(s.charAt(i), arr.getOrDefault(s.charAt(i), 0) + 1);
            arr2.put(t.charAt(i), arr2.getOrDefault(t.charAt(i), 0) + 1);
        }

        return arr.equals(arr2);
    }
}