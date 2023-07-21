import Interfaces.Info;

public abstract class Animal  {
    protected int age;
    protected String name;

    public int getAge() {
        return age;
    }

    public abstract String voice();

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

}






