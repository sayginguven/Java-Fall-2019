package ca.saygin.Classes.Classroom;

public class Door implements Iinteract{

    private MyDimension myDimension;
    private Physical physical;
    private boolean isLocked;
    private boolean isOpen;

    public Door(){
        this(new MyDimension(), new Physical(), false, false);
    }

    public Door(MyDimension myDimension, Physical physical, boolean isLocked, boolean isOpen) {
        this.myDimension = myDimension;
        this.physical = physical;
        this.isLocked = isLocked;
        this.isOpen = isOpen;
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

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    @Override
    public boolean clean() {
        System.out.println("we dont clean the doors");
        return false;
    }

    @Override
    public void paint(String color) {
        System.out.println("door painted to " + color);
    }

    @Override
    public boolean open() {
        if( isOpen ){
            System.out.println("its already open");
            return false;
        } else{
            isOpen = true;
            System.out.println("door opened");
            return isOpen;
        }
    }

    @Override
    public boolean close() {
        if( !isOpen ){
            System.out.println("its already closed");
            return false;
        } else{
            isOpen = true;
            System.out.println("door closed");
            return isOpen;
        }
    }
}
