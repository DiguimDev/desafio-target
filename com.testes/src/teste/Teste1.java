package teste;

import java.util.Scanner;

public class Teste1 {
    public static void main(String[] args) {
        System.out.println("Digite um número para verificar se ele é de fibonacci");
        verificarSequencia();
    }


    private static void verificarSequencia() {
        int numeroAnterior;
        int contador;
        int i;
        int sequencia;
        int numero;
        sequencia = 1;
        contador = 0;

        Scanner scanner = new Scanner(System.in);

        numero = scanner.nextInt();
        for (i = 0; i <= numero;){
            numeroAnterior = sequencia;
            if(numero == i){
                System.out.println("O numero informado pertence a Sequencia de fibonacci");
                contador++;
                break;
            }
            sequencia = i + sequencia;
            i = numeroAnterior;
        }
        if(contador == 0){
            System.out.println("O número informado nao pertence a Sequencia de fibonacci");
        }
    }
}
