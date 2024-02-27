import view.LoginView;
import view.RegisterView;
import config.ImagePanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    private CardLayout cardLayout = new CardLayout();
    private JPanel cardPanel = new JPanel(cardLayout);
    private JPanel mainPanel = new JPanel(new FlowLayout());
    private LoginView loginView = new LoginView();
    private RegisterView registerView = new RegisterView();

    public Main() {
        // jframe (titre, taille de la fenêtre, etc.)
        setTitle("Financement Automobile XYZ");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(1800, 1500);
//        setBounds(0,0,600,400);
//        setResizable(false);

        // ajouter une icône dans la barre de titre
        ImageIcon barTitleIcon =  new ImageIcon("src/config/krillin.png");
        setIconImage(barTitleIcon.getImage());

        // ajouter une image de fond
        ImageIcon backgroundImage = new ImageIcon("src/config/home_page_1.jpg");
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setBounds(0,0,backgroundImage.getIconWidth(), backgroundImage.getIconHeight());


        // description des services de financement
        JLabel descriptionLabel = new JLabel("<html>Services de financement<br>" +
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit,</html>");
        descriptionLabel.setBounds(10, 10, 600, 200);
        // contact de l'entreprise
        JLabel contactLabel = new JLabel("Numéro de contact : 555-555-5555");
        contactLabel.setBounds(10, 10, 600, 200);

        // bouton login
        JButton loginButton = new JButton("Connexion");
        loginButton.setPreferredSize(new Dimension(100, 30));
        // bouton register
        JButton registerButton = new JButton("Inscription");
        registerButton.setPreferredSize(new Dimension(100, 30));

        // ajouter les composants à la page principale
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setPreferredSize(new Dimension(1500, 1200));
        layeredPane.setBorder(BorderFactory.createTitledBorder("page principale"));
//        layeredPane.add(backgroundLabel, new Integer(1));
        layeredPane.add(descriptionLabel, new Integer(2));
        layeredPane.add(contactLabel, new Integer(2));
        layeredPane.add(loginButton, new Integer(3));
        layeredPane.add(registerButton, new Integer(3));
        mainPanel.add(layeredPane);

        cardPanel.add(mainPanel, "Main");
        cardPanel.add(loginView, "Login");
        cardPanel.add(registerView, "Register");

        add(cardPanel);

        // ajouter l'image de fond derrière le reste du contenu layered panel/content
//        ImagePanel panel = new ImagePanel(new ImageIcon("src/config/home_page_1.jpg").getImage());
//        layerPane.add(panel, new Integer(1));
//        layerPane.add(cardPanel, JLayeredPane.DEFAULT_LAYER);

        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "Login");
            }
        });

        registerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "Register");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Main frame = new Main();
                frame.setVisible(true);
//                frame.pack();
            }
        });
    }
}
