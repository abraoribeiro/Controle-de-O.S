package ControlUsuario;

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
public class PesquisaUsuario {
    
    
    public static Integer buscaCodigo(String u, String s){
        Connection con = Conect.getConnection();
        ResultSet rs;
        int codigo = 0;
        try {
            PreparedStatement ps = con.prepareStatement("select codigo from usuarios where nome=? and senha=?;");
            ps.setString(1, u);
            ps.setString(2, s);
            rs = ps.executeQuery();
            
            while(rs.next()){
                codigo = rs.getInt("codigo");
                
            }
            return codigo;
            
        } catch (SQLException ex) {
            Logger.getLogger(PesquisaUsuario.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
        
        
        
    }
    
    
    
}
