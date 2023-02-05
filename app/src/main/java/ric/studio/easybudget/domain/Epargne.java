package ric.studio.easybudget.domain;

import java.util.Date;

public class Epargne {

    private Date date;
    private Double montant;

    public Epargne(Date date, Double montant) {
        this.date = date;
        this.montant = montant;
    }

    public Epargne() {
    }

    @Override
    public String toString() {
        return "Epargne{" +
                "date=" + date +
                ", montant=" + montant +
                '}';
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }
}
