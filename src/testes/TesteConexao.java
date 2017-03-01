package testes;

import dao.Conexao;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author KB-01
 */
public class TesteConexao {
    
    public static void main(String[] args) throws SQLException {
        
        Connection con = new Conexao().getConexao();
        System.out.println("Conexão aberta");
        con.close();
    }
}
