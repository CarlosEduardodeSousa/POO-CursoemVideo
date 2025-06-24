public class Peixe extends Animal {
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
        System.out.println("Nadando");
    }

    @Override
    public void alimentar(){
        System.out.println("Comendo Substâncias");
    }

    @Override
    public void emitirSom(){
        System.out.println("Peixe não faz som");
    }

    //Método da Classe Peixe
    public void soltarBolha(){
        System.out.println("Soltando uma Bolha");
    }
}
