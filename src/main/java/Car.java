public class Car extends Vehicle {
    // The Car class has no additional instance variables

    // Add a constructor that takes two parameters (maxSpeed and numWheels)
    public Car (int maxSpeed, int numWheels) {
        super(maxSpeed, numWheels);
    }
    // Add a constructor that takes one parameter (just speed),
    public Car (int maxSpeed){
        super(maxSpeed,4);
    }

    // the number of wheels is obvious for a car

    // Add a default constructor (no parameters)
    public Car(){
        super(110,4);
    }
    // No other code needed
}
