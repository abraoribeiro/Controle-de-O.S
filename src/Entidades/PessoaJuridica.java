package Entidades;

/**
 *
 * @author Abrão
 */
public class PessoaJuridica extends Pessoa{
    
    private String cnpj;
    private String tipo;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
