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

    @Override
    public void Detalhes(){
        System.out.println("====================");
        System.out.println("       Pessoa       ");
        System.out.println("====================");
        System.out.println("Nome: " + getNome());
        System.out.println("idade: " + getIdade());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Experiencia: " + getExperiencia());
        System.out.println("Login: " + getLogin());
        System.out.println("Vídeos Assistidos: " + getTotassistido());
    }


}
