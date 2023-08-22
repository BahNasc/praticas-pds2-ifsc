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
<<<<<<< HEAD
	
	public boolean excluir(Pessoa p) {
		Conexao c = Conexao.getInstancia();
		Connection con = c.conectar();
		
		String query = "DELETE FROM pessoa WHERE id = ?";
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, p.getId());
			ps.executeUpdate();
			
			c.fecharConexao();
			
			return true;
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
				return false;
	}
	
	public boolean atualizar(Pessoa p) {
		Conexao c = Conexao.getInstancia();
		Connection con = c.conectar();
		
		String query = "UPDATE pessoa SET " + "primeiro_nome = ? WHERE id_pessoa =?";
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, p.getPrimeiro_nome());
			ps.setInt(2, p.getId());
			
			ps.executeUpdate();
			c.fecharConexao();
			
			return true;
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}
	
=======
>>>>>>> master

}
