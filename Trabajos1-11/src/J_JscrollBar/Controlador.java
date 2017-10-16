
package J_JscrollBar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;


public class Controlador implements ActionListener,AdjustmentListener{
        Vista v;

    public Controlador() {
        v=new Vista();
        v.setVisible(true);
        v.desValor.addAdjustmentListener(this);
    }
        

    @Override
    public void actionPerformed(ActionEvent ae) {
        
    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent ae) {
        v.etiValor.setText("El valor es: "+v.desValor.getValue());
    }
    public static void main(String[] args) {
        Controlador c=new Controlador();
    }
    
}
