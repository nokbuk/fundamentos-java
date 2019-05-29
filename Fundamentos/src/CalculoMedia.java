import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class CalculoMedia {

	public static void main(String[] args) {
		double n1, n2, media;
        
		System.out.println("Cálculo da Média");
		//Criando um objeto para entrada de dados
		//Tudo que começa com maiusculo é uma classe
		//Tudo que começa com "new" é criação de um 
		Scanner leia = new Scanner(System.in);
		leia.useLocale(Locale.ENGLISH);
		//criando um objeto para formatar o resultado
		DecimalFormat formatador = new DecimalFormat("#0.0");
		//ln do println quebra a linha!!
		System.out.print("Digite a nota 1: "); 
		n1 = leia.nextDouble();
		
		System.out.print("Digite a nota 2: "); 
		n2 = leia.nextDouble();
		leia.close();
		media = (n1 + n2) / 2;
		System.out.println("Média: " + formatador.format(media));
		if (media < 5) {
			System.out.println("REPROVADINHO KKKKKKKKKKKKKKKKK");
			
		} else {
            System.out.println("AI SIM MEU REI APROVADO");
		}
	}

}
