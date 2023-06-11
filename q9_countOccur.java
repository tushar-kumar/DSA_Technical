public class q9_countOccur {
    
    static int count(int [] arr,int n, int v){
        if(n<0){
            return 0;
        }
        int c=count(arr, n-1, v);
        if(arr[n]==v){
            c++;
        }
        return c;
    }

    
    
    public static void main(String[] args) {
        int [] a={10,20,10,30,10};
        System.out.println("Number of times "+10+" occures in given array are: "+count(a, a.length-1, 10));
    }
}
