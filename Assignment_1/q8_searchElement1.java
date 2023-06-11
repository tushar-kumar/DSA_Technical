// Using stack building
// Search Element in Array from last

public class q8_searchElement1 {
    static void search(int []arr,int n,int v){
        if(n<0){
            System.out.println("not found");
            return ;
        }
        if(arr[n]==v){
            System.out.println("Found the element ");
            return;
        }
        search(arr, n-1, v);
    }
    public static void main(String[] args) {
        int [] a={10,20,30,40,50,60};
        search(a,a.length-1, 120);
        
    }
}
