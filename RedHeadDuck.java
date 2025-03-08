public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        quackBehaviour = new Quack();
        swimBehaviour = new SwimWithLegs();
        flightBehaviour = new Fly();

    }
    @Override
    public void display() {
        System.out.println("I'm a red head duck !!");
    }
}
