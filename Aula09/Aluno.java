package Aula09;

public class Aluno extends Pessoa{
    //Atributos
    private int matr;
    private String curso;

    //Métodos Especiais

    public int getMatr(){
        return matr;
    }

    public void setMatr(int matr){
        this.matr = matr;
    }

    public String getCurso(){
        return curso;
    }

    public void setCurso(String curso){
        this.curso = curso;
    }

    //Métodos 

    public void cancelarMatr(){
        System.out.println("Mátricula será cancelada");
    }
}
