package controle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.Pessoa;

public class PessoaDAO {

	public ArrayList<Pessoa> listar() {
		Conexao c = Conexao.getInstancia();

		Connection con = c.conectar();
		ArrayList<Pessoa> pessoas = new ArrayList<>();
		String query = "";
		
		return null;
	}

	public boolean inserir(Pessoa p) {

		Conexao c = Conexao.getInstancia();

		Connection con = c.conectar();

		String query = "INSERT INTO pessoa " + "(primeiro_nome, idade) " + "VALUES (?, ?)";

		try {
			PreparedStatement ps = con.prepareStatement(query);

			ps.setString(1, p.getPrimeiro_nome());
			ps.setInt(2, p.getIdade());

			ps.executeUpdate();

			c.fecharConexao();

			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}
