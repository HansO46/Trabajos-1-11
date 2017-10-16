package E_ModelosDeCuadroDeLista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class controlador implements ActionListener, ListSelectionListener {

    vista v;//Con esto hacemos un objeto de la clase vista
    int n1 = 0, n2 = 0;

    public controlador() {
        v = new vista();
        v.setVisible(true);
        v.btnCurso1.addActionListener(this);
        v.btnCurso1.setActionCommand("C1");
        v.btnCurso2.addActionListener(this);
        v.btnCurso2.setActionCommand("C2");
        v.lstNombres.addListSelectionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand() == "C1") {
            DefaultListModel modelo = new DefaultListModel();
            modelo.addElement("Juan");
            modelo.addElement("María");
            modelo.addElement("Luis");
            v.lstNombres.setModel(modelo);

        }
        if (e.getActionCommand() == "C2") {
            DefaultListModel modelo = new DefaultListModel();
            modelo.addElement("Ana");
            modelo.addElement("Marta");
            modelo.addElement("Jose");
            v.lstNombres.setModel(modelo);

        }

    }

    public static void main(String[] args) {
        controlador c = new controlador();

    }

    @Override
    public void valueChanged(ListSelectionEvent lse) {
        try{
       v.etiResultado.setText(v.lstNombres.getSelectedValue().toString());
        }catch(Exception e){
            
        }
    }

}
