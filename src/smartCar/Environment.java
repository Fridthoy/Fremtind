package smartCar;

public class Environment {
    private int speedLimit;
    private final String weather;

    public Environment() {
        // get wather from an API
        this.weather = "Rain";
    }

    public int getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(int speedLimit) {
        this.speedLimit = speedLimit;
    }
}
