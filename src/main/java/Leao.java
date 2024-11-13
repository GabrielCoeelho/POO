public class Leao extends Animal {
    private int grauPerigo;

    public Leao(String nome, int grauPerigo) {
        super(nome);
        this.grauPerigo = grauPerigo;
    }

    @Override
    public void emitirRuido() {
        System.out.println(getNome() + " ruge.");
    }

    @Override
    public void alimentar() {
        System.out.println("Colocar a comida na jaula do " + getNome() + ".");
    }

    public int getGrauPerigo() {
        return grauPerigo;
    }
}