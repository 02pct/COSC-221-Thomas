package p.project015;
import java.util.*;

public class Triangle {
    //double a, b;   
    private double a,b;
    
    
    // public function that passes through inputs
    public Triangle(double a1, double b1) {
        a = a1;
        b = b1;
    }
    
    public double get_a() {
        return a;
    }
    
    public double get_b() {
        return b;
    }
    
    public void set_a(double value) {
        a = value;
    }
    
    public void set_b(double value) {
        b = value;
    }
    
    
    /*
    // control for negative term
    public void set_a(double value) {
        a = Math.max(value, 0);
    }
    
    public void set_b(double value) {
        b = Math.max(value, 0);
    }
    // another way to control for negative term
    public void set_a(double value) {
        a = Math.abs(value, 0);
    }
    
    public void set_b(double value) {
        b = Math.abs(value, 0);
    }
    
    */
    
    // public void function to print out function
    public void PrintInfo() {
        System.out.println("Triangle: ");
        //System.out.format("a = %f, b = %f\n", a, b);
        System.out.format("Area: S = %f\n", Area());
        double c = get_c();
        System.out.format("Sides: a = %f, b = %f, c = %f\n", a, b, c);
        System.out.format("Perimeter: P = %f\n", Perimeter());
    }
    
    public double get_c(){
        double c = Math.sqrt(a*a + b*b);
        return c;
    }
 
    public double Area() {   
        return (a*b)/2;
    }
    
    public double Perimeter() {
        double c = get_c();
        return a+b+c;
    }
    
}
