public class q5_prime1 {
    
    static void checkPrime(int num,int c,boolean res){
       if(c<2){
        System.out.println("Prime");
        return;
       }
       if(num%c==0){
        res=true;
        System.out.println("Not a Prime");
        return;
       }
        checkPrime(num, c-1, res);

    }
    public static void main(String[] args) {
        int n=12;
        checkPrime(n,n-1, false);

    }

}
