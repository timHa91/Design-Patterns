package kapitel1.car;

import kapitel1.car.parts.Engine;
import kapitel1.car.parts.Window;
import kapitel1.car.parts.CarKey;

public abstract class Car {

     Window window;
     Engine engine;
     CarKey carKey;

    public void performStart() {
        if(carKey.isKeyValid()) {
            engine.start(carKey);
        }
    }

    public void performAcceleration() {
        engine.accelerate();
    }

    public void performOpenWindow() {
        window.open();
    }

    public void performCloseWindow() {
        window.close();
    }

    public void setWindow(Window window) {
        this.window = window;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setCarKey(CarKey carKey) {
        this.carKey = carKey;
    }
}
