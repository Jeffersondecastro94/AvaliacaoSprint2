package avaliacao2.questao10;

public class CheckSentimento {

	
	
	public static int divertido(String input) {

		int posicao = -1;
		int divertido = 0;
		int cont=1;

		while (input.contains(":-)")) {

			posicao = input.indexOf(":-)", posicao + cont);
			if (posicao < 0)
				break;
			divertido++;

		}
		return divertido;
	}

	public static int chateado(String input) {
		int cont=1;
		int posicao2 = -1;
		int chateado = 0;

		while (input.contains(":-(")) {
		
			posicao2 = input.indexOf(":-(", posicao2 + cont);
			if (posicao2 < 0)
				break;
			chateado++;

		}
		return chateado;
	}
}
