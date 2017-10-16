package G_Togglebuttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener {

    Vista v;

    public Controlador() {
        v = new Vista();

        v.tbtnInstalacion.addActionListener(this);
        v.tbtnFormacion.addActionListener(this);
        v.tbtnAlimentacionBD.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        double precio_base;
        double precio_instal; //precio instalación
        double precio_for; //precio formacion
        double precio_ali; //precio alimentacion

//Recojo datos desde la ventana:
        precio_base = esNumero(v.txtPrecioBase.getText());
        precio_instal = 40;
        precio_for = 200;
        precio_ali = 200;

//Ahora que tengo los datos, puedo hacer cálculos.
//Al precio base se le van añadiendo precio de extras
//según estén o no activados los JToggleButtons
        double precio_total;

        precio_total = precio_base;
        if (v.tbtnInstalacion.isSelected()) { //Si se seleccionó instalación
            precio_total = precio_total + precio_instal;
            v.tbtnInstalacion.setText("Instalación 40");
        }else{
            v.tbtnInstalacion.setText("Instalación 0");
        }

        if (v.tbtnFormacion.isSelected()) { //Si se seleccionó formación
            precio_total = precio_total + precio_for;
           v.tbtnFormacion.setText("Formación 200");
        }else{
            v.tbtnFormacion.setText("Formación 0");
        }
        
        
        if (v.tbtnAlimentacionBD.isSelected()) { //Si se seleccionó Alimentación BD
            precio_total = precio_total + precio_ali;
           v.tbtnAlimentacionBD.setText("Alimentación BD  200");
        }else{
            v.tbtnAlimentacionBD.setText("Alimentación BD 0");
        }
//Finalmente pongo el resultado en la etiqueta
        v.etiTotal.setText(precio_total + " €");

    }

    public double esNumero(String txt) {
        double x;
        try {
            x = Double.parseDouble(txt);
        } catch (Exception e) {
            x = 0;
        }
        return x;
    }

    public static void main(String[] args) {
        Controlador c = new Controlador();
    }

}
