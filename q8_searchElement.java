// Search Element in Array from last

public class q8_searchElement{
    static int search(int [] arr,int n,int v){
        if(n<0){
            return -1;
        }
        int r=search(arr, n-1, v);
        if(arr[n]==v){
            r=n;
        }
        return r;
    }
    
    public static void main(String[] args) {
        int [] a={10,20,30,40,50,60};
        System.out.println(search(a,a.length-1, 20)>=0?"Yes":"No");
    }
}
