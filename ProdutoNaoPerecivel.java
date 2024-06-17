public class ProdutoNaoPerecivel extends Produto {
    private String marca;

    public ProdutoNaoPerecivel(int id, String nome, double preco, String marca) {
        super(id, nome, preco);
        this.marca = marca;
    }

    public ProdutoNaoPerecivel() {}

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Produto Não Perecível [ID: " + getId() + ", Nome: " + getNome() + ", Preço: " + getPreco() + ", Marca: " + marca + "]");
    }
}
