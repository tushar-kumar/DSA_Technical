// Using stack building

public class recr_q1_2 {
    static void pow(int base, int exp, int res){
        // int res = base;
        if (exp == 1){
            System.out.println(res);
        }
        else{
            // res = res * base;
            // System.out.println(res);
            pow(base,exp-1,res*base);
            
        }
    }
    public static void main(String[] args) {
        int base = 3;
        int exp = 3;
        int res = base;
        pow(base, exp, res);
        
    }
}
