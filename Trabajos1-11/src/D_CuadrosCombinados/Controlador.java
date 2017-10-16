package D_CuadrosCombinados;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener {

    Vista v;

    public Controlador() {
        v = new Vista();
        v.setVisible(true);
        v.cboolores.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String mensaje = "El color elegido es ";

        mensaje = mensaje + v.cboolores.getSelectedItem().toString();
        v.lblResultado.setText(mensaje);

    }

    public static void main(String[] args) {
        Controlador c = new Controlador();
    }

}
