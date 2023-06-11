// Using stack falling

class recursion_q1{
    static int pow(int base, int exp){
        if(exp != 0){
            return base * pow(base, exp-1);
        }
        else{
            return 1;
        }
    }
    
    public static void main(String[] args) {
        int base = 2;
        int exp = 5;
        int res = pow(base, exp);
        System.out.println(res);
    }
}