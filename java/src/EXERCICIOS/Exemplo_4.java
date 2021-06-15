package EXERCICIOS;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo_4 {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos funcionario?");
        int func = sc.nextInt();
        System.out.println("Horas trabalhadas?");
        int horas_T = sc.nextInt();
        System.out.println("Valor que recebe por horas trabalhadas?");
        double valor  = sc.nextDouble();

        double soma = horas_T * valor;

        System.out.println("Nunber =" + func);
        System.out.println("Salary = U$ " + soma);

        sc.close();
    }

}
