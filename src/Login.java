import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends pantalla{
    private JLabel usuario;
    private JTextField escribirUsuario;
    private JPanel panel1;
    private JButton entrarButton;
    private JPasswordField escribirContra;

    public Login() {
        entrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int contador = 0;
                boolean ingreso = false;
                String user = "mateo";
                String contrasenia = "mateo123";
                while(ingreso == false && contador < 3){
                    if((user = String.valueOf(escribirUsuario)) == (contrasenia = String.valueOf(escribirContra))){
                        ingreso = true;
                    }
                    else {
                        JOptionPane.showMessageDialog(null,
                                "El usuario o contraseña son incorrectos");
                        contador++;
                    }
                }

                if (ingreso == false) {
                    JOptionPane.showMessageDialog(null,
                            "Se a suspendido el numero de intentos permitidos");
                }
                else {
                    JOptionPane.showMessageDialog(null, "Bienvenido al sistema");
                    JFrame frame = new JFrame("IMC");
                    frame.setContentPane(new pantalla().panel2);
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.pack();
                    frame.setSize(600, 400);
                    frame.setLocationRelativeTo(null);
                    frame.setVisible(true);
                }
            }
        });

        escribirUsuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                escribirUsuario.getAction();
            }
        });
        escribirContra.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                escribirContra.getAction();
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