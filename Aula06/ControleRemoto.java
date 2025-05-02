package Aula06;

public class ControleRemoto implements Controlador {
    // Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    // Métodos Especiais
    public ControleRemoto(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    private int getVolume(){
        return volume;
    }

    private void setVolume(int volume){
        this.volume = volume;
    }

    private boolean getLigado(){
        return ligado;
    }

    private void setLigado(boolean ligado){
        this.ligado = ligado;
    }

    private boolean getTocando(){
        return tocando;
    }

    private void setTocando(boolean tocando){
        this.tocando = tocando;
    }

    // Métodos abstratos da Interface

    public void ligar(){
       setLigado(true);
    }

    public void desligar(){
        setLigado(false);
    }

    public void abrirMenu(){
       if(this.getLigado()){
        System.out.println("Menu");
        System.out.println("Está Ligado? " + this.getLigado());
        System.out.println("Está Tocando? " + this.getTocando());
        System.out.print("Volume: " + this.getVolume());
        for(int i = 0; i < getVolume(); i+=10){
            System.out.print('|');
        }
       }

       else{
        System.out.println("Ligue o controle");
       }
    }

    public void fecharMenu(){
        System.out.println("");
        System.out.println("fechando Menu...");
    }

    public void maisVolume(){
        if(this.getLigado()){
            this.setVolume(this.getVolume() + 5);
        }

        else{
            System.out.println("Impossivel aumentar volume");
        }
    }

    public void menosVolume(){
        if(this.getLigado()){
            this.setVolume(this.getVolume() - 5 );
        }
        else{
            System.out.println("Impossivel diminuir volume");
        }
    }

    public void ligarMudo(){
        if(this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    public void desligarMudo(){
        if(this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    public void play(){
        if(this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        }

        else{
            System.out.println("Não consegui reproduzir");
        }
    }

    public void pause(){
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }
        
        else{
            System.out.println("Não consegui pausar");
        }
    }
}
