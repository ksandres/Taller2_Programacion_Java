import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int tiempoTotalMin=0;
        Scanner p = new Scanner(System.in);

        while(true){
            System.out.print("Ingresa el tiempo de viaje del tramo (en minutos) o 0 para finalizar: ");
            int tiempo=p.nextInt();

            if(tiempo==0){
                break;
            }
            tiempoTotalMin +=tiempo;

        }
        int horas= tiempoTotalMin/60;
        int min= tiempoTotalMin%60;

        System.out.println("Tiempo total de viaje: " + horas + " horas " + min + " minutos");
    }
}