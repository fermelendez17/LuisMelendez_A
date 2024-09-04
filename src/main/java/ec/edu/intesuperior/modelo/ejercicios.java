/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.intesuperior.modelo;

/**
 *
 * @author Cayambe
 */
public class ejercicios {
 ublic static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el tamaño del arreglo: ");
        int tamaño = scanner.nextInt();
        
        int[] numeros = new int[tamaño];
        
        System.out.println("Ingrese los números del arreglo:");
        for (int i = 0; i < tamaño; i++) {
            numeros[i] = scanner.nextInt();
        }
        
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        
        double promedio = (double) suma / tamaño;
        
        System.out.println("La suma de los números es: " + suma);
        System.out.println("El promedio de los números es: " + promedio);
    }
 public static int[][] matrizIdentidad(int n) {
    int[][] matriz = new int[n][n];
    for (int i = 0; i < n; i++) {
        matriz[i][i] = 1;
    }
    return matriz;
}
 public static void main(String[] args) {
        char[] caracteres = {'a', 'b', 'a', 'c', 'a'};
        Map<Character, Integer> frecuencia = new HashMap<>();

        for (char c : caracteres) {
            frecuencia.put(c, frecuencia.getOrDefault(c, 0) + 1);
        }

        System.out.println("La frecuencia de cada carácter es:");
        for (Map.Entry<Character, Integer> entry : frecuencia.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numeros = {2, 4, 6, 8, 10};
        
        System.out.print("Ingrese el número a buscar: ");
        int numeroBuscar = scanner.nextInt();
        
        boolean encontrado = false;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroBuscar) {
                encontrado = true;
                System.out.println("El número se encontró en la posición: " + i);
                break;
            }
        }
        
        if (!encontrado) {
            System.out.println("El número no se encontró en el arreglo.");
        }
    }
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ... (Código para crear un arreglo)

        int contadorPares = 0;
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                contadorPares++;
            }
        }

        System.out.println("La cantidad de números pares es: " + contadorPares);
    }
}
