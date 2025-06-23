package Aula10;

public class Professor extends Pessoa{
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

    //Métodos Públicos

    public void receberAumento(){
        System.out.println("O professor " + this.getNome() + " está recebendo aumento de R$500 reais");
    }
}
