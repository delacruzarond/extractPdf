package org.pdf;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.Vector;

public class Settings  extends JPanel {
    JPanel contenedorInterfaces;
    CardLayout controlador;
    GridBagConstraints gbc;
    JTable table;
    DefaultTableModel model;

    public  Settings(JPanel contenedorInterfaces, CardLayout controlador){
           this.controlador=controlador;
           this.contenedorInterfaces=contenedorInterfaces;
           setLayout(new GridBagLayout());
           elementos();
    }

    private void elementos(){
        gbc= new GridBagConstraints();
        gbc.insets = new Insets(10,10,10,10);

        gbc.gridy=0;gbc.gridx=0;
        JButton button = new JButton("enviar a login");
        add(button);


        button.addActionListener(e -> controlador.show(contenedorInterfaces,"windows_login"));

        //**********************
        //creo la estrutura de la tabla
        model= new DefaultTableModel();
        model.addColumn("columna 1");
        model.addColumn("columna 2");
        model.addRow(new Object[]{"hola","mundo"});
        model.addRow(new Object[]{"sero","drako"}); 

        //recién lo añado a la tabla
        gbc.gridy=1;gbc.gridx=0;gbc.gridwidth=4;
        gbc.weightx = 1.0;      // Estira horizontalmente al redimensionar
        gbc.weighty = 1.0;      // Estira verticalmente (se queda con casi todo el espacio)
        gbc.fill = GridBagConstraints.BOTH; // Rellena todo el espacio asignado
        gbc.insets = new Insets(10, 10, 10, 10);
        table = new JTable(model);
        add(new JScrollPane(table),gbc);
    }
}
