public class RubberDuck extends Duck {


    public RubberDuck() {
        quackBehaviour = new Squeak();
        swimBehaviour = new Floating();

    }
    @Override
    public void display() {
        System.out.println("I am Rubber Duck !!");
    }
}
