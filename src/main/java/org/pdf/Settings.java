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
    JComboBox<Object> comboBox;
    DefaultTableModel model;


    public  Settings(JPanel contenedorInterfaces, CardLayout controlador){
           this.controlador=controlador;
           this.contenedorInterfaces=contenedorInterfaces;
           setLayout(new GridBagLayout());
           elementos();
    }

    private void elementos(){

        //creamos el dmodelo el cual solo se crea en memoria para luego isnertar en la tabla
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

        gbc= new GridBagConstraints();
        gbc.insets = new Insets(10,10,10,10);
        //botones
        //boton login
        gbc.gridy=0;gbc.gridx=0;
        JButton btGoLogin = new JButton("enviar a login");
        add(btGoLogin);

        //boton add
        JButton btAdd = new JButton("add +");
        gbc.gridy=0;gbc.gridx=2;
        add(btAdd);

        String[] box = new  String[model.getRowCount()];
        for(int i=0;i<box.length;i++){
            box[i]=Integer.toString(i);
        }

        // boton eliminar
        JButton btEliminar = new JButton("Eliminar");
        gbc.gridy=0;gbc.gridx=4;
        add(btEliminar);
        // combobox
        gbc.gridy=0;gbc.gridx=3;
        JComboBox comboBox = new JComboBox(box);
        add(comboBox);



        // creamos la tabla
        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        gbc.gridx=0;gbc.gridy=2;gbc.weighty=1.0;gbc.weightx=1.0;
        gbc.fill=GridBagConstraints.BOTH;
        gbc.gridwidth=2;
        add(scrollPane,gbc);
        int valor = model.getRowCount();
        System.out.println(valor);
        //acciones de botones
        //**********************
        // eliminar filas de la tabla
        btEliminar.addActionListener(e ->{
            String texto = comboBox.getSelectedItem().toString();
            int valor2 = Integer.parseInt(comboBox.getSelectedItem().toString());
            model.removeRow(valor2);


            for(int i=0;i<model.getRowCount();i++){
                model.setValueAt(i,i,0);


            }
            comboBox.removeItem(model.getRowCount());
            System.out.println(model.getRowCount());

        });


        // añadir filas
        btAdd.addActionListener(e -> {
            model.addRow(new Object[]{model.getRowCount(),"ingresar nombre de columna","ingresar regex"});
            comboBox.addItem(model.getRowCount()-1);
             });
        // ir al login
        btGoLogin.addActionListener(e -> controlador.show(contenedorInterfaces,"windows_login"));

    }
}
