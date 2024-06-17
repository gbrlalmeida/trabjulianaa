public class Alimento extends Produto {
    private String dataValidade;

    public Alimento(int id, String nome, double preco, String dataValidade) {
        super(id, nome, preco);
        this.dataValidade = dataValidade;
    }

    public Alimento() {}

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Alimento [ID: " + getId() + ", Nome: " + getNome() + ", Preço: " + getPreco() + ", Data de Validade: " + dataValidade + "]");
    }
}
