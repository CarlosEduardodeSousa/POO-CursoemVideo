package Aula04;

public class Aula04 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("Castle", 0.7f, "Preta");
        c1.status();

        System.out.println("");

        Caneta c2 = new Caneta("BIC", 0.5f, "Azul");
        c2.destampar();
        c2.status();
    }
}
