package testeunitario.matematica;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NumerosTest {

    private Numeros n;

    public NumerosTest() {
    }

    @Before
    public void setUp() {
        n = new Numeros();
    }

    @Test
    public void testNumeroPar() {
        Assert.assertEquals(true, n.numeroPar(8));
    }

    @Test
    public void testAreaQuadrado() {
        Assert.assertEquals(100, n.areaQuadrado(10));
    }

    @Test
    public void testNumeroDivisivel() {
        Assert.assertTrue(n.numeroDivisivel(4, 2));
    }

    @Test
    public void testSoma() {
        Assert.assertEquals(8, n.somar(4, 4));
    }

    @Test
    public void testSubtracao() {
        Assert.assertEquals(4, n.subtracao(6, 2));
    }

    @Test
    public void testMedia() {
        Assert.assertEquals(true, n.testMedia(7, 6, 9));
    }

    @Test
    public void testPrimo() {
        Assert.assertEquals(true, n.numeroPrimo(2));
    }
}
