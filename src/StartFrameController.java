import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.security.Key;

public class StartFrameController {

    GameView gameView;
    StartFrame st;
    Thread t;

    public StartFrameController() {
        Main.dayEpidemic = 0;
        StartFrame st = new StartFrame();
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
                    new Wirus();
                }
                GameView gv = new GameView();
                t = new Thread(gv);
                t.start();
                gv.btnPoland.addActionListener(e12 -> {
                    if (e12.getSource() == gv.btnPoland) {
                        gv.infected.setText(String.valueOf("Infected:" + gv.pl.getInfected()));
                        gv.population.setText(String.valueOf("Population:" + gv.pl.getPopulation()));
                        gv.cases.setText(String.valueOf("Cases:" + gv.pl.getCases()));
                    }
                });
                gv.Russia.addActionListener(e13 -> {
                    if (e13.getSource() == gv.Russia) {
                        gv.infected.setText(String.valueOf("Infected:" + gv.ru.getInfected()));
                        gv.population.setText(String.valueOf("Population:" + gv.ru.getPopulation()));
                        gv.cases.setText(String.valueOf("Cases:" + gv.ru.getCases()));
                    }
                });
                gv.Norwey.addActionListener(e13 -> {
                    if (e13.getSource() == gv.Norwey) {
                        gv.infected.setText(String.valueOf("Infected:" + gv.no.getInfected()));
                        gv.population.setText(String.valueOf("Population:" + gv.no.getPopulation()));
                        gv.cases.setText(String.valueOf("Cases:" + gv.no.getCases()));
                    }
                });
                gv.Romania.addActionListener(e13 -> {
                    if (e13.getSource() == gv.Romania) {
                        gv.infected.setText(String.valueOf("Infected:" + gv.ro.getInfected()));
                        gv.population.setText(String.valueOf("Population:" + gv.ro.getPopulation()));
                        gv.cases.setText(String.valueOf("Cases:" + gv.ro.getCases()));
                    }
                });
                gv.Spain.addActionListener(e13 -> {
                    if (e13.getSource() == gv.Spain) {
                        gv.infected.setText(String.valueOf("Infected:" + gv.sp.getInfected()));
                        gv.population.setText(String.valueOf("Population:" + gv.sp.getPopulation()));
                        gv.cases.setText(String.valueOf("Cases:" + gv.sp.getCases()));
                    }
                });
                gv.Sweden.addActionListener(e13 -> {
                    if (e13.getSource() == gv.Sweden) {
                        gv.infected.setText(String.valueOf("Infected:" + gv.sw.getInfected()));
                        gv.population.setText(String.valueOf("Population:" + gv.sw.getPopulation()));
                        gv.cases.setText(String.valueOf("Cases:" + gv.sw.getCases()));
                    }
                });
                gv.Turkey.addActionListener(e13 -> {
                    if (e13.getSource() == gv.Turkey) {
                        gv.infected.setText(String.valueOf("Infected:" + gv.tu.getInfected()));
                        gv.population.setText(String.valueOf("Population:" + gv.tu.getPopulation()));
                        gv.cases.setText(String.valueOf("Cases:" + gv.tu.getCases()));
                    }
                });

                gv.England.addActionListener(e13 -> {
                    if (e13.getSource() == gv.England) {
                        gv.infected.setText(String.valueOf("Infected:" + gv.en.getInfected()));
                        gv.population.setText(String.valueOf("Population:" + gv.en.getPopulation()));
                        gv.cases.setText(String.valueOf("Cases:" + gv.en.getCases()));
                    }
                });

                gv.France.addActionListener(e13 -> {
                    if (e13.getSource() == gv.France) {
                        gv.infected.setText(String.valueOf("Infected:" + gv.fr.getInfected()));
                        gv.population.setText(String.valueOf("Population:" + gv.fr.getPopulation()));
                        gv.cases.setText(String.valueOf("Cases:" + gv.fr.getCases()));
                    }
                });


            }

        });
    }


}
