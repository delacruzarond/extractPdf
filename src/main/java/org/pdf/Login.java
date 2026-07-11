package org.pdf;

import javax.swing.*;
import java.awt.*;

public class Login extends JPanel {
    JPanel contenedorInterfaces;
    CardLayout controlador;
    GridBagConstraints gbc;
    public Login(JPanel contenedorInterfaces, CardLayout controlador){
        this.contenedorInterfaces=contenedorInterfaces;
        this.controlador= controlador;

        setLayout(new GridBagLayout());
        elementos();

    }


    public void elementos(){
        gbc = new GridBagConstraints();
        gbc.insets = new Insets(10,10,10,10);

        JLabel  user = new JLabel("User");
        gbc.gridx=0;gbc.gridy=0;gbc.anchor=GridBagConstraints.WEST;add(user,gbc);

        JTextField textUser = new JTextField(10);
        gbc.gridx=1;gbc.gridy=0;add(textUser,gbc);

        JLabel password = new JLabel("Paswword");
        gbc.gridx=0;gbc.gridy=1;gbc.anchor=GridBagConstraints.WEST;add(password,gbc);

        JTextField textPassword = new JTextField(10);
        gbc.gridx=1;gbc.gridy=1; add(textPassword,gbc);


        JButton button = new JButton("Login");
        gbc.gridx=0;gbc.gridy=2;gbc.gridwidth=2;
//        gbc.weightx=1.0;

        gbc.anchor = GridBagConstraints.CENTER;
        add(button,gbc);
        button.addActionListener(e -> controlador.show(contenedorInterfaces,"windows_work"));

    }
}
