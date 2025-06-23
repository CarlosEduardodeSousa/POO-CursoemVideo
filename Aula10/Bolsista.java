package Aula10;

public class Bolsista extends Aluno{
    private float bolsa;

    //Métodos Especiais

    public float getbolsa(){
        return bolsa;
    }

    public void setBolsa(float bolsa){
        this.bolsa = bolsa;
    }

    //Métodos Públicos

    public void renovarBolsa(){
        System.out.println("Renovando a bolsa do aluno " + this.getNome());
    }

    @Override 
    public void pagarMensalidade(){
        System.out.println(this.getNome() + " é bolsista! Pagamento facilitado");
    }
}