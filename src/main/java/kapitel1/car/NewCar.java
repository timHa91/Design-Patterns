package kapitel1.car;

import kapitel1.car.parts.ElectricEngine;
import kapitel1.car.parts.ElectricWindow;
import kapitel1.car.parts.KeyLess;

public class NewCar extends Car {

    public NewCar() {
        super.carKey = new KeyLess();
        super.window = new ElectricWindow();
        super.engine = new ElectricEngine();
    }
}
