package ca.saygin.Classes.Classroom;

public class Monitor implements Ielectronic {

    private String resolution;
    private boolean isOn;

    public Monitor(){
        this("800x600", false);
    }

    public Monitor(String resolution, boolean isOn) {
        this.resolution = resolution;
        this.isOn = isOn;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    @Override
    public void powerOn() {
        if(!isOn){
            System.out.println("opening the monitor ...");
            isOn = true;
        } else {
            System.out.println("its already on");
        }
    }

    @Override
    public void powerOff() {
        if(isOn){
            System.out.println("shutting down the monitor ...");
            isOn = false;
        } else {
            System.out.println("monitor is off");
        }
    }
}
