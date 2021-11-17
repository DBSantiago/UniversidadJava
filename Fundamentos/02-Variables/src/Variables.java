public class Variables {
    public static void main(String args[]) {
        int miVariableEntera = 5;

        String miNombre = "Santiago";

        //Modificamos la variable
        miVariableEntera = 10;

        double miVariableConComa = 5.7;

        System.out.println(miNombre);
        System.out.println(miVariableEntera);
        System.out.println(miVariableConComa);

        // var -- Inferecia de tipo de dato sobre la variable
        var miVariableEntera2 = 16;
        System.out.println(miVariableEntera2);

        var miApellido = "De Blasis";

        // El operador + nos permite concatenar cadenas de texto
        System.out.println("Mi nombre es " + miNombre + " " + miApellido);

        // Formas válidas de definir nombres de variables
        var miVariable = 1;
        var _miVariable7 = 2;
        var $miVariable = 3;

        //var míVariable = 2; -- No se recomienda el uso de tildes por ser caracteres especiales aunque esté permitido

        // El operador + nos permite concatenar cadenas de texto
        String usuario = "Juanchito";
        String titulo = "Ingeniero";
        String union = usuario + ", " + titulo;
        System.out.println(union);

        // El operador + nos permite sumar números
        System.out.println(miVariableEntera + miVariableEntera2);
        System.out.println(miVariableEntera + miVariableConComa);

        /* Si sumamos números y cadenas de texto, si de izquierda a derecha
           nos encontramos primero con una suma de números, se realizará esta suma
           y luego se concatenará con la cadena de texto
         */
        System.out.println(miVariableEntera + miVariableEntera2 + miNombre);

        // Caso contrario al de arriba, se concatenarán todas las variables como texto
        System.out.println(miNombre + miVariableEntera + miVariableEntera2);


        //Caracteres de escape
        System.out.println("Nueva línea: \n " + miNombre);
        System.out.println("Tabulación: \t" + miNombre);
        System.out.println("Retroceso: \b" + miNombre);
        System.out.println("Comilla simple: '" + miNombre +"'");
        System.out.println("Comilla doble: \"" + miNombre + "\"");
        
    }
}
