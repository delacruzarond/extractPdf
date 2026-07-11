package org.pdf;

import javax.swing.*;
import java.awt.*;

public class Work extends JPanel {

    public Work(JPanel contenedorInterfaces, CardLayout controlador) {
           JButton button = new JButton("workings en construccion - enviar a settings");
           add(button);
           button.addActionListener(e -> controlador.show(contenedorInterfaces,"windows_settings"));
    }
}
