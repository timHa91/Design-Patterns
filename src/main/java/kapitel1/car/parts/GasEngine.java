package kapitel1.car.parts;

public class GasEngine implements Engine{
    @Override
    public void start(CarKey carKey) {
        System.out.println("Engine makes a noise");
    }

    @Override
    public void accelerate() {
        System.out.println("Brrrrruuuumm");
    }
}
