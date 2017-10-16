
package H_Sliders;


import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Controlador implements ChangeListener{
  Vista v;
    
   public Controlador(){
       v=new Vista();
       v.setVisible(true);
       v.slDeslizador.addChangeListener(this);
       
   }

    @Override
    public void stateChanged(ChangeEvent ce) {
        v.etiValor.setText("El valor es: "+v.slDeslizador.getValue());
    }
    public static void main(String[] args) {
        Controlador c=new Controlador();
    }
    
    
    
}
