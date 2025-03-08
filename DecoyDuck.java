public class DecoyDuck extends Duck {


    public DecoyDuck() {
        quackBehaviour = new Mute();
        swimBehaviour = new Drowning();
        flightBehaviour = new Fall();


    }
    @Override
    public void display() {
        System.out.println("I am Decoy Duck !!");
    }
}
