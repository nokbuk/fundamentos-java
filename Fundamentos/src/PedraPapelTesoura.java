import java.util.Scanner;

public class PedraPapelTesoura {

	public static void main() {
		
		int jogador;
		Scanner mao = new Scanner(System.in);
		System.out.println("_______________________");
		System.out.println("________JoKenPo________");
		System.out.println("_______________________");
		System.out.println("");
		System.out.println("1. Papel");
		System.out.println("2. Pedra");
		System.out.println("3. Tesoura");
		System.out.println("Digite a opção desejada: ");
		jogador = mao.nextInt();
		//Estrutura switch case só admite apenas o tipo "int" e 'char'
		switch (jogador) {
		case 1:
			System.out.println("Jogador escolheu PAPEL");
			break;
		case 2:
			System.out.println("Jogador escolheu PEDRA");
			break;
		case 3:
			System.out.println("Jogador escolheu TESOURA");
			break;
		default:
			System.out.println("Opção Inválida");
			break;
		
		}
		// a linha abaixo gera números aleatórios entre o e 2
		// (int) converte para o tipo inteiro(casting)
		//+1 soma 1 ao resultado(1 ou 2 ou 3)
		int computador = (int)(Math.random() * 3 + 1);
		System.out.println(computador);
		switch (jogador) {
		case 1:
			System.out.println("Computador escolheu PAPEL");
			break;
		case 2:
			System.out.println("Computador escolheu PEDRA");
			break;
		case 3:
			System.out.println("Computador escolheu TESOURA");
			break;
		
		}
		mao.close();
	}
	
	
	
	
}
