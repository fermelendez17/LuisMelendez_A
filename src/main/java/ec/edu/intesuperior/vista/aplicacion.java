/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.intesuperior.vista;

import java.util.Scanner;

/**
 *
 * @author Cayambe
 */

public class aplicacion {
    static Scanner leer=new Scanner(System.in);
     public static void main(String[] args) {
       
}
         public static void Ejercicio_1() { 
       int a, b, c;
      
       System.out.println("Introduzca el primer numero");
       a = leer.nextInt() ;
        System.out.println("Introduzca el segundo numero");
       b = leer.nextInt() ;
        System.out.println("Introduzca el tercer numero");
       c = leer.nextInt() ;
       if(a>b && b>c)  
          System.out.println( a+", "+b+", "+c);      
  else{     
       if(a>c && c>b)           
     System.out.println(a+", "+c+", "+b);
       else{   
            if(b>a && a>c)     
              System.out.println(b+", "+a+", "+c);        
       else{   
               if(b>c && c>a)          
            System.out.println(b+", "+c+", "+a);            
      else{      
                if(c>a && a>b)  
                       System.out.println(c+", "+a+", "+b);                    
                else{  
                       if(c>b && b>a)   
                           System.out.println(c+", "+b+", "+a);
                        }
                    }
                }
            }
        }  
    }
   public static void Ejercicio_2() {  
   int num; 
  System.out.print("Introduzca un número entre 0 y 99.999: ");     
  num=leer.nextInt();  
      if(num<10)  
          System.out.println("tiene 1 cifra");
      else{ 
           if(num<100)  
              System.out.println("tiene 2 cifras");     
       else{ 
               if(num<1000)         
           System.out.println("tiene 3 cifras");   
             else{    
                if(num<10000)             
           System.out.println("tiene 4 cifras");      
           else{    
               if(num<100000)                          
                   System.out.println("tiene 5 cifras");                
                }         
            }       
        }     
    }  
}
  public static void Ejercicio_3() {    
    int num;  
    int dm, um, c, d, u;
    System.out.print("Introduzca un número entre 0 y 99.999: ");     
    num = leer.nextInt();
        // unidad
        u = num % 10;
        num = num / 10;
        // decenas 
       d = num % 10;
        num = num / 10;        
        // centenas 
       c = num % 10;
        num = num / 10;
        // unidades de millar
        um = num % 10; 
       num = num / 10;  
      // decenas de millar
        dm = num;
      // lo imprimimos al revés:
System.out.println (u + " " + d + " " + c + " " + um + " " + dm); 
       // otra forma de hacerlo es 
       num = 10000*u + 1000*d + 100*c + 10*um + dm;      
       System.out.println (num);
    }
  public static void Ejercicio_4() {
  int num; 
  int dm, um, c, d, u;           
 System.out.print("Introduzca un número entre 0 y 99.999: ");       
 num=leer.nextInt(); 
  // unidad
        u = num % 10;
        num = num / 10;    
    // decenas 
       d = num % 10;  
      num = num / 10;  
      // centenas 
       c = num % 10; 
       num = num / 10; 
       // unidades de millar
        um = num % 10;   
     num = num / 10;    
    // decenas de millar 
       dm = num; 
   if (dm == u && um == d)
       System.out.println ("el número es capicúa"); 
      else  
         System.out.println ("el número NO es capicúa"); 
        }    
    
  public static void Ejercicio_5() {        
int nota;        
System.out.print("Introduzca una nota: ");       
   nota=leer.nextInt();
if(nota>=0 && nota<5)       
    System.out.println("INSUFICIENTE");        
else            
if(nota==5)               
 System.out.println("SUFICIENTE");           
 else            
    if(nota==6)              
      System.out.println("BIEN");           
     else            
        if(nota==7 || nota==8)                     
            System.out.println("NOTABLE");            
        else
if(nota==9 || nota==10 )                           
System.out.println("SOBRESALIENTE");      
 

public static void Ejercicio_6() {        
int num;        
System.out.print("Introduzca un número: ");        
num= leer.nextInt();       
 while(num!=0)  
    {
   if(num>0)
 num= leer.nextInt();  
      }   

public static void Ejercicio_7() {        
int num,cuadrado;        
 System.out.print("Introduzca número: ");        
num= leer.nextInt();       
 while(num>=0){         
  cuadrado=num*num;       
  System.out.println(num+ "² es igual a "+ cuadrado);       

System.out.print("Introduzca otro número: ");         
num=Entrada.entero();  
    }    
public static void Ejercicio_8() {       
 int num, contador;
System.out.print("Introduzca un número: ");     
num=leer.nextInt();
 contador=0;            
    while(num>0) 
       {      
      contador =contador+1;  
      }  
      System.out.println("Se han introducido: " +contador + " números");
    }
}
public static void Ejercicio_9() {        
int n, num;
n=(int)(Math.random()*100)+1;            
 num=leer.nextInt();               
 while(num!=n)    
  {           
 if(num>n)          
      System.out.println("menor");        
    else        
        System.out.println("mayor");     
System.out.print("Introduce número: ");    
num=leer.nextInt();  
      }              
      System.out.println("acertaste..."); 
   }
public static void Ejercicio_10() {
int num,suma;        
suma=0;      
  do    
    {       
     System.out.print("Introduzca un número: ");     
num=leer.nextInt();       
     suma=suma+num;   
     }   
     while(num!=0);                
  System.out.println("La suma de todos los números es: "+suma);    

}
 }
}
 ublic static void main(String[] args) {
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

}
