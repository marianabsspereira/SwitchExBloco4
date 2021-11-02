import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bloco4Test {

    //Ex 2 testes
    @org.junit.jupiter.api.Test
    void vectorDigitosTeste1() {
        int [] expected = {1,2,3,4,5};
        int [] result = Bloco4.vectorDigitos(12345);
        assertArrayEquals(expected,result);
    }
    @org.junit.jupiter.api.Test
    void vectorDigitosTeste2() {
        int [] expected = {1,2,3,4};
        int [] result = Bloco4.vectorDigitos(1234);
        assertArrayEquals(expected,result);
    }
    //Ex 3 testes
    @Test
    void somaElementosVectorTeste1() {
        int expected = 25;
        int result = Bloco4.somaElementosVector(new int[]{3, 6, 7, 8, 1});
        assertEquals(expected,result);
    }
    @Test
    void somaElementosVectorTeste2() {
        int expected = 27;
        int result = Bloco4.somaElementosVector(new int[]{4, 6, 7, 8, 2});
        assertEquals(expected,result);
    }
    //Ex 4 testes
    @Test
    void elementosParesTeste1() {
        int [] expected = {2,4};
        int [] result = Bloco4.elementosPares(new int[]{1, 2, 3, 4, 5});
        assertArrayEquals(expected,result);
    }
    @Test
    void elementosParesTeste2() {
        int [] expected = {2,4,8};
        int [] result = Bloco4.elementosPares(new int[]{1,2,3,4,8});
        assertArrayEquals(expected,result);
    }
    //Ex 5 testes
    @Test
    void somaParesTeste1() {
        int expected = 12;
        int result = Bloco4.somaPares(123456);
        assertEquals(expected,result);
    }
    @Test
    void somaParesTeste2() {
        int expected = 8;
        int result = Bloco4.somaPares(22574);
        assertEquals(expected,result);
    }
    //Ex 6 testes
    @Test
    void primeirosNelementosTeste1() {
        int [] expected = {1,2,3};
        int [] result = Bloco4.primeirosNelementos(new int[]{1,2,3,4,8},3);
        assertArrayEquals(expected,result);
    }
    @Test
    void primeirosNelementosTeste2() {
        int [] expected = {0};
        int [] result = Bloco4.primeirosNelementos(new int[]{0,2,3},1);
        assertArrayEquals(expected,result);
    }
    @Test
    void primeirosNelementosTeste3() {
        int [] expected = {};
        int [] result = Bloco4.primeirosNelementos(new int[]{0,2,3},0);
        assertArrayEquals(expected,result);
    }
    //Ex 7 testes
    @Test
    void vectorMultiplosXteste1() {
        int [] expected = {6,9};
        int [] result = Bloco4.vectorMultiplosX(4,10,3);
        assertArrayEquals(expected,result);
    }
    @Test
    void vectorMultiplosXteste2() {
        int [] expected = {4,6,8,10};
        int [] result = Bloco4.vectorMultiplosX(4,10,2);
        assertArrayEquals(expected,result);
    }
    @Test
    void vectorMultiplosXteste3() {
        int [] expected = {4,6,8,10};
        int [] result = Bloco4.vectorMultiplosX(10,4,2);
        assertArrayEquals(expected,result);
    }
    //Ex 8 testes
    @Test
    void vectorMultiplosComunsTeste1() {
        int [] expected = {6,12};
        int [] result = Bloco4.vectorMultiplosComuns(4,12,new int[]{2,3});
        assertArrayEquals(expected,result);
    }
    @Test
    void vectorMultiplosComunsTeste2() {
        int [] expected = {4,8,12};
        int [] result = Bloco4.vectorMultiplosComuns(4,12,new int[]{2,4});
        assertArrayEquals(expected,result);
    }
    @Test
    void vectorMultiplosComunsTeste3() {
        int [] expected = {5,10,15};
        int [] result = Bloco4.vectorMultiplosComuns(5,15,new int[]{5});
        assertArrayEquals(expected,result);
    }
    //Ex 9 testes
    @Test
    void capicuaTeste1() {
        boolean expected = true;
        boolean result = Bloco4.capicua(121);
        assertEquals(expected,result);
    }
    @Test
    void capicuaTeste2() {
        boolean expected = true;
        boolean result = Bloco4.capicua(1221);
        assertEquals(expected,result);
    }
    @Test
    void capicuaTeste3() {
        boolean expected = true;
        boolean result = Bloco4.capicua(1);
        assertEquals(expected,result);
    }
    @Test
    void capicuaTeste4() {
        boolean expected = false;
        boolean result = Bloco4.capicua(12);
        assertEquals(expected,result);
    }
    @Test
    void capicuaTeste5() {
        boolean expected = false;
        boolean result = Bloco4.capicua(125);
        assertEquals(expected,result);
    }
    @Test
    void capicuaTeste6() {
        boolean expected = false;
        boolean result = Bloco4.capicua(1251);
        assertEquals(expected,result);
    }
    @Test
    void capicuaTeste7() {
        boolean expected = true;
        boolean result = Bloco4.capicua(12521);
        assertEquals(expected,result);
    }
    @Test
    void capicuaTeste8() {
        boolean expected = false;
        boolean result = Bloco4.capicua(12511);
        assertEquals(expected,result);
    }
    //Ex 10 testes
    //alinea a)
    @Test
    void menorElementoAteste1() {
        int expected = 1;
        int result = Bloco4.menorElementoA(new int[]{1, 2, 3, 4});
        assertEquals(expected,result);
    }
    @Test
    void menorElementoAteste2() {
        int expected = 2;
        int result = Bloco4.menorElementoA(new int[]{10, 2, 3, 4,2});
        assertEquals(expected,result);
    }
    //alinea b)
    @Test
    void maiorElementoBteste1() {
        int expected = 10;
        int result = Bloco4.maiorElementoB(new int[]{10, 2, 3, 4,2});
        assertEquals(expected,result);
    }
    @Test
    void maiorElementoBteste2() {
        int expected = 10;
        int result = Bloco4.maiorElementoB(new int[]{10, 2, 3, 10,2});
        assertEquals(expected,result);
    }
    //alinea c)
    @Test
    void mediaElementosCteste1() {
        double expected = 3;
        double result = Bloco4.mediaElementosC(new int[]{1, 2, 3, 4,5});
        assertEquals(expected,result,0.1);
    }
    @Test
    void mediaElementosCteste2() {
        double expected = 4.8;
        double result = Bloco4.mediaElementosC(new int[]{5, 4, 6, 4,5});
        assertEquals(expected,result,0.1);
    }
    //alinea d)
    @Test
    void produtoElementosDteste1() {
        int expected = 1;
        int result = Bloco4.produtoElementosD(new int[]{1, 1, 1, 1,1});
        assertEquals(expected,result);
    }
    @Test
    void produtoElementosDteste2() {
        int expected = 120;
        int result = Bloco4.produtoElementosD(new int[]{5, 4, 6});
        assertEquals(expected,result);
    }
    //alinea e)
    @Test
    void elementosUnicosTeste1() {
        int [] expected = {5,6,7};
        int [] result = Bloco4.elementosUnicos(new int[]{5,5,6,7});
        assertArrayEquals(expected,result);
    }
    @Test
    void elementosUnicosTeste2() {
        int [] expected = {2,1,7};
        int [] result = Bloco4.elementosUnicos(new int[]{1,2,1,7});
        assertArrayEquals(expected,result);
    }
    //alinea f)
    @Test
    void inverteVectorTeste1() {
        int [] expected = {7,1,2,1};
        int [] result = Bloco4.inverteVector(new int[]{1,2,1,7});
        assertArrayEquals(expected,result);
    }
    @Test
    void inverteVectorTeste2() {
        int [] expected = {7,6,5};
        int [] result = Bloco4.inverteVector(new int[]{5,6,7});
        assertArrayEquals(expected,result);
    }
    @Test
    void inverteVectorTeste3() {
        int [] expected = {3,4,3};
        int [] result = Bloco4.inverteVector(new int[]{3,4,3});
        assertArrayEquals(expected,result);
    }
    //alinea g)
    @Test
    void numerosPrimosTeste1() {
        int [] expected = {3,2};
        int [] result = Bloco4.numerosPrimos(new int[]{3,4,2});
        assertArrayEquals(expected,result);
    }
    @Test
    void numerosPrimosTeste2() {
        int [] expected = {1,5,7};
        int [] result = Bloco4.numerosPrimos(new int[]{10,1,5,7,4});
        assertArrayEquals(expected,result);
    }
    @Test
    void numerosPrimosTeste3() {
        int [] expected = {2,1,3,7};
        int [] result = Bloco4.numerosPrimos(new int[]{6,8,2,14,1,3,7});
        assertArrayEquals(expected,result);
    }
    //Ex 11 testes
    @Test
    void produtoEscalarTeste1() {
        int expected = 11;
        int result = Bloco4.produtoEscalar(new int[]{1, 2}, new int[]{3, 4});
        assertEquals(expected,result);
    }
    @Test
    void produtoEscalarTeste2() {
        int expected = 11;
        int result = Bloco4.produtoEscalar(new int[]{1,2}, new int[]{3,4,4});
        assertEquals(expected,result);
    }
    @Test
    void produtoEscalarTeste3() {
        int expected = 11;
        int result = Bloco4.produtoEscalar(new int[]{1,2,5}, new int[]{3,4});
        assertEquals(expected,result);
    }
}