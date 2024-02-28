package model;

import javax.swing.*;
import java.awt.*;

public class background  {
     public background() {

        ImagePanel panel = new ImagePanel(
                new ImageIcon("C:\\Users\\Owner\\IdeaProjects\\car_financing_team_3\\src\\imageVoiture1.jpg").getImage());
      //  JFrame frame = new JFrame();

       // JButton button = new JButton("Activer");
     //   button.setBounds(50,50,100,50);
      //  frame.add(button);

     //   frame.getContentPane().add(panel);

     //   frame.pack();
      //  frame.setVisible(true);
    }
}

class ImagePanel extends JPanel {
    private final Image img;

    public ImagePanel(String img) {
        this(new ImageIcon(img).getImage());
    }

    public ImagePanel(Image img) {
        this.img = img;
        Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
        setPreferredSize(size);
        setMinimumSize(size);
        setMaximumSize(size);
        setSize(size);
        setLayout(null);
    }

    public void paintComponent(Graphics g) {
        g.drawImage(img, 0, 0, null);
    }
}
