package ex03_polymorphism.after;

public class Dog extends Pet {
    @Override
    public void talk() {
        System.out.println("멍멍!");
    }
}
