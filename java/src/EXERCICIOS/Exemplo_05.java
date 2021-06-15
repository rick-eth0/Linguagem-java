package EXERCICIOS;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo_05 {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double valor1 = sc.nextDouble();
        int a = sc.nextInt();

        double valor2 = sc.nextDouble();
        int b = sc.nextInt();
        
        double soma = valor1 * a + valor2 * b;
        
        System.out.printf("VALOR  A PAGAR: %.2f%n", soma);

        sc.close();
    }
    
}
