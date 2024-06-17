public class Bebida extends ProdutoNaoPerecivel {
    private boolean alcoolica;

    public Bebida(int id, String nome, double preco, String marca, boolean alcoolica) {
        super(id, nome, preco, marca);
        this.alcoolica = alcoolica;
    }

    public Bebida() {}

    public boolean isAlcoolica() {
        return alcoolica;
    }

    public void setAlcoolica(boolean alcoolica) {
        this.alcoolica = alcoolica;
    }

    @Override
    public void exibirDetalhes() {
        String tipo = alcoolica ? "Alcoólica" : "Não Alcoólica";
        System.out.println("Bebida [ID: " + getId() + ", Nome: " + getNome() + ", Preço: " + getPreco() + ", Marca: " + getMarca() + ", Tipo: " + tipo + "]");
    }
}
