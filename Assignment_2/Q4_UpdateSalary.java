// Given is an Array of Employee Salary, add the tax 10% in each salary and return the new array which contains (salary + tax).

public class Q4_UpdateSalary {

    static double[] updateSalary(double[] arr,int n){
        if(n==0){
            return arr;
        }
        double x=arr[n-1];
       double[] r= updateSalary(arr, n-1);
       r[n-1]=x+x*0.1;
       return r;
    }
    public static void main(String[] args) {
        double salary[]={1200,2200,6500,1900};
        double [] newSalary=updateSalary(salary, salary.length);
        for (int i = 0; i < newSalary.length; i++) {
            System.out.print(newSalary[i]+" ");
        }
    }
}
