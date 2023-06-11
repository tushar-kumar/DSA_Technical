// Using stack falling
// 1/1^1 + 2/2^2 + 3/3^3 ...

public class q4_sumpattern {
    static double sumP(Double n){
        if (n > 0){
            return n/Math.pow(n, n) + sumP(n-1);
        }
        return 0;
    }
    public static void main(String[] args) {
        double n = 2;
        System.out.println(sumP(n));
    }    
}
