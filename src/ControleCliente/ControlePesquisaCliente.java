package ControleCliente;

import Conexao.Conect;
import Entidades.Pessoa;
import Entidades.PessoaFisica;
import Entidades.PessoaJuridica;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Abrão
 */
public class ControlePesquisaCliente {
    
   
    
    public static PessoaFisica pesquisaCpf(String s){
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
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
       return pf;
   }
    
    public static PessoaJuridica pesquisaCnpj(String s){
        PessoaJuridica pj = new PessoaJuridica();
       Connection con = Conect.getConnection();
       
        try {
            PreparedStatement ps = con.prepareStatement("select nome, cnpj,endereco, fone1, fone2, cidade, uf,"
                    + " cep, email, bairro, complemento, rg, tipo, codigo from pessoaJuridica where cnpj = ?;");
            ps.setString(1, s);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                pj.setNome(rs.getString("nome"));
                pj.setCnpj(rs.getString("cnpj"));
                pj.setEndereco(rs.getString("endereco"));
                pj.setFone1(rs.getString("fone1"));
                pj.setFone2(rs.getString("fone2"));
                pj.setCidade(rs.getString("cidade"));
                pj.setUf(rs.getString("uf"));
                pj.setCep(rs.getString("cep"));
                pj.setEmail(rs.getString("email"));
                pj.setBairro(rs.getString("bairro"));
                pj.setComplemento(rs.getString("complemento"));
                pj.setRg(rs.getString("rg"));
                pj.setTipo(rs.getString("tipo"));
                pj.setCodigo(rs.getInt("codigo"));
                
                
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

       return pj;
   }
    
    
    public static Pessoa pesquisaCodigo(String s){
       
         Connection con = Conect.getConnection();
         PreparedStatement ps;
         ResultSet rs;
        try {
            ps = con.prepareStatement("select codigo, tipo from pessoa where codigo = ?;");
            ps.setInt(1, Integer.parseInt(s));
            rs = ps.executeQuery();
            String tipo = null;
            while(rs.next()){
                tipo = rs.getString("tipo");
            }
            System.out.println(tipo);
            if(tipo.equals("FISICA")){
               
            PessoaFisica p = new PessoaFisica();
            
       
        
            ps = con.prepareStatement("select nome, cpf,endereco, fone1, fone2, cidade, uf,"
                    + " cep, email, bairro, complemento, rg, tipo, codigo from pessoaFisica where codigo = ?;");
            
            ps.setInt(1, Integer.parseInt(s));
            System.out.println("entrou");
            rs = ps.executeQuery();
            while(rs.next()){
                p.setNome(rs.getString("nome"));
                p.setCpf(rs.getString("cpf"));
                p.setEndereco(rs.getString("endereco"));
                p.setFone1(rs.getString("fone1"));
                p.setFone2(rs.getString("fone2"));
                p.setCidade(rs.getString("cidade"));
                p.setUf(rs.getString("uf"));
                p.setCep(rs.getString("cep"));
                p.setEmail(rs.getString("email"));
                p.setBairro(rs.getString("bairro"));
                p.setComplemento(rs.getString("complemento"));
                p.setRg(rs.getString("rg"));
                p.setTipo(rs.getString("tipo"));
                
               p.setCodigo(rs.getInt("codigo"));
                
                
            }
            rs.close();
            ps.close();
        
        
        return p;
              
                
            }else{

           
            PessoaJuridica p = new PessoaJuridica();

            ps = con.prepareStatement("select nome, cnpj,endereco, fone1, fone2, cidade, uf,"
                    + " cep, email, bairro, complemento, rg, tipo, codigo from pessoaJuridica where codigo = ?;");
            ps.setInt(1, Integer.parseInt(s));
            rs = ps.executeQuery();
            while(rs.next()){
                p.setNome(rs.getString("nome"));
                p.setCnpj(rs.getString("cnpj"));
                p.setEndereco(rs.getString("endereco"));
                p.setFone1(rs.getString("fone1"));
                p.setFone2(rs.getString("fone2"));
                p.setCidade(rs.getString("cidade"));
                p.setUf(rs.getString("uf"));
                p.setCep(rs.getString("cep"));
                p.setEmail(rs.getString("email"));
                p.setBairro(rs.getString("bairro"));
                p.setComplemento(rs.getString("complemento"));
                p.setRg(rs.getString("rg"));
                p.setTipo(rs.getString("tipo"));
                p.setCodigo(rs.getInt("codigo"));
                
                
            }
            rs.close();
            ps.close();
        
        
        return p;
                
            }
        
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
         
    } 
         
         public static Pessoa pesquisaNome(String s, DefaultTableModel tb){
         Pessoa p = new Pessoa();
         Connection con = Conect.getConnection();
         PreparedStatement ps;
         ResultSet rs;
         ArrayList<Pessoa> lista = new ArrayList<Pessoa>();
        try {
            ps = con.prepareStatement("select codigo, nome, email, fone1, fone2 from pessoa where nome like ?;");
            ps.setString(1, s);
            rs = ps.executeQuery();
            tb.setNumRows(0);
            while(rs.next()){
            p.setCodigo(rs.getInt("codigo"));
            p.setNome(rs.getString("nome"));
            p.setEmail(rs.getString("email"));
            p.setFone1(rs.getString("fone1"));
            p.setFone2(rs.getString("fone2"));
              
            tb.addRow(new Object[]{p.getCodigo(), p.getNome(), p.getEmail(), p.getFone1(), p.getFone2() });
                
           
            }System.out.println(p.getNome());
           // dados[0] = Integer.toString(p.getCodigo());
           // dados[1] = p.getNome();
           // dados[2] = p.getEmail();
            //dados[3] = p.getFone1();
           // dados[4] = p.getFone2();
           
            
            
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
             
             return p;
         }
        
        
        
        
        
        
    
    
  
    
    
        
    }
    
    

