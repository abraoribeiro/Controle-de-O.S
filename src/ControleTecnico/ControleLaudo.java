package ControleTecnico;

import Conexao.Conect;
import Entidades.Ordem;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Abrão
 */
public class ControleLaudo {

    
    public static boolean laudo(Ordem o){
        
        Connection con = Conect.getConnection();
        try {
            PreparedStatement ps = con.prepareStatement("update ordem set defeito=?, pecas=?, valor=?, laudo=?, codigotecnico=?, valorp=?"
                    + " where codigo=?;");
            
            ps.setString(1, o.getDefeito());
            ps.setString(2, o.getPecas());
            ps.setDouble(3, o.getValor());
            ps.setString(4, o.getLaudo());
            ps.setInt(5, o.getCodigoTecnico());
            ps.setDouble(6, o.getValorP());
            ps.setInt(7, o.getCodigo());
            ps.executeUpdate();
            ps.close();
            return true;
        } catch (SQLException ex) {
            
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao alterar dados");
            return false;
        }
        
        
        
        
        
    }
    
    
}
