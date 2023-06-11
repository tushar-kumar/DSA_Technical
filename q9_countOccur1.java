public class q9_countOccur1 {

    static void count(int []arr,int n,int v,int c){
        if(n<0){
            System.out.println("Number of times "+v+" occures in given array are: "+c);
            return ;
        }
        if(arr[n]==v){
            c++;
        }
        count(arr, n-1, v,c);
    }
    public static void main(String[] args) {
        int [] a={10,20,10,30,10};
        count(a, a.length-1, 20,0); 
        
    }
}
