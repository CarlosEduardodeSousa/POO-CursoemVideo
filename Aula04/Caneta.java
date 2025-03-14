package Aula04;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    private boolean tampada;


    public Caneta(String m, float p, String c){ // Este é o metodo construtor onde o nome dele dever ser igual ao nome da classe
        this.modelo = m;
        this.ponta = p;
        this.cor = c;
        tampar();
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String m){
        this.modelo = m;
    }

    public float getPonta(){
        return this.ponta;
    }

    public void setPonta(float p){
        this.ponta = p;
    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }

    public void status(){
        System.out.println("Sobre a Caneta: ");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }
}
