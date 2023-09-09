import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        String numero = sc.nextLine();

        if (esPalindromo(numero)) {
            System.out.println(numero + " es un palíndromo");
        } else {
            System.out.println(numero + " no es un palíndromo");
        }
    }

    public static boolean esPalindromo(String numero) {

        StringBuilder reverso = new StringBuilder(numero).reverse();
        return numero.contentEquals(reverso);
    }
}