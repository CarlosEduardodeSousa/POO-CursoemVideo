package Aula13;

public class Video implements AcoesVideos {
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    //Métodos get, set e construtor

    public Video(String titulo){
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public int getAvaliacao(){
        return avaliacao;
    }

    public void setAvalicao(int avaliacao){
        int nova;
        nova = (this.avaliacao + avaliacao) / this.views;
        this.avaliacao = nova;
    }

    public int getViews(){
        return views;
    }

    public void setViews(int views){
        this.views = views;
    }

    public int getCurtidas(){
        return curtidas;
    }

    public void setCurtidas(int curtidas){
        this.curtidas = curtidas;
    }

    public boolean getReproduzindo(){
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo){
        this.reproduzindo = reproduzindo;
    }

    //Métodos da Interface

    public void play(){
        setReproduzindo(true);
    }

    public void pause(){
        setReproduzindo(false);
    }

    public void like(){
        setCurtidas(getCurtidas() + 1);
    }

    //Métodos da classe Video

    public void Status(){
        System.out.println("===================");
        System.out.println("       Vídeo       ");
        System.out.println("===================");
        System.out.println("Título: " + getTitulo());
        System.out.println("Avaliação: " + getAvaliacao());
        System.out.println("Views: " + getViews());
        System.out.println("Curtidas: " + getCurtidas());
        System.out.println("Reproduzindo: " + getReproduzindo());
        System.out.println("");
    }
}
