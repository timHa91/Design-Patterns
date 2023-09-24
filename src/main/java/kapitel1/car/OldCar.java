package kapitel1.car;

import kapitel1.car.parts.GasEngine;
import kapitel1.car.parts.ManualKey;
import kapitel1.car.parts.ManualWindow;

public class OldCar extends Car {

    public OldCar() {
        super.carKey = new ManualKey();
        super.window = new ManualWindow();
        super.engine = new GasEngine();
    }
}
