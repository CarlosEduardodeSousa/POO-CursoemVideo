package Aula10;

public abstract class Pessoa {
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

    //Métodos Públicos

    public final void fazerAniv(){
        this.setIdade(getIdade() + 1);
    }

    public void status(){
        System.out.println("---------------------------");
        System.out.println("Dados");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Sexo: " + this.getSexo());
        System.out.println("---------------------------");
        System.out.println("");
    }
}
