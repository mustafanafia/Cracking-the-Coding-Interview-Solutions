
public class Main {
    public static void main(String[] args) {
        String s = "ABC";
        String t = "CBA";

        System.out.println(permutation(s,t));
    }

    static boolean permutation(String s, String t){
        if(s.length() != t.length()) {
            return false;
        }
        return sort(s).equals(sort(t));
    }

    private static String sort(String str) {
        char[] content = str.toCharArray();
        java.util.Arrays.sort(content);
        return new String(content);
    }
}