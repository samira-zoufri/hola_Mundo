package Shape.Shape;

import EjerciciosHerencias.Personas.Person;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle(){
        super();
        this.length = 1;
        this.width = 1;
    }

    public Rectangle(double width, double length){
        super();
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, Boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;

    }
    public  double getArea(){
        return this.width * this.length;
    }
    public double getPerimeter(){
        return 2*(this.length +this.width);
    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
