import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class GameView extends JFrame {

    JPanel panelTop;
    JButton backToMenu;
    JPanel tab1;
    JPanel tab2;
    JPanel tab3;
    static JLabel population;
    static JLabel cases;
    static JLabel infected;
    JLabel lDays;
    JLabel lWorldInfected;
    JLabel lVaccineProgres;
    JLabel totalCases;
    JLabel lCureProgress;
    JLabel lmask;
    JLabel lStar;
    CountryController countryController;
//    Image img;

    public GameView() {
        countryController = new CountryController();
        MainMenuController.timerPauser = true;
        panelTop = new JPanel();
        createTopMenu();

        JPanel panelMap = new JPanel();
        panelMap.setBounds(20, 100, 700, 506);
        panelMap.setLayout(new BorderLayout());
        JLabel lmapImage = new JLabel(new ImageIcon("background.jpg"));
        panelMap.add(lmapImage);
//        this.loadImage();
        getContentPane().add(countryController.countryView.poland.buttonCountry);
        getContentPane().add(countryController.countryView.norwey.buttonCountry);
        getContentPane().add(countryController.countryView.england.buttonCountry);
        getContentPane().add(countryController.countryView.spain.buttonCountry);
        getContentPane().add(countryController.countryView.turkey.buttonCountry);
        getContentPane().add(countryController.countryView.russia.buttonCountry);
        getContentPane().add(countryController.countryView.france.buttonCountry);
        getContentPane().add(countryController.countryView.romania.buttonCountry);
        getContentPane().add(countryController.countryView.sweden.buttonCountry);


        tab1 = new JPanel();
        tab1.setLayout(new GridLayout(6, 1));
        tab1.setBackground(Color.orange);
        population = new JLabel();
        cases = new JLabel();
        infected = new JLabel();
        population.setBounds(0, 10, 200, 10);
        cases.setBounds(0, 10, 200, 10);
        infected.setBounds(0, 30, 200, 10);
        tab1.add(population);
        tab1.add(infected);
        tab1.add(cases);

        tab2 = new JPanel();
        tab2.setLayout(new GridLayout(9,1));
        JLabel lab1 = new JLabel();
        lab1.setText("Messages");
        tab2.add(lab1);


        tab3 = new JPanel();
        for(JPanel l: CountryView.storeLabels){
            tab3.add(l);
        }
        tab3.setLayout(new GridLayout(10,1));
        JLabel lab2 = new JLabel();
        lab2.setText("Store");

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
//
//    public void loadImage(){
//        File file = new File("plane.png");
//        try{
//            img = ImageIO.read(file);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Override
//    public void paint(Graphics g) {
//        super.paint(g);
//
//        g.drawImage(img,200,200,null);
//    }

    public void createTopMenu() {
        panelTop.setLayout(new FlowLayout());
        panelTop.setBackground(new Color(666699));

        lDays = new JLabel("Day of Epidemics:" + Main.dayEpidemic);
        lDays.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30));
        lDays.setForeground(Color.white);

        totalCases = new JLabel("Total Cases:");
        totalCases.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30));
        totalCases.setForeground(Color.white);

        lWorldInfected = new JLabel("% of the world infected:" + Main.heathPoints);
        lWorldInfected.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30));
        lWorldInfected.setForeground(Color.white);

        lVaccineProgres = new JLabel("Vaccine progress:");
        lVaccineProgres.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30));
        lVaccineProgres.setForeground(Color.white);

        lCureProgress = new JLabel("Cure progress:");
        lCureProgress.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30));
        lCureProgress.setForeground(Color.white);

        lmask = new JLabel(new ImageIcon("mask.png"));
        lmask.setText(String.valueOf(Main.heathPoints));
        lmask.setForeground(Color.white);

        lStar = new JLabel(new ImageIcon("star.png"));
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
        panelTop.add(totalCases);
        panelTop.add(lWorldInfected);
        panelTop.add(lVaccineProgres);
        panelTop.add(lCureProgress);
        panelTop.add(lmask);
        panelTop.add(lStar);


    }


}
