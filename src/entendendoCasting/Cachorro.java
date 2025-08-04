package entendendoCasting;

public class Cachorro extends Animal{
    public Cachorro(String nome){
        super(nome);
    }
    @Override
    public void getSomDoAnimal(){
        System.out.println("Um Latido");
    }
    public void abanarRabo(){
        System.out.println("Estou abanando meu rabo.");
    }
}
