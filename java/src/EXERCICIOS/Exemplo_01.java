package EXERCICIOS;

import java.util.Scanner;

public class Exemplo_01 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();
        int numero2 = sc.nextInt();

        int soma = numero + numero2;

        System.out.println("A soma é " + soma);
        sc.close();
    }
    
}
