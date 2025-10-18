package problem6;
public class Plumber extends Person{
    public Plumber(String name){
        super(name);
    }
    public void display(){
        System.out.println("I am "+ this.getName() + " the Plumber");
    }
}
