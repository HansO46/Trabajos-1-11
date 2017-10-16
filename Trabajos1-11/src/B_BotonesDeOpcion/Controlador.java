package B_BotonesDeOpcion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener {//evento de dar click a algo

    Vista v;//Con esto hacemos un objeto de la clase vista
    

    public Controlador() {
        v = new Vista();
        v.setVisible(true);
        v.aceptar.addActionListener(this);
        
        
        

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String mensaje="Color elegido: ";

 if (v.btnrojo.isSelected()) {
 mensaje=mensaje+"Rojo";
 } else if (v.btnverde.isSelected()) {
 mensaje=mensaje+"Verde";
 } else if (v.btnazul.isSelected()) {
 mensaje=mensaje+"Azul";
 }

 v.lblResultado.setText(mensaje);

     

    }

    public static void main(String[] args) {
        Controlador c = new Controlador();

    }

}
