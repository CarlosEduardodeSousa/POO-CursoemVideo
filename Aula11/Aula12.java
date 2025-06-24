public class Aula12 {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        m.setPeso(33.5f);
        m.setCorPelo("Marrom");
        m.locomover();
        m.alimentar();
        m.emitirSom();

        a.locomover();
        r.locomover();
        p.locomover();

        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra j = new Cobra();
        Tartaruga t = new Tartaruga();
        GoldFish g = new GoldFish();
        Arara ar = new Arara();

        c.locomover();

        k.locomover();
        k.emitirSom();
        k.abanarRabo();
        k.alimentar();

        j.locomover();

        t.locomover();

        g.locomover();

        ar.locomover();
    }
}
