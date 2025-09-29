package arraysandhashing;

public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();

        int i = 0;
        int j = 0;

        while (i < word1.length() && j < word2.length()) {
            sb.append(word1.charAt(i++));
            sb.append(word2.charAt(j++));
        }

        sb.append(word1.substring(i));
        sb.append(word2.substring(j));

        return sb.toString();

        boolean alternate = true;
        String res = "";
        int right = 0;
        int left = 0;

        int length = Math.max(word1.length(), word2.length());

        while (right < word1.length() || left < word2.length()) {
            if (right < word1.length() && alternate) {
                res += word1.charAt(right);
                right++;
            }

            if (left < word2.length() && !alternate) {
                res += word2.charAt(left);
                left++;
            }

            alternate = !alternate;
        }

        return res;
    }
}
