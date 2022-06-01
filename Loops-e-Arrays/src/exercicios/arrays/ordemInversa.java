package exercicios.arrays;

/* crie um vetor de 6 numeros inteiros
e mostre-s na ordem inversa.
*/

public class ordemInversa {
    public static void main(String[] args) {
        int[] vetor = {5, 8, 4, 9, 11, -1}; //inicializando um vetor com 5 elementos

        int count = (vetor.length -1); //o contador devera ser um numero menor que o tamanho do vetor
        System.out.print("Vetor Inverso: ");

        //loop
        while (count >= 0) { //enquanto o contador tiver o valor > ou = a 0
            System.out.print(vetor[count] + " "); //imprima o valor do elemento do vetor na posicao indicada pelo contador
            count--; //diminua o valor 1 do contador a cada loop

        }

        System.out.print("\n-------");

        System.out.println("vetor: ");

        //loop for-each
        for (int elemento : vetor) { //para cada elemento dentro do vetor
            System.out.print(elemento + " "); //imprima o elemento 
 
        }
}
}