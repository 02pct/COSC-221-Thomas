package project029;
import java.util.Arrays;
// coverting arrays to unicode string now?? ascii??

public class Project029 {

    public static void main(String[] args) {
        double [] A = {10, 25, 50, 35, 90, 18, 25, 75, 35};
        double [] B = Arrays.copyOf(A, A.length + 5);
        double [] C = A;
        System.out.print("Array before sort:\n");
        System.out.format("A={%s}\n", Arrays.toString(A));
        // sorting it out bc we wan it klean
        Arrays.sort(A);
        System.out.print("Array after sort:\n");
        System.out.format("A=%s\n",Arrays.toString(A));
        System.out.print("Array after adding 0's:\n");
        System.out.format("B=%s\n", Arrays.toString(B));
        System.out.print("Array C:\n");
        System.out.format("C=%s\n", Arrays.toString(C));
        
        // we trying to find da num
        
        double a = 35;
        int index = Arrays.binarySearch(A, a);
        System.out.format("A[%d] = %f\n", index, a);

    }
    
}
