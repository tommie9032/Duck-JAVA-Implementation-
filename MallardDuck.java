public class MallardDuck extends Duck{
    public MallardDuck(){
        quackBehaviour = new Quack();
        swimBehaviour = new SwimWithLegs();
        flightBehaviour = new Fly();
    }
    @Override
    public void display() {
        System.out.println("I am Mallard Duck !!");
    }
}
