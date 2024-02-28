package Shape.Shape;

public class Circle extends Shape{
    protected double radio;

    public Circle(){
        super();
        this.radio = 1;

    }
    public Circle(double radio, String color, boolean filled){
        super(color, filled);
        this.radio =radio;

    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double getArea(){
        return Math.PI*this.radio*this.radio;
    }
    public double getPerimeter(){
        return 2*Math.PI*this.radio;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
