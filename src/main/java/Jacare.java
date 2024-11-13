public class Jacare extends Animal {
    private int grauPerigo;

    public Jacare(String nome, int grauPerigo) {
        super(nome);
        this.grauPerigo = grauPerigo;
    }

    @Override
    public void emitirRuido() {
        System.out.println(getNome() + " faz um rugido baixo.");
    }

    @Override
    public void alimentar() {
        System.out.println("Jogar a comida de longe para o " + getNome() + ".");
    }

    public int getGrauPerigo() {
        return grauPerigo;
    }
}