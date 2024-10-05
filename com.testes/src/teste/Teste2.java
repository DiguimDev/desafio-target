package teste;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teste2 {
    public static void main(String[] args) {
        String stringAVerificar;
        Scanner scanner = new Scanner(System.in);
        stringAVerificar = scanner.next();

        System.out.println("Digite sua palavra a ser verificada: ");
        verificarA(stringAVerificar);
    }

    private static void verificarA(String string){
        int i;
        int contadorDeA;
        contadorDeA = 0;

        for (i = 0; i < string.length(); i++){
            if (string.charAt(i) == 'a' || string.charAt(i) == 'A'){
                contadorDeA++;
            }
        }
        if (contadorDeA > 0){
            System.out.println("O número de A é: " + contadorDeA);
        }
        else{
            System.out.println("Não há nenhum 'a' ou 'A' na palavra informada");
        }
    }
}
