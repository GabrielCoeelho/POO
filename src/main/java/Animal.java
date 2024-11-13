public class Animal {
    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void emitirRuido() {
        System.out.println(nome + " emite um ruído genérico.");
    }

    public void alimentar() {
        System.out.println("Alimentando " + nome + " de forma padrão.");
    }
}
