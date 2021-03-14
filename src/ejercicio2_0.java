import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ejercicio2_0 {
    public static void main(String[] args) {
        List<Integer> lista_num = new ArrayList<Integer>();
        Scanner entrada = new Scanner(System.in);
        boolean estado = true;


        while (estado) {
            System.out.print("Ingrese número");
            int numero = entrada.nextInt();
            if (numero == -1) {
                estado = false;
            } else {
                lista_num.add(numero);

            }
        }

        int max = 0;
        int min = 0;
        int suma_total = 0;
        int suma_positivos = 0;
        int suma_negativos = 0;

        for (Integer value : lista_num) {
            suma_total = suma_total + value;

            if (value > max) {
                max = value;
            } else {
                if (value < min) {
                    min = value;
                }
            }
        }

        float promedio = (suma_total / lista_num.size());

        for (Integer integer : lista_num) {
            if (integer > 0) {
                suma_positivos = suma_positivos + integer;
            } else {
                suma_negativos = suma_negativos + integer;
            }
        }

        System.out.println("Maximo:" + max);
        System.out.println("Mínimo:" + min);
        System.out.println("Suma total:" + suma_total);
        System.out.println("Suma de negativos" + suma_negativos);
        System.out.println("Suma de positivos" + suma_positivos);
        System.out.println("Promedio" + promedio);


    }
}
