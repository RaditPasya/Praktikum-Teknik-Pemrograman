package Exercise_2;

public class Circle extends Shape{
    private double radius;

    public Circle(){
        super();
        this.radius = 1.0;
    }

    public Circle(double radius){
        super();
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

// Getter and Setter of radius
    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
//End of Getter and Setter

//Get area of circle
    public double getArea(){
            return (radius*radius*Math.PI);
        }
//Get Perimeter of Circle
    public double getPerimeter(){
            return (2 * Math.PI * radius);
        }

    @Override
    public String toString(){
        return "A circle with radius = " + getRadius() + ", which is a sublcass of " + super.toString();
    }
}
