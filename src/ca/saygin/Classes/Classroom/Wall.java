package ca.saygin.Classes.Classroom;

public class Wall implements  Iinteract{

    private MyDimension myDimension;
    private Physical physical;

    public Wall() {
        this(new MyDimension(), new Physical());
    }

    public Wall(MyDimension myDimension, Physical physical) {
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

    @Override
    public boolean clean() {
        System.out.println("wall is cleaned");
        return false;
    }

    @Override
    public void paint(String color) {
        System.out.println("wall painted to " + color);

    }

    @Override
    public boolean open() {
        System.out.println("wall can not be opened");
        return false;
    }

    @Override
    public boolean close() {
        System.out.println("wall can not be closed");
        return false;
    }
}
