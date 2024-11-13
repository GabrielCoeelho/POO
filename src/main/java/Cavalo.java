public class Cavalo extends Animal {

    public Cavalo(String nome) {
        super(nome);
    }

    @Override
    public void emitirRuido() {
        System.out.println(getNome() + " relincha.");
    }

    @Override
    public void alimentar() {
        System.out.println("Colocar a comida na frente de " + getNome() + ".");
    }
}