import javax.swing.*;

public class moja implements Runnable{
    GameView gw = new GameView();

    @Override
    public void run() {
        for(;;){
            Main.dayEpidemic = Main.dayEpidemic +1;
            System.out.println(Main.dayEpidemic);
            try {
                GameView.lDays.setText(String.valueOf(" DayOfEpidemy: "+ Main.dayEpidemic));
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
