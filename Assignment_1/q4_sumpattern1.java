// Using stack building

public class q4_sumpattern1 {
    static void sum(int n,double res){
        if(n<1){
            System.out.println("Sum "+res);
            return;
        }
        res=res+(n/Math.pow(n,n));
        sum(n-1,res);
    }


    public static void main(String[] args) {
        int num=3;
        sum(num,0);//2nd
    }
    
}
