package Exercise_2;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(15.0,"Blue", true);
        Circle c2 = new Circle();

        Rectangle r1 = new Rectangle(15.0, 15.0, "Red", false);
        Rectangle r2 = new Rectangle();

        Square s1 = new Square(10.0);
        Square s2 = new Square(20.0, "Cyan", true);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(" ");
        System.out.println("Area of c1 = " +  c1.getArea() + " Perimeter of c1 = " + c1.getPerimeter());
        System.out.println("Area of c2 = "+ c2.getArea() + " Perimeter of c2 = " + c2.getPerimeter());
        System.out.println(" ");
        System.out.println("Area of r1 = " +  r1.getArea() + " Perimeter of c1 = " + r1.getPerimeter());
        System.out.println("Area of r2 = "+ r2.getArea() + " Perimeter of c2 = " + r2.getPerimeter());
        System.out.println(" ");
        System.out.println("Area of s1 = " +  s1.getArea() + " Perimeter of c1 = " + s1.getPerimeter());
        System.out.println("Area of s2 = "+ s2.getArea() + " Perimeter of c2 = " + s2.getPerimeter());
    }
}
