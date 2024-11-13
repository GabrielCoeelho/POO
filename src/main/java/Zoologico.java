import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    private List<Animal> jaulas;

    public Zoologico() {
        jaulas = new ArrayList<>();
    }

    public void adicionarAnimal(Animal animal) {
        jaulas.add(animal);
    }

    public void tratarAnimais() {
        for (Animal animal : jaulas) {
            System.out.println("Tratando o animal: " + animal.getNome());
            animal.emitirRuido();
            animal.alimentar();
            System.out.println();
        }
    }
}