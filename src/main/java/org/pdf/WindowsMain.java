package org.pdf;

import javax.swing.*;
import java.awt.*;

public class WindowsMain extends JFrame {
JPanel contenedorInterfaces;
CardLayout controlador;
GridBagConstraints gbc;




    public WindowsMain(){
        setTitle("El drako");
        setSize(400,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        //creamos el abjeto que controla la interfaces
        controlador = new CardLayout();
        //creamos el objeto que contiene todas las interfaces y su controlador
        contenedorInterfaces = new JPanel(controlador);

        // creamos las interfaces
        Login login = new Login(contenedorInterfaces,controlador);
        Settings settings = new Settings(contenedorInterfaces,controlador);
        Work work = new Work(contenedorInterfaces,controlador);
        // añadimos las intefaces al contenedor de interfaces

        contenedorInterfaces.add(login,"windows_login");
        contenedorInterfaces.add(settings,"windows_settings");
        contenedorInterfaces.add(work,"windows_work");
        add(contenedorInterfaces);

    }
}
