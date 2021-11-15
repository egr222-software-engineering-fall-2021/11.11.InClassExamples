public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();
        mallard.swim();
        mallard.setFlyBehavior(new FlyWithRocketPower());
        mallard.performFly();

        System.out.println();

        Duck redheadDuck = new RedheadDuck();
        redheadDuck.display();
        redheadDuck.performQuack();
        redheadDuck.performFly();
        redheadDuck.swim();

        System.out.println();

        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.performQuack();
        rubberDuck.performFly();
        rubberDuck.swim();

        System.out.println();

        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.performQuack();
        modelDuck.performFly();
        modelDuck.swim();

        System.out.println();

        Duck donaldDuck = new DonaldDuck();
        donaldDuck.display();
        donaldDuck.performQuack();
        donaldDuck.performFly();
        donaldDuck.swim();
    }
}