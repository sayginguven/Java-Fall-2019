package ca.saygin.Classes.Classroom;

public class Chair {

    private MyDimension dimension;
    private Physical phical;
    private String material;
    private boolean isOccupied;

    public Chair(){
        this.dimension = new MyDimension();
        this.phical = new Physical();
        this.material = "plastic";
        this.isOccupied = false;
    }

    public Chair(MyDimension dimension, Physical phical, String material, boolean isOccupied) {
        this.dimension = dimension;
        this.phical = phical;
        this.material = material;
        this.isOccupied = isOccupied;
    }

    public MyDimension getDimension() {
        return dimension;
    }

    public void setDimension(MyDimension dimension) {
        this.dimension = dimension;
    }

    public Physical getPhical() {
        return phical;
    }

    public void setPhical(Physical phical) {
        this.phical = phical;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public void sit(){

        if(!isOccupied ){
            System.out.println("you sit");
            isOccupied = true;
        } else{
            System.out.println("the chair is not empty, you can not sit");
            isOccupied = false;
        }

    }
}
