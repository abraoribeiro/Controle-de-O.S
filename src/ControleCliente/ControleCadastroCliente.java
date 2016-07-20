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
            PreparedStatement ps = con.prepareStatement("insert into pessoaFisica(nome, cpf,endereco, fone1, fone2, cidade, uf,"
                    + " cep, email, bairro, complemento, rg, tipo)values(?,?,?,?,?,?,?,?,?,?,?,?,?); ");
            System.out.println(p.getUf());
            ps.setString(1, p.getNome());
            ps.setString(2, p.getCpf());
            ps.setString(3, p.getEndereco());
            ps.setString(4, p.getFone1());
            ps.setString(5, p.getFone2());
            ps.setString(6, p.getCidade());
            ps.setString(7, p.getUf());
            ps.setString(8, p.getCep());
            ps.setString(9, p.getEmail());
            ps.setString(10, p.getBairro());
            ps.setString(11, p.getComplemento());
            ps.setString(12, p.getRg());
            ps.setString(13, p.getTipo());
            
            ps.executeUpdate();
            ps.close();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao inserir os dados");
            return false;
        }
        
        
        
    }
    
    public static boolean cadastrarPJ(PessoaJuridica pj){
        
        Connection con = Conect.getConnection();
        try {
            PreparedStatement ps = con.prepareStatement("insert into pessoaJuridica(nome, cnpj,endereco, fone1, fone2, cidade, uf,"
                    + " cep, email, bairro, complemento, rg, tipo)values(?,?,?,?,?,?,?,?,?,?,?,?,?); ");
          //  System.out.println(p.getUf());
            ps.setString(1, pj.getNome());
            ps.setString(2, pj.getCnpj());
            ps.setString(3, pj.getEndereco());
            ps.setString(4, pj.getFone1());
            ps.setString(5, pj.getFone2());
            ps.setString(6, pj.getCidade());
            ps.setString(7, pj.getUf());
            ps.setString(8, pj.getCep());
            ps.setString(9, pj.getEmail());
            ps.setString(10, pj.getBairro());
            ps.setString(11, pj.getComplemento());
            ps.setString(12, pj.getRg());
            ps.setString(13, pj.getTipo());
            
            ps.executeUpdate();
            ps.close();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao inserir os dados");
            return false;
        }
        
       
    }
    
    
    
}
