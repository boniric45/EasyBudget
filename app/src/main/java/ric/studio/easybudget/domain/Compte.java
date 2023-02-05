package ric.studio.easybudget.domain;

import java.util.Date;

public class Compte extends Releve {

    private Integer numero;
    private String nom;
    private Date date;
    private String libelle;
    private Double montant;
    private String typeOperation;
    private Double solde;
    private Double soldeEpargne;

    public Compte(Date date, String libelle, Double montant, String typeOperation, Double solde, Integer numero, String nom, Date date1, String libelle1, Double montant1, String typeOperation1, Double solde1, Double soldeEpargne) {
        super(date, libelle, montant, typeOperation, solde);
        this.numero = numero;
        this.nom = nom;
        this.date = date1;
        this.libelle = libelle1;
        this.montant = montant1;
        this.typeOperation = typeOperation1;
        this.solde = solde1;
        this.soldeEpargne = soldeEpargne;
    }

    public Compte() {
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public Date getDate() {
        return date;
    }

    @Override
    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String getLibelle() {
        return libelle;
    }

    @Override
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @Override
    public Double getMontant() {
        return montant;
    }

    @Override
    public void setMontant(Double montant) {
        this.montant = montant;
    }

    @Override
    public String getTypeOperation() {
        return typeOperation;
    }

    @Override
    public void setTypeOperation(String typeOperation) {
        this.typeOperation = typeOperation;
    }

    @Override
    public Double getSolde() {
        return solde;
    }

    @Override
    public void setSolde(Double solde) {
        this.solde = solde;
    }

    public Double getSoldeEpargne() {
        return soldeEpargne;
    }

    public void setSoldeEpargne(Double soldeEpargne) {
        this.soldeEpargne = soldeEpargne;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "numero=" + numero +
                ", nom='" + nom + '\'' +
                ", date=" + date +
                ", libelle='" + libelle + '\'' +
                ", montant=" + montant +
                ", typeOperation='" + typeOperation + '\'' +
                ", solde=" + solde +
                ", soldeEpargne=" + soldeEpargne +
                '}';
    }
}
