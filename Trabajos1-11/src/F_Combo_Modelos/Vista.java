
package F_Combo_Modelos;

import java.awt.Color;
import javax.swing.*;
import org.netbeans.lib.awtextra.*;

public class Vista extends JFrame{
      JButton btnpares,btnimpares;//btn<-Boton(presionar)
    JLabel lblResultado;
    JComboBox cbonumeros;
    public Vista(){
          this.setTitle("");
        this.setSize(500,500);
        this.getContentPane().setLayout(new AbsoluteLayout());
        
        cbonumeros=new JComboBox();
       
       btnpares=new JButton("Pares");
       this.getContentPane().add(btnpares,new AbsoluteConstraints(60,10,100,50));
       btnimpares=new JButton("Impares");
       this.getContentPane().add(btnimpares,new AbsoluteConstraints(60,100,100,50));
       
          this.getContentPane().add(cbonumeros,new AbsoluteConstraints(165,10,100,100));
       
        lblResultado=new JLabel();
        this.getContentPane().add(lblResultado,new AbsoluteConstraints(10,200,150,70));
        lblResultado.setBackground(Color.white);
        lblResultado.setOpaque(true);         
    }
    public static void main(String[] args) {
        Vista v=new Vista();
        v.setVisible(true);
    }
}
