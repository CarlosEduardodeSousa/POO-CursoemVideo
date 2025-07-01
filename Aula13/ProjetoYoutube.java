package Aula13;

public class ProjetoYoutube {
    public static void main(String[] args) {
        Video v [] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML5");


        Gafanhoto g [] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu", 22, "M", "Juba");
        g[1] = new Gafanhoto("Creuza", 12, "F", "creuzita");

        Visualizacao vi [] = new Visualizacao[5];
        vi[0] = new Visualizacao(g[0], v[2]);
        vi[1] = new Visualizacao(g[0], v[1]);
        vi[2] = new Visualizacao(g[1], v[2]);
        vi[3] = new Visualizacao(g[1], v[0]);

        vi[0].Status(); // Jubileu assisti HTML
    
        vi[1].Status(); // Jubileu assisti PHP

        vi[2].Status(); // Creuza assisti HTML

        vi[3].Status(); // Creuza assisti POO

        vi[0].avaliar();
        vi[1].avaliar(87.00f);

        
        

        v[0].Status();
        v[1].Status();
        v[2].Status();
       


        g[0].Detalhes();
        g[1].Detalhes();


        /*g[0].Detalhes();
        v[0].Status();*/
    }
}
