package controle;

import java.sql.Connection;
import java.sql.SQLException;

import modelo.Pessoa;

public class PessoaDAO {

	
	public boolean inserir(Pessoa p) {
		//Instanciar a classe 
		conexao c = conexao.getInstancia();
		
		//Abrir a conexao com o banco de dados 
		Connection con = c.conectar();
		
		String query = "INSERT INTO";
		
		try {
		PreparedStatment ps = con.prepareStatement(query);
	}catch (SQLException e) {
		e.printStackTrace();
	}
		
		return true;
		
		
	}
	
	
	
	
}
