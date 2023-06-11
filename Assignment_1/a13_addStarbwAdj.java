public class a13_addStarbwAdj {

    static String insertStar(String str) {
        if (str.length() == 1) {
            return "";
        }
        String s = insertStar(str.substring(1));
        if (str.charAt(0) == str.charAt(1)) {
            s = str.charAt(0) + "*" + str.charAt(1) + s;
        }
        return s;
    }

    public static void main(String[] args) {
        String s = "aabbcc";
        System.out.println(insertStar(s));

    }
}
