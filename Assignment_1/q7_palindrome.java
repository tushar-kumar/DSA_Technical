// Using stack falling

public class q7_palindrome {
    static String reverse(String str){
        if(str.length()==1){
            return str;
        }

       String res= reverse(str.substring(1));
       return res+str.charAt(0);
    }
    public static void main(String[] args) {
        String s="ababa";
        System.out.println(reverse(s).equals(s)?"Yes":"No");//1st
    }

}
