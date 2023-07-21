import Interfaces.Info;

public class Labrador extends Dog implements Info {
    public String voice() {
        return "Hav, hav";
    }

    public Labrador(String name, int age, String food) {
        super(name, age);
    }
    public void showInfo(){
        System.out.println("Id is" + this.name);
    }
}
