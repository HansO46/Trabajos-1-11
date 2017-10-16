package C_CuadrosDevista;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Controlador implements ListSelectionListener {

    Vista v;

    public Controlador() {
        v = new Vista();
        v.setVisible(true);
        v.JLcolores.addListSelectionListener(this);

    }

    @Override
    public void valueChanged(ListSelectionEvent lse) {

        String mensaje;

        mensaje = "El color seleccionado es: " + v.JLcolores.getSelectedValue().toString();
        v.lblResultado.setText(mensaje);

    }

    public static void main(String[] args) {
        Controlador c = new Controlador();
    }

}
