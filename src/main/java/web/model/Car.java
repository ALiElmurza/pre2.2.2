package web.model;

public class Car {
    private String model;
    private int serial;
    private int maxSpeed;

    public Car() {

    }

    public Car(String model, int serial, int maxSpeed) {
        this.model = model;
        this.serial = serial;
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car: " + "\n" +
                "model  " + model + ", " +
                " serial " + serial + ", " +
                "maxSpeed " + maxSpeed + "\n";
    }
}
