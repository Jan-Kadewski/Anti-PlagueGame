import javax.swing.*;

public class Russia implements CountryModel{
    int population = 0;
    int cases = 0;
    int infected = 0;
    ImageIcon image = null;

    @Override
    public int getPopulation() {
        return population;
    }

    @Override
    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public int getCases() {
        return cases;
    }

    @Override
    public void setCases(int cases) {
        this.cases = cases;
    }

    @Override
    public int getInfected() {
        return infected;
    }

    @Override
    public void setInfected(int infected) {
        this.infected = infected;
    }
}

