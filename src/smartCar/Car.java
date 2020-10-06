package smartCar;

import java.util.*;

public class Car {

    private Collection<Integer> speed = new ArrayList<>();
    private Collection<ArrayList<Integer>> direction = new ArrayList<>();
    private HashMap<Double, Double> location = new HashMap<>();


    //check if start ride has started, and if ride is ended
    private boolean startExecuted = false;

    //add observer to tel Ride object when ride is ended
    private Ride observer = new Ride();

    //tell that Ride object that ride is ended
    private void startRideAnalyser(){
        this.observer.startRideAnalyser(this);
    }

    public Collection<Integer> getSpeed() {
        return speed;
    }

    public Collection<ArrayList<Integer>> getDirection() {
        return direction;
    }

    public HashMap<Double, Double> getLocation() {
        return location;
    }

    // Speed tells when ride has started and when it is ended
    public void setSpeed(int speed) {

        if(!this.startExecuted && speed > 10){
            this.startExecuted = true;
        }
        else if(this.startExecuted){
            this.speed.add(speed);
        }

        //check if ride is ended
        if(this.startExecuted && speed == 0) {
            //check if speed is 0 over a given timeframe, if so ride is over.
            this.startRideAnalyser();
        }
    }

    public void setDirection(int x, int y, int z) {
        if(this.startExecuted){
            ArrayList<Integer> dirVector = new ArrayList<>();
            dirVector.add(x);
            dirVector.add(y);
            dirVector.add(z);
            this.direction.add(dirVector);
        }
    }

    public void setLocation(double latitude, double longitude) {
        if(this.startExecuted){
            this.location.put(latitude, longitude);
        }
    }
}
