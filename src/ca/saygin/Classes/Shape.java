package ca.saygin.Classes;

public abstract class Shape {

    private String name;

    public abstract double area();
    public abstract double perimeter();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}