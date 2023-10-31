public class tp8 {
    //Imprimir matrices
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Salto de línea después de cada fila
        }
    }
    //1
    public static int[][] sumarMatrices(int[][] matriz1, int[][] matriz2) {
        int filas = matriz1.length;
        int columnas = matriz1[0].length;
        // Verificar si las matrices son del mismo tamaño
        if (filas != matriz2.length || columnas != matriz2[0].length) {
            throw new IllegalArgumentException("Las matrices deben tener el mismo tamaño");
        }
        int[][] resultado = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        return resultado;
    }
    //2
    public static int[][] multiplicarMatrices(int[][] matriz1, int[][] matriz2) {
        int filas = matriz1.length;
        int columnas = matriz1[0].length;
        // Verificar si las matrices son del mismo tamaño
        if (filas != matriz2.length || columnas != matriz2[0].length) {
            throw new IllegalArgumentException("Las matrices deben tener el mismo tamaño");
        }
        int[][] resultado = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matriz1[i][j] * matriz2[i][j];
            }
        }
        return resultado;
    }
    //3
    public static int[][] matrizTranspuesta(int[][] matriz1) {
        int filas = matriz1.length;
        int columnas = matriz1[0].length;
        //Cambio filas por columnas y columnas por filas
        int[][] resultado = new int[columnas][filas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                //Intercambio los valores
                resultado[j][i] = matriz1[i][j];
            }
        }
        return resultado;
    }
    //4
    public static boolean igualdadMatricesTranspuestas(int[][] matriz1, int[][] matriz2) {
        int filas = matriz1.length;
        int columnas = matriz1[0].length;
        // Verificar si las matrices son del mismo tamaño
        if (filas != matriz2.length || columnas != matriz2[0].length) {
            throw new IllegalArgumentException("Las matrices deben tener el mismo tamaño");
        }
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz1[i][j] != matriz2[i][j]) {
                return false; // Si hay alguna diferencia, retorna false
                }
            }
        }
    return true; // Si no se encontraron diferencias, retorna true
    }
    //6
    public static int sumarElementosMatriz(int[][] matriz1) {
        int filas = matriz1.length;
        int columnas = matriz1[0].length;
        int resultado = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado += matriz1[i][j];
            }
        }
        return resultado;
    }

    //7
    public static int[] EncontrarMayorValor(int[][] matriz1) {
        int mayor= matriz1[0][0];
        int posf = 0;
        int posc = 0;
        int filas = matriz1.length;
        int columnas = matriz1[0].length;

        for (int f = 0; f < filas; f++) {
            for (int c = 0; c < columnas; c++) {
                if(matriz1[f][c]> mayor){
                    mayor = matriz1[f][c];
                    posf = f;
                    posc = c;
                }
            }
        }
        //Devuelve los valores en un array
        int[] resultado = {mayor, posf, posc};
        return resultado;
    }
    //8
    public static int sumaFilaMatriz(int[][] matriz, int fila) {
        int suma = 0;
        int columnas = matriz[0].length;
        if (fila < 0 || fila >= matriz.length) {
            throw new IllegalArgumentException("Fila fuera de rango");
        }
        for (int c = 0; c < columnas; c++) {
            suma += matriz[fila][c];
        }
        return suma;
    }
    //9
    public static boolean verificarMatrizDiagonal(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                //Controla que los elementos que no formen parte de la diagonal principal, sean distintos de 0
                if (i != j && matriz[i][j] != 0) {
                    // Si un elemento no es cero, no es diagonal
                    return false;
                }
            }
        }
        // Si todas las verificaciones son validas, la matriz es diagonal
        return true;
    }
    //10
    public static int[][] matrizIdentidad(int n){
        int[][] matriz = new int[n][n];
        for(int f = 0; f < n; f++){
            for(int c = 0; c < n; c++){
                if(f == c){
                    matriz[f][c]= 1;
                }else{
                    matriz[f][c]=0;
                }
            }
        }
        return matriz;
    }
    //11
    public static int[] CantParesImpares(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int pares =0;
        int impares =0;
        for (int f = 0; f < filas; f++) {
            for (int c = 0; c < columnas; c++) {
                if(matriz[f][c]%2==0){
                    pares+= 1;
                }else{
                    impares+= 1;
                }
            }
        }
        //Devuelve los valores en un array
        int[] resultado = {pares, impares};
        return resultado;
    }
    //12
    public static int[][] rotarMatriz90Grados(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        //Invertimos filas y columnas
        int[][] matrizRotada = new int[columnas][filas];
        // Rellenamos la nueva matriz con los elementos rotados
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizRotada[j][filas - 1 - i] = matriz[i][j];
            }
        }
        return matrizRotada;
    }
    //13
    public static int CantAparicionesNum(int[][] matriz,int numRpetido) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int repeticiones =0;
        for (int f = 0; f < filas; f++) {
            for (int c = 0; c < columnas; c++) {
                if(matriz[f][c]== numRpetido){
                    repeticiones+= 1;
                }
            }
        }
        return repeticiones;
    }
    //14
    public static int[][] invertirFilas(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] matrizFilas = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizFilas[i][j]=  matriz[filas-1-i][j];
            }
        }
        return matrizFilas;
    }
    //15
    public static int sumarDiagonales(int[][] matriz) {
        int dimension = matriz.length;
        int sumaDiagonales = 0;
        // Sumar la diagonal principal
        for (int i = 0; i < dimension; i++) {
            sumaDiagonales += matriz[i][i];
        }
        // Sumar la diagonal secundaria
        for (int i = 0; i < dimension; i++) {
            sumaDiagonales += matriz[i][dimension - 1 - i];
        }
        return sumaDiagonales;
    }
    //17
    public static int[] minimoPorFila(int[][] matriz) {
        int min = matriz[0][0];
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[] minimos = new int[filas]; //para almacenar los mínimos por fila
        for (int i = 0; i < filas; i++) {
            for (int j = 1; j < columnas; j++) {
                if (matriz[i][j] < min) {
                    min = matriz[i][j]; 
                }
            }
            //Dentro de for
            minimos[i] = min; //Guarda el valor en el array
        }
        return minimos;
    }
    //18
    public static int[][] productoMatrices (int[][] matriz, int[][]matriz2){
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int filas2 = matriz2.length;
        int columnas2 = matriz2[0].length;
        int[][] resultado = new int[filas][columnas];

        if (filas!=columnas2 || columnas!=filas2){
            return null;
        }else{
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    resultado[i][j] = matriz[i][j]*matriz2[j][i];
                }
            }
        }
        return resultado;
    }


    public static void main(String[] args) throws Exception {
        int[][] matriz1 = {
            {1, 2, 3},
            {4, 5, 6},
        };
        int[][] matriz2 = {
            {1, 2, 3},
            {4, 5, 6},
        };
        //1. Sumar dos matrices
        int[][] resultadoSuma = sumarMatrices(matriz1, matriz2);
        System.out.println("El resultado de sumar 2 matrices: ");
        imprimirMatriz(resultadoSuma);

        //2. Multiplicar dos matrices
        int[][] resultadoMulti = multiplicarMatrices(matriz1, matriz2);
        System.out.println("El resultado de multiplicar 2 matrices: ");
        imprimirMatriz(resultadoMulti);

        //3 Matriz transpuesta
        int[][] resultadoTraspuesta = matrizTranspuesta(matriz1);
        System.out.println("matriz transpuesta: ");
        imprimirMatriz(resultadoTraspuesta);

        //4 verifica que la matris original y la traspuesta son iguales
        int[][] matrizOriginal = {
            {1, 2, 3},
            {2, 1, 2},
            {3, 2, 1},
        };
        int[][] matTraspuesta = matrizTranspuesta(matrizOriginal);
        boolean iguales = igualdadMatricesTranspuestas(matrizOriginal, matTraspuesta);
        if(iguales){
            System.out.println("Las matrices ingresadas son iguales");
        } else {
            System.out.println("Las matrices no son iguales");
        }
        // Imprimir la matriz 
        System.out.println("La matriz original es: ");
        imprimirMatriz(matrizOriginal);

        //6 Sumar los elementos de una matriz
        int resultadoSumElementos = sumarElementosMatriz(matrizOriginal);
        System.out.println("La suma de los elementos es: "+ resultadoSumElementos);

        //7 Encontrar el mayor elemento y su posicion en la matriz
        System.out.println("En la matriz: ");
        imprimirMatriz(matriz1);
        int[] resultado = EncontrarMayorValor(matriz1);
        int mayor = resultado[0];
        int posf = resultado[1];
        int posc = resultado[2];
        System.out.println("El número más grande es " + mayor + " en la posición [" + posf + "][" + posc + "]");

        //8 sumar los elementos deuna fila específica
        int filaDeseada = 1; // La fila a sumar
        int suma = sumaFilaMatriz(matriz1, filaDeseada);
        System.out.println("La suma de la fila " + filaDeseada + " es: " + suma);

        //9 Matriz diagonal
        int[][] matrizDiagonal = {
            {4, 0, 0},
            {0, 2, 0},
            {0, 0, 1},
        };
        boolean diagonal = verificarMatrizDiagonal(matrizDiagonal);
        System.out.println("Verificar que la matriz sea diagonal o no: ");
        imprimirMatriz(matrizDiagonal);
        if (diagonal){
            System.out.println("La matriz cumple con los criterios para ser diagonal");
        } else{
            System.out.println("La matriz no es diagonal");
        }

        //10 Matriz identidad
        int tamano = 4;//definir tamaño de la matriz identidad a crear
        int[][] resultadoMatrizIdentidad = matrizIdentidad(tamano);
        System.out.println("Matriz Identidad de tamaño "+ tamano);
        imprimirMatriz(resultadoMatrizIdentidad);

        //11 cant pares e impares
        System.out.println("En la matriz: ");
        imprimirMatriz(matriz1);
        int[] paresImpares = CantParesImpares(matriz1);
        int par = paresImpares[0];
        int impar = paresImpares[1];
        System.out.println("Cantidad de pares: "+par+"\nCantidad de impares: "+impar);

        //12 crear una matriz con los valores invertidos 90 grados
        int[][] girarMatriz = rotarMatriz90Grados(matriz1);
        System.out.println("Al girar la amtriz 90 grados queda: ");
        imprimirMatriz(girarMatriz);

        //13 cantidad de veces que aparece un número 
        System.out.println("En la matriz: ");
        imprimirMatriz(matrizOriginal);
        int numBuscar = 3;
        int numeroRep = CantAparicionesNum(matrizOriginal,numBuscar);
        System.out.println("El número "+ numBuscar+" aparece "+numeroRep+" en la matriz");

        //14 Nueva matriz que invierte las filas de la matriz original
        int[][] cambiarFilas = invertirFilas(matrizOriginal);
        System.out.println("Resultado de invertir las filas de la matriz: ");
        imprimirMatriz(cambiarFilas);

        //15 Sumar los elementos en las posiciones diagonales
        int SumElementosDiagonal = sumarDiagonales(matrizOriginal);
        System.out.println("La suma de los elementos ubicados en las diagonales es: "+ SumElementosDiagonal);
        
        //17 valores minimos por fila
        int[] minimos = minimoPorFila(matrizOriginal);
        for (int i = 0; i < minimos.length; i++) {
            System.out.println("Mínimo de la fila " + (i+1) + ": " + minimos[i]);
        }

        //18 Calcular el producto de matrices de diferentes tamaños
        int[][] matriz3 = {
            {1, 2},
            {4, 5},
            {6, 7},
        };
        System.out.println("El producto de matrices es: ");
        int [][] prodMatriz = productoMatrices(matriz1, matriz3);
        imprimirMatriz(prodMatriz);
    }
}
