import javax.swing.*;

public class LevelChooser {

    public LevelChooser(){
        ImageIcon image = new ImageIcon("fire.gif");
        String[] buttonNames ={"Easy","Medium","Hard"};
        Main.levelChoosen = JOptionPane.showOptionDialog(null,"Choose level game:","set level game",
                JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,image,buttonNames,null);
    }
}
