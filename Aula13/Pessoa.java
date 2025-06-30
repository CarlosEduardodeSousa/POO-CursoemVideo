package Aula13;

public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;
    protected float experiencia;

    //Métodos get, set e construtor

    public Pessoa(String nome, int idade, String sexo){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experiencia = 0;
    }

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

    public float getExperiencia(){
        return experiencia;
    }

    public void setExperiencia(float experiencia){
        this.experiencia = experiencia;
    }

    //Método da classe Pessoa

    public abstract void ganharExp();

    public void Detalhes(){
        System.out.println("====================");
        System.out.println("       Pessoa       ");
        System.out.println("====================");
        System.out.println("Nome: " + getNome());
        System.out.println("idade: " + getIdade());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Experiencia: " + getExperiencia());
        System.out.println("");
    }
}
