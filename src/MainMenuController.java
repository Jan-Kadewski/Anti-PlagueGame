public class MainMenuController implements Runnable {

    MainMenu mainMenu;
    GameView gameView;
  static  boolean timerPauser;
    public MainMenuController() {
        mainMenu = new MainMenu();
        timerPauser = true;
        mainMenu.btnNewGame.addActionListener(e -> {
            if (e.getSource() == mainMenu.btnNewGame) {
                mainMenu.dispose();
                new LevelChooser();
                new Wirus();
                gameView = new GameView();
                gameView.backToMenu.addActionListener(ev -> {
                    if (ev.getSource() == gameView.backToMenu) {
                        gameView.dispose();
                        timerPauser = false;
                        Main.dayEpidemic =0;
                        mainMenu.setVisible(true);
                        // tu trzeba włączyć jakoś sensownie timePauser na true;
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

    public  void dayTimer() {
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
