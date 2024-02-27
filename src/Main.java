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

        // JFrame
        setTitle("Financement Automobile XYZ");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(1000, 800);
        setLocation(0,0);
//        setResizable(false);

        // définir la police
        Font[] polices = {
                new Font("Century Gothic", Font.PLAIN, 16),
                new Font("Century Gothic", Font.BOLD, 16),
                new Font("Century Gothic", Font.ITALIC, 16),
                new Font("Century Gothic", Font.PLAIN | Font.ITALIC, 16),
                new Font("Century Gothic", Font.BOLD | Font.ITALIC, 16),
                new Font("Century Gothic", Font.BOLD, 20) // pour les titres
        };

        // créer un layeredPane
        JLayeredPane layeredPane = new JLayeredPane();
        Dimension layeredPaneDimension = new Dimension(1000, 800);
        layeredPane.setPreferredSize(layeredPaneDimension);
//        layeredPane.setBorder(BorderFactory.createTitledBorder("page principale"));

        // ajouter une icône dans la barre de titre
        ImageIcon barTitleIcon =  new ImageIcon("src/config/icons8-car-96.png");
        setIconImage(barTitleIcon.getImage());

        // ajouter une image de fond
        JLabel backgroundLabel = new JLabel();
        backgroundLabel.setSize(layeredPaneDimension);
        backgroundLabel.setLocation(0,0);
        ImageIcon backgroundImage = new ImageIcon("src/config/home_page_1.png");
        backgroundLabel.setIcon(backgroundImage);

        // titre de la page
        JLabel companyName = new JLabel("Financement Automobile XYZ");
        companyName.setFont(polices[5]);
        companyName.setSize(layeredPaneDimension.width, 50);
        companyName.setLocation(0, 10);
        companyName.setHorizontalAlignment(JLabel.CENTER);
        companyName.setForeground(Color.WHITE);
//        companyName.setHorizontalTextPosition(SwingConstants.RIGHT);

        // description des services de financement
        JTextArea descriptionTextArea = new JTextArea();
        descriptionTextArea.setSize(layeredPaneDimension.width / 2, 80);
        descriptionTextArea.setLocation(centerComponent(layeredPaneDimension, descriptionTextArea), 60);
        descriptionTextArea.setFont(polices[0]);
        descriptionTextArea.setLineWrap(true);
        descriptionTextArea.setWrapStyleWord(true);
        descriptionTextArea.setEditable(false);
        descriptionTextArea.setText("Nous sommes un service de financement qui accompagne ses clients dans l'achat d'un véhicule. " +
                "Nous offrons également un service de location d'automobiles.");
        descriptionTextArea.setOpaque(false);
        descriptionTextArea.setForeground(Color.WHITE);

        // contact de l'entreprise
        JLabel contactLabel = new JLabel();
        contactLabel.setText(
                "<html> " +
                        "<b>Contactez-nous!</b> <br>" +
                        "Par téléphone : <b>1855-555-5555</b> <br>" +
                        "Par courriel &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: <b>car_financing_team_3@github.com</b>" +
                "</html>");
        contactLabel.setSize(layeredPaneDimension.width / 2, 90);
        contactLabel.setLocation(centerComponent(layeredPaneDimension, contactLabel), 140);
        contactLabel.setFont(polices[0]);
        contactLabel.setHorizontalAlignment(JLabel.CENTER);
        contactLabel.setForeground(Color.WHITE);

        // bouton login
        JButton loginButton = new JButton("Connexion");
        loginButton.setSize(150, 50);
        loginButton.setLocation(centerComponent(layeredPaneDimension, contactLabel) + contactLabel.getWidth()/2 + 5, 275);
        loginButton.setFont(polices[1]);
        loginButton.setForeground(Color.WHITE);
        loginButton.setBackground(Color.BLACK);
        loginButton.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        loginButton.setOpaque(false);

        // bouton register
        JButton registerButton = new JButton("Inscription");
        registerButton.setSize(150, 50);
        registerButton.setLocation(centerComponent(layeredPaneDimension, contactLabel) + contactLabel.getWidth()/2 - registerButton.getWidth() - 5, 275);
        registerButton.setFont(polices[1]);
        registerButton.setForeground(Color.WHITE);
        registerButton.setBackground(Color.BLACK);
        registerButton.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        registerButton.setOpaque(false);

        // ajouter les composants à la page principale
        layeredPane.add(backgroundLabel, new Integer(1));
        layeredPane.add(companyName, new Integer(2));
        layeredPane.add(descriptionTextArea, new Integer(2));
        layeredPane.add(contactLabel, new Integer(2));
        layeredPane.add(loginButton, new Integer(2));
        layeredPane.add(registerButton, new Integer(2));
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

    // centrer les composants dans la page
    public int centerComponent (Dimension panelDimension, JComponent component) {
        return (panelDimension.width / 2 - component.getWidth() / 2);
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
