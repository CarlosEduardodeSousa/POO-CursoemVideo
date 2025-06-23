package Aula10;

public class Tecnico extends Aluno {
    private int registroProfissional;

    //Métodos Especiais

    public int getRegistro(){
        return registroProfissional;
    }

    public void setregistro(int registro){
        this.registroProfissional = registro;
    }

    //Métodos Públicos

    public void praticar(){
        System.out.println("O Técnico " + this.getNome() + " está praticando...");
    }
}
