import java.util.Random;
import java.util.Scanner; //importamos el metodo random
public class tp4 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rad = new Random(); //lo inicializamos y lo llamamos 'rad'
        //1
        int [] numeros = new int[10]; ///declaramos el array, su tipo y su capacidad
        int countPositivos = 0; //delaramos variables para contar la cantidad de numeros positivos ingresado
        int countNegativos = 0; //y una para los negativos, las inicializamos en 0
        int sumaPositivos = 0;//declaramos una variable para que guarde la suma de todos los numeros positivos ingresado
        int sumaNegativos = 0;//y tambien uno de los negativos, las inicializamos en cero

        for (int i = 0; i < 10; i++){ //usamos un for para recorrer el array, dclaramos el contador, lo inializamos en cero, le pasamos los parametros del array y que vaya contando de uno en uno
            System.out.println("introduce un numero entero: ");
            int numero = scanner.nextInt(); //declaramos una variable dentro del for donde guardar lo que el usuario ingrese por teclado
            numeros[i] = numero; //asiganamos a la pocision del array el numero de ronda que vaya 'i'(que va reccorer las 10 pocisiones de nuestro array) y a esa pocision de le asiganmos el valor de la varible "numero", todas las vueltas hace lo mismo hasta que completa el array

            if (numero>0){ //con un if hacemos la condicion de que si el numero ingresado es positivo (numero>0)
                sumaPositivos += numero; //pasa a esta linea donde sumamos todos los numero positivos que se ingresan y guaradmos el resultado en esta varible(sumaPositivos)
                countPositivos ++; //y al mismo tiempo hace esta linea donde suma 1 al contador cada vez que se ingrese un numero positivo
            } else if (numero < 0){ //en este else if hacemos lo mismo pero con la cndicion que los numeros tiene que ser negativos
                sumaNegativos += numero;
                countNegativos++;
            }
        }
        //ahora con if afuera del for averiguamos la media de los positivos ingresados
        if (countPositivos>0){ //con esta condiciones evaluamos que se hayan ingresado numeros positivos (si el contador "countPositivos" no es 0)
        double mediaPositivos = sumaPositivos/countPositivos; //en esta linea declaramos una varible donde guardar el resultado de dividir la suma de los numeros positivos ingresados dividido la cantidad de numeros positivos ingresados (el promedio) 
        System.out.println("La media de los valores positivos ingresados: " + mediaPositivos);
        } else{
            System.out.println("no se ingresaron valores positivos");
        }
        //con otro if averiguamos la media (promedio) de los valores negativos ingresados, repitiendo el procedimiento anterior
        if(countNegativos>0){
            double mediaNegativos = sumaNegativos/countNegativos;
            System.out.println("La media de los valores negativos ingresados es: " + mediaNegativos);
        } else {
            System.out.println("no se ingresaron valores negativos");
        }

        //2
        int[] numbers = new int[10];
        int count_even = 0;
        int suma_even = 0;
        for (int t = 0; t<10; t++){
            System.out.println("ingrese un numero entero: ");
            int number = scanner.nextInt();
            numbers[t] = number;
            if(t%2 == 0 || t == 0){
                suma_even += number;
                count_even++;
            }
        }
        int media = suma_even/count_even;
        System.out.println("la media de los numero guardados en posiciones pares es de: " + media);

        //3
        System.out.println("Ingrese la cantidad alumnos/as:");
        int amout_students = scanner.nextInt();
        double plus_grades = 0;
        double[] students = new double[amout_students];
        for (int s = 0; s<amout_students; s++){
            System.out.print("ingrese la nota del alumno/a " + s + ": ");
            double student_grade = scanner.nextDouble();
            students[s] = student_grade;
            plus_grades += student_grade;
        }

        double students_media = plus_grades/amout_students;
        System.out.println("El promedio general de la clase es de: " + students_media);

        for (int m = 0; m<amout_students; m++){
            if (students[m] > students_media){
                System.out.println("el alumno/a " + m + " tiene una nota superior a la media (" + students_media +  ") con una nota de '" + students[m] +  "'");
            }
        }

        //4
        int[] Pares = new int[20];  // Crear un array de 20 elementos para almacenar los números pares

        // Llenar el array con los primeros 20 números pares
        for (int i = 0, num = 2; i < 20; num += 2, i++) {
            Pares[i] = num;
        }

        // Mostrar el contenido del array en la pantalla
        System.out.println("Contenido del array 'Pares':");
        for (int i = 0; i < 20; i++) {
            System.out.println("Pares[" + i + "] = " + Pares[i]);
        }

        //5
        int[] diez_10  = new int[10];
        int posit = 0;
        int negat = 0;
        int cero = 0;
        for (int e = 0; e < 10; e++){
            System.out.print("ingrese un numero entero: ");
            int num = scanner.nextInt();
            diez_10[e] = num;
            if (num>0){
                posit++;
            }else if (num<0){
                negat++;
            }else if (num == 0){
                cero++;
            }
        }
        System.out.println("Positivos ingresados: " + posit);
        System.out.println("Negativos ingresados: " + negat);
        System.out.println("Ceros ingresados: " + cero);

        //6
        int[] array = new int[10];
        int contnega = 0;
        int contposi = 0;
        int positsuma= 0;
        int negatisuma = 0;
        for ( int a = 0; a < 10; a++){
            System.out.print("ingrese un numero entero:");
            int numb = scanner.nextInt();
            array[a] = numb;
            if(numb>0){
                contposi++;
                positsuma += numb;
            } else if (numb<0){
                contnega++;
                negatisuma += numb;
            }
        }
        int mediaposit = positsuma/contposi;
        int medianegat = negatisuma/contnega;
        System.out.println("el promedio de los numeros positivos es de: " + mediaposit);
        System.out.println("el promedio de los numeros negativos ingresados: " + medianegat);

        //7
        int amount_people = 0;
        do{
            System.out.println("Ingrese la cantidad de personas que quiere medir: ");
            amount_people = scanner.nextInt();
            if (amount_people<0){
                System.out.println("Ingrese un numero positivo");
            }
        }while(amount_people<0);

        int[] people = new int[amount_people];
        int plus_people = 0;
        for (int k = 0; k<amount_people; k++){
            System.out.println("ingrese la altura de la persona " + k + " en centimetros");
            int hight = scanner.nextInt();
            people[k] = hight;
            plus_people += hight;
        }
        double media_people = (plus_people/amount_people);
        System.out.println("el promedio de altura es de: " + media_people);

        for(int y =0; y<amount_people; y++){
            if (people[y] > (media_people)){
                System.out.println("la persona " + y + " tiene una altura de " + people[y] + "  que es superior a la media de " + media_people);
            }else if (people[y] < (media_people)){
                System.out.println("la persona " + y + " tiene una altura de " + people[y] + " que es inferior a la media de " + media_people);
            }
        }

        //8
        int[] salary = new int[20];
        String[] names = new String[20];

        for (int cont = 0; cont <20; cont++){
            System.out.println("ingrese el nombre del empleado " + cont + " :");
            String name_employee = scanner.nextLine();
            names[cont] = name_employee;
            System.out.println("ingrese el salario: ");
            int salary_employee = scanner.nextInt();
            salary[cont] = salary_employee;

            scanner.nextLine(); //Consumir el carácter de nueva línea después de nextInt()
        }
        int biggest_salary = salary[0];
        int position_name = 0;
        for (int cont2 = 0; cont2<20;cont2++){
            if(salary[cont2] > biggest_salary){
                biggest_salary = salary[cont2];
                position_name = cont2;
            }
        }
        System.out.println("el empleado que mas gana es: " + names[position_name] + " con un salario de " + biggest_salary);

        //9
        int[] array_rad = new int[10];
        int desde = 1; //variables con el limite de numeros entre los que se va
        int hasta = 100; //buscar el random para llenar el array

        for (int h = 0; h < array_rad.length; h++){ //"nombredelarray".lenght se usa para cuando no sabemos el largo del array
            int numeroAleatorio = rad.nextInt(hasta - desde + 1) + desde; //formula para general numero alateorio
            array_rad[h] = numeroAleatorio;
        }

        for(int g = 0; g < array_rad.length; g++){
            System.out.println(array_rad[g]);
        }

        //10
        System.out.print("Ingrese el número de filas de las matrices: ");
        int filas = scanner.nextInt();

        System.out.print("Ingrese el número de columnas de las matrices: ");
        int columnas = scanner.nextInt();

        int[][] matrizA = new int[filas][columnas];
        int[][] matrizB = new int[filas][columnas];

        System.out.println("Ingrese los valores de la matriz A:");
        leerMatriz(matrizA, scanner);

        System.out.println("Ingrese los valores de la matriz B:");
        leerMatriz(matrizB, scanner);

        int[][] matrizC = sumarMatrices(matrizA, matrizB);

        System.out.println("La matriz resultante (C) es:");
        mostrarMatriz(matrizC);

        scanner.close();
    
    }

    // Método para leer una matriz desde la entrada estándar
    public static void leerMatriz(int[][] matriz, Scanner scanner) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("Ingrese el valor en la posición (" + i + ", " + j + "): ");
                matriz[i][j] = scanner.nextInt();
            }
        }
    }

    // Método para sumar dos matrices
    public static int[][] sumarMatrices(int[][] matrizA, int[][] matrizB) {
        int filas = matrizA.length;
        int columnas = matrizA[0].length;
        int[][] matrizC = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        return matrizC;
    }

    // Método para mostrar una matriz en la consola
    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}