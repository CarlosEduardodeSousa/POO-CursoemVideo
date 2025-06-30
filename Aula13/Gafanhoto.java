package Aula13;

public class Gafanhoto extends Pessoa{
    private String login;
    private int totAssistido;

    //Métodos get, set e construtor

    public Gafanhoto(String nome, int idade, String sexo, String login){
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }

    public String getLogin(){
        return login;
    }

    public void setLogin(String login){
        this.login = login;
    }

    public int getTotassistido(){
        return totAssistido;
    }

    public void setToassistido(int totAssistido){
        this.totAssistido = totAssistido;
    }

    //Método da Classe 

    public void viuMaisUm(){
        
    }

    //Método abstrato da classe Pessoa

    public void ganharExp(){

    }


}
