public class q2_countzero {
    static int count = 0;
    static void countz(int num){
        if(num == 0)
            return;
        if (num%10 == 0){
            count += 1;
            countz(num/10);
        } 
        else{
            countz(num/10);
        }
    }
    public static void main(String[] args) {
        int num = 1000;
        countz(num);
        System.out.println(count);
    }
}
