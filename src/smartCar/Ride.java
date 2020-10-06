package smartCar;


import java.lang.*;

public class Ride implements EventListener{

    private Car car;
    private Environment environment;

    public Ride(){
        this.environment = new Environment();
    }

    public void startRideAnalyser(Car car){
        System.out.println("ride is over");

        this.car = car;
        this.returnScore();
    }
    public int smoothDriving(){
        //calculate smooth driving
        int smoothDriving = 40;
        return smoothDriving;
    }
    //calculate how predictable the ride was
    public int predictable(){
        int predictable = 92;
        return predictable;
    }
    // Calclulate legal speed from car.speed and environment.speed
    public int legalSpeed(){
        int legalSpeed = 83;
        return legalSpeed;
    }
    //calculate cellPhoneUse
    public int cellphoneUse(){
        int cellPhoneUse = 79;
        return cellPhoneUse;
    }

    //return total score
    public int totalScore(){
        int score = (this.smoothDriving()+this.predictable()+this.legalSpeed()+this.cellphoneUse());
        int totalScore = score/4;

        System.out.println("your total Score is: " + totalScore);
        return totalScore;
    }

    //return result GUI
    public void returnScore(){
        this.smoothDriving();
        this.predictable();
        this.legalSpeed();
        this.cellphoneUse();
        this.totalScore();
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.setSpeed(12);
        car.setSpeed(0);
    }

}
