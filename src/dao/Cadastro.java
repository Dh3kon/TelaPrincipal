package dao;

import classes.Pessoa;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Cadastro {

    private Conexao con = new Conexao();
    
    public void salvarPessoa(Pessoa pes) {
        
        PreparedStatement st;
        ResultSet res;
        
        try {
            
            int i = 1;
            st = con.getConexao().prepareStatement("insert into pessoas2 "
                    + "(pes_nome,pes_rg,pes_cpf,pes_end,pes_tel,pes_dtcadastro,pes_status)values (?,?,?,?,?,?,?)",
                    PreparedStatement.RETURN_GENERATED_KEYS);
            
            st.setString(i++, pes.getPes_nome());
            st.setString(i++, pes.getPes_rg());
            st.setString(i++, pes.getPes_cpf());
            st.setString(i++, pes.getPes_end());
            st.setString(i++, pes.getPes_tel());
            st.setString(i++, String.valueOf(pes.getPes_dtCadastro()));
            st.setString(i++, pes.getPes_status());
            
            st.execute();
            res = st.getGeneratedKeys();
            
            if (res.next()) {
                pes.setPes_id(res.getInt(1));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Cadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
