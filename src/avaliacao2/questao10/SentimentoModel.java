package avaliacao2.questao10;

public class SentimentoModel {

	private String sentimento;

	public String getSentimento() {
		return this.sentimento;
	}

	public void setSentimento(String sentimento) {
		this.sentimento = sentimento;
	}

	public String resultadoSentimento(int divertido, int chateado) {
		if (divertido == chateado) {
			this.sentimento = "neutro";
			return getSentimento();
		} else if (divertido < chateado) {
			this.sentimento = "divertido";
			return getSentimento();
		} else {
			this.sentimento = "chateado";
			return getSentimento();
		}

	}

	public String resultado(int chateado, int divertido) {
		// TODO Auto-generated method stub
		return null;
	}

}
