T1E01
public class T1E01 {
    public static void main (String[] args) {
        ;
        System.out.println("Me llamo Brutus");
        System.out.println("Estudio el ciclo de Daw");
        System.out.println("Este es mi primer programa en IntelliJ");
    }
}

T1E02
public class T1E02 {
    public static void main (String[] args) {
        System.out.println("Inicio del programa");
        System.out.println("Calculando...");
        System.out.println("Fin del programa");
    }
}

T1E03
  public class T1E03 {
    public static void main (String[] args) {
        int nota1 = 6;
        int nota2 = 8;
        int nota3 = 7;
        //El resultado da 16 porque está sumando int1 + int2+ la división de nota3 /3, lo que da 16,33 periodico.
        //Para que el resultado diera 7.0 tendría que dividir el total de la suma de las notas entre 3.
        // Corregido sería así:
        int nota_total = nota1 + nota2 + nota3;
        double media = nota_total /3;
        System.out.println("Media: " + media);

    }
}

T1E04
  public class T1E04 {
    public static void main (String[] args) {
        //ENTRADA
        double coste_pizza = 9.50;
        int numero_pizzas = 3;
        double envio = 2;
        //PROCESO
        double subtotal = coste_pizza * numero_pizzas;
        double total = subtotal + envio;
        //SALIDA
        System.out.println("Pizzas: " + numero_pizzas +  " x "  + coste_pizza + " €");
        System.out.println("Subtotal = " + subtotal + "€");
        System.out.println("Envio: " + envio + "€");
        System.out.println("Total: " + total +"€");

    }
}

T1E05
  public class T1E05 {
    public static void main (String[] args) {

        int radio = 5;
        final double PI = 3.14159;
        double area = PI * radio * radio;
        double perimetro = 2 * PI * radio;
        System.out.println("Área: " + area);
        System.out.println("Perimetro: " + perimetro);


    }
}

T1E06
  public class T1E06 {
    public static void main (String[] args) {
        //INICIO = óvalo = main
        int minutosTotales = 135;
        int horasTotales = minutosTotales / 60;
        int minutos = minutosTotales % 60;
        System.out.println(minutosTotales + " minutos son " + horasTotales + " horas y " + minutos + " min");
    }
}
   //con 59: 59 minutos son 0 horas y 59 min
   //con 600: 600 minutos son 10 horas y 0 min

T1E07
public class T1E07 {
    public static void main (String[] args) {
        int a = 7;
        int b = 5;
        double random = Math.random();
        int suma = a + b;
        System.out.println("Suma: " + suma);
        System.out.println("Número aleatorio: " + random);
        /* a) La variable que cambia es el print de random.
           b) El primer print si que sería determinista, mientras que el segundo no.
           c) Incumple la característica del determinismo, ya que con mismos datos de
            entrada imprime distintos resultados.
        */

    }
}

T1E08
