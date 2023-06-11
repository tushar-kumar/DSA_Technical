// Using stack building


public class q7_palindrome1 {
    static void isPalindrome(String str,String actual,String res){
        if(str.length()==0){
            System.out.println(actual.equals(res)?"It is palindrome":"Not a palindrome");
            return;
        }
        res=str.charAt(0)+res;
        isPalindrome(str.substring(1),actual, res);
    }
    public static void main(String[] args) {
        String s="abba";
        isPalindrome(s,s, "");
    }

}
