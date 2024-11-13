public class Macaco extends Animal {

    public Macaco(String nome) {
        super(nome);
    }

    @Override
    public void emitirRuido() {
        System.out.println(getNome() + " faz um grito.");
    }

    @Override
    public void alimentar() {
        System.out.println("Entregar a comida nas mãos do " + getNome() + ".");
    }
}