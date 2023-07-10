import org.w3c.dom.css.RGBColor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class UserLogin extends JFrame{
    private JPanel loginPane;
    private JLabel titleLabel;
    private JLabel userLabel;
    private JTextField userField;
    private JLabel passwordLabel;
    private JButton loginButton;
    private JPasswordField passwordField;
    private JPanel titlePanel;
    private JLabel registerLabel;
    private UserList usersList;

    public UserLogin(UserList userList){
        this.usersList = userList;
        setContentPane(loginPane);
        setTitle("BiblioTech - Inicio de Sesión");
        setSize(500,600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        Color registerColorNormal = new Color(60,63,65);
        Color registerColorMoused = new Color(0,90,146);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!userField.getText().isEmpty() && !passwordField.getText().isEmpty()){
                    if (checkCredentials(userField.getText(),passwordField.getText())){
                        
                    }
                } else {
                    JOptionPane.showMessageDialog(loginPane,"¡Complete todos los campos!");
                }
            }
        });

        registerLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                JOptionPane.showMessageDialog(loginPane,"Registrando...");
            }

        });
        registerLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                registerLabel.setForeground(registerColorMoused);
            }
        });
        registerLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                registerLabel.setForeground(registerColorNormal);
            }
        });
    }

    public boolean checkCredentials(String rut, String password){
        if (this.usersList.checkUser(rut) != null){
            User u = this.usersList.checkUser(rut);
            if (this.usersList.checkPassword(u,password)){
                JOptionPane.showMessageDialog(loginPane,"Accediendo correctamente...");
                return true;
            } else {
                JOptionPane.showMessageDialog(loginPane, "¡Contraseña incorrecta!");
                return false;
            }
        } else {
            JOptionPane.showMessageDialog(loginPane,"¡Usuario no encontrado en el sistema!");
            return false;
        }
    }


}
