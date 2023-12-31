public class RedheadDuck extends Duck implements Quackable,Flyable{
    Quackable qb;
    Flyable fb;
    public RedheadDuck(Quackable qb, Flyable fb){
        this.qb = qb;
        this.fb =fb;
    }
    public void display(){
        System.out.println("RedheadDuck!!");
    }
    public void quack(){
        qb.quack();
    }
    public void fly(){
        fb.fly();
    }
}