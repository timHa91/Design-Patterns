package kapitel1.car;

import kapitel1.car.parts.ElectricWindow;

public class Main {
    public static void main(String[] args) {
        Car oldCar = new OldCar();
        Car newCar = new NewCar();

        oldCar.performStart();
        oldCar.performAcceleration();
        oldCar.performOpenWindow();
        oldCar.performCloseWindow();
        oldCar.setWindow(new ElectricWindow());
        oldCar.performOpenWindow();

        newCar.performStart();
        newCar.performAcceleration();
    }
}
