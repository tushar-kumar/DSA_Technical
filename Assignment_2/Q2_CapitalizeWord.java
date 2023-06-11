// Write recursive function that takes an array of words and returns an array containing all words capitalized
// i/p : ["foo", "bar", "world"]
// o/p : ["FOO", "BAR", "WORLD"]


public class Q2_CapitalizeWord {

    static String[] toCapitalize(String[] s,int n){
        if(n==0){
            return s;
        }
        String a=s[n-1];
        String[] r=toCapitalize(s,n-1);
        r[n-1]=a.toUpperCase();
        return r;
    }
    public static void main(String[] args) {
        String[] str={"hello","new","world"};
        String[] b=toCapitalize(str,str.length);
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+" ");
        }
    }
}
