public class Ave extends Animal {
    private String corPena;

    //Métodos get e set

    public String getCorPena(){
        return corPena;
    }

    public void setCorPena(String corPena){
        this.corPena = corPena;
    }

    //Métodos da Classe Animal

    @Override
    public void locomover(){
        System.out.println("Voando");
    }

    @Override
    public void alimentar(){
        System.out.println("Comendo Frutas");
    }

    @Override
    public void emitirSom(){
        System.out.println("Som de Ave");
    }

    //Método da Classe Ave
    public void fazerNinho(){
        System.out.println("Contruiu um ninho");
    }
}
