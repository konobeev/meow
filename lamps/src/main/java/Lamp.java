public class Lamp {
    private Boolean state = false;

    public void turnOn() {
        this.state = true;
    }

    public void turnOff() {
        this.state = false;
    }

    public Boolean getState() {
        return state;
    }
}
