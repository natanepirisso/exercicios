package entendendoCasting;

public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Cleytin");
        cachorro.getSomDoAnimal();
        cachorro.getId();
        Cachorro c1 = (Cachorro)cachorro;


        c1.abanarRabo();
    }
}
