public class logInFrame {

    import javax.swing.*;
import java.awt.*;

    public class LoginFrame extends JFrame {

        private JTextField tfUsername;
        private JPasswordField pfPassword;

        public LoginFrame() {
            // Frame-Grundeinstellungen
            setTitle("Lower Austria Tourism Portal");
            setSize(600, 350);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLocationRelativeTo(null); // zentriert öffnen

            // Hauptpanel
            JPanel panel = new JPanel();
            panel.setBackground(new Color(0xD3, 0xD3, 0xD3)); // light gray
            panel.setLayout(null);
            setContentPane(panel);

            // Überschrift
            JLabel lblTitle = new JLabel("Lower Austria Tourism Portal", SwingConstants.CENTER);
            lblTitle.setFont(new Font("Arial", Font.BOLD, 20));
            lblTitle.setBounds(0, 20, 600, 30);
            panel.add(lblTitle);

            // Username-Label + Textfeld
            JLabel lblUser = new JLabel("Username:");
            lblUser.setFont(new Font("Arial", Font.PLAIN, 14));
            lblUser.setBounds(120, 100, 80, 25);
            panel.add(lblUser);

            tfUsername = new JTextField();
            tfUsername.setBounds(210, 100, 260, 25);
            panel.add(tfUsername);

            // Password-Label + Feld
            JLabel lblPass = new JLabel("Password:");
            lblPass.setFont(new Font("Arial", Font.PLAIN, 14));
            lblPass.setBounds(120, 145, 80, 25);
            panel.add(lblPass);

            pfPassword = new JPasswordField();
            pfPassword.setBounds(210, 145, 260, 25);
            panel.add(pfPassword);

            // Login-Button
            JButton btnLogin = new JButton("Login");
            btnLogin.setFont(new Font("Arial", Font.BOLD, 14));
            btnLogin.setBounds(250, 210, 100, 35);
            btnLogin.setBackground(new Color(100, 149, 237)); // cornflower blue
            btnLogin.setForeground(Color.WHITE);
            btnLogin.setFocusPainted(false);
            panel.add(btnLogin);
        }

        public static void main(String[] args) {
            // Starte die GUI im Event-Dispatch-Thread
            SwingUtilities.invokeLater(() -> {
                LoginFrame frame = new LoginFrame();
                frame.setVisible(true);
            });
        }
    }

}
