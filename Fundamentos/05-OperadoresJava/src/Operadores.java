public class Operadores {
    public static void main(String[] args) {

        // OPERADORES ARITMÉTICOS
        int a = 3;
        int b = 2;

        System.out.println("El valor de a es: " + a);
        System.out.println("El valor de b es: " + b);

        // Operador de suma +
        int resultadoSuma = a + b;

        System.out.println("La suma de a y b es: " + resultadoSuma);

        // Operador de resta -
        int resultadoResta = a - b;

        System.out.println("La resta de a y b es: " + resultadoResta);

        // Operador multiplicación *
        int resultadoMultiplicacion = a * b;

        System.out.println("La multiplicación de a por b es: " + resultadoMultiplicacion);

        // Operador división /
        double resultadoDivision = a / b;
        System.out.println("La división de a sobre b es: " + resultadoDivision);

        // Operador módulo %
        int resultadoModulo = a % b;
        System.out.println("El residuo de la división de a sobre b es: " + resultadoModulo);


        // OPERADOR DE ASIGNACIÓN =
        // Los valores se asigna de izquierda a derecha, es decir, primero se resuelve lo que está a la derecha del =
        // y luego el resultado se lo asigna en la variable
        int c = a + 5 - b;
        a++;
        System.out.println("El nuevo valor de a es: " + a);
        b--;
        System.out.println("El nuevo valor de b es: " + b);
        a+=2;
        System.out.println("El valor de a + 2 es: " + a);
        b*=2;
        System.out.println("El valor de b * 2 es: " + b);


        // OPERADORES UNARIOS

        // Operador de negación
        int d = 3;
        int f = -d;
        System.out.println(f + " es el opuesto de " + d);

        boolean miTrue = true;
        boolean miFalse = !miTrue;
        System.out.println(miFalse + " es el opuesto de " + miTrue);

        // Operador de incremento
        // Pre-incremento - primero se incrementa la variable g en una unidad y luego se asigna a h
        int g = 3;
        int h = ++g;
        System.out.println("h es: " + h);
        System.out.println("g es: " + g);

        // Post-incremento - primero se asigna el valor y luego se incrementa
        int j = 4;
        int k = j++;
        System.out.println("j es: " + j);
        System.out.println("k es: " + k);

        // Operador de decremento
        // Pre-decremento - primero se decrementa la variable g en una unidad y luego se asigna a h
        int l = 3;
        int m = --l;
        System.out.println("m es: " + m);
        System.out.println("l es: " + l);

        // Post-decremento - primero se asigna el valor y luego se decrementa
        int n = 4;
        int o = n--;
        System.out.println("n es: " + n);
        System.out.println("o es: " + o);


        // OPERADORES DE IGUALDAD Y RELACIÓN

        // Operadores de Igualdad
        int a1 = 3;
        int b1 = 2;
        int c1 = 3;
        System.out.println("El valor de a1 es: " + a1);
        System.out.println("El valor de b1 es: " + b1);
        System.out.println("El valor de c1 es: " + c1);
        System.out.println("Es a1 igual a b1?: " + (a1 == b1));
        System.out.println("Es a1 igual a c1?: " + (a1 == c1));
        System.out.println("Es a1 distinto a b1?: " + (a1 != b1));
        System.out.println("Es a1 distinto a c1?: " + (a1 != c1));

        // Cuando comparamos objetos el operador == compara referencias a espacio de memoria
        // Comparamos objetos con el método equals

        String cadena1 = "Hola";
        String cadena2 = "Chau";
        String cadena3 = "Hola";
        System.out.println("Es "+ cadena1 + " igual a " + cadena2 + "?: " + (cadena1.equals(cadena2)));
        System.out.println("Es "+ cadena1 + " igual a " + cadena3 + "?: " + (cadena1.equals(cadena3)));

        // Operadores de relación

        System.out.println("El valor de a1 es: " + a1);
        System.out.println("El valor de b1 es: " + b1);
        System.out.println("El valor de c1 es: " + c1);
        System.out.println("Es a1 mayor o igual que b1?: " + (a1>=b1));
        System.out.println("Es a1 mayor o igual que c1?: " + (a1>=c1));
        System.out.println("Es a1 menor o igual que b1?: " + (a1<=b1));


        // OPERADORES CONDICIONALES
        int x = 25;
        int y = 50;
        System.out.println("El valor de x es: " + x);
        System.out.println("El valor de y es: " + y);
        // Con && deben cumplirse ambas condiciones
        System.out.println("X se encuentra entre 20 y 50?: " + (x>20 && x<50));
        // Con || debe cumplirse al menos una condición
        System.out.println("Es alguno de x o y mayor a 40?: " + (x>40 || y>40));

        boolean vacaciones = false;
        boolean finDeSemana = true;

        System.out.println("Puedo ir a ver el partido de fútbol?");
        if (vacaciones || finDeSemana){
            System.out.println("Sí, puedo.");
        }else{
            System.out.println("No puedo.");
        }


        // OPERADOR TERNARIO
        // Es una forma de estructurar un if/else simple

        String resultadoTernarioTrue = (3 > 2) ? "Verdadero":"Falso" ;
        System.out.println(resultadoTernarioTrue);

        String resultadoTernarioFalse = (2 > 2) ? "Verdadero":"Falso" ;
        System.out.println(resultadoTernarioFalse);
    }
}
