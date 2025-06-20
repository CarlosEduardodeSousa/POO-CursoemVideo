package Aula09;

public class Professor extends Pessoa {
    //Atributos
    private String especialidade;
    private float salario;

    //Métodos Especiais

    public String getEspecialidade(){
        return especialidade;
    }

    public void setEspecialidade(String especialidade){
        this.especialidade = especialidade;
    }

    public float getSalario(){
        return salario;
    }

    public void setSalario(float salario){
        this.salario = salario;
    }

    //Métodos

    public void receberAum(float aumento){
        this.setSalario(getSalario() + aumento);
    }
}
