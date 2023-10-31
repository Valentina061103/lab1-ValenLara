import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class tp11Parte2 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        //////////////////////////////////////////////////////////
        //4/
        ArrayList<Double> numeros4 = new ArrayList<Double>();
        // Leer 20 números decimales ingresados por el usuario
        for (int i = 0; i < 20; i++) {
            System.out.print("Ingrese un numero decimal en la posicion "+(i+1)+": ");
            double numero = scr.nextDouble();
            numeros4.add(numero);
        }

        // Determinar y mostrar el mayor número
        double mayor = Collections.max(numeros4);
        System.out.println("El número mayor es: " + mayor);

        // Determinar y mostrar el menor número
        double menor = Collections.min(numeros4);
        System.out.println("El número menor es: " + menor);

        // Calcular y mostrar el rango
        double rango = mayor - menor;
        System.out.println("El rango es: " + rango);
        //////////////////////////////////////////////////////////
        //5
        ArrayList<Integer> numeros = new ArrayList<>();
        Random random = new Random();

        // Generar aleatoriamente 20 números enteros positivos pares del 1 al 100
        for (int i = 0; i < 20; i++) {
            int numero = 2 * random.nextInt(50) + 2; // Números pares del 2 al 100
            numeros.add(numero);
        }
        System.out.println("Numeros elegidos al azar ");
        for(int numero: numeros){
            System.out.print(numero+", ");
        }
        System.out.println(" ");
        // Calcular el promedio aritmético
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        double promedio = (double) suma / numeros.size();
        System.out.println("Promedio aritmético: " + promedio);

        // Cuántos números son iguales al promedio
        int igualesAlPromedio = 0;
        for (int numero : numeros) {
            if (numero == promedio) {
                igualesAlPromedio++;
            }
        }
        System.out.println("Números iguales al promedio: " + igualesAlPromedio);

        // Cuántos números son mayores que el promedio
        int mayoresAlPromedio = 0;
        for (int numero : numeros) {
            if (numero > promedio) {
                mayoresAlPromedio++;
            }
        }
        System.out.println("Números mayores al promedio: " + mayoresAlPromedio);

        // Cuántos números son menores que el promedio
        int menoresAlPromedio = 0;
        for (int numero : numeros) {
            if (numero < promedio) {
                menoresAlPromedio++;
            }
        }
        System.out.println("Números menores al promedio: " + menoresAlPromedio);

        scr.close();

}
}
