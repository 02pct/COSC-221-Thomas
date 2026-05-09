package p.project034;

public class Project034 {

    public static void main(String[] args) {
        Shape shape1 = new Shape("Yellow", true);
        Shape shape2 = new Shape("Pink", false);
        Circle circle1 = new Circle(10, "Blue", false);
        Circle circle2 = new Circle(4, "Red", true);
        //Rectangle rect1 = new Rectangle(3, 4, "Green", true);
        //Rectangle rect2 = new Rectangle(2, 5, "Cyan", false);
        
        //new instance
        //Shape sh = new Rectangle();
        
        //then assign to a new circle instance? object?
        //sh = new Circle();
        
        System.out.format("shape1:\n%s\n\n", shape1);
        System.out.format("shape2:\n%s\n\n", shape2);
        System.out.format("circle1:\n%s\n\n", circle1);
        System.out.format("circle2:\n%s\n\n", circle2);
        //System.out.format("rect1:\n%s\n\n", rect1);
        //System.out.format("rect2:\n%s\n\n", rect2);
        
    }
}
