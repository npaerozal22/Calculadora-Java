public class Despesa {
    private double valor;
    private String descricao;
    private String categoria;

    public Despesa(double valor, String descricao, String categoria) {
        this.valor = valor;
        this.descricao = descricao;
        this.categoria = categoria;
    }

    public double getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getCategoria() {
        return categoria;
    }
}
