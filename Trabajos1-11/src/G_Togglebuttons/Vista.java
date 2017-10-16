package G_Togglebuttons;

import java.awt.Color;
import javafx.scene.control.ToggleButton;
import javax.swing.*;
import javax.swing.border.LineBorder;
import org.netbeans.lib.awtextra.*;

public class Vista extends JFrame {

    JLabel LblPrecioBase, etiTotal;
    JToggleButton tbtnInstalacion, tbtnFormacion, tbtnAlimentacionBD;
    JTextField txtPrecioBase;

    public Vista() {
        this.setTitle("Toglebuttons v1.1 alpha");
        this.setSize(300, 700);
        this.getContentPane().setLayout(new AbsoluteLayout());
        this.setResizable(false);//la ventana no se haga mas grande
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);//se áre el proceso de consola al cerrar la interfaz
        LblPrecioBase = new JLabel("Precio base");
        this.getContentPane().add(LblPrecioBase, new AbsoluteConstraints(10, 10, 150, 50));

        etiTotal = new JLabel();
        this.getContentPane().add(etiTotal, new AbsoluteConstraints(60, 550, 150, 50));
        etiTotal.setBackground(Color.white);
        etiTotal.setOpaque(true);
        etiTotal.setBorder(new LineBorder(Color.red));
        
//Estas 3 no son visibles

//        etiPrecioInstalacion = new JLabel("40");
//        this.getContentPane().add(etiPrecioInstalacion, new AbsoluteConstraints(250, 100, 100, 50));
//       
//        
//        etiFormacion = new JLabel("200");
//        this.getContentPane().add(etiFormacion, new AbsoluteConstraints(250, 200, 100, 50));
//                 
//
//        etiPrecioAlimentacion = new JLabel("200");
//        this.getContentPane().add(etiPrecioAlimentacion, new AbsoluteConstraints(250, 300, 100, 50));
//                

//Estas 3 no son visibles

       
        
        tbtnAlimentacionBD=new JToggleButton("Alimentacion BD 0");
        this.getContentPane().add(tbtnAlimentacionBD, new AbsoluteConstraints(60, 300, 150, 50));
        
        tbtnInstalacion=new JToggleButton("Instalación 0");
        this.getContentPane().add(tbtnInstalacion, new AbsoluteConstraints(60, 100, 150, 50));
        
        tbtnFormacion=new JToggleButton("Formacion 0");
        this.getContentPane().add(tbtnFormacion, new AbsoluteConstraints(60, 200, 150, 50));
        
        txtPrecioBase=new JTextField();
        this.getContentPane().add(txtPrecioBase, new AbsoluteConstraints(60, 10, 150, 50));
        this.setVisible(true);



    }
    public static void main(String[] args) {
        Vista v=new Vista();
        v.setVisible(true);
    }

}
