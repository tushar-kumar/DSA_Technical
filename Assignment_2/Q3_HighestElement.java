// Find the Highest Element in an Array 

public class Q3_HighestElement {
    static int highestElement(int[] a,int n){
        if(n==0){
            return a[n];
        }
        int x=a[n-1];
       int max= highestElement(a,n-1);
       if(max<x){
        max=x;
       }
       return max;
    }
    public static void main(String[] args) {
        int[] arr={10,50,20,15,0};
        System.out.println(highestElement(arr,arr.length));
        
    }
}
