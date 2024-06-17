public class Alimento extends ProdutoPerecivel {
    public Alimento(int id, String nome, double preco, String dataValidade) {
        super(id, nome, preco, dataValidade);
    }

    public Alimento() {}

    @Override
    public void exibirDetalhes() {
        System.out.println("Alimento [ID: " + getId() + ", Nome: " + getNome() + ", Preço: " + getPreco() + ", Data de Validade: " + getDataValidade() + "]");
    }
}
