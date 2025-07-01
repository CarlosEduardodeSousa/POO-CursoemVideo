package Aula13;

public class Visualizacao {
    private Gafanhoto espectador;
    private Video filme;

    //Métodos get, set e construtor

    public Visualizacao(Gafanhoto espectador, Video filme){
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setToassistido(this.espectador.getTotassistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }

    public Gafanhoto getEspectador(){
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador){
        this.espectador = espectador;
    }

    public Video getFilme(){
        return filme;
    }

    public void setFilme(Video filme){
        this.filme = filme;
    }

    //Métodos da classe

    public void Status(){
        System.out.println("===============");
        System.out.println(" Visualização  ");
        System.out.println("===============");
        System.out.println("Espectador: " + getEspectador().getNome());
        System.out.println("Filme: " + getFilme().getTitulo());
        System.out.println("");
    }

    public void avaliar(){
        this.filme.setAvalicao(5);
    }

    public void avaliar(int nota){
        this.filme.setAvalicao(nota);
    }

    public void avaliar(float porc){
        int tot = 0;
        if(porc <= 20){
            tot = 3;
        }

        else if (porc <= 50){
            tot = 5;
        }

        else if (porc <= 90){
            tot = 8;
        }

        else{
            tot = 10;
        }

        this.filme.setAvalicao(tot);
    }
}
