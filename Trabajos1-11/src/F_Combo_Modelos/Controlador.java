
package F_Combo_Modelos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;


public class Controlador implements ActionListener{
    Vista v;
    public Controlador(){
         v = new Vista();
        v.setVisible(true);
        v.cbonumeros.addActionListener(this);
        v.btnpares.addActionListener(this);
        v.btnpares.setActionCommand("par");
     
        v.btnimpares.addActionListener(this);
         v.btnimpares.setActionCommand("impar");
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if("par".equals(ae.getActionCommand())){
            DefaultComboBoxModel modelo = new DefaultComboBoxModel();
            int i;
    for ( i=0;i<10;i+=2) {
   modelo.addElement("Nº "+i);
}
v.cbonumeros.setModel(modelo);
        
    }
        if("impar".equals(ae.getActionCommand())){
        int i;
DefaultComboBoxModel modelo = new DefaultComboBoxModel();
for (i=1;i<10;i+=2) {
   modelo.addElement("Nº "+i);
}
v.cbonumeros.setModel(modelo);
    }
        v.lblResultado.setText(v.cbonumeros.getSelectedItem().toString());

        
    }
    public static void main(String[] args) {
        Controlador c=new Controlador();
    }
    
}
