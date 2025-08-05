package entendendoGenerics;

public class Cat {
    private String nome;
    private int idade;

    public Cat(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    @Override
    public String toString(){
        return "Nome do Gato: " + nome + " | Idade:" + idade;
    }
}
