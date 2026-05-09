package project032;

public class Project032 {

    public static void main(String[] args) {
        
        // 
        try {
            int a[] = new int [6];
            a[6] = 8;
            int i = 7;
            int j = 0;
            int k = i/j;
            System.out.format("Output is " + k + "\n");
        } // end of try
        // implementing exceptions
        catch (ArithmeticException ex) {
            System.err.println("Arithmetic Error");
        } // end of catch 1
        // we use exception ex if we have a generic/basic exception
        catch (ArrayIndexOutOfBoundsException ex) {
                System.err.println("The index must be less than 6");
        } // end of catch 2
        catch (Exception ex) {
                System.err.println("Something went wrong");
        } // end of catch 3
        // a marker or smthn
        finally {
            System.out.println("Hasta Luego!");
        }
        
    } // end of main
    
    // function to divide
    public static int Divide(int a, int b) {
        return a/b;
    }
}
