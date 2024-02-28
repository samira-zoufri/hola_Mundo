package Shape.Shape;

public class Square extends Rectangle {

    public Square() {

    super();
}


public Square(double side){
        super(side,side);
}

public Square(double side, String color, Boolean filled){
        super(side, side,color, filled);
}

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }
    public double getSide(){
        return this.length;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
