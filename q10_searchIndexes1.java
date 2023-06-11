public class q10_searchIndexes1 {
    
    static void search(int []arr,int n,int v,int c){
        if(n==arr.length){
           int b[]=new int[c];
            store(arr,n-1,c-1,v,b);
            return ;
        }
        if(arr[n]==v){
            c++;
        }
        search(arr, n+1, v,c);
        
    }
    static void store(int []a,int n,int c,int value,int[] b){
        if(c<0){
            display(b,c+1);
            return;
        }
        if(a[n]==value){
            b[c]=n;
            store(a,n-1,c-1 ,value,b);
        }else{
            store(a,n-1,c,value,b);
        }
        
    }
    static void display(int[] b,int c){
        if(c==b.length){
            return;
        }
        System.out.print(b[c]+" ");
        display(b, c+1);
    }
    public static void main(String[] args) {
        int [] a={10,20,10,20,10,20,20};
    
        search(a, 0, 10, 0);
    }
}
