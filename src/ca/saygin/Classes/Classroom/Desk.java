package ca.saygin.Classes.Classroom;

public class Desk {

    private MyDimension myDimension;
    private Physical physical;

    public Desk(){
        this(new MyDimension(10d,10d), new Physical("black", "steel"));
    }

    public Desk(MyDimension myDimension, Physical physical) {
        this.myDimension = myDimension;
        this.physical = physical;
    }

    public MyDimension getMyDimension() {
        return myDimension;
    }

    public void setMyDimension(MyDimension myDimension) {
        this.myDimension = myDimension;
    }

    public Physical getPhysical() {
        return physical;
    }

    public void setPhysical(Physical physical) {
        this.physical = physical;
    }
}
