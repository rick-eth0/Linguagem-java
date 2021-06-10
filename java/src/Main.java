import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner teste = new Scanner(System.in);

        String x;
        int y;
        double z;

        x = teste.next();
        y = teste.nextInt();
        z = teste.nextDouble();

        System.out.println("Dados digitados: ");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        teste.close();
        
    }
}
