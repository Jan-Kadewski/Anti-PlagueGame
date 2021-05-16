import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class StartFrame extends JFrame {
    JButton btnNewGame;
    JButton btnHighScores;
    JButton btnExit;

    public StartFrame() {
        ImageIcon image = new ImageIcon("icon.jpeg");
        JPanel panel = new JPanel();
        btnNewGame = new JButton("New Game");
        btnNewGame.setFont(new Font(null, Font.BOLD, 20));
        btnNewGame.setForeground(Color.white);
        btnNewGame.setPreferredSize(new Dimension(100, 100));
        btnNewGame.setFocusable(false);
        btnNewGame.setBackground(new Color(330066));
        btnHighScores = new JButton("High Scores");
        btnHighScores.setFont(new Font(null, Font.BOLD, 20));
        btnHighScores.setFocusable(false);
        btnHighScores.setBackground(new Color(330066));
        btnHighScores.setForeground(Color.white);
        btnExit = new JButton("Exit");
        btnExit.setFont(new Font(null, Font.BOLD, 20));
        btnExit.setFocusable(false);
        btnExit.setBackground(new Color(330066));
        btnExit.setForeground(Color.white);
        JLabel label = new JLabel("Koronawirus AntiPlague");
        label.setFont(new Font(null, Font.BOLD, 24));
        label.setForeground(Color.orange);
        label.setHorizontalAlignment(JLabel.CENTER);

        panel.add(label);
        panel.add(btnNewGame);
        panel.add(btnHighScores);
        panel.add(btnExit);
        panel.setLayout(new GridLayout(4, 1));
        panel.setBackground(new Color(666699));
        add(panel);
        setTitle("Koronawirus AntiPlague");
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 300);
        this.setIconImage(image.getImage());
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
