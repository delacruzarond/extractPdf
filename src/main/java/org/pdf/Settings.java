package org.pdf;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
        JButton btGoLogin = new JButton("enviar a login");
        add(btGoLogin);


        btGoLogin.addActionListener(e -> controlador.show(contenedorInterfaces,"windows_login"));

        JButton btAdd = new JButton("add +");
        gbc.gridy=0;gbc.gridx=2;
        add(btAdd);
        btAdd.addActionListener(e -> {
            model.addRow(new Object[]{"ingresar nombre de columna","ingresar regex"});
        });


        //creamos el dmodelo
        model=new DefaultTableModel();
        model.addColumn("columna 0");
        model.addColumn("columna 2");
        model.addColumn("columna 2");

        Object [][] matriz={{"hola","mundo"},{"drako","zero"}};
//

 

        for (int i=0;i<matriz.length;++i){
            Object[] temporal= new  Object[3];
            temporal[0]=i;
            temporal[1]=matriz[i][0];
            temporal[2]=matriz[i][1];
            model.addRow(temporal);
        }
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
