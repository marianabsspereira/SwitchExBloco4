import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bloco4Ex16Test {

    @Test
    void determinanteTeste1() throws Exception {
        int expected = 7;
        int result = Bloco4Ex16.determinante(new int[][]{{2,1},{-3,2}});
        assertEquals(expected,result);
    }
    @Test
    void determinanteTeste2() throws Exception {
        int expected = 18;
        int result = Bloco4Ex16.determinante(new int[][]{{2,1,2},{-3,4,1},{3,2,5}});
        assertEquals(expected,result);
    }
    @Test
    void determinanteTeste3() throws Exception {
        int expected = 210;
        int result = Bloco4Ex16.determinante(new int[][]{{4,5,-3,0},{2,-1,3,1},{1,-3,2,1},{0,2,-2,5}});
        assertEquals(expected,result);
    }
    //Func. auxiliar
    @Test
    void reduzMatrizTeste1() {
        int [][] expected = {{-3,4},{3,2}};
        int [][] result = Bloco4Ex16.reduzMatriz(0,2,new int[][]{{2,1,2},{-3,4,1},{3,2,5}});
        assertArrayEquals(expected,result);
    }
    @Test
    void reduzMatrizTeste2() {
        int [][] expected = {{2,2},{3,5}};
        int [][] result = Bloco4Ex16.reduzMatriz(1,1,new int[][]{{2,1,2},{-3,4,1},{3,2,5}});
        assertArrayEquals(expected,result);
    }
}