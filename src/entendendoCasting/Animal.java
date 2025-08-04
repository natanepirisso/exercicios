package entendendoCasting;

public class Animal {
    String nome;
    long id;

    private static long idCounter = 1;
    public Animal(String nome){
        this.nome = nome;
        this.id = idCounter++;
    }
    public void getSomDoAnimal(){
        System.out.println("Som genérico");
    }
    public void getId(){
        System.out.println(id);
    }
}
