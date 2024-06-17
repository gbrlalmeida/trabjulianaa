public class ProdutoPerecivel extends Produto {
    private String dataValidade;

    public ProdutoPerecivel(int id, String nome, double preco, String dataValidade) {
        super(id, nome, preco);
        this.dataValidade = dataValidade;
    }

    public ProdutoPerecivel() {}

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Produto Perecível [ID: " + getId() + ", Nome: " + getNome() + ", Preço: " + getPreco() + ", Data de Validade: " + dataValidade + "]");
    }
}
