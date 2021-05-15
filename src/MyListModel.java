import javax.swing.*;
import java.util.Vector;

public class MyListModel extends AbstractListModel {
    public Vector<String> imiona;
   public MyListModel(Vector<String> imiona){
       this.imiona = imiona;
   }
    @Override
    public int getSize() {
        return imiona.size();
    }

    @Override
    public Object getElementAt(int index) {
        return imiona.get(index);
    }
}
