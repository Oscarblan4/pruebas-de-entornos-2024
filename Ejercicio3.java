/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entornospractica;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author oscar
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero = 0;
        boolean pedirDato = true;
        Scanner reader = new Scanner(System.in);

        while (pedirDato == true) {
            try {
                System.out.println("Introduce un número entero: ");
                numero = reader.nextInt();
                pedirDato = false;
            } catch (InputMismatchException e) {
                System.out.println("Error, no es un número.");

            }
        }

        System.out.println(
                "El número es " + numero);
    }
}
