import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public static void main(String[] args) {
        String ransomNote = "aabb";
        String magazine = "aabbc";
        Solution solution = new Solution();
        boolean result = solution.canConstruct(ransomNote, magazine);
        System.out.println(result);
    }
}

/**
 * Calculate if magizne string can construct ransomNote string.
 * 
 * @param  Two strings ransomNote and magazine.
 * @return True if ransomNote can be constructed by using the letters from magazine and false otherwise.
 */
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> magazineMap = new HashMap<>();

        for (char c : magazine.toCharArray()) {
            magazineMap.put(c, magazineMap.getOrDefault(c, 0) + 1);
        }

        for (char c : ransomNote.toCharArray()) {
            if (!magazineMap.containsKey(c) || magazineMap.get(c) <= 0) {
                return false;
            }
            magazineMap.put(c, magazineMap.get(c) - 1);
        }

        return true;
    }
}
