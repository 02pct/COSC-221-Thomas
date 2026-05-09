package p.project027;

public class Project027 {
    
    // separate functions
    
    public static double ArraySum (double A[]) {
        
        double sum = 0;
        for (int i = 0; i<A.length; i++) {
            sum += A[i];
        }
        return sum;
    }
    
    public static double ArrayMean (double A[]) {
        
        double mean = ArraySum(A)/A.length;
        return mean;
    }
    
    public static double ArrayVar(double A[]) {
        
        double variance = 0;
        double mean = ArrayMean(A);
        for (double a:A) {
            variance +=(a - mean)*(a - mean);
        }
        
        return variance;
    }
    
    public static double ArrayStd (double A[]) {
        return Math.sqrt(ArrayVar(A));
    }
    
    public static void ModifyArray1(double A[]) {
        int i = 0;
        for (double a:A) {
            A[i] = a*2;
            i++;
        }
    }
   
    public static void main(String[] args) {
        
        // students grades with regular for loop
        double X[] = {85,79,93,89,76,79,87,94,95,83,67,92};
        // in the for loop is the length of the array...uses x.length
        /*
        for (int i = 0; i<x.length; i++) {
            System.out.format("x%d = %f\n",i,x[i]);
        } */
        
        // advanced for loop for printing
        /*
        int i = 0;
        for (double x:X) {
            System.out.format("X%d\t%f\n",i, x);
            i++;
        } */
        
        // function calls and printing
        /*
        double sum = ArraySum(X);
        double mean = ArrayMean(X);
        double variance = ArrayVar(X);
        double std = ArrayStd(X);
        */
        System.out.format("n=%d \n",X.length);
        System.out.format("Variance: %f\nStd dev: %f\n", ArrayVar(X), ArrayStd(X));
        System.out.format("Sum: %f\nAverage: %f\n", ArraySum(X), ArrayMean(X));
        /*
        System.out.format("n=%d \n",X.length);
        
        // sum and average
        double sum = 0;
        for (int i = 0; i<X.length; i++) {
            sum += X[i];
        }
        
        double mean = sum/X.length;
        System.out.format("Sum: %f\nAverage: %f\n", sum, mean);
        
        // variance and other statistics
        double variance = 0;
        for (double x:X) {
            variance +=(x - mean)*(x - mean);
        }
        variance /= (X.length);
        double std = Math.sqrt(variance);
        System.out.format("Variance: %f\nStd dev: %f\n", variance, std);
        */
    }
}
