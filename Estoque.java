import java.util.ArrayList;
import java.util.Scanner;

public class Estoque {
    private ArrayList<Produto> produtos = new ArrayList<>();

    public void cadastrarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println(produto.getNome() + " cadastrado com sucesso.");
    }

    public void listarProdutos() {
        for (Produto produto : produtos) {
            produto.exibirDetalhes();
        }
    }

    public void visualizarProduto(int id) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                produto.exibirDetalhes();
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }

    public void excluirProduto(int id) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                produtos.remove(produto);
                System.out.println(produto.getNome() + " removido com sucesso.");
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }

    public void editarProduto(int id) {
        Scanner sc = new Scanner(System.in);
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                System.out.print("Novo Nome: ");
                produto.setNome(sc.nextLine());
                System.out.print("Novo Preço: ");
                produto.setPreco(sc.nextDouble());
                sc.nextLine(); // Consome o \n
                if (produto instanceof Alimento || produto instanceof ProdutoPerecivel) {
                    System.out.print("Nova Data de Validade: ");
                    ((ProdutoPerecivel) produto).setDataValidade(sc.nextLine());
                } else if (produto instanceof Bebida) {
                    System.out.print("É Alcoólica? (true/false): ");
                    ((Bebida) produto).setAlcoolica(sc.nextBoolean());
                    sc.nextLine(); // Consome o \n
                } else if (produto instanceof ProdutoNaoPerecivel) {
                    System.out.print("Nova Marca: ");
                    ((ProdutoNaoPerecivel) produto).setMarca(sc.nextLine());
                }
                System.out.println("Produto atualizado com sucesso.");
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }

    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar Produto");
            System.out.println("2. Listar Produtos");
            System.out.println("3. Visualizar Produto");
            System.out.println("4. Excluir Produto");
            System.out.println("5. Editar Produto");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // Consome o \n

            switch (opcao) {
                case 1:
                    System.out.println("1. Alimento");
                    System.out.println("2. Bebida");
                    System.out.println("3. Produto Perecível");
                    System.out.println("4. Produto Não Perecível");
                    System.out.print("Escolha o tipo de produto: ");
                    int tipo = sc.nextInt();
                    sc.nextLine(); // Consome o \n

                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // Consome o \n
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Preço: ");
                    double preco = sc.nextDouble();
                    sc.nextLine(); // Consome o \n

                    switch (tipo) {
                        case 1:
                            System.out.print("Data de Validade: ");
                            String dataValidade = sc.nextLine();
                            Alimento alimento = new Alimento(id, nome, preco, dataValidade);
                            estoque.cadastrarProduto(alimento);
                            break;
                        case 2:
                            System.out.print("É Alcoólica? (true/false): ");
                            boolean alcoolica = sc.nextBoolean();
                            sc.nextLine(); // Consome o \n
                            Bebida bebida = new Bebida(id, nome, preco, alcoolica);
                           
