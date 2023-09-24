package kapitel1.car.parts;

public class ElectricEngine implements Engine{
    @Override
    public void start(CarKey carKey) {
        System.out.println("The engine starts quietly");
    }

    @Override
    public void accelerate() {
        System.out.println("you can hear a slight whistle");
    }
}
