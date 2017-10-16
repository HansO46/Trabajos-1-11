
package B_BotonesDeOpcion;



import java.awt.Color;
import javax.swing.*;//esto para abreviar todas las .button.Jlabel o JtextField
import org.netbeans.lib.awtextra.*;

public class Vista extends JFrame{
    JRadioButton btnrojo,btnverde,btnazul;//btn<-Boton(presionar)
    JButton aceptar;
    JLabel resultad,lblResultado;
    ButtonGroup colores;
            
    public Vista() {
        this.setTitle("");
        this.setSize(500,300);
        this.getContentPane().setLayout(new AbsoluteLayout());
        
        colores=new ButtonGroup();
        btnrojo=new JRadioButton("rojo");
        this.getContentPane().add(btnrojo,new AbsoluteConstraints(10,40,100,20));
        btnverde=new JRadioButton("verde");
        this.getContentPane().add(btnverde,new AbsoluteConstraints(10,60,100,20));
        btnazul=new JRadioButton("azul");
        this.getContentPane().add(btnazul,new AbsoluteConstraints(10,20,100,20));
       colores.add(btnrojo);
        colores.add(btnazul);
        colores.add(btnverde);
        aceptar=new JButton ("aceptar");
        this.getContentPane().add(aceptar,new AbsoluteConstraints(60,100,100,100));
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
