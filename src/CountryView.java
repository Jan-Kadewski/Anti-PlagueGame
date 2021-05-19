import javax.swing.*;

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

    public CountryView() {
        poland = new Country();
        poland.setPopulation(37846611);
        poland.setCases(2);
        poland.setInfected(0);
        createButtonPoland();

        england = new Country();
        england.setCases(0);
        england.setInfected(0);
        england.setPopulation(67886011);
        createButtonEngland();

        romania = new Country();
        romania.setCases(0);
        romania.setInfected(0);
        romania.setPopulation(19237691);
        createButtonRomania();

        norwey = new Country();
        norwey.setCases(0);
        norwey.setInfected(0);
        norwey.setPopulation(5421241);
        createButtonNorwey();

        spain = new Country();
        spain.setCases(0);
        spain.setInfected(0);
        spain.setPopulation(46754778);
        createButtonSpain();

        france = new Country();
        france.setCases(0);
        france.setInfected(0);
        france.setPopulation(65273511);
        createButtonFrance();

        sweden = new Country();
        sweden.setCases(0);
        sweden.setInfected(0);
        sweden.setPopulation(10099265);
        createButtonSweden();

        russia = new Country();
        russia.setCases(0);
        russia.setInfected(0);
        russia.setPopulation(145934462);
        createButtonRussia();

        turkey = new Country();
        turkey.setCases(0);
        turkey.setInfected(0);
        turkey.setPopulation(84339067);
        createButtonTurkey();


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


    @Override
    public String toString() {
        return "CountryView{" +
                "poland=" + poland +
                "population" + poland.getPopulation() +
                '}';
    }
}
