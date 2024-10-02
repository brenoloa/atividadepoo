package model.fabrica.services.catalogo;

public class Catalogo {
    private double cadeira;
    private double mesa;
    private double guardaroupa;
    private double cama;
    public Catalogo(double cadeira, double mesa, double guardaroupa, double cama) {
        this.cadeira = cadeira;
        this.mesa = mesa;
        this.guardaroupa = guardaroupa;
        this.cama = cama;
    }
    public double getMesa() {
        return mesa;
    }
    public void setMesa(double mesa) {
        this.mesa = mesa;
    }
    public double getGuardaroupa() {
        return guardaroupa;
    }
    public void setGuardaroupa(double guardaroupa) {
        this.guardaroupa = guardaroupa;
    }
    public double getCama() {
        return cama;
    }
    public void setCama(double cama) {
        this.cama = cama;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Catalogo{");
        sb.append("cadeira=").append(cadeira);
        sb.append(", mesa=").append(mesa);
        sb.append(", guardaroupa=").append(guardaroupa);
        sb.append(", cama=").append(cama);
        sb.append('}');
        return sb.toString();
    }
    public double getCadeira() {
        return cadeira;
    }
    public void setCadeira(double cadeira) {
        this.cadeira = cadeira;
    }

    
}
