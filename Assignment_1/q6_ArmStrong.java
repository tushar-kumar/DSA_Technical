// Using stack falling

public class q6_ArmStrong {

    static int armstrongN(int num){
        if(num==0){
            return 0;
        }
       int res= armstrongN(num/10);
       int x=num%10;
       res=res+(int)(Math.pow(x,3));
       return res;
       
    }


    public static void main(String[] args) {
        int n=153;
        System.out.println(armstrongN(n)==n?"Yes":"No");
    }
    
}
