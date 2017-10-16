
package I_Spinner;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


public class Controlador  implements ActionListener,ChangeListener {
     Vista v;

    public Controlador() {
        v=new Vista();
        v.setVisible(true);
        SpinnerNumberModel nm = new SpinnerNumberModel();
        nm.setMaximum(10);
        nm.setMinimum(0);
        nm.setStepSize(2);
        v.spiValor.setModel(nm);
        v.spiValor.addChangeListener(this);
      
    }
       @Override
    public void stateChanged(ChangeEvent ce) {
       v.etiValor.setText("El valor es: "+v.spiValor.getValue().toString());
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
       
    }


    public static void main(String[] args) {
        Controlador c=new Controlador();
    }

  
}
