package K_BarraDeMenus;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.*;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class Vista extends JFrame {

    JMenuBar barraMenus;
    JMenu MenuArchivo, MenuEdicion, MenuInsertar, MenuColores;
    JMenuItem MenuItemAbrir, menuItemGuardar, MenuSalir, ClrAzul, ClrRojo, ClrVerde;

    public Vista() {
        this.setTitle("Menus");
        this.setSize(500, 500);
        this.getContentPane().setLayout(new AbsoluteLayout());

        barraMenus = new JMenuBar();
        this.getContentPane().add(barraMenus, new AbsoluteConstraints(10, 10, 200, 50));
        MenuArchivo = new JMenu("Archivo");
        MenuInsertar = new JMenu("Ayuda");
        MenuEdicion = new JMenu("Diseño");
        barraMenus.add(MenuArchivo);
        barraMenus.add(MenuEdicion);
        barraMenus.add(MenuInsertar);
        MenuItemAbrir = new JMenuItem("Abrir");
        menuItemGuardar = new JMenuItem("Guardar");
        MenuSalir = new JMenuItem("Salir");
        MenuArchivo.add(MenuItemAbrir);
        MenuArchivo.add(menuItemGuardar);
        MenuArchivo.addSeparator();
        MenuArchivo.add(MenuSalir);
        MenuColores = new JMenu("Colores");
        MenuEdicion.add(MenuColores);
        ClrRojo = new JMenuItem("Rojo");
        ClrAzul=new JMenuItem("Azul");
        ClrVerde=new JMenuItem("Verde");
        MenuColores.add(ClrAzul);
         MenuColores.addSeparator();
        MenuColores.add(ClrRojo);
         MenuColores.addSeparator();
        MenuColores.add(ClrVerde);

    }

    public static void main(String[] args) {
        Vista v = new Vista();
        v.setVisible(true);
    }

    void ClrAzul(Color RED) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
