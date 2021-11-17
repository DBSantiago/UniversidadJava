import java.util.Scanner;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // Tipos primitivos números enteros

        // byte almacena hasta 8 bit
        byte miByte = 7;
        System.out.println("Valor mínimo de un byte: " + Byte.MIN_VALUE);
        System.out.println("Valor máximo de un byte: " + Byte.MIN_VALUE);

        // short almacena hasta 16 bit
        short miShort = 7;
        System.out.println("Valor mínimo de un short: " + Short.MIN_VALUE);
        System.out.println("Valor máximo de un short: " + Short.MIN_VALUE);

        // int almacena hasta 32 bit
        int miInt = 7;
        System.out.println("Valor mínimo de un entero: " + Integer.MIN_VALUE);
        System.out.println("Valor máximo de un entero: " + Integer.MIN_VALUE);

        // long almacena hasta 64 bit
        long miLong = 7;
        System.out.println("Valor mínimo de un long: " + Long.MIN_VALUE);
        System.out.println("Valor máximo de un long: " + Long.MIN_VALUE);


        // Tipos primitivos de números flotantes (con coma)

        // float utiliza 32bit
        float miFloat = 10.0F;
        System.out.println("Valor mínimo de un float: " + Float.MIN_VALUE);
        System.out.println("Valor máximo de un float: " + Float.MIN_VALUE);

        // double utiliza 64bit
        double miDouble = 10.0;
        System.out.println("Valor mínimo de un double: " + Double.MIN_VALUE);
        System.out.println("Valor máximo de un double: " + Double.MIN_VALUE + "\n");


        // Tipos primitivos caracter

        // char almacena un solo caracter, se define en comillas simples
        // char utiliza 16bit
        char miChar = 'S';

        // Podemos definir char con código UNICODE
        char miChar2 = '\u0021';

        // Podemos definir char con código decimal
        char michar3 = 33;
        System.out.println(michar3 + "\n");


        // Tipos primitivos boolean
        boolean miFalso = false;
        boolean miVerdadero = true;
        System.out.println(miFalso);
        System.out.println(miVerdadero);


        // Conversión de tipos primitivos

        // Convertir String a int
        String edad = "20";
        int edadInt = Integer.parseInt("20");

        // Convertir String a double
        String miPi = "3.1416";
        double miPiDouble = Double.parseDouble("3.1416");

        // Pedir un valor
        Scanner miScanner = new Scanner(System.in);
        System.out.println("Ingrese su edad:");
        int edadPedida = Integer.parseInt(miScanner.nextLine());


        // Ejercicio librería
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona el nombre del libro:");
        String nombre = scanner.nextLine();
        System.out.println("Proporciona el id del libro:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Proporciona el precio del libro:");
        double precio = Double.parseDouble(scanner.nextLine());
        System.out.println("Proporciona el envio gratuito:");
        boolean envioGratuito = Boolean.parseBoolean(scanner.nextLine());

        System.out.println(nombre + " #" + id);
        System.out.println("Precio: $" + precio);
        System.out.println("Envio Gratuito: " + envioGratuito);
    }
}
