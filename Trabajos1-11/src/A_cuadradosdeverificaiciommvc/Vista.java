
package A_cuadradosdeverificaiciommvc;

import java.awt.Color;
import javax.swing.*;
import org.netbeans.lib.awtextra.*;

public class Vista extends JFrame{
    JLabel gato,perro,raton,mensaje;
    JButton accept;
    JCheckBox chkgato,chkperro,chkraton;
   


public Vista(){
this.setTitle("Cuadros de verificacion");
this.setSize(500,500);
this.getContentPane().setLayout(new AbsoluteLayout());
gato=new JLabel("Gato");
this.getContentPane().add(gato,new AbsoluteConstraints(50,10,100,20));
raton=new JLabel("raton");
this.getContentPane().add(raton,new AbsoluteConstraints(50,70,100,20));
perro=new JLabel("perro");
this.getContentPane().add(perro,new AbsoluteConstraints(50,130,100,20));
mensaje=new JLabel();
this.getContentPane().add(mensaje,new AbsoluteConstraints(10,250,300,100));
mensaje.setBackground(Color.white);
mensaje.setOpaque(true);
accept=new JButton("Aceptar");
this.getContentPane().add(accept,new AbsoluteConstraints(10,200,90,20));
chkgato=new JCheckBox("Gato");
this.getContentPane().add(chkgato,new AbsoluteConstraints(10,10,25,20));
chkraton=new JCheckBox();
this.getContentPane().add(chkraton,new AbsoluteConstraints(10,70,25,20));
chkperro=new JCheckBox();
this.getContentPane().add(chkperro,new AbsoluteConstraints(10,130,25,20));
        
}
   
}

