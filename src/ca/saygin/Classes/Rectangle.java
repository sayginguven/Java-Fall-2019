package ca.saygin.Classes;

public class Rectangle extends Shape{

    private double height;
    private double width;

    @Override
    public double area(){
        return height*width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double perimeter(){
        return 2 * (height + width);
    }
}
