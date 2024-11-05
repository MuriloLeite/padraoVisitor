public class ProdutoRoupa implements Produto {

    private String nome;
    private String tamanho;
    private float preco;

    public ProdutoRoupa(String nome, String tamanho, float preco) {
        this.nome = nome;
        this.tamanho = tamanho;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public String getTamanho() {
        return tamanho;
    }

    public float getPreco() {
        return preco;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirProdutoRoupa(this);
    }
}
