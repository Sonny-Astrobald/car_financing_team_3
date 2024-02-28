package model;

import java.time.LocalDate;

public class Client extends User {
    private String nomComplet;
    private String phone;
    private String emploi;
    private double revenuAnnuel;
    private double coteCredit;
    private String dateNaissance;
    private String statutMarital;
    private double dureeEtablissement;

    public String getNomComplet() {
        return nomComplet;
    }

    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmploi() {
        return emploi;
    }

    public void setEmploi(String emploi) {
        this.emploi = emploi;
    }

    public double getRevenuAnnuel() {
        return revenuAnnuel;
    }

    public void setRevenuAnnuel(double revenuAnnuel) {
        this.revenuAnnuel = revenuAnnuel;
    }

    public double getCoteCredit() {
        return coteCredit;
    }

    public void setCoteCredit(double coteCredit) {
        this.coteCredit = coteCredit;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getStatutMarital() {
        return statutMarital;
    }

    public void setStatutMarital(String statutMarital) {
        this.statutMarital = statutMarital;
    }

    public double getDureeEtablissement() {
        return dureeEtablissement;
    }

    public void setDureeEtablissement(double dureeEtablissement) {
        this.dureeEtablissement = dureeEtablissement;
    }


    public Client(String courriel, String pWord, String nomComplet, String phone,
                  String emploi, double revenuAnnuel, double coteCredit, String dateNaissance, String statutMarital,
                  double dureeEtablissement)
    {
        super(courriel, pWord);

        this.nomComplet = nomComplet;
        this.phone = phone;
        this.emploi = emploi;
        this.revenuAnnuel = revenuAnnuel;
        this.coteCredit = coteCredit;
        this.dateNaissance = dateNaissance;
        this.statutMarital = statutMarital;
        this.dureeEtablissement = dureeEtablissement;

    }

    @Override
    public String toString()
    {
        String valeurs = "";
        valeurs += "Client " + "\n";
        valeurs += "Nom complet : " + this.nomComplet + "\n";
        valeurs += "Adresse électronique : " + this.getcourriel() + "\n";
        valeurs += "Numéro de tèléphone : " + this.phone + "\n";
        valeurs += "Emploi : " + this.emploi + "\n";
        valeurs += "Revenu annuel : " + this.revenuAnnuel + "\n";
        valeurs += "Note de crédit : " + this.coteCredit + "\n";
        valeurs += "Date de naissance : " + this.dateNaissance + "\n";
        valeurs += "Statut marital : " + this.statutMarital + "\n";
        valeurs += "Durée d'établissement : " + this.dureeEtablissement + ".";

        return valeurs;

    }


}
