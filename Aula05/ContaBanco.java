package Aula05;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;


    public ContaBanco(){
        this.setSaldo(0);
        this.setStatus(false);
    }

    public void estadoAtual(){
        System.out.println("---------------------------------");
        System.out.println("Conta: " + this.getnumConta());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }

    public int getnumConta(){
        return numConta;
    }

    public void setnumConta(int numConta){
        this.numConta = numConta;
    }

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getDono(){
        return dono;
    }

    public void setDono(String dono){
        this.dono = dono;
    }

    public float getSaldo(){
        return saldo;
    }

    public void setSaldo(float saldo){
        this.saldo = saldo;
    }

    public boolean getStatus(){
        return status;
    }

    public void setStatus(boolean status){
        this.status = status;
    }

    public void abrirConta(String tipo){
       this.setTipo(tipo);
       this.setStatus(true);
       if(this.getTipo() == "CC"){
         this.setSaldo(50);
       }

       else if(this.getTipo() == "CP"){
         setSaldo(150);
       }

    }

    public void fecharConta(){
        if(this.getSaldo() > 0){
            System.out.println("Conta com dinheiro");
        }

        else if (this.getSaldo() < 0){
           System.out.println("Conta em débito");
        }

        else{
            this.setStatus(false);
        }
    }

    public void depositar(float valor){
        if(this.getStatus()){
            this.setSaldo(this.getSaldo() + valor);
        }

        else{
            System.out.println("Impossivel depositar numa conta fechada!");
        }

    }

    public void sacar(float valor){
        if(this.getStatus()){
            if(this.getSaldo() >= valor){
                this.setSaldo(this.getSaldo() - valor);
            }

            else{
                System.out.println("Saldo insuficiente");
            }
        }

        else{
            System.out.println("Impossivel sacar de uma conta fechada!");
        }
    }

    public void pagarMensalidade(){
        int v = 0;
        if(this.getTipo() == "CC"){
            v = 12;
        }

        else if(this.getTipo() == "CP"){
            v = 20;
        }

        if(this.getStatus()){
            if(this.getSaldo() > v){
                this.setSaldo(this.getSaldo() - v);
            }

            else{
                System.out.println("Saldo Insuficiente");
            }
        }

        else{
            System.out.println("Impossivel pagar em uma conta fechada!");
        }
    }
}
