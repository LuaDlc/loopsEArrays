package exercicios.arrays;

import java.util.Random;

public class ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] M =new int[4][4]; //declaração de um matriz multidimensional

        //variaves
        int menor = Integer.MIN_VALUE; //var que guarda o menor valor
        int linha =0, coluna = 0; //posicao inicial da linha e da coluna

        //para: var i=0, ate i menor q o tamanho da matriz(array multidimensional) acrecentamos 1 ao vlor de i a cada loop
        for (int i =0; i < M.length; i++) {//navegando na matriz
            //para: var j=0, ate i menor q o tamanho da linha, acrescentamos 1 ao valor de i a cada loop
            for (int j = 0; j < M[i].length; j++) {
                M[i][j] = random.nextInt(9); //atribuindo um numero aleatoriamente a posição do elemento

                //se o elemento em uma deerminada posicao(linha e coluna) é menor q o numero
                if (M[i][j] < menor) {
                    menor = M[i][j]; //o valor da var menor passa a ser o valor aleatorio
                    linha = i; // q esta na linha representada pela var i
                    coluna = j; 

                    }
                }

            }
            System.out.print("Menor: " + menor);
            System.out.print("Linha: " + linha);
            System.out.print("Coluna: " + coluna);

            System.out.print("\nMatriz");
            for (int[] linhaM: M) {//para cada linha da matriz M
                for(int colunaM : linhaM) {//pegue a coluna desta linha
                    System.out.print(colunaM + " ");

                }
                System.out.println();

            }

        }
    }

