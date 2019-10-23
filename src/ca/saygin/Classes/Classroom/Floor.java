package ca.saygin.Classes.Classroom;

public class Floor {

    private MyDimension myDimension;
    private Physical physical;

    public Floor(){
        this(new MyDimension(), new Physical());
    }

    public Floor(MyDimension myDimension, Physical physical) {
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
