import java.util.Locale;
import java.text.DecimalFormat;
import java.util.Scanner;


public class CalculadoraIMC {

	public static void main(String[] args) {
		double peso,altura,imc;
		System.out.println("==============");
		System.out.println("Calculo do IMC");
		System.out.println("==============");
		Scanner leia = new Scanner(System.in);
		leia.useLocale(Locale.ENGLISH);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		System.out.print("Digite a sua altura: ");
		altura = leia.nextDouble();
		
		System.out.print("Digite o seu peso: ");
		peso = leia.nextDouble();
		leia.close();
		imc = peso / (altura * altura);
		
		System.out.println("O Seu IMC é: " + formatador.format(imc));
       //Para criar um intervalo usamos o operador AND (&&)
		if (imc < 18.5){
			System.out.println("Você esta abaixo do peso!");
			
		} else if(imc >=18.5 && imc < 25){
			System.out.println("Você esta com o peso normal!");
		}
		else if(imc >=25 && imc < 30) {
			System.out.println("Você esta acima do peso!");
		}
		else {
			System.out.println("Você esta obeso!");
		}
	}

}
