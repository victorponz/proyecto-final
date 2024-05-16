package caminas;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import javax.swing.*;
import java.awt.*;

/**
 * This is the Spring Boot Application class.  This is where we make sure we're NOT running in Headless mode and that
 * the WebApplicationType is set to NONE.
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context  =
                new SpringApplicationBuilder(MainApplication.class)
                        .headless(false)
                        .web(WebApplicationType.NONE)
                        .run(args);

        EventQueue.invokeLater(()->{
            JOptionPane.showMessageDialog(null, "Funciona");
        });
    }
}
