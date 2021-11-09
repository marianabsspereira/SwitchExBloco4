public class Bloco4Ex16 {
    public static void main(String[] args){
    }
    //Ex 16
    public static int determinante (int[][] matrizIn) throws Exception {
        int det;
        int soma = 0;
        int[][] matrizAux;

        if (!Bloco4.verificaMatrizQuadrada(matrizIn)) {
            return 0;//mudar
        }
        if (matrizIn.length == 1) {
            det = matrizIn[0][0];
            return det;
        }
        if (matrizIn.length == 2) {
            det = Bloco4.produtoElementosD(Bloco4Ex15.matrizDiagonalPrincipal(matrizIn))
                    - Bloco4.produtoElementosD(Bloco4Ex15.matrizDiagonalSecundaria(matrizIn));
            return det;
        }
        if (matrizIn.length == 3) {
            det = (matrizIn[0][0]*matrizIn[1][1]*matrizIn[2][2] + matrizIn[0][1]*matrizIn[1][2]*matrizIn[2][0] +
                    matrizIn[0][2]*matrizIn[1][0]*matrizIn[2][1]) - (matrizIn[0][0]*matrizIn[1][2]*matrizIn[2][1] +
                    matrizIn[0][1]*matrizIn[1][0]*matrizIn[2][2] + matrizIn[0][2]*matrizIn[1][1]*matrizIn[2][0]);
            return det;
        }
        for (int i = 0; i < matrizIn.length; i++){
            for (int j = 0; j < matrizIn.length; j++){
                matrizAux = reduzMatriz(i,j,matrizIn);
                //int x = (int)Math.pow(-1,(i+1+j+1));
                //int y = Bloco4Ex16.determinante(matrizAux);
                soma += matrizIn[i][j] * (int)Math.pow(-1,(i+1+j+1)) * Bloco4Ex16.determinante(matrizAux);
            }
        }
        det = soma;
        return det;
    }

    public static int[][] reduzMatriz(int i, int j, int[][] matrizIn) {
        int [][] matrizOut = new int[matrizIn.length-1][matrizIn.length-1];
        int linhas = 0;
        int colunas = 0;
        int count = 0;

        for (int x = 0; x < matrizIn.length; x++){
            for (int y = 0; y < matrizIn.length; y++){
                if (x != i && y != j){
                    matrizOut[linhas][colunas] = matrizIn[x][y];
                    colunas++;
                    count++;
                }
            }
            if (count != 0){
                linhas++;
            }
            count = 0;
            colunas = 0;
        }
        return matrizOut;
    }

}
