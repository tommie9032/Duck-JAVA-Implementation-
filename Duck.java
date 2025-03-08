abstract public class Duck {
    QuackBehaviour quackBehaviour;
    SwimBehaviour swimBehaviour;
    FlightBehaviour flightBehaviour;
    public void setSwimBehaviour(SwimBehaviour swimBehaviour) {
        this.swimBehaviour = swimBehaviour;
    }
    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public void setFlightBehaviour(FlightBehaviour flightBehaviour) {
        this.flightBehaviour = flightBehaviour;
    }

    abstract public void display();

    public void performQuack(){
        quackBehaviour.quack();
    }

    public void performSwim(){
        swimBehaviour.swim();
    }

    public void performFlight(){
        flightBehaviour.fly();
    }


}
