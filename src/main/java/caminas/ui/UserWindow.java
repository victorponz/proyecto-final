package caminas.ui;

import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
public class UserWindow extends JFrame{

    public UserWindow(){
        super("Login");

        // Configurar el diseño del marco
        this.setLayout(new BorderLayout());

        ImageIcon backgroundImageIcon = new ImageIcon("src/main/resources/fondo.jpg");

        // Create a panel with the background image
        JLabel contentPane = new JLabel();
        contentPane.setIcon( backgroundImageIcon );
        contentPane.setLayout( new BorderLayout() );
        contentPane.setSize(200, 100);
        this.setContentPane( contentPane );

        // Crear un panel para los campos de texto
        JPanel textPanel = new JPanel(new GridLayout(2, 2)); // Dos filas, dos columnas
        textPanel.setSize(200, 100);

        // Crear etiquetas y campos de texto
        JLabel label1 = new JLabel("Campo 1:");
        JTextField textField1 = new JTextField(100);
        JLabel label2 = new JLabel("Campo 2:");
        JTextField textField2 = new JTextField(100);
        textField2.setSize(new Dimension(100, 20));
        textField2.setPreferredSize(new Dimension(100, 20));

        // Agregar etiquetas y campos de texto al panel
        textPanel.add(label1);
        textPanel.add(textField1);
        textPanel.add(label2);
        textPanel.add(textField2);

        // Agregar el panel de texto al marco en el centro
        //this.add(textPanel, BorderLayout.CENTER);
        textPanel.setOpaque(false);
        //imagePanel.add(textPanel, BorderLayout.CENTER);
        this.add(textPanel);
        // Configurar el tamaño del marco
        //this.setSize(backgroundImageIcon.getIconWidth(), backgroundImageIcon.getIconHeight() + 20); // Ajustar según tus necesidades
        pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

}
