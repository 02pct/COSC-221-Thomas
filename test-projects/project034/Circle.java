package p.project034;
// circle is a subclass of shape...
public class Circle extends Shape {
    
    private double radius;
    
    // say super intead of the class itself, when referring to it
    public Circle() {
        super();
        this.radius = 0;
    }
    
    public Circle(double r) {
        super();
        this.radius = r;
    }
    
    public Circle(double r, String color, boolean filled) {
        super(color, filled);
        this.radius = r;
    }
    
    public double getRadius() {
        return this.radius;
    }
    
    public void setRadius(double r) {
        this.radius = r;
    }
    
    public double getArea() {
        return Math.PI*this.radius*this.radius;
    }
    
    public double getPerimeter() {
        return 2*Math.PI*this.radius;
    }
    
}
