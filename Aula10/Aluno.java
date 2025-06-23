package Aula10;

public class Aluno extends Pessoa {
    private int matricula;
    private String curso;

    //Métodos Especiais

    public int getMatricula(){
        return matricula;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public String getCurso(){
        return curso;
    }

    public void setCurso(String curso){
        this.curso = curso;
    }

    //Métodos Públicos

    public void pagarMensalidade(){
        System.out.println("Pagando Mensalidade do Aluno " + this.getNome());
    }
}
