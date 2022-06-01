package exercicios.loops;

import java.util.Scanner;

public class Ex5_Tabuada{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Numero: ");
        int numero = scan.nextInt();

        System.out.println("tabuada de " + numero + ":");

        for (int i = 0; i <= 10; i++) {

            System.out.println(numero + " X " + i + "=" + (numero * i));

            scan.close();
        }
    }
    
}
