public class Bloco4 {
    public static void main(String[] args){

    }
    //Ex 1
    public static int numeroDigitos (int numero){
        int contaALgarismos = 0;
        int i = 1;
        if (numero<0){
            numero = Math.abs(numero);
        }
        while (numero / i > 0){
            contaALgarismos ++;
            i = i * 10;
        }
        if (numero == 0){
            contaALgarismos = 1;
        }
        return contaALgarismos;
    }
    //Ex 2
    public static int [] vectorDigitos (int numero){
        int N = Bloco4.numeroDigitos(numero);
        int [] vector = new int[N];
        int j = 1;

        for (int i = (N - 1); i >= 0; i--){
            vector [i] = (numero / j) % 10;
            j = j * 10;
        }

        return vector;
    }
    //Ex 3
    public static int somaElementosVector (int [] vectorIn){
        int soma = 0;

        for (int i = 0; i < vectorIn.length; i++){
            soma += vectorIn [i];
        }

        return soma;
    }

    // Função auxiliar para replicar vectores e adicionar 1 elemento
    public static int [] novoVector (int [] old, int x){
        int [] newVector = new int[old.length+1];

        for (int i = 0; i < old.length; i++){
            newVector [i] = old [i];
        }

        newVector [old.length] = x;

        return newVector;
    }
    //Ex 4 // não fiz para impares porque é igual mas c/ vectorIn[i] % 2 != 0
    public static int [] elementosPares (int [] vectorIn){
        int [] vectorOut = new int[0]; //poderia iniciar logo com o tamanho do vectorIn mas dificulta os testes e prof diz q esta e melhor

        for (int i = 0; i < vectorIn.length; i++){
            if (vectorIn[i] % 2 == 0){
                vectorOut = novoVector(vectorOut,vectorIn[i]);
                //vectorOut [j] = vectorIn [i];
                //j++;
            }
        }

        return vectorOut;
    }
    //Ex 5 : Tb não fiz para impares (solução seria idêntica)
    public static int somaPares (int numero){
        int soma;
        //Devolve o nº em vector
        int [] vector = Bloco4.vectorDigitos(numero);
        //Devolve vector só com os pares
        int [] vectorPares = Bloco4.elementosPares(vector);
        //Devolve a soma dos elementos de vector
        soma = Bloco4.somaElementosVector(vectorPares);
        //Poderia ser directamente assim:
        //soma = Bloco4.somaElementosVector(Bloco4.elementosPares(Bloco4.vectorDigitos(numero)));

        return soma;
    }
    //Ex 6
    public static int [] primeirosNelementos (int [] vectorIn, int N){
        int [] vectorOut = new int [0];

        for (int i = 0; i < N; i++){
            vectorOut = novoVector(vectorOut,vectorIn[i]);
        }

        return vectorOut;
    }
    //Ex 7
    public static int[] vectorMultiplosX (int limInf, int limSup, int X){
        int [] vectorMultiplos = new int[0];

        if (limInf < limSup){
            for (int i = limInf; i <= limSup; i++){
                if (i % X == 0){
                    vectorMultiplos = novoVector(vectorMultiplos,i);
                }
            }
        } else {
            for (int i = limSup; i <= limInf; i++){
                if (i % X == 0){
                    vectorMultiplos = novoVector(vectorMultiplos,i);
                }
            }
        }

        return vectorMultiplos;
    }
    //Ex 8 : sem validação dos limites pq basicamente é fazer o mm do ex 7. Sem validação da / por 0
    public static int [] vectorMultiplosComuns (int limInf, int limSup, int [] N){
        int [] vectorMultiplosComuns = new int[0];
        int auxiliar = 0;

        for (int i = limInf; i <= limSup; i++){
            for (int j = 0; j < N.length; j++){
                if (i % N[j] == 0){
                    auxiliar++;
                }
            }
            if (auxiliar == N.length){
                vectorMultiplosComuns = novoVector(vectorMultiplosComuns,i);
            }
            auxiliar = 0;
        }

        return vectorMultiplosComuns;
    }
    //Ex 9 : ver ex 10 alinea f. Também dava para resolver este exercicio
    public static boolean capicua (int numero){
        boolean resultado = false;
        int [] vector = Bloco4.vectorDigitos(numero);
        int j = vector.length - 1;
        int auxiliar = 0;

        for (int i = 0; i < vector.length; i++){
            if (vector [i] == vector[j]){
               auxiliar++;
            }
            j--;
        }

        if (auxiliar == vector.length){
            resultado = true;
        }

        return resultado;
    }
    //Ex 10
    //alinea a)
    public static int menorElementoA (int[] vectorIn){
        int menor = vectorIn[0];

        for (int i = 0; i < vectorIn.length; i++){
            if (menor > vectorIn[i]){
                menor = vectorIn[i];
            }
        }

        return menor;
    }
    //alinea b)
    public static int maiorElementoB (int[] vectorIn){
        int maior = vectorIn[0];

        for (int i = 0; i < vectorIn.length; i++){
            if (maior < vectorIn[i]){
                maior = vectorIn[i];
            }
        }

        return maior;
    }
    //alinea c)
    public static double mediaElementosC (int[] vectorIn){
        double media;
        int soma = 0;

        for (int i = 0; i < vectorIn.length; i++){
            soma += vectorIn[i];
        }

        if (vectorIn.length == 0){ // só para não ter / 0
            media = 0;
        }

        media = (double) soma / (vectorIn.length);

        return media;
    }
    //alinea d)
    public static int produtoElementosD (int[] vectorIn){
        int produto = 1;

        for (int i = 0; i < vectorIn.length; i++){
            produto = produto * vectorIn[i];
        }

        return produto;
    }
    //alinea e)
    public static int [] elementosUnicos (int[] vectorIn){
        int [] vectorOut = new int[0];
        int auxiliar = 0;

        for (int i = 0; i < vectorIn.length; i++){
            for (int j = i + 1; j < vectorIn.length; j++){
                if (vectorIn[i] != vectorIn[j]){
                    auxiliar++;
                }
            }
            if (auxiliar == vectorIn.length - 1 - i){
                vectorOut = novoVector(vectorOut,vectorIn[i]);
            }
            auxiliar = 0;
        }

        return vectorOut;
    }
    //alinea f)
    public static int[] inverteVector (int[] vectorIn){
        int [] vectorOut = new int[vectorIn.length];
        int j = vectorIn.length - 1;

        for (int i = 0; i < vectorIn.length; i++){
            vectorOut[i] = vectorIn[j];
            j--;
        }

        return vectorOut;
    }
    //alinea g) : Para ter valores unicos bastava usar aqui a função elementosUnicos
    public static int[] numerosPrimos (int[] vectorIn){
        int [] vectorOut = new int[0];
        int auxiliar = 0;

        for (int i = 0; i < vectorIn.length; i++){
            for (int j = 2; j <= vectorIn[i] / 2; j++){
                if (vectorIn[i] % j == 0){
                    auxiliar++;
                }
            }
            if (auxiliar == 0){
                vectorOut = novoVector(vectorOut,vectorIn[i]);
            }
            auxiliar = 0;
        }

        return vectorOut;
    }
    //Ex 11
    public static int produtoEscalar (int[] v, int [] u){
        int produtoEscalar = 0;
        int N = v.length;

        if (N > u.length){
           N = u.length;
        }

        for (int i = 0; i < N; i++){
            produtoEscalar += v[i] * u[i];
        }

        return produtoEscalar;
    }
    //Não é um exercício: usando esta func da para criar os vectores c/ max de posições e ao fim reduzi-lo
    public static int[] reduzArray (int[] vectorIn, int N){
        int newSize = vectorIn.length - N;
        int [] vectorOut = new int[newSize];

        for (int i = 0; i < newSize; i++){
            vectorOut[i] = vectorIn[i];
        }

        return vectorOut;
    }
    //Ex 12: myMat = new double[Lines][Columns]; throws Exception -> tem de estar aqui pq não trato as excepções
    public static int numeroColunasMatriz (int[][] matrizIn) throws Exception {
        int contaColunasLinhaActual;
        int contaColunasLinhaSeguinte;
        int resultado;

        if (matrizIn.length == 0 || matrizIn[0].length == 0){
            throw new Exception("Objecto recebido não é uma matriz");
        }

        for (int i = 0; i < matrizIn.length - 1; i++){
            contaColunasLinhaActual = matrizIn[i].length;
            contaColunasLinhaSeguinte = matrizIn[i+1].length;

            if (contaColunasLinhaActual != contaColunasLinhaSeguinte){
                resultado = -1;
                return resultado;
            }
        }

        resultado = matrizIn[0].length;
        return resultado;
    }
    //Ex 13
    public static boolean verificaMatrizQuadrada (int[][] matrizIn) throws Exception {
        boolean resultado = false;
        int numColMatriz;

        numColMatriz = Bloco4.numeroColunasMatriz(matrizIn);

        if (numColMatriz != -1 && matrizIn.length == numColMatriz){
            resultado = true;
        }

        return resultado;
    }
    //Ex 14
    public static boolean verificaMatrizRectangular (int[][] matrizIn) throws Exception {
        boolean resultado = false;
        int numColMatriz;

        numColMatriz = Bloco4.numeroColunasMatriz(matrizIn);

        if (numColMatriz != -1 && matrizIn.length != numColMatriz){
            resultado = true;
        }

        return resultado;
    }
}
