package Aula09;

public class ProjetoPessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Cláudio");
        p4.setNome("Fabiana");

        p1.setSexo("M");
        p4.setSexo("F");
        p2.setIdade(18);

        p2.setCurso("Infórmatica");
        p3.setSalario(2500.75f);
        p4.setSetor("Estoque");

        p1.Status();
        p2.Status();
        p3.Status();
        p4.Status();
    }
}
