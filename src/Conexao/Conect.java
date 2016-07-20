package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Abrão
 */
public  class Conect {
    
    private static final String url="jdbc:postgresql://localhost:5432/Controle";
    private static final String senha = "123";
    private static final String usuario = "postgres";
    private static final String classe = "org.postgresql.Driver";
    
    public static Connection getConnection(){
        
        try {
            Class.forName(classe);
            return DriverManager.getConnection(url, usuario, senha);
            
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao procurar Classe");
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro de SQL");
        }
        
        
        return null;
    }
    
    
}
