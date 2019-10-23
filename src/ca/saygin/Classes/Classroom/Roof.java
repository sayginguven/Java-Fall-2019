package ca.saygin.Classes.Classroom;

public class Roof implements  Iinteract{

    private MyDimension myDimension;
    private Physical physical;
    private int lights;
    private boolean isClean;
    private boolean isLightsOn;

    public boolean isClean() {
        return isClean;
    }

    public void setClean(boolean clean) {
        isClean = clean;
    }

    public Roof(){
        this(new MyDimension(), new Physical(), 2, false, false);
    }

    public Roof(MyDimension myDimension, Physical physical, int lights, boolean isLightsOn, boolean isClean) {
        this.myDimension = myDimension;
        this.physical = physical;
        this.lights = lights;
        this.isLightsOn = isLightsOn;
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

    public int getLights() {
        return lights;
    }

    public void setLights(int lights) {
        this.lights = lights;
    }

    public boolean isLightsOn() {
        return isLightsOn;
    }

    public void setLightsOn(boolean lightsOn) {
        isLightsOn = lightsOn;
    }

    public void repair(){
        System.out.println("roof repaired");
    }

    @Override
    public boolean clean() {
        return isClean;
    }

    @Override
    public void paint(String color) {
        System.out.println("roof painted");
    }

    @Override
    public boolean open() {
        System.out.println("roof can not be opened");
        return false;
    }

    @Override
    public boolean close() {
        System.out.println("roof can not be closed");
        return false;
    }
}
