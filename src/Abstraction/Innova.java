package Abstraction;

public class Innova implements Enginall,FourVehiler{

    @Override
    public void gear() {
        System.out.println("Gear implemented");
    }

    @Override
    public void strearing() {
        System.out.println("strearing implemented");
    }

    @Override
    public void breake() {
        System.out.println("breake implemented");
    }

    @Override
    public void tataInnova() {
        System.out.println("tataInnova implemented");
    }

    @Override
    public void tataFortuneer() {
        System.out.println("tataFortuneer implemented");
    }
}
interface Enginall{
    void gear();
    void strearing();
    void breake();
}

interface FourVehiler{
    void tataInnova();
    void tataFortuneer();

}