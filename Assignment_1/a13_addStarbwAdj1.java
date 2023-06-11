public class a13_addStarbwAdj1 {

    static void insertStar(String str, String newValue) {
        if (str.length() == 1) {
            System.out.println("New String: " + newValue);
            return;
        }
        String s = str.substring(0, 2);
        if (s.charAt(0) == s.charAt(1)) {
            newValue = newValue + s.charAt(0) + "*" + s.charAt(1);
        }
        insertStar(str.substring(1, str.length()), newValue);
    }

    public static void main(String[] args) {
        String s = "aabbcc";
        insertStar(s, "");

    }
}
