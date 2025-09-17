package arraysandhashing;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> mapS = new HashMap<>();
        Map<Character, Character> mapT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);

            if (mapS.containsKey(a) && mapS.get(a) != b) {
                return false;
            }

            if (mapT.containsKey(b) && mapT.get(b) != a) {
                return false;
            }

            mapS.put(s.charAt(i), t.charAt(i));
            mapT.put(t.charAt(i), s.charAt(i));

        }
        return true;
    }
}
