import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
public class tp9 {
    public static void main(String[] args) {
        //1
        ArrayList<Integer> numeros=new ArrayList<>();
        numeros.add(3);
        numeros.add(5);
        numeros.add(8);
        numeros.add(1);
        numeros.add(-12);
        int ite=0;
        for (int i: numeros){
            ite++;
            System.out.println("Nº"+ite+": "+i);;
        }

        //2 
        ArrayList<String> listaCadenas=new ArrayList<>();
        listaCadenas.add("LUCAS");
        listaCadenas.add("MARTIN");
        listaCadenas.add("JOSE");
        int it=0;
        for(String i : listaCadenas){
            it++;
            System.out.println("Nombre ("+it+"): "+i);
        }

        //3
        ArrayList<Integer> ListaNumeros=new ArrayList<>();
        ListaNumeros.add(0);
        ListaNumeros.add(2);
        ListaNumeros.add(3);
        ListaNumeros.add(4);
        ListaNumeros.add(5);
        ListaNumeros.add(6);
        ListaNumeros.add(7);
        ListaNumeros.add(8);
        ListaNumeros.add(9);
        System.out.println("Elementos ");
        for (int i :ListaNumeros) {
            System.out.print(i+", ");
        }
        System.out.println(" ");

        //4 y 5 
        ArrayList<String> elementos=new ArrayList<>();
        elementos.add("hola");
        elementos.add("yo");
        elementos.add("soy");
        elementos.add("tu");
        elementos.add("si");
        /*cantidad de elementos del array list */
        int tamaño=elementos.size();
        System.out.println("Longitud del array list: "+tamaño);
        /*remover el elemento */
        System.out.println("Removiendo el elemento: "+elementos.remove(1));

        //6
        ArrayList<Integer>numeros6=new ArrayList<>();
        boolean estaVacio = numeros6.isEmpty(); 
        System.out.println("El array esta vacio? "+estaVacio);

        //7
        ArrayList<Integer> numeros7 = new ArrayList<>();
        numeros7.add(5);
        numeros7.add(10);
        numeros7.add(3);
        numeros7.add(8);
        numeros7.add(15);
        // Inicializamos el número más grande con el primer elemento de la lista
        int maximo = numeros7.get(0);
        // Recorremos la lista para encontrar el número más grande
        for (int numero : numeros7) {
            if (numero > maximo) {
                maximo = numero;
            }
        }
        System.out.println("El número más grande en la lista es: " + maximo);

        //8
        ArrayList<Integer> nuevoArrayList = new ArrayList<>(numeros7);
        System.out.println("Nuevo ArrayList: " + nuevoArrayList);

        //9
        ArrayList<Integer> numeros9 = new ArrayList<>();
        numeros9.add(1);
        numeros9.add(2);
        numeros9.add(3);
        numeros9.add(4);
        numeros9.add(5);
        Collections.reverse(numeros9);
        System.out.println("ArrayList invertido: " + numeros9);

        //10
        ArrayList<Integer> numeros10 = new ArrayList<>();
        numeros10.add(1);
        numeros10.add(2);
        numeros10.add(3);

        ArrayList<Integer> numeros10_2 = new ArrayList<>();
        numeros10_2.add(4);
        numeros10_2.add(5);
        numeros10_2.add(6);
        // Combinar los dos ArrayLists en uno solo, el addAll agrega todos los elementos de una coleccion a otro
        ArrayList<Integer> numerosCombinados = new ArrayList<>(numeros10);
        numerosCombinados.addAll(numeros10_2);
        System.out.println("ArrayList combinado: " + numerosCombinados);

        //11
        ArrayList<Integer> numeros11 = new ArrayList<>();
        numeros11.add(49);
        numeros11.add(12);
        numeros11.add(24);
        numeros11.add(31);
        ArrayList<Integer> numerosImpares = new ArrayList<>();
        for (int n : numeros11) {
            if (n % 2 != 0) {
                numerosImpares.add(n);}}
        System.out.println("El ArrayList con los números pares removidos se ve: " + numerosImpares);

        //12
        ArrayList<String> cadenas=new ArrayList<>();
        cadenas.add("rosas");
        cadenas.add("tulipanes");
        cadenas.add("jazmines");
        String elementoBuscado = "tulipanes";
        int indice = cadenas.indexOf(elementoBuscado);

        if (indice != -1) {
            System.out.println("El elemento '" + elementoBuscado + "' se encuentra en el índice " + indice);
        } else {
            System.out.println("El elemento '" + elementoBuscado + "' no se encuentra en la lista.");}
        
        //13
        ArrayList<String> lista1 = new ArrayList<>();
        lista1.add("manzana");
        lista1.add("naranja");
        lista1.add("banana");

        ArrayList<String> lista2 = new ArrayList<>();
        lista2.add("frutilla");
        lista2.add("naranja");
        lista2.add("banana");
        // Usar el método equals para verificar si son iguales
        boolean sonIguales = lista1.equals(lista2);
        if (sonIguales) {
            System.out.println("Las listas son iguales.");
        } else {
            System.out.println("Las listas no son iguales.");
        }

        //14 y 15
        ArrayList<Integer> numeros14 = new ArrayList<>();
        numeros14.add(50);
        numeros14.add(30);
        numeros14.add(10);
        numeros14.add(20);
        int minimo = numeros14.get(0);
        // Recorremos la lista para encontrar el número más chico
        for (int numero : numeros14) {
            if (numero < minimo) {
                minimo = numero;
            }
        }
        System.out  .println("El número más chico en la lista es: " + minimo);
        int suma = 0;

        for (int numero : numeros14) {
            suma += numero;
        }
        System.out.println("La suma de los números en el ArrayList es: " + suma);
        
        //16
        ArrayList<String> listaCadenas16 = new ArrayList<>();
        listaCadenas16.add("Hola");
        listaCadenas16.add(", ");
        listaCadenas16.add("¡Buenos");
        listaCadenas16.add(" dias!");
        listaCadenas16.add(" ,¿que");
        listaCadenas16.add(" tal?");
        // Concatenar todas las cadenas en una sola, utilizamos stringbuilder para concatenar
        StringBuilder cadenaConcatenada = new StringBuilder();
        for (String cadena : listaCadenas16) {
            cadenaConcatenada.append(cadena);
        }
        String resultadoConcatenado = cadenaConcatenada.toString();
        System.out.println("Cadena concatenada: " + resultadoConcatenado);

        //17
        ArrayList<String> listaCadenas17 = new ArrayList<>();
        listaCadenas17.add("manzana");
        listaCadenas17.add("pera");
        listaCadenas17.add("manzana");
        listaCadenas17.add("uva");
        listaCadenas17.add("pera");
        // Eliminar elementos duplicados usando un LinkedHashSet
        LinkedHashSet<String> conjuntoUnico = new LinkedHashSet<>(listaCadenas17);
        ArrayList<String> listaSinDuplicados = new ArrayList<>(conjuntoUnico);
        System.out.println("ArrayList con elementos duplicados: " + listaCadenas17);
        System.out.println("ArrayList sin elementos duplicados: " + listaSinDuplicados);

        //18
        ArrayList<Integer> numeros18 = new ArrayList<>();
        numeros18.add(1);
        numeros18.add(2);
        numeros18.add(3);
        numeros18.add(4);
        numeros18.add(5);
        numeros18.add(6);
        int sumaIndicesPares = 0;
        for (int i = 0; i < numeros18.size(); i ++) {
            if(i%2==0){
                sumaIndicesPares += numeros18.get(i);
            }
            
        }
        System.out.println("La suma de los elementos en índices pares es: " + sumaIndicesPares);

        //19
        ArrayList<Integer> numeros19=new ArrayList<>();
        numeros19.add(12);
        numeros19.add(34);
        numeros19.add(7);
        int element = 8;
        int ind = numeros19.indexOf(element);

        if (ind != -1) {
            System.out.println("El elemento '" + element + "' se encuentra en el índice " + ind);
        } else {
            System.out.println("El elemento '" + element + "' no se encuentra en la lista.");}
        
        //20
        ArrayList<String> cadenas20 = new ArrayList<>();
        cadenas20.add("manzana");
        cadenas20.add("mandarina");
        cadenas20.add("sandía");
        cadenas20.add("uva");
        String longitud_cad = "";
        for (String cadena : cadenas20) {
            if (cadena.length() > longitud_cad.length()) {
                longitud_cad = cadena;
            }
        }
        System.out.println("La cadena más larga en el ArrayList es: " + longitud_cad);

        //21
        ArrayList<Integer> numeros21 = new ArrayList<>();
        numeros21.add(10);
        numeros21.add(20);
        numeros21.add(30);
        numeros21.add(40);
        numeros21.add(50);

        int suma21 = 0;

        for (int numero : numeros21) {
            suma21 += numero;
        }

        double promedio21 = (double) suma21 / numeros21.size();

        System.out.println("La suma de los elementos es: " + suma21);
        System.out.println("El promedio de los elementos es: " + promedio21);

        //22 y 23
        ArrayList<Integer> numeros22 = new ArrayList<>();
        numeros22.add(30);
        numeros22.add(10);
        numeros22.add(50);
        numeros22.add(20);
        numeros22.add(40);
        // Ordenar la lista en orden ascendente
        Collections.sort(numeros22);
        System.out.println("ArrayList ordenado en orden ascendente: " + numeros22);
        int valorLimite = 35;
        // Eliminar elementos mayores que el valor límite
        numeros22.removeIf(numero -> numero > valorLimite);
        // Imprimir la lista resultante
        System.out.println("ArrayList después de eliminar elementos mayores que " + valorLimite + ": " + numeros22);
        
        //24
        ArrayList<String> cadenas24 = new ArrayList<>();
        cadenas24.add("manzana");
        cadenas24.add("naranja");
        cadenas24.add("manzana");
        cadenas24.add("uva");
        cadenas24.add("manzana");

        String buscando = "manzana";
        int contador = 0;
        for (String cadena : cadenas24) {
            if (cadena.equals(buscando)) {
                contador++;
            }
        }
        System.out.println("La cadena '" + buscando + "' aparece " + contador + " veces en el ArrayList.");
        
        //25
        ArrayList<String> cadenas25 = new ArrayList<>();
        cadenas25.add("pera");
        cadenas25.add("naranja");
        cadenas25.add("uva");
        cadenas25.add("sandia");
        cadenas25.add("manzana");
        Collections.sort(cadenas25);
        System.out.println("ArrayList en orden alfabetico " + cadenas25);

    
    }
}
