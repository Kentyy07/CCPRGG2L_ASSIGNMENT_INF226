import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainMenu extends JFrame {
    MainMenu() {
        super("Snake Game");
        this.setLayout(new FlowLayout());

        ImageIcon snakeIcon = new ImageIcon("mudoh.gif");
        JLabel label = new JLabel();
        label.setIcon(snakeIcon);

        JButton button = new JButton();
        button.setText("START GAME");
        button.setFont(new Font("Consolas", Font.BOLD, 25));

        EventHandler handler = new EventHandler();
        button.addActionListener(handler);

        this.add(label);
        this.add(button);
        this.setLayout(new FlowLayout()); 
        this.setTitle("Snake Game");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(250,500);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    // Event handler class
    private class EventHandler implements ActionListener {

        public void actionPerformed(ActionEvent event) {

            new ColorMenu();

            dispose();
        }
    }
}