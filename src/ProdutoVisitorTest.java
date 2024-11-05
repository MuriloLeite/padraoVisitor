import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProdutoVisitorTest {

    @Test
    public void testExibirProdutoEletronico() {
        ProdutoEletronico produto = new ProdutoEletronico("Smartphone", "Modelo X", 1500.00f);
        Visitor visitor = new ProdutoVisitor();

        String resultado = produto.aceitar(visitor);
        String esperado = "Produto Eletrônico{" +
                "nome='Smartphone'," +
                " modelo='Modelo X'," +
                " preço=1500.0" +
                '}';

        assertEquals(esperado, resultado);
    }

    @Test
    public void testExibirProdutoMovel() {
        ProdutoMovel produto = new ProdutoMovel("Sofá", "Couro", 2000.00f);
        Visitor visitor = new ProdutoVisitor();

        String resultado = produto.aceitar(visitor);
        String esperado = "Produto Móvel{" +
                "nome='Sofá'," +
                " material='Couro'," +
                " preço=2000.0" +
                '}';

        assertEquals(esperado, resultado);
    }

    @Test
    public void testExibirProdutoRoupa() {
        ProdutoRoupa produto = new ProdutoRoupa("Camiseta", "M", 50.00f);
        Visitor visitor = new ProdutoVisitor();

        String resultado = produto.aceitar(visitor);
        String esperado = "Produto de Roupa{" +
                "nome='Camiseta'," +
                " tamanho='M'," +
                " preço=50.0" +
                '}';

        assertEquals(esperado, resultado);
    }
}
