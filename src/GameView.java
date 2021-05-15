import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class GameView extends JFrame {

    public GameView() {



        setTitle("background test");
        setSize(700,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setVisible(true);

        JLabel background = new JLabel(new ImageIcon("/home/jan/Pulpit/Projekt/src/background.jpg"));
        add(background);
        background.setLayout(new FlowLayout());
    }


}
