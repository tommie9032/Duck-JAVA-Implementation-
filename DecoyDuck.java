public class DecoyDuck extends Duck {


    public DecoyDuck() {
        quackBehaviour = new Squeak();
        swimBehaviour = new Floating();
        flightBehaviour = new Fall();


    }
    @Override
    public void display() {
        System.out.println("I am Decpy Duck !!");
    }
}
