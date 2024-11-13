public class Cobra extends Animal {
    private int grauPerigo;

    public Cobra(String nome, int grauPerigo) {
        super(nome);
        this.grauPerigo = grauPerigo;
    }

    @Override
    public void emitirRuido() {
        System.out.println(getNome() + " faz um chiado.");
    }

    @Override
    public void alimentar() {
        System.out.println("Jogar a comida de longe para " + getNome() + ".");
    }

    public int getGrauPerigo() {
        return grauPerigo;
    }
}