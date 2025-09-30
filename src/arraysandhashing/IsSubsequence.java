package arraysandhashing;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) {
            return true;
        }

        int right = 0;
        int left = 0;
        String res = "";

        while (right < s.length() && left < t.length()) {
            if (left < t.length() && s.charAt(right) == t.charAt(left)) {
                res += t.charAt(left);
                right++;
            }
            left++;
        }
        System.out.println(res);
        return res.equals(s);

        int i = 0;
        int j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }

        return i == s.length();
    }
}
