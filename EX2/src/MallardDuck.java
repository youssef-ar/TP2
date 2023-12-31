public class MallardDuck extends Duck implements Quackable,Flyable{
    Quackable qb;
    Flyable fb;
    public MallardDuck(Quackable qb, Flyable fb){
        this.qb = qb;
        this.fb =fb;
    }
    public void display(){
        System.out.println("MallardDuck!!");
    }
    public void quack(){
        qb.quack();
    }
    public void fly(){
        fb.fly();
    }
}
