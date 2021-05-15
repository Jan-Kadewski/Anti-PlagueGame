import javax.swing.*;
import java.io.IOException;

public class Main {
    public static int levelChoosen;


    public static void main(String[] args) {
        SwingUtilities.invokeLater( () -> {new StartFrameController();
        });

    }
}
