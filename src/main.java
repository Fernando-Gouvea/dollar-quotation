import java.util.Locale;
import java.util.Scanner;
import util.CurrencyConverter;


public class main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a cota��o do D�lar:");
		double cot = sc.nextDouble(); 
		
		System.out.println("Digite quantos D�lares deseja comprar");
		double dol = sc.nextDouble();
		
		double reais = CurrencyConverter.convert(cot,dol);
		
		System.out.println("O valor em Reais �:");
		System.out.printf("%.2f",reais);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
