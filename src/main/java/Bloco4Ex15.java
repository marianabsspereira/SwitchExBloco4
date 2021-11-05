public class Bloco4Ex15 {
    public static void main(String[] args){

    }
    //a)
    public static int menorValorMatriz (int [][] matrizIn) throws Exception {
        int resultado = matrizIn[0][0];
        int verificaNumCol = Bloco4.numeroColunasMatriz(matrizIn);

        if (verificaNumCol == -1){
            throw new Exception("Objecto recebido não é uma matriz");
        }

        for (int i = 0; i < matrizIn.length; i++){
            for (int j = 0; j < matrizIn[0].length; j++){
                if (resultado > matrizIn[i][j]){
                    resultado = matrizIn[i][j];
                }
            }
        }

        return resultado;
    }
    //b)
    public static int maiorValorMatriz (int [][] matrizIn) throws Exception {
        int resultado = matrizIn[0][0];
        int verificaNumCol = Bloco4.numeroColunasMatriz(matrizIn);

        if (verificaNumCol == -1){
            throw new Exception("Objecto recebido não é uma matriz");
        }

        for (int i = 0; i < matrizIn.length; i++){
            for (int j = 0; j < matrizIn[0].length; j++){
                if (resultado < matrizIn[i][j]){
                    resultado = matrizIn[i][j];
                }
            }
        }

        return resultado;
    }
    //c)
    public static double mediaValoresMatriz (int [][] matrizIn) throws Exception {
        double media;
        int soma = 0;
        int verificaNumCol = Bloco4.numeroColunasMatriz(matrizIn);

        if (verificaNumCol == -1 || matrizIn.length == 0 || matrizIn[0].length == 0 ){
            throw new Exception("Objecto recebido não é uma matriz");
        }

        for (int i = 0; i < matrizIn.length; i++){
            for (int j = 0; j < matrizIn[0].length; j++){
                soma += matrizIn[i][j];
            }
        }

        media =  (double) soma / (matrizIn.length * matrizIn[0].length);

        return media;
    }
    //d)
    public static int produtoValoresMatriz (int [][] matrizIn) throws Exception {
        int produto = 1;
        int verificaNumCol = Bloco4.numeroColunasMatriz(matrizIn);

        if (verificaNumCol == -1 || matrizIn.length == 0 || matrizIn[0].length == 0 ){
            throw new Exception("Objecto recebido não é uma matriz");
        }

        for (int i = 0; i < matrizIn.length; i++){
            for (int j = 0; j < matrizIn[0].length; j++){
                produto = produto * matrizIn[i][j];
            }
        }

        return produto;
    }
}
