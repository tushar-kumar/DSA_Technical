// Write a recursive function that takes a list of numbers as an input and return product of all numbers in list

public class Q1_ProductOfAllNum {
    static int product(int[] arr,int n){
        if(n==0){
            return 1;
        }
        return arr[n-1] * product(arr, n-1);
    }
    public static void main(String[] args) {
       int[] a={2,2,4,5};
       System.out.println(product(a,a.length));
        
    }
}

