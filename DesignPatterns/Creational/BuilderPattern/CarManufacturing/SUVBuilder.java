

// SUVBuilder.java
public class SUVBuilder extends CarBuilder {
    @Override
    public void buildEngine() {
        car.setEngine("V6 Engine");
    }

    @Override
    public void buildColor() {
        car.setColor("Black");
    }

    @Override
    public void buildWheels() {
        car.setWheels("20 inch Alloy Wheels");
    }

    @Override
    public void buildInterior() {
        car.setInterior("Premium Fabric");
    }
}

