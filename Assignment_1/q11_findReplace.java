public class q11_findReplace {
    // 1st way
    static int[] replace(int [] arr,int n,int v,int newValue){
        if(n<0){
            return arr;
        }
        int []b=replace(arr, n-1, v, newValue);
        if(b[n]==v){
            b[n]=newValue;
        }
        return b;
    }
    public static void main(String[] args) {
        int [] a={10,20,10,30,10,40};
        a=replace(a, a.length-1, 10, 5);//1st
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
