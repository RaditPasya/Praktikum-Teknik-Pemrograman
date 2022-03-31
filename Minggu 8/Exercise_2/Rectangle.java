package Exercise_2;

public class Rectangle extends Shape {
    private double width;
    private double length;


    // start of constructor
    public Rectangle(){
        super();
        this.width = 1.0;
        this.length = 1.0;
    }

    public Rectangle(double width, double length){
        super();
        this.width = width;
        this.length = length;
    }

    public Rectangle(double widht, double length, String color, boolean filled){
        super(color, filled);
        this.width = widht;
        this.length = length;
    }
    // end of constructor

    // start of getter and setter
    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    // end of getter and setter

    // Get an area of a rectangle
    public double getArea(){
        return (length * width);
    }
    // get a perimeter of a rectangle
    public double getPerimeter(){
        return (2 * length) + (2 * width);
    }

    @Override

    public String toString(){
        return "A Rectangle with width = " + this.width + " and length = " + this.length +", which is a subclass of " + super.toString();
    }
}
