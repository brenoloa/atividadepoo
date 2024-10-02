package model.fabrica.deposito.materiaprima;

public class MateriaPrima {
    private int madeira;
    private int mdf;
    private int compensado;
    private int laminado;
    public MateriaPrima(int madeira, int mdf, int compensado, int laminado) {
        this.madeira = madeira;
        this.mdf = mdf;
        this.compensado = compensado;
        this.laminado = laminado;
    }
    public int getMadeira() {
        return madeira;
    }
    public void setMadeira(int madeira) {
        this.madeira = madeira;
    }
    public int getMdf() {
        return mdf;
    }
    public void setMdf(int mdf) {
        this.mdf = mdf;
    }
    public int getCompensado() {
        return compensado;
    }
    public void setCompensado(int compensado) {
        this.compensado = compensado;
    }
    public int getLaminado() {
        return laminado;
    }
    public void setLaminado(int laminado) {
        this.laminado = laminado;
    }

    public void status(){
        System.out.println("Madeira : " + this.getMadeira());
        System.out.println("mdf : " + this.getMdf());
        System.out.println("compensado : " + this.getCompensado());
        System.out.println("laminado : " + this.getLaminado());
    }

    
}
