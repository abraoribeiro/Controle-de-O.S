package ControleCliente;

import Conexao.Conect;
import Entidades.PessoaFisica;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Abrão
 */
public class ControleExcluirCliente {
    
     public static PessoaFisica excluiCpf(String s, DefaultTableModel jt){
       PessoaFisica pf = new PessoaFisica();
       Connection con = Conect.getConnection();
       
        try {
            PreparedStatement ps = con.prepareStatement("select nome, cpf,endereco, fone1, fone2, cidade, uf,"
                    + " cep, email, bairro, complemento, rg, tipo, codigo from pessoaFisica where cpf = ?;");
            ps.setString(1, s);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                pf.setNome(rs.getString("nome"));
                pf.setCpf(rs.getString("cpf"));
                pf.setEndereco(rs.getString("endereco"));
                pf.setFone1(rs.getString("fone1"));
                pf.setFone2(rs.getString("fone2"));
                pf.setCidade(rs.getString("cidade"));
                pf.setUf(rs.getString("uf"));
                pf.setCep(rs.getString("cep"));
                pf.setEmail(rs.getString("email"));
                pf.setBairro(rs.getString("bairro"));
                pf.setComplemento(rs.getString("complemento"));
                pf.setRg(rs.getString("rg"));
                pf.setTipo(rs.getString("tipo"));
                pf.setCodigo(rs.getInt("codigo"));
                
                
            }
            
            jt.setNumRows(0);
            
            jt.addRow(new Object[]{ pf.getCodigo(), pf.getNome(), pf.getCpf(), pf.getFone1(), pf.getFone2()     });
            
            
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
       return pf;
   }
    public static boolean delete(Integer c){
        
        
        
        return false;
    }
    
}
