import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    private JLabel usuario;
    private JTextField escribirUsuario;
    private JPanel panel1;
    private JButton entrarButton;
    private JPasswordField escribirContra;

    public Login() {
        entrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Entraste");
            }
        });
    }

    public static void main (String[] args){
        JFrame frame = new JFrame("Log-in");
        frame.setContentPane(new Login().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}
