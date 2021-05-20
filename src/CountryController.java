import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CountryController implements Runnable{
    CountryView countryView;

    public CountryController() {
        countryView = new CountryView();

        countryView.poland.buttonCountry.addActionListener(e -> {
            if (e.getSource() == countryView.poland.buttonCountry) {
                GameView.infected.setText(String.valueOf("Infected:" + countryView.poland.getInfected()));
                GameView.population.setText(String.valueOf("Population:" + countryView.poland.getPopulation()));
                GameView.cases.setText(String.valueOf("Cases:" + countryView.poland.getCases()));
            }
        });

        countryView.russia.buttonCountry.addActionListener(e -> {
            if (e.getSource() == countryView.russia.buttonCountry) {
                GameView.infected.setText(String.valueOf("Infected:" + countryView.russia.getInfected()));
                GameView.population.setText(String.valueOf("Population:" + countryView.russia.getPopulation()));
                GameView.cases.setText(String.valueOf("Cases:" + countryView.russia.getCases()));
            }
        });

        countryView.england.buttonCountry.addActionListener(e -> {
            if (e.getSource() == countryView.england.buttonCountry) {
                GameView.infected.setText(String.valueOf("Infected:" + countryView.england.getInfected()));
                GameView.population.setText(String.valueOf("Population:" + countryView.england.getPopulation()));
                GameView.cases.setText(String.valueOf("Cases:" + countryView.england.getCases()));
            }
        });

        countryView.sweden.buttonCountry.addActionListener(e -> {
            if (e.getSource() == countryView.sweden.buttonCountry) {
                GameView.infected.setText(String.valueOf("Infected:" + countryView.sweden.getInfected()));
                GameView.population.setText(String.valueOf("Population:" + countryView.sweden.getPopulation()));
                GameView.cases.setText(String.valueOf("Cases:" + countryView.sweden.getCases()));
            }
        });

        countryView.romania.buttonCountry.addActionListener(e -> {
            if (e.getSource() == countryView.romania.buttonCountry) {
                GameView.infected.setText(String.valueOf("Infected:" + countryView.romania.getInfected()));
                GameView.population.setText(String.valueOf("Population:" + countryView.romania.getPopulation()));
                GameView.cases.setText(String.valueOf("Cases:" + countryView.romania.getCases()));
            }
        });

        countryView.turkey.buttonCountry.addActionListener(e -> {
            if (e.getSource() == countryView.turkey.buttonCountry) {
                GameView.infected.setText(String.valueOf("Infected:" + countryView.poland.getInfected()));
                GameView.population.setText(String.valueOf("Population:" + countryView.poland.getPopulation()));
                GameView.cases.setText(String.valueOf("Cases:" + countryView.poland.getCases()));
            }
        });

        countryView.spain.buttonCountry.addActionListener(e -> {
            if (e.getSource() == countryView.spain.buttonCountry) {
                GameView.infected.setText(String.valueOf("Infected:" + countryView.spain.getInfected()));
                GameView.population.setText(String.valueOf("Population:" + countryView.spain.getPopulation()));
                GameView.cases.setText(String.valueOf("Cases:" + countryView.spain.getCases()));
            }
        });

        countryView.norwey.buttonCountry.addActionListener(e -> {
            if (e.getSource() == countryView.norwey.buttonCountry) {
                GameView.infected.setText(String.valueOf("Infected:" + countryView.norwey.getInfected()));
                GameView.population.setText(String.valueOf("Population:" + countryView.norwey.getPopulation()));
                GameView.cases.setText(String.valueOf("Cases:" + countryView.norwey.getCases()));
            }
        });


        countryView.france.buttonCountry.addActionListener(e -> {
            if (e.getSource() == countryView.france.buttonCountry) {
                GameView.infected.setText(String.valueOf("Infected:" + countryView.france.getInfected()));
                GameView.population.setText(String.valueOf("Population:" + countryView.france.getPopulation()));
                GameView.cases.setText(String.valueOf("Cases:" + countryView.france.getCases()));
            }
        });
    //TESTTTTTTT
        countryView.mystoreButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == countryView.mystoreButton){
                    countryView.mystoreButton.setText("bought");
                }
            }
        });
    }

    @Override
    public void run() {

    }
}
