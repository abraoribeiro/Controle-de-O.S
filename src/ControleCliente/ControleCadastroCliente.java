package ControleCliente;

import Conexao.Conect;
import Entidades.Pessoa;
import Entidades.PessoaFisica;
import Entidades.PessoaJuridica;
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
public class ControleCadastroCliente {
    
    public static boolean cadastrarPF(PessoaFisica p){
        
        Connection con = Conect.getConnection();
        try {
            PreparedStatement ps = con.prepareStatement("insert into pessoaFisica(nome, cpf,endereco)values(?,?,?); ");
            ps.setString(1, p.getNome());
            ps.setString(2, p.getCpf());
            ps.setString(3, p.getEndereco());
            ps.executeUpdate();
            ps.close();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao inserir os dados");
            return false;
        }
        
        
        
    }
    
    public static boolean cadastrarPJ(PessoaJuridica P){
        
        return false;
    }
    
    
    
}
