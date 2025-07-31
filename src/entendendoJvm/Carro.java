package entendendoJvm;
public class Carro {
    int chaci;
    String modelo;

    private static int chaciCounter = 1;
    public Carro(String modelo){
        this.modelo = modelo;
        this.chaci = chaciCounter++;
    }
    public int getChaci(){
        int contador = 10;
        return chaci;
    }

}
