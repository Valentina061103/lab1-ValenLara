import java.util.Scanner; //importamos el scanner que es por donde vamos a leer lo que ingrese el usuario

public class tp2 {
    //1
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in); //creamos un Scanner (asi le ponemos cuando queremos llamar al scanner) y ese Scanner le asignamos el nombre "scanner"
        System.out.println("Ingrese el primer numero entero: "); // "System.in" significa que el scanner va leer la entrada del usuario por teclado
        int numero1 = scanner.nextInt(); // "System.out.println" lo usamos para mostrar algo por pantalla
        System.out.println("Ingrese el segundo numero entero: ");
        int numero2 = scanner.nextInt(); // nextInt()  es el metodo del objeto "scanner" que lee lo ingresado por el usario y la guarda en la variable  

        System.out.println("los numeros ingresados son: ");
        System.out.println("Primero numero: " + numero1);
        System.out.println("Segndo numero: " + numero2);

    //2
    System.out.println("Ingrese un nombre: ");
    String name = scanner.nextLine();
    System.out.println("El nombre ingresado es: " + name);

    //3
    System.out.println("Ingrese el numero del que quiere conocer el doble y el triple: ");
    int number = scanner.nextInt();
    int number2 = number * 2;
    int number3 =number * 3;
    System.out.println("El doble de su numero es: " + number2);
    System.out.println("el tripe de su numero es: " + number3);

    //4
    System.out.println("Ingrese los grados centigrados que quiere convertir a fahrenheit: ");
    double grados_centig = scanner.nextDouble();
    double grados_fahre = 32 + ( 9 * grados_centig / 5);
    System.out.println(" los grados: " + grados_centig + " son: " + grados_fahre + " en la escala de fahrenheit");

    //5
    System.out.println("ingrese el radio de una circunferencia: ");
    double radio = scanner.nextDouble();
    double longi = 2 * Math.PI * radio;
    double area_circunf = Math.PI * Math.pow(radio, 2);
    System.out.println("La longitud de la circunferencia es de: " + longi + " y el area de la circuferencia es de: " + area_circunf);

    //6
    System.out.println("ingrese la velocidad en km/h: ");
    double km_h = scanner.nextDouble();
    double m_s = km_h * 0.27778;
    System.out.println("La velocidad en m/s es: " + m_s);

    //7
    System.out.println(("ingrese la longitud del cateto 1: "));
    double cateto1 = scanner.nextDouble();
    System.out.println("ingrese la longitud del cateto 2: ");
    double cateto2 = scanner.nextDouble();
    double hipot = Math.pow((cateto1 + cateto2), 2);
    System.out.println("La hipotenusa del triangulo es de: " + hipot);

    //8
    System.out.println("ingrese el radio de la esfera: ");
    double radio_esfera = scanner.nextDouble();
    double volumm_esfera = (4.0/3) * Math.PI * Math.pow(radio_esfera,3);
    System.out.println("el volumen de esta esfera es de: " + volumm_esfera);

    //9
    System.out.println("ingrese la longitud del lado a: ");
    double lado_a = scanner.nextDouble();
    System.out.println("ingrese la longitud del lado b: ");
    double lado_b = scanner.nextDouble();
    System.out.println("ingrese longitud del lado c: ");
    double lado_c = scanner.nextDouble();

    double p = (lado_a+lado_b+lado_c)/2;
    double area_triangulo = Math.sqrt( p * (p-lado_a) * (p-lado_b) * (p-lado_c));
    System.out.println("el area del triangulo es: " + area_triangulo);

    //10
    System.out.println("ingrese un numero de 3 cifras: ");
    int namber_3 = scanner.nextInt();
    int separate_1 = namber_3 / 100;
    int separate_2 = (namber_3 / 10) % 10;
    int separate_3 = namber_3 % 10;

    System.out.println("Ese numero esta compuesto por: " + separate_1 + " - " + separate_2 + " - " + separate_3);

    //11
    System.out.println("ingrese un numero de 5 cifras: ");
    int number_5 = scanner.nextInt();
    String number5cadena = String.valueOf(number_5);
    for ( int i = 1; i <= number5cadena.length(); i++) //el contador i recorre el codigo hasta que i sea igual al largo de la cadena y i++ siginfica que se incrementa de a 1
    {
    String subcadena5 = number5cadena.substring( 0, i); //substring extre una parte de la cadena, haciendolo hasta "i" lo que hacemos es que primero vaya de (0 a la pocision 1) y despues hast ala 2 y asi
    System.out.println(subcadena5);
    }

    //12
    System.out.println("ingrese un numero de 5 cifras: ");
    int number5 = scanner.nextInt();
    String cadena5number = String.valueOf(number5);
    for ( int i = cadena5number.length(); i >= 1; i--) { //inicilizamjos el for en el largo de la cadena y lo terminamos cuando i sea == 1 y le decimos i-- que significa que vay de forma decreciente (5,4,3,2,1)
        String cadenasub5 = cadena5number.substring(i-1); // y a substring le decimos que vaya desde el largo de la cadena (i) hasta uno menos de eso entonces va ir de atras hacia delante
        System.out.println(cadenasub5);
    }

    //13
    System.out.println("ingrese su fecha de nacimiento con el formato DDMMAAAA para conocer su numero de la suerte:");
    String date = scanner.nextLine();
    String day_date = date.substring(0,2);
    String moth_date = date.substring(2,4);
    String year_date = date.substring(4,8);
    System.out.println(day_date + "/" + moth_date + "/" + year_date);
    int plus_date = Integer.parseInt(day_date) + Integer.parseInt(moth_date) + Integer.parseInt(year_date);
    int one = plus_date / 1000;
    int two = (plus_date / 100) % 10;
    int three = (plus_date / 10) % 10;
    int four = plus_date % 10;
    int lucky_number = one + two + three + four;
    System.out.println("Su numero de la suerte es: " + lucky_number);

    //14
    System.out.println("ingrese la cantidad de productos vendidos:");
    int amountproduct = scanner.nextInt();
    System.out.print("ingrese el precio por unidad: $");
    double valueproduct = scanner.nextDouble();
    double finalprice = (amountproduct*valueproduct)*1.21;
    System.out.println("el precio de venta es de: " + finalprice);

    //15
    System.out.println("ingrese un numero N: ");
    int N = scanner.nextInt();
    System.out.println("ingrese un numero m: ");
    int m = scanner.nextInt();
    String cadenaN = String.valueOf(N);
    String Nsinm = cadenaN.substring(0,(cadenaN.length()-m));
    System.out.println(N + " sin " + m + " es igual a: " + Nsinm);

    //16
    System.out.println("ingrese la temperatura en grados centigrados:");
    double g_centigrados = scanner.nextInt();
    double g_reamur = (g_centigrados/100) * 80;
    double g_kelvin = ((g_reamur/80) * 100) +273;
    System.out.println("los grados centigrados: " + g_centigrados + " equivalen a: \n" + g_reamur + " grados Reamur\n" + g_kelvin + " grados Kelvin" );


        scanner.close(); //cerramos el scanner
    }
}