package entendendoJvm;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<Carro> carros = new ArrayList<>(List.of(
                new Carro("Fusca"),
                new Carro("Corsa")
        ));
        for(Carro c : carros){
            System.out.println("Modelo: "+ c.modelo + " | Chaci: "+ c.getChaci());
        }
    }
}
