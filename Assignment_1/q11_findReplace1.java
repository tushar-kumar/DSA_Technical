public class q11_findReplace1 {

    static void search(int []arr,int n,int v,int newValue){
        if(n<0){
            display(arr,0);
            return ;
        }
        if(arr[n]==v){
            arr[n]=newValue;
        }
        search(arr, n-1, v,newValue);
    }
    static void display(int[] arr,int n){
        if(n==arr.length){
            return;
        }
        System.out.print(arr[n]+" ");
        display(arr, n+1);
    }
    public static void main(String[] args) {
        int [] a={10,20,10,30,10,40};
        search(a, a.length-1, 10,5);
        
    }
}
