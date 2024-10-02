package model.fabrica.services.producao;

import model.fabrica.deposito.materiaprima.MateriaPrima;

public class Producao {
    
    private MateriaPrima material;
    
    public Producao(MateriaPrima material) {
        this.material = material;
    }

    public void fazerCadeira(int quantidade) {
        if (material.getCompensado() >= quantidade * 10 
                && material.getLaminado() >= quantidade * 10 
                && material.getMadeira() >= quantidade * 10 
                && material.getMdf() >= quantidade * 10) {

            material.setCompensado(material.getCompensado() - quantidade * 10);
            material.setLaminado(material.getLaminado() - quantidade * 10);
            material.setMadeira(material.getMadeira() - quantidade * 10);
            material.setMdf(material.getMdf() - quantidade * 10);

            System.out.println(quantidade + ": Cadeira criada com sucesso!");
        } else {
            System.out.println("Materiais insuficientes para criar a cadeira.");
        }
     
    }

    public void fazerMesa(int quantidade) {
        if (material.getCompensado() >= quantidade * 10 
                && material.getLaminado() >= quantidade * 10 
                && material.getMadeira() >= quantidade * 10 
                && material.getMdf() >= quantidade * 10) {

            material.setCompensado(material.getCompensado() - quantidade * 10);
            material.setLaminado(material.getLaminado() - quantidade * 10);
            material.setMadeira(material.getMadeira() - quantidade * 10);
            material.setMdf(material.getMdf() - quantidade * 10);

            System.out.println(quantidade + ": Mesa criada com sucesso!");
        } else {
            System.out.println("Materiais insuficientes para criar a mesa.");
        }
        
    }

    public void fazerGuardaRoupa(int quantidade) {
        if (material.getCompensado() >= quantidade * 10 
                && material.getLaminado() >= quantidade * 10 
                && material.getMadeira() >= quantidade * 10 
                && material.getMdf() >= quantidade * 10) {

            material.setCompensado(material.getCompensado() - quantidade * 10);
            material.setLaminado(material.getLaminado() - quantidade * 10);
            material.setMadeira(material.getMadeira() - quantidade * 10);
            material.setMdf(material.getMdf() - quantidade * 10);

            System.out.println(quantidade + ": Guarda-Roupa criado com sucesso!");
        } else {
            System.out.println("Materiais insuficientes para criar o guarda-roupa.");
        }
       
    }

    public void fazerCama(int quantidade) {
        if (material.getCompensado() >= quantidade * 10 
                && material.getLaminado() >= quantidade * 10 
                && material.getMadeira() >= quantidade * 10 
                && material.getMdf() >= quantidade * 10) {

            material.setCompensado(material.getCompensado() - quantidade * 10);
            material.setLaminado(material.getLaminado() - quantidade * 10);
            material.setMadeira(material.getMadeira() - quantidade * 10);
            material.setMdf(material.getMdf() - quantidade * 10);

            System.out.println(quantidade + ": Cama criada com sucesso!");
        } else {
            System.out.println("Materiais insuficientes para criar a cama.");
        }

    }
}
