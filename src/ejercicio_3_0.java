import java.util.Scanner;
public class ejercicio_3_0 {

    private static boolean NumeroPrimo(int numero) {
        float division = 0;
        for (int i = 2; i < numero; i++) {
            division = numero % i;
            if (division == 0) {
                return false;

            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Ingrese numero para analizar");
        int numero_a = myObj.nextInt();

        boolean func = NumeroPrimo(numero_a);
        if (func){
            System.out.println("Es primo");
        }
        else{
            System.out.println("No es primo");
        }
    }
}
