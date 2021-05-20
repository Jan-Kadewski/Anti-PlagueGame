import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.security.Key;

public class MainMenuController implements Runnable {

    MainMenu mainMenu;
    GameView gameView;
    static boolean timerPauser;

    public MainMenuController() {
        mainMenu = new MainMenu();
        timerPauser = true;
        String key = "BackToMenu";
        mainMenu.btnNewGame.addActionListener(e -> {
            if (e.getSource() == mainMenu.btnNewGame) {
                mainMenu.dispose();
                new LevelChooser();
                new Wirus();
                gameView = new GameView();
                gameView.backToMenu.setAction(buttonAction);
                gameView.backToMenu.setText("Back To Menu");
                gameView.backToMenu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke
                        .getKeyStroke(KeyEvent.VK_Q  ,ActionEvent.CTRL_MASK+ ActionEvent.SHIFT_MASK ),key);
                gameView.backToMenu.getActionMap().put(key,buttonAction);


                gameView.backToMenu.addActionListener(ev -> {
                    if (ev.getSource() == gameView.backToMenu) {
                        gameView.dispose();
                        timerPauser = false;
                        Main.dayEpidemic = 0;
                        mainMenu.setVisible(true);
                        timerPauser = true;
                    }
                });
            }
        });
        mainMenu.btnExit.addActionListener(e -> {
            if (e.getSource() == mainMenu.btnExit) {
                System.exit(0);
            }
        });
    }

    Action buttonAction = new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent e) {
            gameView.dispose();
            timerPauser = false;
            Main.dayEpidemic = 0;
            mainMenu.setVisible(true);
            timerPauser = true;
        }
    };



    public void dayTimer() {
        while (timerPauser) {
            if (gameView == null) {
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            } else {
                Main.dayEpidemic = Main.dayEpidemic + 1;
                try {
                    gameView.lDays.setText(String.valueOf(" Epidemic Day: " + Main.dayEpidemic));
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public void run() {
        dayTimer();
    }
}
