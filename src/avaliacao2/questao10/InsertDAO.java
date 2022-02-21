package avaliacao2.questao10;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDAO {

	void insertBanco(String resultado12) throws SQLException {

		ConnectionFactory criaConexao = new ConnectionFactory();
		Connection connection = criaConexao.recuperarConexao();

		try (PreparedStatement stm = connection.prepareStatement("INSERT INTO emocoes (sentimento) VALUES (?)",
				Statement.RETURN_GENERATED_KEYS);) {

			// stm.setString(1, id);
			stm.setString(1, resultado12);

			stm.execute();

			try (ResultSet rst = stm.getGeneratedKeys();) {
				while (rst.next()) {
					String id2 = rst.getString(1);
					System.out.println("O id criado foi: " + id2);
				}
			}

		}

	}

}
