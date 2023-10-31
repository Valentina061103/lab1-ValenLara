import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class ejerciciosArray {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rad = new Random();

    //1
    int[] array1 = new int [10];
    for(int i = 0; i<10; i++){
        array1[i] = i;
        System.out.println(array1[i]);
    }

    //2
    int[] arrayprimos = {2,3,5,7,11,13,17,19,23,29};
    System.out.println("Primeros 10 numeros primos: ");
    for(int t = 0; t < arrayprimos.length; t++){
        System.out.println(arrayprimos[t]);
    }

    //3
    int [][] numerosEnteros = new int [10][10];
    for(int i=0;i<10;i++){
        for(int t = 0; t<10; t++){
            numerosEnteros[i][t] = rad.nextInt(50);
        }
        System.out.println(" ");
    }
    System.out.println("El array de numeros enteros es: ");
    for (int i = 0; i <10; i++){
        for(int t = 0; t<10; t++){
            System.out.print(numerosEnteros[i][t] + " ");
        }
        System.out.println(" ");
    }

    //4
    double[][][] arrayTridimensional = new double[10][10][10];
    for(int i = 0; i <10; i++){
        for(int t = 0; t<10; t++){
            for (int x = 0; x<10; x++){
                arrayTridimensional[i][t][x] = rad.nextInt(50);
            }
            System.out.println(" ");
        }
    System.out.println("el array tridimensional de numeros enteros:");
    for(int x = 0; x < 10; x++){
        for(int t = 0; t < 10; t++){
            for(int y = 0; y <10; y++){
                System.out.println("array tridimensional [ " + x + "][" + t + "][" + y + "] = "+arrayTridimensional[x][t][y] + " ");
            }
        }
    }
}
    //5
    int[] array_teclado = new int[10];
    for (int i = 0; i < 10; i++){
        System.out.print("ingrese el numero " + i + ":");
        int num = scanner.nextInt();
        array_teclado[i] = num;
    }
    System.out.println("su array es: ");
    for(int i=0; i <10; i++){
        System.out.print(i + " ");
    }

    //6
    double[] array_teclado2 = new double[10];
    for (int i = 0; i < 10; i++){
        System.out.print("ingrese el numero " + i + ":");
        double num = scanner.nextDouble();
        array_teclado2[i] = num;
    }
    System.out.println("su array es: ");
    for(int i=0; i <10; i++){
        System.out.print(i + " ");
    }


     //7
    String[] array_carac = new String[5];
    for(int i = 0; i < 5; i++){
        System.out.println("ingrese un caracter: ");
        String caracter = scanner.nextLine();
        array_carac[i] = caracter;
    }
    System.out.println("su array es: ");
    for(int i =0; i < 5; i++){
        System.out.print(array_carac[i] + " ");
    }

    //8
    boolean[] array_bolean = new boolean[5];
    for(int i = 0; i < 5; i++){
        System.out.println("ingrese un dato booleano: ");
        boolean dato = scanner.nextBoolean();
        array_bolean[i] = dato;
    }
    System.out.println("su array es: ");
    for(int i = 0; i < 5; i++){
        System.out.print(array_bolean[i] + " ");
    }

    //9
    int[] array_sum = new int[10];
    System.out.println("su array es: ");
    for (int i = 0; i < 10; i++){
        array_sum[i] = rad.nextInt(20);
        System.out.print(array_sum[i] + " ");
    }
    int suma = 1;
    for (int i = 0; i < 10; i++){
        suma += array_sum[i];
    }
    System.out.println("\nla suma de los elementos del array es: " + suma);


    //10
    double[] multi_num = new double[10];
    System.out.println("su array es: ");
    for(int i =0; i <10; i++){
        multi_num[i] = rad.nextInt(20);
        System.out.print(multi_num[i] + " ");
    }
    double producto = 1;
    for (int i = 0; i <10; i++){
        producto *= multi_num[i];
    }
    System.out.println("el producto de los elemento del array es: " + producto);

    //11
    int[] num_burbuja = new int[10];
    System.out.println("el array es: ");
    for(int i = 0; i < 10; i++){
        num_burbuja[i] = rad.nextInt(20);
        System.out.println(num_burbuja[i] + " ");
    }
    //metodo burbuja
    for (int i = 0; i < num_burbuja.length - 1; i++ ){ 
        for( int j = 0; j < num_burbuja.length - 1 - i; j++){ 
            if (num_burbuja[j] > num_burbuja[j + 1]){ //si el numero de la pocision en la que estamos(supongamos num_burbuja[0]) es mas grande que la pocision siguiente(num_burnuja[0+1])
                int temp = num_burbuja[j]; //entra aca, donde a la variable tempe le asiganamos el valor de la posicion(en este caso num_burbuja[0] supongamos que es 9)
                num_burbuja[j] = num_burbuja[ j + 1]; //aca los cambia de lugar ahora la posicion num_burbuja[0] (9) va a valer lo que esta en la pocision num_burbuja[1] (5)
                num_burbuja[ j + 1] = temp; // y le asignamos el valor original de la posicion num_burbuja[0] (9) a la posicion num_burbuja[1] (5) entonces ahora la poscion num_burnuja[1] vale 9 
            }
        }
    }

    System.out.println("array ordenado de menor a mayor: ");
    for( int numero : num_burbuja){
        System.out.println(numero + " ");
    }

    //12
    // Definir un array de cadenas
    String[] cadenaArray = {"Manzana", "Banana", "Naranja", "Uva", "Pera", "Cereza", "Kiwi", "Limón", "Fresa", "Mango"};
        
    // Ordenar el array alfabéticamente
    Arrays.sort(cadenaArray);
    
    // Imprimir el array ordenado
    for (String cadena : cadenaArray) {
        System.out.println(cadena);
    }

    //13
    System.out.println("su array es: ");
    int[] numeros = new int[10];
    for (int i = 0; i < 10; i++){
        numeros[i] = rad.nextInt(30);
        System.out.print(numeros[i] + " ");
    }
    int cantidadPares = contarPares(numeros);
    System.out.println("\nla cantidad de numeros pares en este array es: " + cantidadPares);
    
    //14
    System.out.println("su array es: ");
    int[] diezMayores = new int[10];
    for (int i = 0; i < 10; i++){
        diezMayores[i] = rad.nextInt(30);
        System.out.print(diezMayores[i] + " ");
    }
    int cantidadMayores = mayoresDiez(diezMayores);
    System.out.println("\nla cantidad de numeros mayores a 10 es: " + cantidadMayores);

    //15
    System.out.println("su array es: ");
    int[] sumaArray = new int[10];
    for (int i = 0; i < 10; i++){
        sumaArray[i] = rad.nextInt(30);
        System.out.print(sumaArray[i] + " ");
    }
    int plus_variable = suma(sumaArray);
    System.out.println("\nLa suma de los numeros multiplos de 3 es: " + plus_variable);

    //16
    System.out.println("su array es: ");
    int[] maxArray = new int[10];
    for(int i = 0; i < 10; i++){
        maxArray[i] = rad.nextInt(30);
        System.out.print(maxArray[i] + " ");
    }

    int variableMax = maximo(maxArray);
    System.out.println("\nel numero mas grande del array es: " + variableMax);



        scanner.close();
    }
 //hacer un metodo13, tiene que estar dentro del main pero suera de las clase
    public static int contarPares (int[] numeros){ //[acceso] [modificador] [tipo (que tiene que ser el mismo que del valor que va retornar)] 'nombre de la funcion'([tipo NombreArgumento])
    int count = 0;
    for(int i = 0; i < numeros.length; i++ ){
        if (numeros[i] % 2 == 0){
            count++;
        }
    }
        return count;
    }
    //metodo14
    public static int mayoresDiez (int[] diezMayores){
        int t = 0;
        for(int i = 0; i < diezMayores.length; i++){
            if(diezMayores[i] > 10){
                t++;
            }
        }
        return t;
    }

    //metodo15
    public static int suma (int[] sumaArray){
        int plus = 0;
        for (int i = 0; i < sumaArray.length; i++){
            if(sumaArray[i] % 3 ==0){
                plus += sumaArray[i];
            }
        }
        return plus;
    }

    //metodo16
    public static int maximo (int[] maxArray){
        int max = maxArray[0];
        for(int i = 1; i < maxArray.length; i++){
            if(maxArray[i] > max){
                max = maxArray[i];
            }
        }
        return max;
    }

}

