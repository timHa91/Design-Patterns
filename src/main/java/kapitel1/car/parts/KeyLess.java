package kapitel1.car.parts;

public class KeyLess implements CarKey{

    @Override
    public boolean isKeyValid() {
        System.out.println("checks if the key is in distance");
        return true;
    }
}
