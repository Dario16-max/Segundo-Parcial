import java.util.Random;
import java.util.Scanner;

public class segundo {
    // Creamos los metodos para cada uno de los puntos del reto

    public static int contarParesMayoresA4(int[][] matriz) {
    int contador = 0;
    for (int[] fila : matriz) {
        for (int valor : fila) {
            if (valor % 2 == 0 && valor > 4) {
                contador++;
            }
        }
    }
    return contador;
    }
    public static void sumarFilas(int[][] matriz) {
        int n = matriz.length;
        for (int i = 0; i < n; i++) {
            int suma = 0;
            for (int valor : matriz[i]) {
                suma += valor;
            }
            System.out.println("   Fila " + i + "----> " + suma);
        }
    }
    
    public static void mostrarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }

     public static void promedioNumerosPares (int[][] matriz) {
        int n = matriz.length;
        double acumulador = 0;
        for (int fila = 0; fila < n; fila++) {
            for (int col = 0; col < matriz[fila].length; col++) {
                 if ((matriz[fila][col]/2) != 0){
                    acumulador = matriz[fila][col];
                    
                 }

        }
    

     }
    public static void main(String[] args) {
        int[][] laberinto = new int[5][5];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int n = laberinto.length;
        for (int fila = 0; fila < n; fila++) {
            for (int col = 0; col < laberinto[fila].length; col++) {
                laberinto[fila][col] = random.nextInt(9) + 1;
            }
        }

        // Mostrar el laberinto generado
        System.out.println("=== LABERINTO UNIVERSITARIO ===");
        mostrarMatriz(laberinto);

        int paresMayoresA4 = contarParesMayoresA4(laberinto);
        System.out.println("Numeros pares mayores a 4 son ----> " + paresMayoresA4);
    
        System.out.println("Suma de los valores de cada fila:");
        sumarFilas(laberinto);
        
        //2. Calcular el promedio de los números impares. 🎯

        
        scanner.close();
    }
}