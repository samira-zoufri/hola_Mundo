
public class Circle {

    private double radio;
    private String color;

    public Circle (){
        this.radio = 1.0;
        this.color = "Azul";
    }
    public Circle(float radio, String color ) {
        this.radio = radio;
        this.color = color;

    }

    public double getRadio() {
        return this.radio;
    }

    public double getArea() {
        return Math.PI*this.radio*this.radio;
    }
}