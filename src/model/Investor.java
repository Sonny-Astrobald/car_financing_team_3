package model;

import java.time.LocalDate;

public class Investor extends User {

    private String nomComplet;
    private String phone;
    private String nomBanque;
    private String detailCompte;
    private String niveauRisque;
    private String niveauEducation;

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

    public String getNomBanque() {
        return nomBanque;
    }

    public void setNomBanque(String nomBanque) {
        this.nomBanque = nomBanque;
    }

    public String getDetailCompte() {
        return detailCompte;
    }

    public void setDetailCompte(String detailCompte) {
        this.detailCompte = detailCompte;
    }

    public String getNiveauRisque() {
        return niveauRisque;
    }

    public void setNiveauRisque(String niveauRisque) {
        this.niveauRisque = niveauRisque;
    }

    public String getNiveauEducation() {
        return niveauEducation;
    }

    public void setNiveauEducation(String niveauEducation) {
        this.niveauEducation = niveauEducation;
    }

   Investor(String courriel, String pWord,String nomComplet, String phone,
            String nomBanque, String detailCompte, String niveauRisque, String niveauEducation)
   {
       super(courriel, pWord);

       this.nomComplet = nomComplet;
       this.phone = phone;
       this.nomBanque = nomBanque;
       this.detailCompte = detailCompte;
       this.niveauRisque = niveauRisque;
       this.niveauEducation = niveauEducation;
   }
    @Override
    public String toString()
    {
        String valeurs = "";
        valeurs += "Investisseur " + "\n";
        valeurs += "Nom complet : " + this.nomComplet + "\n";
        valeurs += "Adresse électronique : " + this.getcourriel() + "\n";
        valeurs += "Numéro de tèléphone : " + this.phone + "\n";
        valeurs += "Nom de la banque : " + this.nomBanque + "\n";
        valeurs += "Détails du compte bancaire : " + this.detailCompte + "\n";
        valeurs += "Niveau de risque souhaité : " + this.niveauRisque + "\n";
        valeurs += "Niveau d'éducation : " + this.niveauEducation + ".";

        return valeurs;
    }

}
