package exercicios.arrays;

import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random(); //classe para gerar numeros aleatorios

        int[] numeros = new int[20]; //array com 20 posições

        //para: var i =numero, ate i menor que o tamanho, acrescentamos 1 ao valor de i a cada loop
        for (int i =0; i < numeros.length; i++) {
            int numero = random.nextInt(100); //pegando um numero aleatorio entre 0 e 100
            numeros[i] = numero;
        }

        System.out.print("Numeros: ");
        //loop for-each
        for (int numero : numeros) {//para cada numero dentro do array de numeros
             System.out.print(numero + " "); //imprima o numero

        }

        System.out.print("\n--------");

        System.out.print("Sucessores: ");
        for (int numero : numeros){//para cada numero denro do array de numeros
           System.out.print((numero +1) + " "); 
        }   
    }
}
    
