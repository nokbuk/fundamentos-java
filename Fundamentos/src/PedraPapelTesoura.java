import java.util.Scanner;

public class PedraPapelTesoura {

	public static void main(String[] args) {
		
		int jogador;
		Scanner mao = new Scanner(System.in);
		System.out.println("_______________________");
		System.out.println("________JoKenPo________");
		System.out.println("_______________________");
		System.out.println("");
		System.out.println("1. Papel");
		System.out.println("2. Pedra");
		System.out.println("3. Tesoura");
		System.out.println("Digite a op��o desejada: ");
		jogador = mao.nextInt();
		//Estrutura switch case s� admite apenas o tipo "int" e 'char'
		if(jogador >= 4) {
			System.out.println("N�mero Invalido!!");
		}
		else {
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
			System.out.println("Op��o Inv�lida");
			break;
		
		}
		// a linha abaixo gera n�meros aleat�rios entre o e 2
		// (int) converte para o tipo inteiro(casting)
		//+1 soma 1 ao resultado(1 ou 2 ou 3)
		int computador = (int)(Math.random() * 3 + 1);
		System.out.println(computador);
		switch (computador) {
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
			if (jogador == computador) {
				System.out.println("Empate!! ");
			} else {
         if ((jogador == 1 && computador == 3)||(jogador == 2 && computador == 1)||(jogador == 3 && computador == 2)){
			
        	System.out.println("Computador Venceu!! "); 
		} else {
			System.out.println("Jogador Venceu!! "); 
			
		}
			}
		
		}
		mao.close();
	}
	
	
	
	
}
