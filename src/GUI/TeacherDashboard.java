package GUI;
import javax.swing.*;
import server.WhiteboardServer;
/**
 *
 * @author anant
 */


public class TeacherDashboard extends JFrame {
    public TeacherDashboard() {
        setTitle("Teacher Dashboard");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JButton uploadLectureButton = new JButton("Upload Lecture");
        JButton uploadVideoButton = new JButton("Upload Video");
        JButton whiteboardButton = new JButton("Open Whiteboard");
        
        uploadLectureButton.addActionListener(e -> new UploadLectureForm().setVisible(true));
        uploadVideoButton.addActionListener(e -> new UploadLectureForm().setVisible(true));
        whiteboardButton.addActionListener(e -> new WhiteboardServer().setVisible(true));

        JPanel panel = new JPanel();
        panel.add(uploadLectureButton);
        panel.add(uploadVideoButton);
        panel.add(whiteboardButton);
        add(panel);
    }
}

