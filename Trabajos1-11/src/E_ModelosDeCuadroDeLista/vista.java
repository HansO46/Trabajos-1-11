 
package E_ModelosDeCuadroDeLista;

import javax.swing.*;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class vista extends JFrame {
  JList lstNombres; 
  JButton btnCurso1,btnCurso2; 
  JLabel etiResultado;

    public vista() {
        this.setTitle("");
        this.setSize(500,300);
        this.getContentPane().setLayout(new AbsoluteLayout()); 
        Object x[] =new Object [3];
        x[0]= "";
        x[1]= "";
        x[2]= "";
        lstNombres=new JList (x);
        this.getContentPane().add(lstNombres,new AbsoluteConstraints(60,10,100,100));
        btnCurso1 =new JButton("Curso1");
        this.getContentPane().add(btnCurso1,new AbsoluteConstraints(100,180,100,20));
        btnCurso2 =new JButton("Curso2");
        this.getContentPane().add(btnCurso2,new AbsoluteConstraints(100,200,100,20));
        etiResultado=new JLabel("Resultado:");
        this.getContentPane().add(etiResultado,new AbsoluteConstraints(200,10,150,20));
    }

    public static void main(String[] args) {
       vista v=new vista();
        v.setVisible(true); 
    }
}
