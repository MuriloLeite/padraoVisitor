public class ProdutoEletronico implements Produto {

    private String nome;
    private String modelo;
    private float preco;

    public ProdutoEletronico(String nome, String modelo, float preco) {
        this.nome = nome;
        this.modelo = modelo;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public String getModelo() {
        return modelo;
    }

    public float getPreco() {
        return preco;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirProdutoEletronico(this);
    }
}
