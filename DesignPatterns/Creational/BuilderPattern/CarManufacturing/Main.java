
// Main.java
public class Main {
    public static void main(String[] args) {
        CarBuilder sportsCarBuilder = new SportsCarBuilder();
        CarDirector sportsCarDirector = new CarDirector(sportsCarBuilder);
        sportsCarDirector.constructCar();
        Car sportsCar = sportsCarDirector.getCar();
        System.out.println("Sports Car built: " + sportsCar);

        CarBuilder suvBuilder = new SUVBuilder();
        CarDirector suvDirector = new CarDirector(suvBuilder);
        suvDirector.constructCar();
        Car suv = suvDirector.getCar();
        System.out.println("SUV built: " + suv);
    }
}
