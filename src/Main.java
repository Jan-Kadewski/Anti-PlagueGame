import javax.swing.*;

public class Main {
    public static int levelChoosen;
    public static int points;
    public static int heathPoints;
    public static int dayEpidemic;
    public static int Infection;



    public static void main(String[] args) {
        SwingUtilities.invokeLater( () -> {new MainController();
        });
    }
}
