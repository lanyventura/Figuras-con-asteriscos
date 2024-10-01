package figuras;

import java.util.Scanner;

public class Figuras {

    public static void main(String[] args) {
        int algoMas = 0;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Elige una opcion: \n1.-Cuadrado \n2.-Triangulo \n3.-Reloj");
            int opcion = teclado.nextInt();
            switch (opcion) {
                case 1 ->
                    cuadrado();
                case 2 ->
                    triangulo();
                case 3 ->
                    reloj();
                
                default ->
                    System.out.println("opcion no valida");

            }
            System.out.println("Deseas hacer algo mas? \n0.-Si \n1.-no");
            algoMas = teclado.nextInt();
        } while (algoMas == 0);
    }

    public static void cuadrado() {
         Scanner teclado = new Scanner(System.in);
       int tam;
        System.out.println("INGRESA EL TAMAÑO DE LA TABLA");
        tam = teclado.nextInt();
        char[][] arreglo = new char[tam][tam];
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                if (i == 0 || i == tam - 1 || j == 0 || j == tam - 1) {
                    arreglo[i][j] = '*';
                } else {
                    arreglo[i][j] = ' ';
                }
            }
        }
        
        // Imprimir la matriz
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                System.out.print(arreglo[i][j]);
            }
            System.out.println(); // Salto de línea después de cada fila
        }}

    public static void triangulo() {
        Scanner scanner = new Scanner(System.in);

        // Pedimos al usuario que ingrese la altura del triángulo
        System.out.print("Ingresa la altura del triángulo: ");
        int altura = scanner.nextInt();

        // Bucle para imprimir el triángulo
        for (int i = 1; i <= altura; i++) {
            // Imprimir espacios
            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            }
            // Imprimir asteriscos
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            // Salto de línea
            System.out.println();
        }
    }
    public static void reloj (){
        Scanner scc = new Scanner(System.in);
        int numero;
        System.out.println("INGRESA EL TAMAÑO DE LA TABLA");
        numero = scc.nextInt();
        
        // Asegurarse de que el tamaño sea impar para un reloj de arena simétrico
        if (numero % 2 == 0) {
            System.out.println("El tamaño debe ser un número impar.");
            return;
        }
        
        char[][] arreglo = new char[numero][numero];
        
        // Inicializar la matriz con espacios en blanco
        for (int i = 0; i < numero; i++) {
            for (int j = 0; j < numero; j++) {
                arreglo[i][j] = ' ';
            }
        }
        
        // Llenar la matriz para formar el reloj de arena
        int mitad = numero / 2;
        for (int i = 0; i < numero; i++) {
            for (int j = 0; j < numero; j++) {
                if (i <= mitad) {
                    // Parte superior del reloj de arena
                    if (j >= i && j < numero - i) {
                        arreglo[i][j] = '*';
                    }
                } else {
                    // Parte inferior del reloj de arena
                    if (j >= numero - i - 1 && j <= i) {
                        arreglo[i][j] = '*';
                    }
                }
            }
        }
        
        // Imprimir la matriz en formato cuadrado
        for (int i = 0; i < numero; i++) {
            for (int j = 0; j < numero; j++) {
                System.out.print(arreglo[i][j]);
            }
            System.out.println(); // Salto de línea después de cada fila
        }
    }
    }
    
        

