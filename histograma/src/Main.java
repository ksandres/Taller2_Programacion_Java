import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        int pos=0;
        int neg= 0;
        System.out.println("ingrese numeros enteros (ingrese 0 si desea finalizar)");
        while (true) {
            int x = o.nextInt();
            if (x==0){
                break;
            }

            if (x>0){
                pos++;
            }else {
                neg++;
            }
        }
        System.out.println("valores positivos:");
        for (int i =0;i<pos;i++){
            System.out.print("* ");
        }
        System.out.println(" ");
        System.out.println("valores negativos:");
        for (int i = 0; i<neg;i++){
            System.out.print("* ");
        }
    }
}

