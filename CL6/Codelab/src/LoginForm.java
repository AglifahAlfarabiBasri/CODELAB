import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JLabel messageLabel;

    public LoginForm() {
        createUI();
    }

    private void createUI() {
        setTitle("Form Login");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;

        JLabel titleLabel = new JLabel("Halaman Login", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 2;
        panel.add(titleLabel, constraints);

        constraints.gridwidth = 1;
        constraints.insets = new Insets(10, 10, 10, 10);

        JLabel usernameLabel = new JLabel("User Name:");
        constraints.gridx = 0;
        constraints.gridy = 1;
        panel.add(usernameLabel, constraints);

        usernameField = new JTextField(20);
        constraints.gridx = 1;
        constraints.gridy = 1;
        panel.add(usernameField, constraints);

        JLabel passwordLabel = new JLabel("Password:");
        constraints.gridx = 0;
        constraints.gridy = 2;
        panel.add(passwordLabel, constraints);

        passwordField = new JPasswordField(20);
        constraints.gridx = 1;
        constraints.gridy = 2;
        panel.add(passwordField, constraints);

        loginButton = new JButton("Sign in");
        constraints.gridx = 1;
        constraints.gridy = 3;
        constraints.anchor = GridBagConstraints.CENTER;
        panel.add(loginButton, constraints);

        messageLabel = new JLabel("", SwingConstants.CENTER);
        messageLabel.setForeground(Color.RED);
        constraints.gridx = 0;
        constraints.gridy = 4;
        constraints.gridwidth = 2;
        panel.add(messageLabel, constraints);

        add(panel);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleLogin();
            }
        });
    }

    private void handleLogin() {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

        if (username.equals("Giparong") && password.equals("password")) {
            messageLabel.setText("");
            new MainForm(username).setVisible(true);
            this.dispose();
        } else {
            messageLabel.setText("Password Atau Username Salah !");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }
}
