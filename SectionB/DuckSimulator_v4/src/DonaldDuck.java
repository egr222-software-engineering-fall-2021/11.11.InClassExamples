public class DonaldDuck extends Duck {
    public DonaldDuck() {
        quackBehavior = new QuackAndSpeak();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("I'm Donald Duck");
    }
}