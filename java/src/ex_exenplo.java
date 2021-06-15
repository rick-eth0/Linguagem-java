import java.util.Locale;

public class ex_exenplo {
    
    public static void main(String[] args) {
        
        String product1 = " Computer";
		String product2 = " Office desk";

		int age = 30;
		int code = 5290;
		char agender = 'F';

		double prince1 = 2100;
		double prince2 = 650.50;
		double measure = 53.234567;

		System.out.println("Products:");
		System.out.printf("%s with prince is $ %.2f%n", product1, prince1);
		System.out.printf("%s with is $ %.2f%n", product2, prince2);
		System.out.println();
		System.out.printf("Record: %d  years old, code %d and gender: %c%n ", age, code, agender);
		System.out.println();
		System.out.printf("Measue with eight decimal places: %.8f%n", measure);
		System.out.printf("Rouded with fdecimal places: %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US dicimal point: %.3f%n", measure);
		
        
    }
}
