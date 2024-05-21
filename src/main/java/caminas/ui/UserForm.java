package caminas.ui;

import caminas.controller.UserController;
import caminas.repository.UserRepository;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentListener;

@Component
public class UserForm extends JFrame implements ActionListener {
    // Create labels and text fields
    JLabel userLabel = new JLabel("User Name:");
    JTextField userField = new JTextField();
    JLabel passwordLabel = new JLabel("Password:");
    JTextField passwordField = new JPasswordField();
    // Create buttons
    JButton acceptButton = new JButton(OK);
    JButton registerButton = new JButton(REGISTER);

    public final static String OK = "OK";
    public final static String REGISTER = "Register";

    private final UserRepository userRepository;
    private final UserController userController;

    public UserForm(UserRepository userRepository, UserController userController){
        // Create the main frame
        super("User Form");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 200);

        this.userRepository = userRepository;
        this.userController = userController;
        initUI();
        // Set the frame's visibility to true
        setVisible(true);
    }
    public void initUI(){
        // Set the layout to GridLayout with 3 rows and 2 columns
        //this.setLayout(new GridLayout(3, 2, 20, 30));

        JPanel panel = new JPanel(new BorderLayout());
        panel.setLayout(new GridLayout(3, 2, 20, 30));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Adding padding


        Dimension textFieldSize = new Dimension(100, 5);
        userField.setPreferredSize(textFieldSize);
        passwordField.setPreferredSize(textFieldSize);

        ImageIcon backgroundImageIcon = new ImageIcon("src/main/resources/fondo.jpg");

        // Create a panel with the background image
        JLabel contentPane = new JLabel();
        contentPane.setIcon( backgroundImageIcon );
        contentPane.setLayout( new BorderLayout() );
        contentPane.setSize(200, 100);
        this.setContentPane( contentPane );

        acceptButton.setActionCommand(OK);
        acceptButton.addActionListener(this);

        registerButton.setActionCommand(REGISTER);
        registerButton.addActionListener(this);

        // Add components to the frame
        panel.add(userLabel);
        panel.add(userField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(acceptButton);
        panel.add(registerButton);
        this.add(panel);

    }


    public void actionPerformed( ActionEvent pEvento )
    {
        String comando = pEvento.getActionCommand( );

        if( comando.equals( OK ) )
        {
            System.out.println("Ok");;
            System.out.println(this.userController.checkUserExists(userField.getText(), passwordField.getText()));
        }
        else if( comando.equals( REGISTER ) )
        {
            System.out.println(REGISTER);
        }
    }
}
