package ControleCliente;

import Conexao.Conect;
import Entidades.PessoaFisica;
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
public class ControleAlterarCliente {
    
    
    
    public static boolean alteraPessoaFisica(PessoaFisica p){
        
        Connection con = Conect.getConnection();
        PreparedStatement ps;
        String sql = "update pessoaFisica set nome=?, cpf=?, rg=?, "
                + "fone1=?, fone2=?, cidade=?, uf=?, email=?, complemento=?, endereco=?, "
                + "cep=?, bairro=? where codigo= ?;";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, p.getNome());
            ps.setString(2, p.getCpf());
            ps.setString(3, p.getRg());
            ps.setString(4, p.getFone1());
            ps.setString(5, p.getFone2());
            ps.setString(6, p.getCidade());
            ps.setString(7, p.getUf());
            ps.setString(8, p.getEmail());
            ps.setString(9, p.getComplemento());
            ps.setString(10, p.getEndereco());
            ps.setString(11, p.getCep());
            ps.setString(12, p.getBairro());
            ps.setInt(13, p.getCodigo());
            ps.executeUpdate();
            ps.close();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro de Sql");
            return false;
        } 
    }
}
