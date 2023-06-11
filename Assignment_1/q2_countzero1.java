// Using stack falling

public class q2_countzero1 {
    static int countz(int num){
        if(num == 0)
            return 0;
        int res=countz(num/10);
        if(num%10==0){
        res=res+1;}
        return res;
    }
    public static void main(String[] args) {
        int num = 101203000;
        System.out.println(countz(num));
    }
}
