package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.JOptionPane;
import modelo.Usuario;
import modelo.UsuarioDao;
import vista.FRMLogin;
import vista.FRMMenu;
/**
 *
 * @author mikey
 */
public class Ctrl_Usuarios implements ActionListener {
    
    private Usuario us;
    private UsuarioDao usDao;
    private FRMLogin vista;

    public Ctrl_Usuarios(Usuario us, UsuarioDao usDao, FRMLogin vista) {
        this.us = us;
        this.usDao = usDao;
        this.vista = vista;
        this.vista.btnIngresar.addActionListener(this);
        this.vista.btnCancelar.addActionListener(this);
        this.vista.setLocationRelativeTo(vista);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnIngresar) {
            if (vista.txtUsuario.getText().equals("") || String.valueOf(vista.txtPassword.getPassword()).equals("")) {
                JOptionPane.showMessageDialog(null, "Por favor llene los campos");
            }else{
                String usuario = vista.txtUsuario.getText();
                String contra = String.valueOf(vista.txtPassword.getPassword());
                us = usDao.login(usuario, contra);
                if (us.getUsuario() != null) {
                    FRMMenu menu = new FRMMenu();
                    menu.setVisible(true);
                    this.vista.dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "El usuario o la contraseña es incorrecto");
                }
            }
        }else{
            int pregunta = JOptionPane.showConfirmDialog(null, "Esta seguro de salir", "Pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (pregunta == 0) {
                System.exit(0);
            }
        }
    }
    
    
}
