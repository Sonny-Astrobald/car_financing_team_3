package view;

import model.User;
import model.Client;
import model.Investor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalDate;
import javax.swing.event.*;

public class RegisterView extends JPanel {
    public RegisterView() {
        // Ajoutez vos composants d'inscription ici

        Box bVert = Box.createVerticalBox();

        bVert.add(Box.createVerticalStrut(5));

        bVert.add(new JLabel("Page d'Inscription"));

        bVert.add(Box.createVerticalStrut(5));

        bVert.add(new JLabel("Type d'utilisateur :            "));

        bVert.add(Box.createVerticalStrut(2));

        String[] typeUser = {"Client", "Investisseur"};

        JComboBox comboField = new JComboBox(typeUser);
        comboField.setSelectedIndex(0);

        bVert.add(comboField);

        //comboField.addItemListener ((ItemListener) bVert);

        bVert.add(Box.createVerticalStrut(5));

            JTextField nomComplet = new JTextField(10);
            JTextField adresse = new JTextField(10);
            JPasswordField motDePasse = new JPasswordField();
            JPasswordField motDePasse1 = new JPasswordField();
            JTextField telephone = new JTextField(10);

        //Client
           JTextField infoEmploi = new JTextField(10);
           JTextField revenu = new JTextField(10);
           JTextField cote = new JTextField(10);
           JTextField dateNais = new JTextField(10);

           String[] status = {"célibataire", "marié"};

          JComboBox comboStatut= new JComboBox(status);

          JTextField duree = new JTextField(10);


        //Investisseur

        JTextField nomBank = new JTextField(10);
        JTextField detailCompte = new JTextField(10);

        String[] niveauRisque = {"peu de risque", "risqué", "très risqué"};

        JComboBox comboRisque = new JComboBox(niveauRisque);

        String[] niveauEducation = {"peu", "moyen", "beaucoup"};

        JComboBox comboEducation = new JComboBox(niveauEducation);


        bVert.add(new JLabel("Nom complet :            "));
        bVert.add(Box.createVerticalStrut(2));
        bVert.add(nomComplet);
        bVert.add(Box.createVerticalStrut(5));
        bVert.add(new JLabel("Adresse électronique :            "));
        bVert.add(Box.createVerticalStrut(2));
        bVert.add(adresse);
        bVert.add(Box.createVerticalStrut(5));

        bVert.add(new JLabel("Mot de passe :            "));

        bVert.add(Box.createVerticalStrut(2));

        bVert.add(motDePasse);

        bVert.add(Box.createVerticalStrut(5));

        bVert.add(new JLabel("Repetez le mot de passe :    "));

        bVert.add(Box.createVerticalStrut(2));

        bVert.add(motDePasse1);

        bVert.add(Box.createVerticalStrut(5));

        bVert.add(new JLabel("Numéro de téléphone :            "));
        bVert.add(Box.createVerticalStrut(2));
        bVert.add(telephone);
        bVert.add(Box.createVerticalStrut(5));



        Object utilisateur = comboField.getSelectedItem();

            if ((String) utilisateur == "Client") {

                bVert.add(new JLabel("Informations sur l'emploi : "));
                bVert.add(Box.createVerticalStrut(2));
                bVert.add(infoEmploi);
                bVert.add(Box.createVerticalStrut(5));
                bVert.add(new JLabel("Revenu annuel  : "));
                bVert.add(Box.createVerticalStrut(2));
                bVert.add(revenu);
                bVert.add(Box.createVerticalStrut(5));
                bVert.add(new JLabel("Note de crédit : "));
                bVert.add(Box.createVerticalStrut(2));
                bVert.add(cote);
                bVert.add(Box.createVerticalStrut(5));
                bVert.add(new JLabel("Date de naissance : "));
                bVert.add(Box.createVerticalStrut(2));
                bVert.add(dateNais);
                bVert.add(Box.createVerticalStrut(5));
                bVert.add(new JLabel("Statut marital : "));
                bVert.add(Box.createVerticalStrut(2));
                bVert.add(comboStatut);
                bVert.add(Box.createVerticalStrut(5));
                bVert.add(new JLabel("Durée d'établissement : "));
                bVert.add(Box.createVerticalStrut(2));
                bVert.add(duree);
                bVert.add(Box.createVerticalStrut(5));
            }
            if ((String) utilisateur == "Investisseur")
            {
                bVert.add(new JLabel("Nom de la banque : "));
                bVert.add(Box.createVerticalStrut(2));
                bVert.add(nomBank);
                bVert.add(Box.createVerticalStrut(5));
                bVert.add(new JLabel("Détails compte bancaire  : "));
                bVert.add(Box.createVerticalStrut(2));
                bVert.add(detailCompte);
                bVert.add(Box.createVerticalStrut(5));
                bVert.add(new JLabel("Niveau de risque souhaité : "));
                bVert.add(Box.createVerticalStrut(2));
                bVert.add(comboRisque);
                bVert.add(Box.createVerticalStrut(5));
                bVert.add(new JLabel("Niveau d'éducation : "));
                bVert.add(Box.createVerticalStrut(2));
                bVert.add(comboEducation);
                bVert.add(Box.createVerticalStrut(5));
            }

                bVert.add(Box.createVerticalStrut(5));

                JButton sinscrire = new JButton("    S'inscrire   ");

                sinscrire.addActionListener(e -> {
                    String nom = nomComplet.getText();
                    String addr = adresse.getText();
                    char[] mot = motDePasse.getPassword();
                    String tel = telephone.getText();

                    if ((String) utilisateur == "Client")
                    {
                        String info = infoEmploi.getText();
                        String revenuA =  revenu.getText();
                        String coteC = cote.getText();
                        String dateN = dateNais.getText();
                        String statutM = (String) comboStatut.getSelectedItem();
                        String dureeE = duree.getText();

                        Client client1 = new Client (addr, mot.toString(), nom, tel, info, 45.00, 780.00, dateN, statutM, 12.00);
                        //
                        JOptionPane.showConfirmDialog(null, client1.toString(), "CONFIRMER", JOptionPane.YES_OPTION);
                    }

                });

                bVert.add(sinscrire);


        add(bVert);


    }

    private class TheHandler implements ItemListener {
        public void itemStateChanged(ItemEvent event) {

            if (event.getStateChange() == ItemEvent.SELECTED) {
               // menu.setSelectedItem("The Matrix");
               // menu.getSelectedIndex();
            }
        }
    }
}