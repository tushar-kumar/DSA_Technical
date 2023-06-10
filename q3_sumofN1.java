public class q3_sumofN1 {
    static int sumN(int n){
        if(n > 0){
            return n + sumN(n-1);
        }
        return 0;
    }
    public static void main(String[] args) {
        int n = 9;
        System.out.println(sumN(n)); 
    }    
}
