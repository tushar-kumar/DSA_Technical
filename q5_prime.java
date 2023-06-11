public class q5_prime {
    static boolean checkPrime(int n,int c){
        if(c<2){
            return true;
        }
        boolean res=checkPrime(n, c-1);
        if(n%c==0){
            res=false;
        }
        return res;
    }
    
    public static void main(String[] args) {
        int n=11;
        System.out.println(checkPrime(n, n-1)?"Prime":"Not a Prime");//1st
    }

}
