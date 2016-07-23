package ControleLogin;

import Conexao.Conect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Abrão
 */
public class ControleLogin {
    
    public static String verifica(String u, String s){
        
        Connection con = Conect.getConnection();
        try {
            PreparedStatement ps = con.prepareStatement("select nome, senha, tipo from usuarios where nome= ? and senha= ?;");
            ps.setString(1, u);
            ps.setString(2, s);
            ResultSet rs = ps.executeQuery();
            String tipo = null;
            while(rs.next()){
                tipo = rs.getString("tipo");
            }
            return tipo;
        } catch (SQLException ex) {
            Logger.getLogger(ControleLogin.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
        
        
    }
    
}
