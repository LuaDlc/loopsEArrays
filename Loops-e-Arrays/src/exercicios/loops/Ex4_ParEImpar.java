package loops;

import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantidade de números: ");
        int quantidadeDeNumeros = scan.nextInt();

        int quantPar = 0, quantImpar = 0;

        int count = 0;

        //loop
        do {// faca isso
            System.out.println("Numero: ");
            int numero = scan.nextInt();

            if (numero % 2 == 0) quantPar++;

            else quantImpar++;

            count++;

        } while (count < quantidadeDeNumeros);

        System.out.println("Quantidade de numeros pares: " + quantPar + " / Quantidade de numeros impares " + quantImpar);
        
        scan.close();
    }
    
}
