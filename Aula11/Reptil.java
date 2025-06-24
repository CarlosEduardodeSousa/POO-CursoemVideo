public class Reptil extends Animal {
    private String corEscama;

    //Métodos get e set

    public String getCorEscama(){
        return corEscama;
    }

    public void setCorEscama(String corEscama){
        this.corEscama = corEscama;
    }

    //Métodos da Classe Animal

    @Override
    public void locomover(){
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar(){
        System.out.println("Comendo Vegetais");
    }

    @Override
    public void emitirSom(){
        System.out.println("Som de Reptil");
    }
}
