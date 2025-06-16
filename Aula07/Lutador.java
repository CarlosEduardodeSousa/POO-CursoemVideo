package Aula07;

public class Lutador {
    private String nome;
    private String nascionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias, derrotas, empates;

    // Métodos Especiais
    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em){
        this.nome = no;
        this.nascionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
        
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String no){
        this.nome = no;
    }

    public String getNacionalidade(){
        return nascionalidade;
    }

    public void setNacionalidade(String na){
        this.nascionalidade = na;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int id){
        this.idade = id;
    }

    public float getAltura(){
        return altura;
    }

    public void setAltura(float al){
        this.altura = al;
    }

    public float getPeso(){
        return peso;
    }

    public void setPeso(float pe){
        this.peso = pe;
        this.setCategoria();
    }

    public String getCategoria(){
        return categoria;
    }

    private void setCategoria(){

        if(this.getPeso() < 52.2){
            this.categoria = "Invalido";
        }

        else if(this.getPeso() <= 70.3){
            this.categoria = "Leve";
        }

        else if(this.getPeso() <= 83.7){
            this.categoria = "Médio";
        }

        else if(this.getPeso() <= 120.2){
            this.categoria = "Pesado";
        }

        else{
            this.categoria = "Invalido";
        }
    }

    public int getVitorias(){
        return vitorias;
    }

    public void setVitorias(int vi){
        this.vitorias = vi;
    }

    public int getDerrotas(){
        return derrotas;
    }

    public void setDerrotas(int de ){
        this.derrotas = de;
    }

    public int getEmpates(){
        return empates;
    }

    public void setEmpates(int em){
        this.empates = em;
    }

    // Métodos Públicos

    public void apresentar(){
        System.out.println("--------------------------------------");
        System.out.println("Lutador: " + getNome());
        System.out.println("Origem: " + getNacionalidade());
        System.out.println(getIdade() + " anos");
        System.out.println(getAltura() + " m de altura");
        System.out.println("Pesando: " + getPeso() + "KG");
        System.out.println("Ganhou: " + getVitorias());
        System.out.println("Perdeu: " + getDerrotas());
        System.out.println("Empatou: " + getEmpates());
    }

    public void status(){
        System.out.println(getNome());
        System.out.println("é um peso " + getCategoria());
        System.out.println(getVitorias() + " vitórias");
        System.out.println(getDerrotas() + " derrotas");
        System.out.println(getEmpates() + " empates");
    }

    public void ganharLuta(){
        setVitorias(getVitorias() + 1);
    }

    public void perderLuta(){
        setDerrotas(getDerrotas() + 1);
    }

    public void empatarLuta(){
        setEmpates(getEmpates() + 1);
    }
}
