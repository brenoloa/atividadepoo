package model.fabrica.deposito.moveis;

public class Moveis {
    private int codigo;
    private String nome;
    private double peso;
    private double valor;
    
    public Moveis(int codigo, String nome, double peso, double valor) {
        this.codigo = codigo;
        this.nome = nome;
        this.peso = peso;
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    

  
}
