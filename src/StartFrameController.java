import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartFrameController {

    StartFrame st = new StartFrame();

    public StartFrameController() {
        st.btnExit.addActionListener(e -> {
            Object source = e.getSource();
            if (source == st.btnExit) {
                System.exit(0);
            }
        });
        st.btnNewGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object source = e.getSource();
                if (source == st.btnNewGame) {
                    st.dispose();
                    new LevelChooser();
                    new GameView();
                }
            }
        });
    }
}
