
package K_BarraDeMenus;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public class Controlador implements ActionListener{
Vista v;
    
    public Controlador(){
       v=new Vista();
       v.setVisible(true);
        v.ClrAzul.addActionListener(this);
        v.ClrRojo.addActionListener(this);
        v.ClrVerde.addActionListener(this);
         
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==v.ClrRojo){
        v.getContentPane().setBackground(Color.RED);

        }
        if(ae.getSource()==v.ClrAzul){
        v.getContentPane().setBackground(Color.BLUE);

        }
        if(ae.getSource()==v.ClrVerde){
        v.getContentPane().setBackground(Color.GREEN);

       }
        
    }
    public static void main(String[] args) {
        Controlador c=new Controlador();
    }
    
    
    
    
    
    
    
    
}
