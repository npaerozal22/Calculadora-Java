import java.util.ArrayList;
import java.util.List;

public class Orcamento {
    private List<Receita> receitas;
    private List<Despesa> despesas;

    public Orcamento() {
        this.receitas = new ArrayList<>();
        this.despesas = new ArrayList<>();
    }

    public void adicionarReceita(double valor, String descricao) {
        receitas.add(new Receita(valor, descricao));
    }

    public void adicionarDespesa(double valor, String descricao, String categoria) {
        despesas.add(new Despesa(valor, descricao, categoria));
    }

    public double totalReceitas() {
        return receitas.stream().mapToDouble(Receita::getValor).sum();
    }

    public double totalDespesas() {
        return despesas.stream().mapToDouble(Despesa::getValor).sum();
    }

    public double saldo() {
        return totalReceitas() - totalDespesas();
    }

    public List<Receita> getReceitas() {
        return receitas;
    }

    public List<Despesa> getDespesas() {
        return despesas;
    }
}
