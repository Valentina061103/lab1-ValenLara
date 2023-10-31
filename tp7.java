// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import java.util.Scanner; 
public class tp7 {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        /* Ejercicio 1 */
        System.out.println("Ejercicio 1 (ordenaremos los numeros ENTEROS de un array de menor a mayor)");
        int[] numeros={6,7,5,3,2,9};
        System.out.println("Array desordenado");
        System.out.println(Arrays.toString(numeros));
        Arrays.sort(numeros);
        System.out.println("Array ordenado");
        System.out.println(Arrays.toString(numeros));
        /*Ejercicio 2 */
        System.out.println("Ejercicio 2 (ordenar los numeros enteros de un array de mayor a menor)");
        Integer[] numeros2={6,7,5,3,2,9};
        System.out.println("Array desordenado");
        System.out.println(Arrays.toString(numeros2));
        Arrays.sort(numeros2, Collections.reverseOrder());
        System.out.println("Array ordenado");
        System.out.println(Arrays.toString(numeros2));
        /*Ejercicio 3 */ 
        System.out.println("Ejercicio 3(ordenar numeros flotantes de array de menor a mayor)");
        float[] numeros3={7.39f,6.35f,26.05f,9.45f};
        System.out.println("Array desordenado");
        System.out.println(Arrays.toString(numeros3));
        Arrays.sort(numeros3);
        System.out.println("Array ordenado");
        System.out.println(Arrays.toString(numeros3));
        /*Ejercicio 4 */
        System.out.println("Ejercicio 4(ordenar un array de numeros flotantes de mayor a menor)");
        Float [] numeros4={7.39f,6.35f,26.05f,9.45f};
        System.out.println("Array desordenado");
        System.out.println(Arrays.toString(numeros4));
        Arrays.sort(numeros4, new Comparator<Float>() {
            @Override
            public int compare(Float o1, Float o2) {
                return Float.compare(o2, o1); // Compara en orden descendente
            }
        });
        System.out.println("Array ordenado");
        System.out.println(Arrays.toString(numeros4));
        /*Ejercicio 5*/
        System.out.println("Ejercicio 5 (Ordenar un array de cadenas de texto en orden alfabético)");
        String [] array5={"diciembre", "enero", "agosto", "abril", "noviembre"};
        System.out.println("Array desordenado");
        System.out.println(Arrays.toString(array5));
        Arrays.sort(array5);
        System.out.println("Array ordenado");
        System.out.println(Arrays.toString(array5));
        /*Ejercicio 6 */
        System.out.println("Ejercicio 6 (Ordenar un array de cadenas de texto en orden inverso.)");
        String [] array6={"diciembre", "enero", "agosto", "abril", "noviembre"};
        System.out.println("Array original");
        System.out.println(Arrays.toString(array6));
        Arrays.sort(array6, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1); // Compara en orden inverso
            }
        });
        System.out.println("Array inverso lexicografico");
        System.out.println(Arrays.toString(array6));
        /*Ejercicio 10 */
        int[] array10 = {5, 2, 9, 1, 5, 6};

        System.out.println("Array sin ordenar:");
        imprimirArray(array10);

        ordenarSeleccion10(array10);

        System.out.println("\nArray ordenado:");
        imprimirArray(array10);

        
        /*Ejercicio 11 */
        System.out.println("Ejercicio 11	(Ordenar un array de números enteros utilizando el algoritmo de ordenamiento por inserción)");
        int [] arraySelec=new int[10];
        
            for (int i = 0; i < arraySelec.length; i++) {
                System.out.println("Ingrese el numero en el casillero "+ i);
                arraySelec[i]=scanner.nextInt();
            }
            ordenarArraySeleccion(arraySelec);
            System.out.println("Array Ordenado por Seleccion");
            for (int i : arraySelec) {
                    System.out.println("[ "+i+" ]");
            }
        /*Ejercicio 12 */
        System.out.println("Ejercicio 12(Ordenar un array de números enteros utilizando el algoritmo de ordenamiento por mezcla)");
        int [] arrayInser=new int[10];
        for (int i = 0; i < arrayInser.length; i++) {
            System.out.println("Ingrese el numero en el casillero "+ i);
            arrayInser[i]=scanner.nextInt();
            }
        ordenarArrayInsercion(arrayInser);
        System.out.println("Array Ordenado por Insercion");
            for (int i : arrayInser) {
                System.out.println("[ "+i+" ]");
            }
        /*Ejercicio 13*/
        System.out.println("Ejercicio 13 (Ordenar un array de números enteros utilizando el algoritmo de ordenamiento shell.)");
        int[] array = {9, 5, 7, 1, 3};
        System.out.println("Array original: " + Arrays.toString(array));

        // Ordenar el array utilizando el algoritmo de ordenamiento shell
        int n = array.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = array[i];
                int j;
                for (j = i; j >= gap && array[j - gap] > temp; j -= gap) {
                    array[j] = array[j - gap];
                }
                array[j] = temp;
            }
        }
        System.out.println("Array ordenado: " + Arrays.toString(array));
        /*Ejercicio 14 */
        System.out.println("Ejercicio 14(como ordenar el array de 20 enteros)");
        int[] array20 = new int[20];
        
        for (int i = 0; i < array20.length; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + ": ");
            array20[i] = scanner.nextInt();
        }
        System.out.println("Array original: ");
        for(int i : array20){
            System.out.print(i+",");
        }
        System.out.println("");
        System.out.print("¿Cómo deseas ordenar el array? (1)ASCENDENTE///(2) DESCENDENTE): ");
        int tipoOrdenamiento = scanner.nextInt();
        
        System.out.print("¿Qué método de ordenamiento deseas aplicar? (1)inserción///(2)burbuja///(3)selección: ");
        int metodoOrdenamiento = scanner.nextInt();
        
        if(tipoOrdenamiento==1){
            if (metodoOrdenamiento==1) {
                    insertionSort(array20);
                    for (int num : array20) {
                        System.out.print(num + " ");
                    }
                
            
            }else if (metodoOrdenamiento==2) {
                bubbleSortAsc(array);

                System.out.println("Array ordenado en forma ascendente:");
                for (int num : array) {
                    System.out.print(num + " ");}
            } else if (metodoOrdenamiento==3) {
                selectionSortAsc(array);
                System.out.println("Array ordenado en forma ascendente:");
                for (int num : array) {
                    System.out.print(num + " ");}
            }
        } else if (tipoOrdenamiento==2) {
            if (metodoOrdenamiento==1) {
                insertionSortDesc(array20);

                System.out.println("Array ordenado en forma descendente:");
                for (int num : array20) {
                    System.out.print(num + " ");
                }
            } else if (metodoOrdenamiento==2) {
                bubbleSortDesc(array20);

                System.out.println("Array ordenado en forma descendente:");
                for (int num : array20) {
                System.out.print(num + " ");}
            } else if (metodoOrdenamiento==3) {
                selectionSortDesc(array);

                System.out.println("Array ordenado en forma descendente:");
                for (int num : array) {
                    System.out.print(num + " ");
                }
            }
            scanner.close();
        }
    
    }public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
    }public static void insertionSortDesc(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] < key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }public static void bubbleSortDesc(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }public static void bubbleSortAsc(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Intercambiar los elementos si están en orden descendente
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    } public static void selectionSortAsc(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Intercambiar el elemento mínimo con el primer elemento no ordenado
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }  public static void selectionSortDesc(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] > array[maxIndex]) {
                    maxIndex = j;
                }
            }
            // Intercambiar el elemento máximo con el primer elemento no ordenado
            int temp = array[maxIndex];
            array[maxIndex] = array[i];
            array[i] = temp;
        }
    }public static void ordenarArraySeleccion(int []array){
        int aux=0;
        int min=0;
        for (int i = 0; i < array.length; i++) {
            min=i;
            for (int j = i+1; j < array.length; j++) {
                if (array[min]>array[j]){
                    min=j;
                }
            }
            aux=array[i];
            array[i]=array[min];
            array[min]=aux;
        }
    }public static void ordenarArrayInsercion(int []array){
        int aux=0;
        int pos=0;
            for (int i = 0; i < array.length; i++) {
                pos=i;
                aux=array[i];
                while(pos>0 && (array[pos-1]>aux)){
                    array[pos]=array[pos-1];
                    pos--;
                }
                array[pos]=aux;
            }
    }public static void ordenarSeleccion10(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }public static void imprimirArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    
    
    }
    
    