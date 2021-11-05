import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bloco4Ex15Test {
    //a)
    @Test
    void menorValorMatrizTeste1() throws Exception {
        int expected = 1;
        int result = Bloco4Ex15.menorValorMatriz(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
        assertEquals(expected,result);
    }
    @Test
    void menorValorMatrizTeste2() throws Exception {
        int expected = 2;
        int result = Bloco4Ex15.menorValorMatriz(new int[][]{{3,2,3},{4,5,6},{7,2,9}});
        assertEquals(expected,result);
    }
    @Test
    void menorValorMatrizTesteExcepcao() {
        Exception thrown = Assertions.assertThrows(Exception.class, () -> {
           Bloco4Ex15.menorValorMatriz(new int[][]{{3,3,3},{4,5}});
        });
        Assertions.assertEquals("Objecto recebido não é uma matriz", thrown.getMessage());
    }
    @Test
    void menorValorMatrizTeste3() throws Exception {
        int expected = -1;
        int result = Bloco4Ex15.menorValorMatriz(new int[][]{{3,2},{4,5},{7,-1}});
        assertEquals(expected,result);
    }
    //b)
    @Test
    void maiorValorMatrizTeste1() throws Exception {
        int expected = 9;
        int result = Bloco4Ex15.maiorValorMatriz(new int[][]{{3,2,3},{4,5,6},{7,2,9}});
        assertEquals(expected,result);
    }
    @Test
    void maiorValorMatrizTeste2() throws Exception {
        int expected = 7;
        int result = Bloco4Ex15.maiorValorMatriz(new int[][]{{3,2},{4,5},{7,2}});
        assertEquals(expected,result);
    }
    @Test
    void maiorValorMatrizTeste3() throws Exception {
        int expected = 7;
        int result = Bloco4Ex15.maiorValorMatriz(new int[][]{{7,2},{7,5},{7,2}});
        assertEquals(expected,result);
    }
    @Test
    void maiorValorMatrizTesteExcepcao() {
        Exception thrown = Assertions.assertThrows(Exception.class, () -> {
            Bloco4Ex15.maiorValorMatriz(new int[][]{{3,3,3},{4,5}});
        });
        Assertions.assertEquals("Objecto recebido não é uma matriz", thrown.getMessage());
    }
    //c)
    @Test
    void mediaValoresMatrizTeste1() throws Exception {
        double expected = 5;
        double result = Bloco4Ex15.mediaValoresMatriz(new int[][]{{7,2},{7,5},{7,2}});
        assertEquals(expected,result,0.1);
    }
    @Test
    void mediaValoresMatrizTeste2() throws Exception {
        double expected = 3.3;
        double result = Bloco4Ex15.mediaValoresMatriz(new int[][]{{7,2,-1},{7,5,0}});
        assertEquals(expected,result,0.1);
    }
    @Test
    void mediaValoresMatrizTeste1Excepcao() {
        Exception thrown = Assertions.assertThrows(Exception.class, () -> {
            Bloco4Ex15.mediaValoresMatriz(new int[][]{{3,3,3},{4,5}});
        });
        Assertions.assertEquals("Objecto recebido não é uma matriz", thrown.getMessage());
    }
    @Test
    void mediaValoresMatrizTeste2Excepcao() {
        Exception thrown = Assertions.assertThrows(Exception.class, () -> {
            Bloco4Ex15.mediaValoresMatriz(new int[][]{});
        });
        Assertions.assertEquals("Objecto recebido não é uma matriz", thrown.getMessage());
    }
    //d)
    @Test
    void produtoValoresMatrizTeste1() throws Exception {
        int expected = 1680;
        int result = Bloco4Ex15.produtoValoresMatriz(new int[][]{{3,2},{4,5},{7,2}});
        assertEquals(expected,result);
    }
    @Test
    void produtoValoresMatrizTeste1Excepcao() {
        Exception thrown = Assertions.assertThrows(Exception.class, () -> {
            Bloco4Ex15.produtoValoresMatriz(new int[][]{{3,3,3},{4,5}});
        });
        Assertions.assertEquals("Objecto recebido não é uma matriz", thrown.getMessage());
    }
    @Test
    void produtoValoresMatrizTeste2Excepcao() {
        Exception thrown = Assertions.assertThrows(Exception.class, () -> {
            Bloco4Ex15.produtoValoresMatriz(new int[][]{});
        });
        Assertions.assertEquals("Objecto recebido não é uma matriz", thrown.getMessage());
    }
}