import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.*;
public class TryAgain extends JFrame{

    TryAgain(){
        
    JLabel label = new JLabel();
    label.setText("GAME OVER");
    label.setFont(new Font("Arial", Font.BOLD, 25));
    this.add(label);

    JButton tryAgainButton = new JButton();
    tryAgainButton.setText("Play Again");
    tryAgainButton.setFont(new Font("Arial", Font.BOLD, 25));

    EventHandler handler = new EventHandler();
    tryAgainButton.addActionListener(handler);


    JButton exitButton = new JButton();
    exitButton.setText("Exit");
    exitButton.setFont(new Font("Arial", Font.BOLD, 25));
    exitButton.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            System.exit(0);
        }
    });

    this.add(tryAgainButton);
    this.add(exitButton);
    this.setLayout(new FlowLayout()); 
    this.setTitle("Snake Game");
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setSize(250,500);
    this.setVisible(true);
    this.setLocationRelativeTo(null);

    // set background color of frame
    this.getContentPane().setBackground(Color.MAGENTA);
    // lock frame        
    this.setResizable(false);
    }
    private class EventHandler implements ActionListener {

        public void actionPerformed(ActionEvent event) {

            new GameFrame();

            dispose();
        }
    }
}
