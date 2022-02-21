package avaliacao2.questao10;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ClassMain {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		MenuModel menu = new MenuModel();
		SentimentoModel sentimentoModel = new SentimentoModel();
		CheckSentimento CheckSentimento = new CheckSentimento();

		menu.menu();
		String sentimento1 = input.next();

		int divertido = CheckSentimento.divertido(sentimento1);
		int chateado = CheckSentimento.chateado(sentimento1);

		InsertDAO insert = new InsertDAO();

		String resultadoSentimentos = sentimentoModel.resultadoSentimento(chateado, divertido);

		insert.insertBanco(resultadoSentimentos);

	}

}
