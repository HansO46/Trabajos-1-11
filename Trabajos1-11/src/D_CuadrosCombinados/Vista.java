/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package D_CuadrosCombinados;

import java.awt.Color;
import javax.swing.*;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;
        

/**
 *
 * @author Alumnos
 */
public class Vista extends JFrame{
     JRadioButton btnrojo,btnverde,btnazul;//btn<-Boton(presionar)
    JButton aceptar;
    JLabel resultad,lblResultado;
    JComboBox cboolores;
    
    public Vista(){
         this.setTitle("");
        this.setSize(500,300);
        this.getContentPane().setLayout(new AbsoluteLayout());
        
        cboolores=new JComboBox();
        
        cboolores.addItem("rojo");
        cboolores.addItem("azul");
        cboolores.addItem("verde");
       
          this.getContentPane().add(cboolores,new AbsoluteConstraints(60,10,100,100));
       
        resultad=new JLabel("Resultado:");
        this.getContentPane().add(resultad,new AbsoluteConstraints(200,10,150,20));
        lblResultado=new JLabel();
        this.getContentPane().add(lblResultado,new AbsoluteConstraints(200,30,175,65));
        lblResultado.setBackground(Color.white);
        lblResultado.setOpaque(true);                          
    }
    public static void main(String[] args) {
        Vista v=new Vista();
         v.setVisible(true);
         
    }
}

