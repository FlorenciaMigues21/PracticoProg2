public class ejercicio_4_0 {

    public void desplegar(int[][] matriz){
        for (int[] ints : matriz) {
            for (int anInt : ints) {
                System.out.println(anInt + " ");
            }
            System.out.println();
        }
    }
    public boolean esCuadrada(int [][] matriz){
        return matriz.length == matriz[1].length;
    }
    public int filas(int [][] matriz){
        return matriz[1].length;

    }
    public int columnas(int [][] matriz){
        return matriz.length;
    }
    public int[][] sumar(int[][] matrizA, int[][] matrizB){
        int[][] matrizC = new int[matrizA.length][matrizA[1].length];
        for (int i=0; i<matrizA.length; i++){
            for (int j = 0; j< matrizA[i].length; j++){
                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        return matrizC;
    }
}
