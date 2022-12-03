/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programacion2.examenfinal;

import java.util.Scanner;

/**
 *
 * @author Emili
 */
public class Lista_Inversa3 {

    public static void main(String[] args) {
        
        int j;
        
        Scanner teclado = new Scanner( System.in );
        
		 System.out.print("Cuantos tendra la lista? ->");
                 j=teclado.nextInt();
        
                 int t[]=new int[j];

		 for (int i=0;i<j;i++)
		 {
		 System.out.print("Cual seria este numero? -> ");
		 t[i]=teclado.nextInt();
		 }

		 System.out.println("Este es el orden inverso de lo introducido: ");
		 for (int i=4;i>=0;i--)
		 System.out.println(t[i]);

	}
    
}

/*
Respuestas de la 4ta Pregunta:
El comando que permite que se pueda ignorar un elemento del repositorio seria la 3era opcion, es decir, ".gitignore".

Y en el caso de la 5ta pregunta:
 La respuesta serie el comando "git init", el cual al utilizarse luego de poner la direccion de un archivo, 
este permitira que los cambios que se vayan a realizar en un repositorio sean registrados de dicho archivo.
*/