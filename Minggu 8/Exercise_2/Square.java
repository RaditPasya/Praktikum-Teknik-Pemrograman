package Exercise_2;

public class Square extends Rectangle {

    public Square(){
        super();
    }

    public Square(double side){
        super(side, side);
    }
    
    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }
    //override of set width and setlength
    @Override

    public void setWidth(double side){
        super.setWidth(side);
        super.setLength(side);
    }

    public void setLength(double side){
        super.setWidth(side);
        super.setLength(side);
    }
    //end of override of set width and setlength

    //dont need getArea nor getPerimeter since they are the same shape 

    //override of toString
    @Override
    public String toString(){
        return "A Square with side = " + getLength() +", which is a subclass of "+ super.toString();
    }
}
