package Entidades;

/**
 *
 * @author Abrão
 */
public class PessoaFisica extends Pessoa {
    
    private String cpf;
    private String tipo;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
