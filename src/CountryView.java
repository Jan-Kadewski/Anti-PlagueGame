import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class CountryView {
    Country poland;
    Country england;
    Country romania;
    Country norwey;
    Country spain;
    Country france;
    Country sweden;
    Country turkey;
    Country russia;
    static List<JPanel> storeLabels;
    JPanel myLab;
    JPanel myLab1;
    JPanel myLab2;
    JPanel myLab3;
    JPanel myLab4;
    JPanel myLab5;
    JPanel myLab6;
    JPanel myLab7;
    JPanel myLab8;

    JButton mystoreButton;
    JButton mystoreButton1;
    JButton mystoreButton2;
    JButton mystoreButton3;
    JButton mystoreButton4;
    JButton mystoreButton5;
    JButton mystoreButton6;
    JButton mystoreButton7;
    JButton mystoreButton8;
    JLabel myLabelStore;
    JLabel myLabelStore1;
    JLabel myLabelStore2;
    JLabel myLabelStore3;
    JLabel myLabelStore4;
    JLabel myLabelStore5;
    JLabel myLabelStore6;
    JLabel myLabelStore7;
    JLabel myLabelStore8;

    public CountryView() {
        storeLabels = new ArrayList<>();
        createStoreLabels();
        poland = new Country();
        poland.setPopulation(37846611);
        poland.setCases(2);
        poland.setInfected(0);
        createButtonPoland();
        poland.setStoreLabels(storeLabels);

        england = new Country();
        england.setCases(0);
        england.setInfected(0);
        england.setPopulation(67886011);
        createButtonEngland();
        england.setStoreLabels(storeLabels);

        romania = new Country();
        romania.setCases(0);
        romania.setInfected(0);
        romania.setPopulation(19237691);
        createButtonRomania();
        romania.setStoreLabels(storeLabels);

        norwey = new Country();
        norwey.setCases(0);
        norwey.setInfected(0);
        norwey.setPopulation(5421241);
        createButtonNorwey();
        norwey.setStoreLabels(storeLabels);

        spain = new Country();
        spain.setCases(0);
        spain.setInfected(0);
        spain.setPopulation(46754778);
        createButtonSpain();
        spain.setStoreLabels(storeLabels);

        france = new Country();
        france.setCases(0);
        france.setInfected(0);
        france.setPopulation(65273511);
        createButtonFrance();
        france.setStoreLabels(storeLabels);

        sweden = new Country();
        sweden.setCases(0);
        sweden.setInfected(0);
        sweden.setPopulation(10099265);
        createButtonSweden();
        sweden.setStoreLabels(storeLabels);

        russia = new Country();
        russia.setCases(0);
        russia.setInfected(0);
        russia.setPopulation(145934462);
        createButtonRussia();
        russia.setStoreLabels(storeLabels);

        turkey = new Country();
        turkey.setCases(0);
        turkey.setInfected(0);
        turkey.setPopulation(84339067);
        createButtonTurkey();
        turkey.setStoreLabels(storeLabels);

    }


    public void createButtonPoland() {
        poland.buttonCountry = new JButton("Poland");
        poland.buttonCountry.setBounds(350, 380, 85, 20);
        poland.buttonCountry.setFocusable(false);

    }


    public void createButtonFrance() {
        france.buttonCountry = new JButton("France");
        france.buttonCountry.setBounds(210, 445, 85, 20);
        france.buttonCountry.setFocusable(false);
    }

    public void createButtonRomania() {
        romania.buttonCountry = new JButton("Romania");
        romania.buttonCountry.setBounds(420, 455, 96, 20);
        romania.buttonCountry.setFocusable(false);
    }


    public void createButtonNorwey() {
        norwey.buttonCountry = new JButton("Norwey");
        norwey.buttonCountry.setBounds(235, 240, 92, 20);
        norwey.buttonCountry.setFocusable(false);
    }


    public void createButtonEngland() {
        england.buttonCountry = new JButton("England");
        england.buttonCountry.setBounds(180, 350, 92, 20);
        england.buttonCountry.setFocusable(false);
    }


    public void createButtonRussia() {
        russia.buttonCountry = new JButton("Russia");
        russia.buttonCountry.setBounds(550, 220, 85, 20);
        russia.buttonCountry.setFocusable(false);
    }

    public void createButtonSweden() {
        sweden.buttonCountry = new JButton("Sweden");
        sweden.buttonCountry.setBounds(300, 280, 92, 20);
        sweden.buttonCountry.setFocusable(false);
    }

    public void createButtonTurkey() {
        turkey.buttonCountry = new JButton("Turkey");
        turkey.buttonCountry.setBounds(510, 520, 85, 20);
        turkey.buttonCountry.setFocusable(false);
    }

    public void createButtonSpain() {
        spain.buttonCountry = new JButton("Spain");
        spain.buttonCountry.setBounds(145, 520, 85, 20);
        spain.buttonCountry.setFocusable(false);
    }

    public void createStoreLabels() {
        myLab = new JPanel();
        mystoreButton = new JButton("Buy");
        myLabelStore = new JLabel("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy");
        myLab.add(myLabelStore);
        myLab.add(mystoreButton);

        myLab1 = new JPanel();
        mystoreButton1 = new JButton("Buy");
        myLabelStore1 = new JLabel("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy");
        myLab1.add(myLabelStore1);
        myLab1.add(mystoreButton1);

        myLab2 = new JPanel();
        mystoreButton2 = new JButton("Buy");
        myLabelStore2 = new JLabel("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy");
        myLab2.add(myLabelStore2);
        myLab2.add(mystoreButton2);

        myLab3 = new JPanel();
        mystoreButton3 = new JButton("Buy");
        myLabelStore3 = new JLabel("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy");
        myLab3.add(myLabelStore3);
        myLab3.add(mystoreButton3);

        myLab4 = new JPanel();
        mystoreButton4 = new JButton("Buy");
        myLabelStore4 = new JLabel("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy");
        myLab4.add(myLabelStore4);
        myLab4.add(mystoreButton4);

        myLab5 = new JPanel();
        mystoreButton5 = new JButton("Buy");
        myLabelStore5 = new JLabel("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy");
        myLab5.add(myLabelStore5);
        myLab5.add(mystoreButton5);

        myLab6 = new JPanel();
        mystoreButton6 = new JButton("Buy");
        myLabelStore6 = new JLabel("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy");
        myLab6.add(myLabelStore6);
        myLab6.add(mystoreButton6);

        myLab7 = new JPanel();
        mystoreButton7 = new JButton("Buy");
        myLabelStore7 = new JLabel("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy");
        myLab7.add(myLabelStore7);
        myLab7.add(mystoreButton7);

        myLab8 = new JPanel();
        mystoreButton8 = new JButton("Buy");
        myLabelStore8 = new JLabel("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy");
        myLab8.add(myLabelStore8);
        myLab8.add(mystoreButton8);


        storeLabels.add(myLab);
        storeLabels.add(myLab1);
        storeLabels.add(myLab2);
        storeLabels.add(myLab3);
        storeLabels.add(myLab4);
        storeLabels.add(myLab6);
        storeLabels.add(myLab7);
        storeLabels.add(myLab8);


    }

    @Override
    public String toString() {
        return "CountryView{" +
                "poland=" + poland +
                "population" + poland.getPopulation() +
                '}';
    }
}
