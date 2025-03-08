//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MallardDuck md = new MallardDuck();
        System.out.println("---------------------");
        md.display();
        md.performQuack();
        md.performSwim();
        md.performFlight();
        System.out.println("---------------------");

        RubberDuck rd = new RubberDuck();
        System.out.println("---------------------");
        rd.display();
        rd.performQuack();
        rd.performSwim();
        rd.performFlight();
        System.out.println("---------------------");


        RedHeadDuck rh = new RedHeadDuck();
        System.out.println("---------------------");
        rh.display();
        rh.performQuack();
        rh.performSwim();
        rh.performFlight();
        System.out.println("---------------------");


    }
}