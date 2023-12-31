public class RubberDuck extends Duck implements Quackable{
    protected Quackable qb;
    public RubberDuck(Quackable qb){
        this.qb=qb;
    }
    public void display(){
        System.out.println("RubberDuck!!");
    }
    public void quack(){
        qb.quack();
    }

}