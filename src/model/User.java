package model;

public class User {
    private String courriel;
    private String pWord;

    public String getcourriel() {
        return courriel;
    }

    public void setcourriel(String courriel) {
        this.courriel = courriel;
    }

    public String getpWord() {
        return pWord;
    }

    public void setpWord(String pWord) {
        this.pWord = pWord;
    }

    public User(String courriel, String pWord)
    {
        this.courriel = courriel;
        this.pWord = pWord;
    }

    @Override
    public String toString()
    {
        String valeurs = "";
        valeurs += "Adresse électronique : " + this.courriel + "\n";
        valeurs += "Mot de passe : " + this.pWord + ".";

        return valeurs;

    }

}
