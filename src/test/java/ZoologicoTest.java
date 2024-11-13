import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ZoologicoTest {

    @Test
    public void testTratarAnimais() {
        Zoologico zoologico = new Zoologico();

        // Cria os animais
        Animal cobra = new Cobra("Cobra Real", 9);
        Animal leao = new Leao("Leão", 10);
        Animal macaco = new Macaco("Macaco");
        Animal jacare = new Jacare("Jacaré", 7);
        Animal cavalo = new Cavalo("Cavalo");
        Animal zebra = new Zebra("Zebra");
        Animal passaro = new Passaro("Pássaro");

        // Adiciona os animais no zoológico
        zoologico.adicionarAnimal(cobra);
        zoologico.adicionarAnimal(leao);
        zoologico.adicionarAnimal(macaco);
        zoologico.adicionarAnimal(jacare);
        zoologico.adicionarAnimal(cavalo);
        zoologico.adicionarAnimal(zebra);
        zoologico.adicionarAnimal(passaro);

        // Redireciona a saída para verificar a saída do sistema
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Executa o método
        zoologico.tratarAnimais();

        // Verifica se a saída contém as mensagens esperadas
        String expectedOutput = "Tratando o animal: Cobra Real\nCobra Real faz um chiado.\nJogar a comida de longe para Cobra Real.\n\n"
                + "Tratando o animal: Leão\nLeão ruge.\nColocar a comida na jaula do Leão.\n\n"
                + "Tratando o animal: Macaco\nMacaco faz um grito.\nEntregar a comida nas mãos do Macaco.\n\n"
                + "Tratando o animal: Jacaré\nJacaré faz um rugido baixo.\nJogar a comida de longe para o Jacaré.\n\n"
                + "Tratando o animal: Cavalo\nCavalo relincha.\nColocar a comida na frente de Cavalo.\n\n"
                + "Tratando o animal: Zebra\nZebra emite um barulho suave.\nColocar a comida na frente de Zebra.\n\n"
                + "Tratando o animal: Pássaro\nPássaro canta.\nColocar a comida na gaiola de Pássaro.\n\n";

        assertEquals(expectedOutput, outputStream.toString());
    }
}