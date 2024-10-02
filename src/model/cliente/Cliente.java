package model.cliente;

public class Cliente {
    private String cnpj;
    private String endereço;
    private String nomeEmpresa;
    private String telefone;
    private double saldo;
    public Cliente(String cnpj, String endereço, String nomeEmpresa, String telefone, double saldo) {
        this.cnpj = cnpj;
        this.endereço = endereço;
        this.nomeEmpresa = nomeEmpresa;
        this.telefone = telefone;
        this.saldo = saldo;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public String getEndereço() {
        return endereço;
    }
    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
    public String getNomeEmpresa() {
        return nomeEmpresa;
    }
    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
   
    public void reduzirSaldo(double valor) {
        this.setSaldo(this.getSaldo() - valor);
    }
   
    
    
    
}
