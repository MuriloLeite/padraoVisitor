public class ProdutoVisitor implements Visitor {

    @Override
    public String exibirProdutoEletronico(ProdutoEletronico produto) {
        return "Produto Eletrônico{" +
                "nome='" + produto.getNome() + '\'' +
                ", modelo='" + produto.getModelo() + '\'' +
                ", preço=" + produto.getPreco() +
                '}';
    }

    @Override
    public String exibirProdutoMovel(ProdutoMovel produto) {
        return "Produto Móvel{" +
                "nome='" + produto.getNome() + '\'' +
                ", material='" + produto.getMaterial() + '\'' +
                ", preço=" + produto.getPreco() +
                '}';
    }

    @Override
    public String exibirProdutoRoupa(ProdutoRoupa produto) {
        return "Produto de Roupa{" +
                "nome='" + produto.getNome() + '\'' +
                ", tamanho='" + produto.getTamanho() + '\'' +
                ", preço=" + produto.getPreco() +
                '}';
    }
}
