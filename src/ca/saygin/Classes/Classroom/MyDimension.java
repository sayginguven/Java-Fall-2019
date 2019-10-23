package ca.saygin.Classes.Classroom;

public class MyDimension {

    private double length;
    private double width;

    public MyDimension(){
        this(0,0);
    }

    public MyDimension(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
