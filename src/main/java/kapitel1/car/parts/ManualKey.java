package kapitel1.car.parts;

public class ManualKey implements CarKey{

    @Override
    public boolean isKeyValid() {
        System.out.println("checks if key is in keyhole");
        return true;
    }
}
