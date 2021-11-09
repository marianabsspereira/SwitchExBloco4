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
    //e) com 2 funções "auxiliares" e sem validação de dados
    public static int[] matrizValoresUnicos (int[][] matrizIn){
        int[] vetorzOut = new int[matrizIn.length * matrizIn[0].length];
        int count = 0;

        for (int i = 0; i < matrizIn.length; i++){
            for (int j = 0; j < matrizIn[i].length; j++){
                if (!valorRepetido(matrizIn, matrizIn[i][j])){
                    vetorzOut[count] = matrizIn[i][j];
                    count++;
                }
            }
        }

        return copyVector (vetorzOut, count);
    }

    private static int[] copyVector(int[] vetorIn, int count) {
        int [] vectorCopy = new int[count];

        for (int i = 0; i < count; i++){
            vectorCopy [i] = vetorIn[i];
        }

        return vectorCopy;
    }

    public static boolean valorRepetido(int[][] matrizIn, int N) {
        int count = 0;
        boolean result = false;

        for (int i = 0; i < matrizIn.length; i++){
            for (int j = 0; j < matrizIn[i].length; j++){
                if (N == matrizIn[i][j]){
                    count++;
                }
            }
        }

        if (count > 1){
            result = true;
        }

        return result;
    }
    //f)
    public static int[] matrizValoresPrimos (int[][] matrizIn){
        int[] vetorOut = new int[matrizIn.length * matrizIn[0].length];
        int count = 0;

        for (int i = 0; i < matrizIn.length; i++){
            for (int j = 0; j < matrizIn[i].length; j++){
                if (valorPrimo(matrizIn[i][j])){
                    vetorOut[count] = matrizIn[i][j];
                    count++;
                }
            }
        }

        return copyVector (vetorOut, count);
    }

    private static boolean valorPrimo(int N) {
        boolean result = false;
        int count = 0;

        for (int i = 2; i <= N/2; i++){
            if (N % i == 0 && N != i){
                count++;
            }
        }

        if (count == 0 || N == 1){
            result = true;
        }

        return result;
    }
    //g)
    public static int[] matrizDiagonalPrincipal (int[][] matrizIn){
        int[] vetorOut = new int[matrizIn.length * matrizIn[0].length];
        int count = 0;

        for (int i = 0; i < matrizIn.length; i++){
            for (int j = 0; j < matrizIn[i].length; j++){
                if (i == j){
                    vetorOut[count] = matrizIn[i][j];
                    count++;
                }
            }
        }

        return copyVector (vetorOut, count);
    }
    //h)
    public static int[] matrizDiagonalSecundaria (int[][] matrizIn){
        int[] vetorOut = new int[matrizIn.length * matrizIn[0].length];
        int count = 0;
        int menorDim = matrizIn.length - 1;

        if (menorDim > matrizIn[0].length - 1){
            menorDim = matrizIn[0].length - 1;
        }

        for (int i = 0; i < matrizIn.length; i++){
            for (int j = 0; j < matrizIn[i].length; j++){
                if (j == menorDim){
                    vetorOut[count] = matrizIn[i][j];
                    count++;
                }
            }
            menorDim--;
        }

        return copyVector (vetorOut, count);
    }
    //i)
    public static boolean matrizIdentidade (int[][] matrizIn) throws Exception {
        boolean result = true;
        int verificaColunas = Bloco4.numeroColunasMatriz(matrizIn);

        if (verificaColunas == -1 || !Bloco4.verificaMatrizQuadrada(matrizIn)){
            return false;
        }

        int [] vectorDiagonal = Bloco4Ex15.matrizDiagonalPrincipal(matrizIn);

        for (int i = 0; i < vectorDiagonal.length; i++){
            if (vectorDiagonal[i] != 1){
                return false;
            }
        }

        for (int i = 0; i < matrizIn.length; i++){
            for (int j = 0; j < matrizIn[0].length; j++){
                if (i != j && matrizIn[i][j] != 0){
                    return false;
                }
            }
        }

        return result;
    }
    //j)
    public static int[][] matrizInversa (int[][] matrizIn){
        int[][] matrizOut = new int[matrizIn.length][matrizIn.length];

        return matrizOut;
    }
}
