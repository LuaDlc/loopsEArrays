package exercicios.arrays;
/*  faca um programa que leia um vetor de 6 caracteres, e diga quantas consosantes foram lidas. imprima as consoantes
*/

import java.util.Scanner;

public class consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //entrada de fluxo de dados pelo teclado;

        String[] consoantes = new String[6]; //iniciando um array vazio com 6 posições

        int count =0; //controla o loop
        int quantidadeDeConsoantes= 0;

        //loop
        do {
            System.out.print("Letra: "); //peça uma letra
            String letra = scan.next(); //capture essa letra e atribua á vaiavel letra

            //se  aletra informada noa for igual a:
            if(!(letra.equalsIgnoreCase("a") |
            letra.equalsIgnoreCase("e") |
            letra.equalsIgnoreCase("i") |
            letra.equalsIgnoreCase("o") |
            letra.equalsIgnoreCase("u"))) {
        //atribua a letra ao elemento do vetor na posição indicada pelo contador caso seja consoante
        consoantes[count] = letra;
        quantidadeDeConsoantes++;

            }
            count++; //acrescente o valor 1 ao contador a cada loop
        } while (count < consoantes.length); //enquanto o contador tiver o valor menor que o tamanho do array

        System.out.print("Consoantes: ");
        for (String consoante : consoantes){ //para cada consoante dentro do array consoantes
            if (consoante != null) //se o valor da consoante for diferente de null
              System.out.print(consoante + " ");


        }

        System.out.println("Quantidade de consoantes: " + quantidadeDeConsoantes);

        scan.close();
    }
}