package entendendoGenerics;

public class Main {
    public static void main(String[] args) {
        AnimalsList<Object> animalsList = new AnimalsList<>();
        animalsList.addAnimals(new Dog("Clebin",8));
        animalsList.addAnimals(new Cat("José Deodo", 12));

        animalsList.runAnimalList();
    }
}
