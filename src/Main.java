import javax.swing.*;
import java.io.IOException;

public class Main {
    public static int levelChoosen;
    public static int Points;
    public static int heathPoints;



    public static void main(String[] args) {
        SwingUtilities.invokeLater( () -> {new StartFrameController();
        });

    }
}
