import javax.swing.*;

public class User extends JFrame {
    private JPanel panel1 = new JPanel();
    private JTextField textField1;
    private JButton connectButton;

    public User() {
        add(panel1);
        setSize(700, 200);
        setTitle("Crypt0-M3ss3ng3r");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
