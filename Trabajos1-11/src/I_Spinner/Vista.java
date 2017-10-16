
package I_Spinner;

import javax.swing.*;
import org.netbeans.lib.awtextra.*;


public class Vista extends JFrame{
   JSpinner spiValor;
   JLabel etiValor;

    public Vista() {
        this.setTitle("");
        this.setSize(500,500);
        this.getContentPane().setLayout(new AbsoluteLayout()); 
        etiValor=new JLabel("");
        this.getContentPane().add(etiValor,new AbsoluteConstraints(5,90,150,20));
        spiValor=new JSpinner();
         this.getContentPane().add(spiValor,new AbsoluteConstraints(10,50,450,20));
        
    
    }
    public static void main(String[] args) {
         Vista v=new Vista();
         v.setVisible(true); 
    }
    
}
