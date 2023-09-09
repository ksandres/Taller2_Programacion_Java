import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cuántos valores ingresará ");
        int n = sc.nextInt();

        double[] datos = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            datos[i] = sc.nextDouble();
        }


        double maximo = datos[0];
        double minimo = datos[0];

        for (int i = 1; i < n; i++) {
            if (datos[i] > maximo) {
                maximo = datos[i];
            }
            if (datos[i] < minimo) {
                minimo = datos[i];
            }
        }

        double rango = maximo - minimo;


        System.out.println("El rango es " + rango);
    }
}