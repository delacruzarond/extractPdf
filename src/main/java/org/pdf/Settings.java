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


        //creamos el dmodelo
        model=new DefaultTableModel();
        model.addColumn("columna 0");
        model.addColumn("columna 2");
        model.addColumn("columna 2");
        model.addRow(new  Object[]{"hola","mundo"});
        model.addRow(new Object[]{"drako","zero"});
        model.addRow(new Object[]{"michi","gato"});

        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        gbc.gridx=0;gbc.gridy=2;gbc.weighty=1.0;gbc.weightx=1.0;
        gbc.fill=GridBagConstraints.BOTH;
        gbc.gridwidth=2;
        add(scrollPane,gbc);
        int valor = model.getRowCount();
        System.out.println(valor);

        //**********************

    }
}
