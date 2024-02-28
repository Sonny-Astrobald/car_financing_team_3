package view;

import model.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginView extends JPanel {
    public LoginView() {
        // Ajoutez vos composants de connexion ici
        //add(new JLabel("Page de Connexion"));
        Box bVert = Box.createVerticalBox();

        bVert.add(Box.createVerticalStrut(5));

        bVert.add(new JLabel("Page de Connexion"));

        bVert.add(Box.createVerticalStrut(10));

        bVert.add(new JLabel("Adresse électronique :            "));
        bVert.add(Box.createVerticalStrut(2));

        JTextField adresse = new JTextField(10);
        bVert.add(adresse);

        bVert.add(Box.createVerticalStrut(5));

        bVert.add(new JLabel("Mot de passe :            "));

        bVert.add(Box.createVerticalStrut(2));

        JPasswordField motDePasse = new JPasswordField();

        bVert.add(motDePasse);

        bVert.add(Box.createVerticalStrut(10));

        JButton connecter = new JButton("    Connexion   ");

        connecter.addActionListener(e -> {
            String addr = adresse.getText();
            char[] mot = motDePasse.getPassword();

            User user1 = new User(addr, mot.toString());
          //
            JOptionPane.showConfirmDialog(null, user1.toString(), "CONFIRMER", JOptionPane.YES_OPTION);
        });

        bVert.add(connecter);

        add(bVert);

    }
}
