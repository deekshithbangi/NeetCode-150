package arraysandhashing;

import java.util.Stack;

public class BackspaceStringCompare {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stackS = new Stack<>();
        Stack<Character> stackT = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#' && !stackS.isEmpty()) {
                stackS.pop();
            } else if (s.charAt(i) != '#'){
                stackS.add(s.charAt(i));
            }
        }

        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == '#' && !stackT.isEmpty()) {
                stackT.pop();
            } else if (t.charAt(i) != '#'){
                stackT.add(t.charAt(i));
            }
        }
        return stackS.equals(stackT);
    }
}
