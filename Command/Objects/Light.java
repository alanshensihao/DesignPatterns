package CommandPattern.Objects;

public class Light {

    String type;

    public Light(String type) {
        this.type = type;
    }

    public void on() {
        System.out.println(type + " Light is turned on");
    }

    public void off() {
        System.out.println(type + "Light is turned off");
    }
}
