package arraysandhashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        if (pattern.length() != s.split(" ").length)
            return false;

        Map<Character, String> map = new HashMap<>();
        List<String> list = new ArrayList<>();

        for(String str : s.split(" ")) list.add(str);

        int i = 0;
        while (i < pattern.length()) {
            if (!map.containsValue(list.get(i))) {
                map.putIfAbsent(pattern.charAt(i), list.get(i));
            }
            if (map.containsKey(pattern.charAt(i))) {
                if (!map.get(pattern.charAt(i)).equals(list.get(i))) return false;
            } else return false;
            i++;
        }
        System.out.println(map);
        return true;
    }
}
