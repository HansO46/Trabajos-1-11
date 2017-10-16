
package J_JscrollBar;

import javax.swing.*;
import org.netbeans.lib.awtextra.*;

public class Vista extends JFrame{
JScrollBar desValor;
JLabel etiValor;
     
    public Vista() {
        this.setTitle("");
        this.setSize(500,500);
        this.getContentPane().setLayout(new AbsoluteLayout()); 
         etiValor=new JLabel("");
        this.getContentPane().add(etiValor,new AbsoluteConstraints(5,90,150,20));
          desValor=new JScrollBar(JScrollBar.HORIZONTAL);
         this.getContentPane().add(desValor,new AbsoluteConstraints(10,50,450,20));
        desValor.setMaximum(150);
        desValor.setMinimum(50);
        desValor.setUnitIncrement(2);
        desValor.setBlockIncrement(20);
        desValor.setVisibleAmount(5);
         
         
    }
    
    public static void main(String[] args) {
         Vista v=new Vista();
         v.setVisible(true); 
    }
    
}
