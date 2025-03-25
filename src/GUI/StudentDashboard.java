package GUI;

import java.awt.*;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author anant
 */
public class StudentDashboard extends JFrame {
    public StudentDashboard() {
        setTitle("Student Dashboard");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JButton viewLecturesButton = new JButton("View Lectures");
        JButton openWhiteboardButton = new JButton("Open Whiteboard");

        viewLecturesButton.addActionListener(e -> new ViewLecturesForm().setVisible(true));
        openWhiteboardButton.addActionListener(e -> new WhiteboardClient().setVisible(true));

        JPanel panel = new JPanel();
        panel.add(viewLecturesButton);
        panel.add(openWhiteboardButton);
        add(panel);
    }
}