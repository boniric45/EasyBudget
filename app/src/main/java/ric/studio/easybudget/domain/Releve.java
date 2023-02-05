package ric.studio.easybudget.domain;

import java.util.Date;

public class Releve {

    private Date date;
    private String libelle;
    private Double montant;
    private String typeOperation;
    private Double solde;

    public Releve(Date date, String libelle, Double montant, String typeOperation, Double solde) {
        this.date = date;
        this.libelle = libelle;
        this.montant = montant;
        this.typeOperation = typeOperation;
        this.solde = solde;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

    public String getTypeOperation() {
        return typeOperation;
    }

    public void setTypeOperation(String typeOperation) {
        this.typeOperation = typeOperation;
    }

    public Double getSolde() {
        return solde;
    }

    public void setSolde(Double solde) {
        this.solde = solde;
    }

    public Releve() {
    }

    @Override
    public String toString() {
        return "Releve{" +
                "date=" + date +
                ", libelle='" + libelle + '\'' +
                ", montant=" + montant +
                ", typeOperation='" + typeOperation + '\'' +
                ", solde=" + solde +
                '}';
    }
}
