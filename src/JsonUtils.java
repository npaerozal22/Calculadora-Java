import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JsonUtils {
    private static final String ARQUIVO = "data/dados.json";
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public static void salvar(Orcamento orcamento) {
        try (FileWriter writer = new FileWriter(ARQUIVO)) {
            gson.toJson(orcamento, writer);
        } catch (IOException e) {
            System.out.println("Erro ao salvar dados: " + e.getMessage());
        }
    }

    public static Orcamento carregar() {
        try (FileReader reader = new FileReader(ARQUIVO)) {
            return gson.fromJson(reader, Orcamento.class);
        } catch (Exception e) {
            return new Orcamento(); // caso não exista ainda
        }
    }
}
