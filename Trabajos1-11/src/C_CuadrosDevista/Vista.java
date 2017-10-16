package C_CuadrosDevista;

import java.awt.Color;
import javax.swing.*;
import org.netbeans.lib.awtextra.*;

public class Vista extends JFrame {

    JLabel resultad, lblResultado,mensaje;
    JList JLcolores;

    public Vista() {
        this.setTitle("Hola");
        this.setSize(500, 300);
        this.getContentPane().setLayout(new AbsoluteLayout());

        Object x[] = new Object[3];
        x[0] = "Rojo";
        x[1] = "Verde";
        x[2] = "Azul";
        JLcolores = new JList(x);
        this.getContentPane().add(JLcolores, new AbsoluteConstraints(60, 10, 100, 100));

        
        lblResultado = new JLabel();
        this.getContentPane().add(lblResultado, new AbsoluteConstraints(200, 30, 175, 65));
        lblResultado.setBackground(Color.WHITE);
        lblResultado.setOpaque(true);

    }

    public static void main(String[] args) {
        Vista v = new Vista();
        v.setVisible(true);
    }
}
