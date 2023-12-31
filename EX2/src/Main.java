
public class Main {
    public static void main(String[] args) {
        // Create ducks with different behaviors
        Duck decoyDuck = new DecoyDuck();
        Duck rubberDuck = new RubberDuck(new quackBehaviour());
        Duck redheadDuck = new RedheadDuck(new quackBehaviour(), new flayBehaviour1());
        Duck mallardDuck = new MallardDuck(new quackBehaviour(), new flayBehaviour2());

        // Test duck behaviors
        System.out.println("Decoy Duck:");
        decoyDuck.display();
        decoyDuck.swim();
        System.out.println();

        System.out.println("Rubber Duck:");
        rubberDuck.display();
        rubberDuck.swim();
        ((RubberDuck) rubberDuck).quack();
        System.out.println();

        System.out.println("Redhead Duck:");
        redheadDuck.display();
        redheadDuck.swim();
        ((RedheadDuck) redheadDuck).quack();
        ((RedheadDuck) redheadDuck).fly();
        System.out.println();

        System.out.println("Mallard Duck:");
        mallardDuck.display();
        mallardDuck.swim();
        ((MallardDuck) mallardDuck).quack();
        ((MallardDuck) mallardDuck).fly();
    }

}