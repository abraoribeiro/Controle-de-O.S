package Conexao;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Abrão
 */
public  class Conect {
    
    private static Properties conf = new Properties();
    private static String url=null;
    private static String senha=null;
    private static String usuario=null;
    private static String classe=null;
    
    public static Connection getConnection(){       
        try {
            conf.load(new FileInputStream("d:\\parametros.ini"));
            classe = conf.getProperty("classe");
            url = conf.getProperty("url");
            usuario = conf.getProperty("usuario");
            senha = conf.getProperty("senha");
            Class.forName(classe);
            return DriverManager.getConnection(url, usuario, senha);   
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao procurar Classe");
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro de SQL");
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "arquivo 'parametros.ini' nao encontrado");
        }
        return null;
    }    }
