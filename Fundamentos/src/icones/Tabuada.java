package icones;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		System.out.println("===== TABUADA =====");
		Scanner leia = new Scanner(System.in);
		// dica ctrl shift o importa��o
		int valor;
		System.out.print("Digite o valor da tabuada: ");
		valor = leia.nextInt();
		//Estrutura de repeti��o FOR
		// for (estrutura de repeti��o_
		// for(inicio; condi��o; incremento){
		//codigo
		//}
		//i++ > i=i+1)
		
		for (int i = 0; i <=10; i++) {
			
			System.out.println(valor + " x " + i + " = " + (valor*i));
			
		}
		
		leia.close();
	}
	

}
