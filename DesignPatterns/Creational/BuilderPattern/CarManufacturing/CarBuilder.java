
// CarBuilder.java
public abstract class CarBuilder {
    protected Car car;

    public Car getCar() {
        return car;
    }

    public void createNewCar() {
        car = new Car();
    }

    public abstract void buildEngine();
    public abstract void buildColor();
    public abstract void buildWheels();
    public abstract void buildInterior();
}

