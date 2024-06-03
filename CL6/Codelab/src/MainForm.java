import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm extends JFrame {
    public MainForm(String username) {
        createUI(username);
    }

    private void createUI(String username) {
        setTitle("Form 2");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JLabel welcomeLabel = new JLabel("Halo " + username, SwingConstants.CENTER);
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(welcomeLabel, BorderLayout.CENTER);

        JButton backButton = new JButton("Kembali");
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new LoginForm().setVisible(true);
                dispose();
            }
        });
        panel.add(backButton, BorderLayout.SOUTH);

        add(panel);
    }
}
