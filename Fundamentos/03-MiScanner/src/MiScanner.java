import java.util.Scanner;

public class MiScanner {
    public static void main(String args[]){
        Scanner miScanner = new Scanner(System.in);
        // Siempre es recomendable agregar un texto antes de pedir datos
        System.out.println("Escribe tu nombre");

        // Capturo información en consola con miScanner y la guardo en la variable usuario
        // La ejecución del código se pausa hasta que entremos algo por consola
        String usuario = miScanner.nextLine();
        System.out.println("Usuario: " + usuario);

        System.out.println("Ingrese su libro favorito");
        String libroFavorito = miScanner.nextLine();

        System.out.println("Ingrese su autor");
        String autor = miScanner.nextLine();

        System.out.println(libroFavorito + " fue escrito por " + autor);
    }
}