public class q10_searchIndexes {
    static int[] search(int []arr,int n,int v,int c){
        if(n==arr.length){
            int a[]=new int[c];
            return a;
        }
        if(arr[n]==v){
            c++;
        }
        int [] b=search(arr, n+1, v,c);
        if(arr[n]==v){
            b[c-1]=n;
        }
        return b;
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
        
        int ans[]=search(a,0,10,0);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
