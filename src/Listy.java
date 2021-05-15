import javax.swing.*;
import java.awt.*;
import java.util.Vector;

public class Listy extends JFrame {

   public Listy(){
       generateFrame();
   }

   public void generateFrame(){
       Vector<String> imiona = new Vector<>();
       imiona.add("Adam");
       imiona.add("Jan");
       imiona.add("Michał");
       imiona.add("Sławomir");
       imiona.add("Zbigniew");


        MyListModel myListModel = new MyListModel(imiona);


       JList jList = new JList();
       jList.setModel(myListModel);
       JScrollPane jscrollPane = new JScrollPane(jList);
       this.getContentPane().add(jscrollPane);

       setSize(200,300);
       setVisible(true);
       setLocationRelativeTo(null);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
   }
}
