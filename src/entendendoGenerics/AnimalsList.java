package entendendoGenerics;

import java.util.ArrayList;
import java.util.List;

public class AnimalsList<T> {
    private List<T> animals;
    public void addAnimals(T animal){
        animals.add(animal);
    }
    public void runAnimalList(){
        for(T animal : animals){
            System.out.println(animal);
        }
    }
    public AnimalsList(){
        this.animals = new ArrayList<>();
    }
}
