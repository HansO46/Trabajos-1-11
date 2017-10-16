package A_cuadradosdeverificaiciommvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener {

    Vista v;

    public Controlador() {
        v = new Vista();
        v.setVisible(true);
        v.accept.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String mensaje = "Animales elegidos: ";
        if (v.chkperro.isSelected()) {
            mensaje = mensaje + "Perro ";
        }

        if (v.chkgato.isSelected()) {
            mensaje = mensaje + "Gato ";
        }

        if (v.chkraton.isSelected()) {
            mensaje = mensaje + "Raton ";
        }

        v.mensaje.setText(mensaje);
    }
    
    public static void main(String[] args) {
        Controlador c=new Controlador();
    }

}
