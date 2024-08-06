package modelo;

import conexion.Conexion;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author mikey
 */
public class UsuarioDao {
    
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    public Usuario login(String usuario, String pass){
        String sql = "SELECT * FROM tbl_Usuarios WHERE usuario = ? AND contraseña = ?";
        Usuario usu = new Usuario();
        
        try {
            con = cn.conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            
            if (rs.next()) {
                usu.setId(rs.getInt("id"));
                usu.setNombre(rs.getString("nombre"));
                usu.setUsuario(rs.getString("usuario"));
                usu.setContrasena(rs.getString("contraseña"));
                usu.setCaja(rs.getString("caja"));
                usu.setRol(rs.getString("rol"));
                usu.setEstado(rs.getString("estado"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return usu;
    }
    
//    public boolean registrarUsuario(Usuario usuario){
//        con = cn.conexion();
//        String slq = "{regitrarUsuarios}";
//        
//        try {
//            CallableStatement cs = cn.conexion().prepareCall(slq);
//            
//        } catch (Exception e) {
//        }
    //}
}
