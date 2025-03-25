package GUI;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author anant
 */

public class AdminDashboard extends JFrame {
    public AdminDashboard() {
        setTitle("Admin Dashboard");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JButton registerButton = new JButton("Register User");
        registerButton.addActionListener(e -> new RegistrationForm().setVisible(true));
        
        add(registerButton, BorderLayout.CENTER);
    }
}
