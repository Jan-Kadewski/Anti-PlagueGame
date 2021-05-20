import javax.swing.*;
import java.awt.*;
import java.util.List;

public class Country {
    int population;
    int cases;
    ImageIcon image;
    int infected;
    JButton buttonCountry;
    Image animatedIcon;
    ImageIcon animatedIcon1;
    ImageIcon animatedIcon2;
    List<JPanel> storeLabels;



    public Country(){
    }

    public List<JPanel> getStoreLabels() {
        return storeLabels;
    }

    public void setStoreLabels(List<JPanel> storeLabels) {
        this.storeLabels = storeLabels;
    }



    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getCases() {
        return cases;
    }

    public void setCases(int cases) {
        this.cases = cases;
    }

    public int getInfected() {
        return infected;
    }

    public void setInfected(int infected) {
        this.infected = infected;
    }

    public ImageIcon getImage() {
        return image;
    }

    public void setImage(ImageIcon image) {
        this.image = image;
    }

}
