import Interfaces.Info;

public class Cat extends Animal implements Info {
    public Cat(String name, int age) {
        super(name, age);
    }

    ;

    @Override
    public String voice() {
        return "Myau, myau";
    }

    ;

    public void showInfo() {
        System.out.println("Cat name is" + this.name);
    }
}