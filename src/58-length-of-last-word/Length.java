public class Length {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.lengthOfLastWord("   fly me   to   the moon  ");
        System.out.println(result);
    }
}

/**
 * Calculates the length of the last word.
 * 
 * @param An string.
 * @return the lenght of the word.
 */
class Solution {
    public int lengthOfLastWord(String s) {
        int length;
        s.trim();

        String[] words = s.split("\\s+");
        String[][] wordsArrays = new String[words.length][];

        // Preencher os arrays de strings com cada palavra
        for (int i = 0; i < words.length; i++) {
            wordsArrays[i] = new String[]{words[i]};
        }

        String lastWord = wordsArrays[wordsArrays.length -1][0];
        length = lastWord.length();
        return length;
    }
}