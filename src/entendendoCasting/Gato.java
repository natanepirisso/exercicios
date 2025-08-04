package entendendoCasting;

public class Gato extends Animal{
    public Gato(String nome){
        super(nome);
    }
    @Override
    public void getSomDoAnimal() {
        System.out.println("um miado");
    }
}
