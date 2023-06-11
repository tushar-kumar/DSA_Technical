// Using stack building

public class q6_ArmStrong1 {
    
    static void armstrongN(int num,int res,int i){
        if(num==0){
            System.out.println(i==res?"Yes, it is an Armstrong Number":"No");
            return;
        }
        int x=num%10;
        res=res+(int)(Math.pow(x, 3));
        armstrongN(num/10, res,i);
    }
    public static void main(String[] args) {
        int n=153;
        armstrongN(n, 0,n);
    }
    
}
