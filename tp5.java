import java.util.Scanner;
import java.text.DecimalFormat; //importamos una clase que pasa los double a dos decimales
public class tp5 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat two_decimal = new DecimalFormat("#.##"); //le ponemos a esta la clase el nombre two_decimales
    //1
    System.out.println("ingrese un numero entero:");
    int number = scanner.nextInt();
    if (number%2 == 0) {
        System.out.println("el numero: " + number + " es par");
    } else {
        System.out.println("el numero: " + number + " es impar");
    }

    //2
    System.out.println("ingrese el numero entero del que quiere conocer si es multiplo de 10:");
    int number10 = scanner.nextInt();
    if (number10 % 10 == 0) {
        System.out.println("el numero es multiplo de 10");
    } else {
        System.out.println("el numero no es multiplo de 10");
    }

    //3
    System.out.println("ingrese una letra:");
    char letter = scanner.next().charAt(0);
    if (letter >= 'A' && letter <= 'Z') { //Verificamos si el valor numérico del carácter 
        System.out.println(letter + " es una letra mayúscula."); //está en el rango de las letras mayúsculas en el código ASCII ('A' a 'Z').
    } else {
        System.out.println(letter + " no es una letra mayúscula.");
    }

    //4
    System.out.println("ingrese el primer a comparar: ");
    int first_number = scanner.nextInt();
    System.out.println("ingrese el segundo numero a comprar:");
    int second_number = scanner.nextInt();
    if (first_number == second_number){
        System.out.println("los dos numeros son iguales");
    } else {
        System.out.println("los numeros son distintos");
    }

    //5
    System.out.println("ingrese un numero: ");
    int f_number = scanner.nextInt();
    System.out.println("ingrese otro numero:");
    int s_number = scanner.nextInt();
    if (f_number > s_number){
        System.out.println("el numero: " + f_number + " es el mas grande");
    } else if (f_number == s_number){
        System.out.println("los dos numeros son iguales");
    } else {
        System.out.println("el numero: " + s_number + " es el mas grande");
    }

    //6
    System.out.println("ingrese el primer numero entero:");
    int number1 = scanner.nextInt();
    System.out.println("ingrese el segundo numero entero:");
    int number2 = scanner.nextInt();
    if (number1 % 10 == number2 % 10){
        System.out.println("la ultima cifra de '" + number1 + "' es igual a la de el numero '" + number2 + "'");
    } else {
        System.out.println("la ultima cifra de '" + number1 + "' es distinta a la de el numero '" + number2 + "'");
    }

    //7
    System.out.println("ingrese un numero entero: ");
    int num = scanner.nextInt();
    if (num % 3 == 0 && num % 5 == 0){
        System.out.println("el numero '" + num + "' es multiplo de 3 y 5");
    } else{
        System.out.println("el numero '" + num + "' no es multiplo de 3 y 5");
    }

    //8
    System.out.println("ingrese un numero entero: ");
    int num2o3 = scanner.nextInt();
    if (num2o3 % 2 == 0 || num2o3 % 3 == 0){
        System.out.println("el numero '" + num2o3 + "' es multiplo de 2 o 3");
    } else{
        System.out.println("el numero '" + num2o3 + "' no es multiplo de 2 ni de 3");
    }

    //9
    System.out.println("ingrese el primer caracter:");
    char character = scanner.next().charAt(0);
    System.out.println("ingrese el segundo caracter:");
    char character2 = scanner.next().charAt(0);
    if (character == character2){
        System.out.println(" el caracter '" + character + "' es igual al caracter '" + character2 + "'");
    } else{
        System.out.println(" el caracter '" + character + "' es diferente al caracter '" + character2 + "'");
    }

    //10
    System.out.println("ingrese un caracter:");
    char chara = scanner.next().charAt(0);
    System.out.println("ingrese otro caracter");
    char chara2 = scanner.next().charAt(0);
    if (('A' <= chara && chara <= 'Z') || ('A' <= chara2 && chara2 <= 'Z')){
        System.out.println("alguna de las dos letras no es minuscula");
    } else
    System.out.println("las dos letras son minusculas");

    //11
    System.out.println("ingrese un digito numerico:");
        char caracter = scanner.next().charAt(0);
        if (caracter >= '0' && caracter <= '9') {
            System.out.println(caracter + " es un dígito numérico.");
        } else {
            System.out.println(caracter + " no es un dígito numérico.");
        }

    //12
    System.out.println("ingrese el numero dividendo:");
    int dividendo = scanner.nextInt();
    System.out.println("ingrese el divisor:");
    int divisor = scanner.nextInt();
    if (divisor == 0){
        System.out.println("no se puede dividir por cero");
    }else{
        int total = dividendo/divisor;
        System.out.println("el resultado es: " + dividendo + ":" + divisor + " = " + total);
    }

    //13
    System.out.println("ingrese el año del que quiere saber si es bisiesto o no:");
    int year = scanner.nextInt();
    if ( (year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ){
        System.out.println(" el año " + year + " es bisiesto");
    } else {
        System.out.println(" el año " + year + " no es bisiesto");
    }

    //14
    System.out.println("ingrese un numero de 3 cifras:");
    int capiduda = scanner.nextInt();
    if (capiduda >= 100 && capiduda <= 999){
        int first_n = capiduda/100;
        int second_n = capiduda % 10;
        if (first_n == second_n){
            System.out.println("el numero " + capiduda + " es capicuda");
        }else{
            System.out.println("el numero " + capiduda + " no es capicuda");
        }
    }else{
        System.out.println("el numero ingresado no es tres de cifras");
    }

    //15
    System.out.println("ingrese la hora exacta en formato HH:MM:SS");
    String time = scanner.nextLine();
    String valid_hour = time.substring(0, 2);
    String valid_minutes = time.substring(3, 5);
    String valid_seconds = time.substring(6, 8);
    if (Integer.parseInt(valid_hour) > 24 || Integer.parseInt(valid_minutes) > 60 || Integer.parseInt(valid_seconds) > 60){
        System.out.println("la hora ingresada es invalidad");
    }else{
        System.out.println("la hora ingresada es valida");
    }

    //16
    System.out.println("ingrese un numero correspondiente a un mes:");
    int month_number = scanner.nextInt();
    if (month_number >= 1 && month_number <= 12){
        if (month_number == 1){
            System.out.println(month_number + " --> Enero tiene 31 dias");
        }
        if (month_number == 2){
            System.out.println(month_number + " --> Febrero tiene 28 dias");
        }
        if (month_number == 3){
            System.out.println((month_number + " --> Marzo tiene 31 dias"));
        }
        if (month_number == 4){
            System.out.println(month_number + " --> Abril tiene 30 dias");
        }
        if (month_number == 5){
            System.out.println(month_number + " --> Mayo tiene 31 dias");
        }
        if (month_number == 6){
            System.out.println(month_number + " --> Junio tiene 30 dias");
        }
        if (month_number == 7){
            System.out.println(month_number + " --> Julio tiene 31 dias");
        }
        if (month_number == 8){
            System.out.println(month_number + " --> Agosto tiene 31 dias");
        }
        if (month_number == 9){
            System.out.println(month_number + " --> Septiempre tiene 30 dias");
        }
        if (month_number == 10){
            System.out.println(month_number + " --> Octubre tiene 31 dias");
        }
        if (month_number == 11){
            System.out.println(month_number + " --> Noviembre tiene 30 dias");
        }
        if (month_number == 12){
            System.out.println(month_number + " --> Diciembre tiene 31 dias");
        }
    } else if (month_number>12) {
        System.out.println("numero invalido");
    }

    //17
    System.out.println("Ingrese la calificacion del alumno/a");
    int grade = scanner.nextInt();
    if ( grade>=0 && grade<=10){
        switch (grade){
        case 0:
        case 1:
        case 2:
        case 3:
        case 4:
            System.out.println("Insuficiente");
            break;
        case 5:
            System.out.println("Suficiente");
            break;
        case 6:
            System.out.println("Bien");
            break;
        case 7:
        case 8:
            System.out.println("Notable");
            break;
        case 9:
        case 10:
            System.out.println("Sobresaliente");
            break;
        }
    }else{
        System.out.println("numero no valido");
    }

    //18
    System.out.println("numeros de 1 al 100");
    int i = 0;
    while (true){
        i++;
        System.out.println(i);
        if (i==100){break;}
    }

    //19
    System.out.println("numeros del 1 al 100");
    int t = 0;
    do { 
    System.out.println("numero " + (t+1)); //t + 1 en este caso es para que se imprima desde el 1
    t += 1;
    } while (t<100);

    //20
    System.out.println("numeros del 1 al 100");
    for ( int f = 1; f<=100; f++){ //primero variable(contador), condicion, incremento
        System.out.println(f);
    }

    //21
    System.out.println("numeros del 100 al 1");
    int v = 100;
    while (true){
        v--;
        System.out.println(v);
        if (v ==1){break;}
    }

    //22
    System.out.println("numeros del 100 al 1");
    int n = 100;
    do {System.out.println(n);
        n -= 1;
    } while(n < 100 && n>0);

    //23
    System.out.println("numeros del 100 al 1");
    for(int a = 100; a<=100 && a>0; a--){
        System.out.println(a);
    }
    
    //24
    //A
    System.out.println("ingrese un numero:");
    int num_until = scanner.nextInt();
    for (int b = 1; b<=num_until; b++){
        System.out.println(b);
    }

    //B
    System.out.println("ingrese un numero:");
    int num_hasta = scanner.nextInt();
    int c = 0;
    while(true){
        c++;
        System.out.println(c);
        if (c==num_hasta){break;}
    }

    //C
    System.out.println("ingrese un numero:");
    int hasta_num = scanner.nextInt();
    int d = 0;
    do {
        System.out.println(d);
        d += 1;
    }while(d <= hasta_num);

    //25
    //A
    System.out.println("ingrese un numero:");
    int n_h = scanner.nextInt();
    for (int m = n_h; m <= n_h && m >= 1; m--){
        System.out.println(m);
    }

    //B
    System.out.println("ingrese un numero:");
    int h_n = scanner.nextInt();
    int w = h_n;
    while(true){
        System.out.println(w);
        w--;
        if (w==0){break;}
    }

    //C
    System.out.println("ingrese un numero:");
    int has_num = scanner.nextInt();
    int r = has_num;
    do{
        System.out.println(r);
        r -= 1;
    }while(r <= has_num && r>=1);

    //26
    System.out.println("ingrese el primer numero:");
    int nume1 = scanner.nextInt();
    System.out.println("ingrese el segundo numero:");
    int nume2 = scanner.nextInt();
    if (nume1>nume2){
        int bigger_num = nume1;
        int smaller_num = nume2;
            for (int u = smaller_num; u >= smaller_num && u <= bigger_num; u++){
        System.out.println(u);
    }
    } else if (nume1 == nume2){
        System.out.println("los numeros son iguales");
    }else {
        int bigger_num = nume2;
        int smaller_num = nume1;
            for (int u = smaller_num; u >= smaller_num && u <= bigger_num; u++){
        System.out.println(u);
        }
    }

    //27
    System.out.println("ingrese dos numeros ( A Y B) 'A' tiene que ser mayor que 'B'");
    int num_A;
    int num_B;
        do{
            System.out.print("ingrese A: ");
            num_A = scanner.nextInt();
            System.out.print("ingrese B: ");
            num_B = scanner.nextInt();
            if (num_A >= num_B){
            System.out.println("A debe ser menor que B. Por favor, intente otra vez");
            }
        }while(num_A>=num_B);

    System.out.println("numeros pares entre " + num_A + " y " + num_B + " son: ");
    for(int g = num_A; g>=num_A && g <= num_B; g++){
            if (g%2==0){
            System.out.println(g);
    }
        }

    //28
    System.out.println("ingrese dos numeros ( N Y M )" + "\n -'N' es el numero del que quiere conocer sus multiplos y 'M' es hasta que numero" + "\n -'N' tiene que ser mayor que 'N'");
    int numN;
    int numM;
        do{
            System.out.print("ingrese N: ");
            while(!scanner.hasNextInt()){
                System.out.println("Por favor ingrese un valor valido");
                scanner.next(); //limpia el scanner
                System.out.print("ingrese N: ");
            }
            numN = scanner.nextInt();
            System.out.print("ingrese M: ");
            while(!scanner.hasNextInt()){ // "!" significa que si "scanner.hasNextInt()"(que larga un valor verdadero si el valor ingresado en el scanner corresponde co el tipo de dato de la varible donde lo guardamos) es falso entre al while
                System.out.println("Por favor ingrese un valor valido");
                scanner.next(); 
                System.out.print("ingrese M: ");
            }
            numM = scanner.nextInt();
            if (numN >= numM){
            System.out.println("N debe ser menor que M. Por favor, intente otra vez");
            }
        }while(numN >= numM);
    System.out.println("los multiplos de '" + numN + "' hasta el numero '" + numM + "'");
    for(int p = 1; p>=1 && p<=numM; p++){
        if(p%numN==0){
            System.out.println(p);
        }
    }

    //29
    int out = 0;
    do{
        System.out.println("Convertor de millas a kilometros");
        System.out.println("--------------------------------");
        System.out.println("ingrese la cantidad de millas: ");
        double millas = scanner.nextDouble();
        double kilometros = millas * 1.6093;
        String km_dosdecimales = two_decimal.format(kilometros); //para usar la clase ponemos el nombre(two_decimales).format("nombre de la variables que queres cnvertir")
        System.out.println(millas + " millas son " + km_dosdecimales + " kilometros");
        System.out.println("Para realizar una nueva conversion ingrese '0' y para salir ingrese '1'");
        out = scanner.nextInt();
    }while (out == 0);


    scanner.close();
}
}
