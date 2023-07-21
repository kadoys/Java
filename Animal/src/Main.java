public class Main {
    public static void main(String[] args) {
        Cat mariya = new Cat("Merie", 5);
        Dog dog = new Dog("Brus", 4);
        Lion lion = new Lion("Simba", 2);
        Labrador labrador = new Labrador("Smakolik", 8, "meat");
        System.out.println(dog.voice());
        System.out.println(mariya.voice());
        System.out.println(lion.voice());
        System.out.println(labrador.voice());
    }
}