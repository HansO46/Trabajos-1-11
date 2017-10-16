
package H_Sliders;

import javax.swing.*;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;


public class Vista extends JFrame{
      JSlider slDeslizador;
    JLabel etiValor;
    
    public Vista(){
        this.setSize(500,500);
        this.setTitle("Sliders");
         this.getContentPane().setLayout(new AbsoluteLayout());
        slDeslizador=new JSlider(100,500);
        etiValor=new JLabel();
        this.getContentPane().add(slDeslizador, new AbsoluteConstraints(10, 10, 300, 100));
        slDeslizador.setValue(400);
        slDeslizador.setMajorTickSpacing(50);
        slDeslizador.setPaintTicks(true);
        slDeslizador.setPaintLabels(true);
        this.getContentPane().add(etiValor, new AbsoluteConstraints(10, 100, 150, 50));
    }
    public static void main(String[] args) {
        Vista v=new Vista();
        v.setVisible(true);
    }
}
