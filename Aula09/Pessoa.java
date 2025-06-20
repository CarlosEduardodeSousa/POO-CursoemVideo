package Aula09;

public class Pessoa {
    // Atributos
    private String nome;
    private int idade;
    private String sexo;

    //Métodos Especiais

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getSexo(){
        return sexo;
    }

    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    //Métodos

    public void fazerAniversario(){
        this.setIdade(getIdade() + 1);
    }

    public void Status(){
        System.out.println("-------------------------------");
        System.out.println("Pessoa: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Sexo: " + this.getSexo());
        System.out.println("");
    }
}
