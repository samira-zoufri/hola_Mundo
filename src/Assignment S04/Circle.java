
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
    public String toString() {
        return "Circle[radius=" + this.radio + " color=" + this.color + "]";
    }

    public void setRadio(float radioNuevo){
        this.radio = radioNuevo;
    }
}