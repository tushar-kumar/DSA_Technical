public class q2_countzero1 {
    static int count = 0;
    static int countz(int num){
        if(num == 0)
            return count;
        if (num%10==0) {
            count += 1;
            return countz(num/10);
        } else {
            return countz(num/10);
        }
    }
    public static void main(String[] args) {
        int num = 101203000;
        System.out.println(countz(num));
    }
}
