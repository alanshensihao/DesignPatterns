package CommandPattern.Objects;

public class Stereo {
    public void on() {
        System.out.println("stereo is on");
    }

    public void setCD() {
        System.out.println("stereo sets CD");
    }

    public void setVolume(int scale) {
        System.out.println("set volume to: " + scale);
    }

    public void off() {
        System.out.println("stereo is off");
    }
}
