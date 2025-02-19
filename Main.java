//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MallardDuck md = new MallardDuck();
        System.out.println("---------------------");
        md.display();
        md.perfromQuack();
        md.perfromSwim();
        System.out.println("---------------------");

        RubberDuck rd = new RubberDuck();
        System.out.println("---------------------");
        rd.display();
        rd.perfromQuack();
        rd.perfromSwim();
        System.out.println("---------------------");


        RedHeadDuck rh = new RedHeadDuck();
        System.out.println("---------------------");
        rh.display();
        rh.perfromQuack();
        rh.perfromSwim();
        System.out.println("---------------------");


    }
}