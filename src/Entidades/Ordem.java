package Entidades;

/**
 *
 * @author Abrão
 */
public class Ordem {
    
    private Integer codigo;
    private String equipamento;
    private String defeitoR;
    private String defeito;
    private String laudo;
    private String tipo;
    private String entreguePor;
    private Boolean entregue;
    private String nrSerie;
    private String acessorios;
    private String obs;
    private String tipoOrcamento;
    private Integer codigoTecnico;
    private Integer codigoCliente;
    private double valor;
    private double valorP;
    private String pecas;

    public double getValorP() {
        return valorP;
    }

    public void setValorP(double valorP) {
        this.valorP = valorP;
    }

    public String getPecas() {
        return pecas;
    }

    public void setPecas(String pecas) {
        this.pecas = pecas;
    }
        
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    
    
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(String equipamento) {
        this.equipamento = equipamento;
    }

    public String getDefeitoR() {
        return defeitoR;
    }

    public void setDefeitoR(String defeitoR) {
        this.defeitoR = defeitoR;
    }

    public String getDefeito() {
        return defeito;
    }

    public void setDefeito(String defeito) {
        this.defeito = defeito;
    }

    public String getLaudo() {
        return laudo;
    }

    public void setLaudo(String laudo) {
        this.laudo = laudo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEntreguePor() {
        return entreguePor;
    }

    public void setEntreguePor(String entreguePor) {
        this.entreguePor = entreguePor;
    }

    public Boolean getEntregue() {
        return entregue;
    }

    public void setEntregue(Boolean entregue) {
        this.entregue = entregue;
    }

    public String getNrSerie() {
        return nrSerie;
    }

    public void setNrSerie(String nrSerie) {
        this.nrSerie = nrSerie;
    }

    public String getAcessorios() {
        return acessorios;
    }

    public void setAcessorios(String acessorios) {
        this.acessorios = acessorios;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getTipoOrcamento() {
        return tipoOrcamento;
    }

    public void setTipoOrcamento(String tipoOrcamento) {
        this.tipoOrcamento = tipoOrcamento;
    }

    public Integer getCodigoTecnico() {
        return codigoTecnico;
    }

    public void setCodigoTecnico(Integer codigoTecnico) {
        this.codigoTecnico = codigoTecnico;
    }

    public Integer getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(Integer codigoCliente) {
        this.codigoCliente = codigoCliente;
    }
    
    
    
    
    
    
}
