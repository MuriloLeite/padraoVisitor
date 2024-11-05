public class ProdutoMovel implements Produto {

    private String nome;
    private String material;
    private float preco;

    public ProdutoMovel(String nome, String material, float preco) {
        this.nome = nome;
        this.material = material;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public String getMaterial() {
        return material;
    }

    public float getPreco() {
        return preco;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirProdutoMovel(this);
    }
}
