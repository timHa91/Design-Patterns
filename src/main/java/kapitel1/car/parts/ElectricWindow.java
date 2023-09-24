package kapitel1.car.parts;

public class ElectricWindow implements Window{


    @Override
    public void open() {
        System.out.println("Opens the window via a Button");
    }

    @Override
    public void close() {
        System.out.println("Close the window via a Button");
    }


}
