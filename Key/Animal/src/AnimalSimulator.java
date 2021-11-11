public class AnimalSimulator {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.Bark();

        Animal animal = new Dog();
        animal.makeSound();

        Animal a = GetAnimal();
        a.makeSound();
    }

    public static Animal GetAnimal() {
        return new Dog();
    }
}