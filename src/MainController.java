import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainController {

    MainMenuController mainMenuController;
    Thread threadTimer;
    public MainController() {
        mainMenuController = new MainMenuController();
        threadTimer = new Thread(mainMenuController);
        threadTimer.start();
    }



}
