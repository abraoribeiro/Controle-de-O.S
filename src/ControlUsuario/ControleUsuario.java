package ControlUsuario;

import Conexao.Conect;
import Entidades.Usuario;
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
public class ControleUsuario {
    
    public static boolean CadastraUsuario(Usuario u){
        String sql = "insert into usuarios (nome, senha, tipo) values(?,?,?);";
        
        Connection con = Conect.getConnection();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, u.getNome());
            ps.setString(2, u.getSenha());
            ps.setString(3, u.getTipo());
            ps.executeUpdate();
            ps.close();
            con.close();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao Inserir os dados");
        return false;
        }
        
        
        
    }
}
