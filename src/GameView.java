import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.jar.JarEntry;

public class GameView extends JFrame {
    JPanel panelTop;
    static JButton backToMenu;
    JButton btnPoland;
    JButton Russia;
    JButton England;
    JButton Spain;
    JButton France;
    JButton Turkey;
    JButton Norwey;
    JButton Sweden;
    JButton Romania;
    Poland pl;
    Norwey no;
    Romania ro;
    Russia ru;
    Spain sp;
    Sweden sw;
    Turkey tu;
    England en;
    France fr;
    JPanel tab1;
    JPanel tab2;
    JPanel tab3;
    JLabel lab;
    static JLabel lDays;
    public GameView() {
        Poland pl = new Poland();
        Norwey no = new Norwey();
        Romania ro = new Romania();
        Russia ru = new Russia();
        Spain sp = new Spain();
        Sweden sw = new Sweden();
        Turkey tu = new Turkey();
        England en = new England();
        France fr = new France();

        pl.setCases(0);
        pl.setInfected(0);
        pl.setPopulation(37846611);

        no.setCases(0);
        no.setInfected(0);
        no.setPopulation(5421241);

        ro.setCases(0);
        ro.setInfected(0);
        ro.setPopulation(19237691);

        sp.setCases(0);
        sp.setInfected(0);
        sp.setPopulation(145934462);

        sw.setCases(0);
        sw.setInfected(0);
        sw.setPopulation(10099265);


        tu.setCases(0);
        tu.setInfected(0);
        tu.setPopulation(84339067);

        en.setCases(0);
        en.setInfected(0);
        en.setPopulation(67886011);


        fr.setCases(0);
        fr.setInfected(0);
        fr.setPopulation(65273511);


        panelTop = new JPanel();
        createTopMenu();
        JPanel panelMap = new JPanel();
        panelMap.setBounds(20, 100, 700, 506);
        panelMap.setLayout(new BorderLayout());
        JLabel lmapImage = new JLabel(new ImageIcon("background.jpg"));

        panelMap.add(lmapImage);
        createButtonPoland();
        createButtonRussia();
        createButtonSpain();
        createButtonFrance();
        createButtonTurkey();
        createButtonNorwey();
        createButtonSweden();
        createButtonRomania();
        createButtonEngland();


        tab1 = new JPanel();
        tab1.setBackground(Color.orange);
        lab = new JLabel();
        lab.setText("Infected");
        tab1.add(lab);
        tab2 = new JPanel();
        JLabel lab1 = new JLabel();
        lab1.setText("Messages");
        tab2.add(lab1);
        tab3 = new JPanel();
        JLabel lab2 = new JLabel();
        lab2.setText("Store");
        tab2.add(lab2);
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.setBackground(Color.DARK_GRAY);
        tabbedPane.addTab("Infected", tab1);
        tabbedPane.addTab("Messages", tab2);
        tabbedPane.addTab("Store", tab3);
        tabbedPane.setBounds(780, 80, 350, 550);

        add(tabbedPane);
        add(panelMap);
        add(panelTop);

        setTitle("Koronavirus Anti Plague");
        setSize(1200, 680);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void createTopMenu() {
        panelTop.setLayout(new FlowLayout());
        panelTop.setBackground(new Color(666699));

        lDays = new JLabel("Day of Epidemics:" + Main.dayEpidemic);
        lDays.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30));
        lDays.setForeground(Color.white);
        JLabel lCases = new JLabel("Total Cases:");
        lCases.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30));
        lCases.setForeground(Color.white);
        JLabel lWorldInfected = new JLabel("% of the world infected:");
        lWorldInfected.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30));
        lWorldInfected.setForeground(Color.white);
        JLabel lVaccineProgres = new JLabel("Vaccine progress:");
        lVaccineProgres.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30));
        lVaccineProgres.setForeground(Color.white);
        JLabel lCureProgress = new JLabel("Cure progress:");
        lCureProgress.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30));
        lCureProgress.setForeground(Color.white);
        JLabel lmask = new JLabel(new ImageIcon("mask.png"));
        lmask.setText(String.valueOf(Main.heathPoints));
        lmask.setForeground(Color.white);
        JLabel lStar = new JLabel(new ImageIcon("star.png"));
        lStar.setText(String.valueOf(Main.points));
        lStar.setForeground(Color.white);


        backToMenu = new JButton("Back to menu");
        backToMenu.setForeground(Color.white);
        backToMenu.setFont(new Font(null, Font.BOLD, 16));
        backToMenu.setFocusable(false);
        backToMenu.setBackground(Color.orange);
        backToMenu.setPreferredSize(new Dimension(160, 25));
        panelTop.add(backToMenu);
        panelTop.add(lDays);
        panelTop.add(lCases);
        panelTop.add(lWorldInfected);
        panelTop.add(lVaccineProgres);
        panelTop.add(lCureProgress);
        panelTop.add(lmask);
        panelTop.add(lStar);
    }

    public void createButtonRussia() {
        Russia = new JButton("Russia");
        Russia.setBounds(550, 220, 85, 20);
        Russia.setFocusable(false);
        getContentPane().add(Russia);
    }

    public void createButtonRomania() {
        Romania = new JButton("Romania");
        Romania.setBounds(420, 455, 96, 20);
        Romania.setFocusable(false);
        getContentPane().add(Romania);
    }

    public void createButtonEngland() {
        England = new JButton("England");
        England.setBounds(180, 350, 92, 20);
        England.setFocusable(false);
        getContentPane().add(England);
    }

    public void createButtonPoland() {
        btnPoland = new JButton("Poland");
        btnPoland.setBounds(350, 380, 85, 20);
        btnPoland.setFocusable(false);
        getContentPane().add(btnPoland);
    }

    public void createButtonSpain() {
        Spain = new JButton("Spain");
        Spain.setBounds(145, 520, 85, 20);
        Spain.setFocusable(false);
        getContentPane().add(Spain);
    }

    public void createButtonFrance() {
        France = new JButton("France");
        France.setBounds(210, 445, 85, 20);
        France.setFocusable(false);
        getContentPane().add(France);
    }

    public void createButtonTurkey() {
        Turkey = new JButton("Turkey");
        Turkey.setBounds(510, 520, 85, 20);
        Turkey.setFocusable(false);
        getContentPane().add(Turkey);
    }

    public void createButtonNorwey() {
        Norwey = new JButton("Norwey");
        Norwey.setBounds(235, 240, 92, 20);
        Norwey.setFocusable(false);
        getContentPane().add(Norwey);
    }

    public void createButtonSweden() {
        Sweden = new JButton("Sweden");
        Sweden.setBounds(300, 280, 92, 20);
        Sweden.setFocusable(false);
        getContentPane().add(Sweden);
    }


}
