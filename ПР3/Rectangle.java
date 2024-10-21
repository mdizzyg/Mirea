package ПР3;

public class Rectangle extends Shape {
    protected double width, length;

    public Rectangle(double side){
        super();
        length = 0;
        width = 0;
    }

    public  Rectangle(String colour, boolean filled, double width, double lenght){
        super(colour, filled);
        this.width = width;
        this.length = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getLenght(){
        return length;
    }

    public double getLength(){
        return length;
    }

    public void setLength(double lenght){
        this.length = lenght;
    }

    @Override
    public double getArea(){
        return width * length;
    }

    @Override
    public double getPerimeter(){
        return 2 * (width + length);
    }

    @Override
    public String toString(){
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", colour='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }



}
