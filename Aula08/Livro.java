package Aula08;

public class Livro implements Publicacao {
    //Atributos
    private String titulo;
    private String autor;
    private int totpaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    //Métodos Especiais

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor){
        this.titulo = titulo;
        this.autor = autor;
        this.totpaginas = totPaginas;
        this.leitor = leitor;
        this.aberto = false;
        this.pagAtual = 0;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutor(){
        return autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public int gettotPaginas(){
        return totpaginas;
    }

    public void settotPaginas(int totPaginas){
        this.totpaginas = totPaginas;
    }

    public int getpagAtual(){
        return pagAtual;
    }

    public void setpagAtual(int pagAtual){
        this.pagAtual = pagAtual;
    }

    public boolean getAberto(){
        return aberto;
    }

    public void setAberto(boolean aberto){
        this.aberto = aberto;
    }

    public Pessoa getLeitor(){
        return leitor;
    }

    public void setLeitor(Pessoa leitor){
        this.leitor = leitor;
    }

    //Método Publico

    public void detalhes(){
        System.out.println("Livro");
        System.out.println("-------------------------------------------");
        System.out.println("Titulo: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Total de Paginas: " + this.gettotPaginas());
        System.out.println("Página Atual: " + this.getpagAtual());
        System.out.println("Aberto: " + this.getAberto());
        System.out.println("Leitor: " + this.getLeitor().getNome());
        System.out.println("Idade Leitor: " + this.getLeitor().getIdade());
        System.out.println("Sexo do Leitor: " + this.getLeitor().getSexo());
        System.out.println("-------------------------------------------");
        System.out.println("");
    }

    //Métodos Abistratos da Interface

    public void abrir(){
        this.setAberto(true);
    }

    public void fechar(){
        this.setAberto(false);
    }

    public void folhear(int p){
        if(p > gettotPaginas()){
            this.setpagAtual(0);
        }

        else{
            this.setpagAtual(p);
        }
    }

    public void avancarPag(){
        this.setpagAtual(this.getpagAtual() + 1);
    }

    public void voltarPag(){
        this.setpagAtual(this.getpagAtual() - 1);
    }
}
