package entendendoGenerics;

public class Dog {
    private String nome;
    private int idade;

    public Dog(String nome, int idade){
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
       return "Nome do Cachorro: " + nome + " | Idade:" + idade;
    }
}
