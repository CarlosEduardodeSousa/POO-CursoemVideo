package Aula07;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovado;

    //Métodos
    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria() == l2.getCategoria() && l1 != l2){
            setAprovado(true);
            setDesafiado(l1);
            setDesafiante(l2);
        }

        else{
            setAprovado(false);
            setDesafiado(null);
            setDesafiante(null);
        }
    }

    public void lutar(){
        if(getAprovado()){
            System.out.println("### Desafiado ###");
            getDesafiado().apresentar();
            System.out.println("### Desafiante ###");
            getDesafiante().apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); // 0 1 2
            System.out.println("======= Resultado da Luta =======");
            switch (vencedor){
                case 0: // Empate
                    System.out.println("Empatou");
                    getDesafiado().empatarLuta();
                    getDesafiante().empatarLuta();
                    break;

                case 1: // Ganhou Desafiado
                    System.out.println(getDesafiado().getNome());
                    getDesafiado().ganharLuta();
                    getDesafiante().perderLuta();
                    break;

                case 2: // Ganhou Desafiante
                    System.out.println(getDesafiante().getNome());
                    getDesafiante().ganharLuta();
                    getDesafiado().perderLuta();
                    break;
            }
            System.out.println("================================");
        }

        else{
            System.out.println("A luta não pode ser realizada");
        }
    }

    // Métodos Especiais

    public Lutador getDesafiado(){
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado){
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante(){
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante){
        this.desafiante = desafiante;
    }

    public int getRounds(){
        return rounds;
    }

    public void setRounds(int rounds){
        this.rounds = rounds;
    }

    public boolean getAprovado(){
        return aprovado;
    }

    public void setAprovado(boolean aprovado){
        this.aprovado = aprovado;
    }
}
