/*Ejercicio 1. Crea una aplicación que permita adivinar un número. La aplicación genera un número aleatorio
 del 1 al 100. A continuación va pidiendo números y va respondiendo si el número a adivinar 
es mayor o menor que el introducido, a demás de los intentos que te quedan (tienes 10 intentos para acertarlo). 
El programa termina cuando se acierta el número (además te dice en cuantos intentos lo has acertado), si se llega al
 limite de intentos te muestra el número que había generado. */
import java.util.Random;
import java.util.Scanner;

public class ejercicioQ{
    public static void main(String[] args) {
        
    Random aleatorio= new Random(System.currentTimeMillis());
    int num_aleatorio= aleatorio.nextInt(100);
    int intentos=0;
    Scanner r=new Scanner(System.in);
    for (int i=0;intentos<10;i++){
        intentos=i;
        System.out.println("intente adivinar el numero: ");
        int numero=r.nextInt();
        if (intentos<10) {
            if (numero>num_aleatorio){
                System.out.println("el numero a adivinar es menor al numero ingresado ");}
            if (num_aleatorio>numero) {
                System.out.println("el numero a adivinar es mayor al numero ingresado");
            } 
            if (num_aleatorio==numero) {
                System.out.println("haz adivinado el numero ");
                break;
                
            
            }
       
        
        }

        else{
            System.out.println("el numero era : "+ num_aleatorio);}

    }  
    r.close(); 
}
}

    
