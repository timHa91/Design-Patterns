package kapitel1.car.parts;

public class ManualWindow implements Window{
    @Override
    public void open() {
        System.out.println("Open the Window manual");
    }

    @Override
    public void close() {
        System.out.println("Close the window manual");
    }
}
