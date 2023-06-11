// Using stack building

public class q3_sumofN {
    static int count = 0;
    static void sumN(int n){
        if (n<=0) {
            return;
        }
        count += n;
        sumN(n-1);
    }
    public static void main(String[] args) {
        int n = 8;
        sumN(n);
        System.out.println(count);
    }
}
