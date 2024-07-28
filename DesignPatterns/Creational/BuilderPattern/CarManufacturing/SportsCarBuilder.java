
// SportsCarBuilder.java
public class SportsCarBuilder extends CarBuilder {
    @Override
    public void buildEngine() {
        car.setEngine("V8 Engine");
    }

    @Override
    public void buildColor() {
        car.setColor("Red");
    }

    @Override
    public void buildWheels() {
        car.setWheels("18 inch Alloy Wheels");
    }

    @Override
    public void buildInterior() {
        car.setInterior("Leather");
    }
}

