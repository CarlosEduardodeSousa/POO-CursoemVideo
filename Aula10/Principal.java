package Aula10;

public class Principal {
    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa(); não funciona

        Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("M");
        v1.status();

        Aluno a1 = new Aluno();
        a1.setNome("Cláudio");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.setCurso("Infórmatica");
        a1.setMatricula(1111);
        a1.pagarMensalidade();

        Bolsista b1 = new Bolsista();
        b1.setNome("Jubileu");
        b1.setSexo("M");
        b1.setIdade(25);
        b1.setMatricula(1112);
        b1.setBolsa(12.5f);
        b1.pagarMensalidade();

        Professor p1 = new Professor();
        p1.setNome("Alexandre");
        p1.setIdade(50);
        p1.setSexo("M");
        p1.setSalario(1700.00f);
        p1.setEspecialidade("História");
        p1.status();
        p1.receberAumento();

        Tecnico t1 = new Tecnico();
        t1.setNome("João");
        t1.setIdade(18);
        t1.setSexo("M");
        t1.setMatricula(5553);
        t1.setCurso("Engenharia");
        t1.status();
        t1.praticar();
    }
}
