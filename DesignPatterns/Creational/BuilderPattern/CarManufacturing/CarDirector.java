
// CarDirector.java
public class CarDirector {
    private CarBuilder carBuilder;

    public CarDirector(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public void constructCar() {
        carBuilder.createNewCar();
        carBuilder.buildEngine();
        carBuilder.buildColor();
        carBuilder.buildWheels();
        carBuilder.buildInterior();
    }

    public Car getCar() {
        return carBuilder.getCar();
    }
}
