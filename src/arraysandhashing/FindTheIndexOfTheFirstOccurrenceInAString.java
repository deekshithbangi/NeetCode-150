package arraysandhashing;

public class FindTheIndexOfTheFirstOccurrenceInAString {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);

//        for(int i = 0; i <= haystack.length() - needle.length(); i++) {
//            if (haystack.substring(i, i + needle.length()).equals(needle)) {
//                return i;
//            }
//        }
    }
}