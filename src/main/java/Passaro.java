public class Passaro extends Animal {

    public Passaro(String nome) {
        super(nome);
    }

    @Override
    public void emitirRuido() {
        System.out.println(getNome() + " canta.");
    }

    @Override
    public void alimentar() {
        System.out.println("Colocar a comida na gaiola de " + getNome() + ".");
    }
}