public class Zebra extends Animal {

    public Zebra(String nome) {
        super(nome);
    }

    @Override
    public void emitirRuido() {
        System.out.println(getNome() + " emite um barulho suave.");
    }

    @Override
    public void alimentar() {
        System.out.println("Colocar a comida na frente de " + getNome() + ".");
    }
}