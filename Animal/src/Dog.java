public class Dog extends  Animal {
    public String voice() {
        return "Hav, hav";

    }

    public void dogName() {
        System.out.println("Brus");
    }

    public Dog(String name, int age) {
        super(name, age);
    }
}