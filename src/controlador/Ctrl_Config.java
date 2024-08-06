package controlador;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import vista.FRMMenu;


/**
 *
 * @author mikey
 */
public class Ctrl_Config implements MouseListener{

    private FRMMenu vista;

    public Ctrl_Config(FRMMenu vista) {
        this.vista = vista;
        this.vista.lblNuevaCompra.addMouseListener(this);
        this.vista.lblNuevaVenta.addMouseListener(this);
        this.vista.lblProductos.addMouseListener(this);
        this.vista.lblCategoria.addMouseListener(this);
        this.vista.lblClientes.addMouseListener(this);
        this.vista.lblProveedores.addMouseListener(this);
        this.vista.lblMedidas.addMouseListener(this);
        this.vista.lblUsuarios.addMouseListener(this);
        this.vista.lblConfiguraciones.addMouseListener(this);
    }
    
    
    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == vista.lblNuevaCompra) {
            vista.panelNuevaCompra.setBackground(new Color(0, 204, 204));
        }else if (e.getSource() == vista.lblNuevaVenta) {
            vista.panelNuevaVenta.setBackground(new Color(0, 204, 204));
        }else if (e.getSource() == vista.lblProductos) {
            vista.panelProductos.setBackground(new Color(0, 204, 204));
        }else if (e.getSource() == vista.lblCategoria) {
            vista.panelCategoria.setBackground(new Color(0, 204, 204));
        }else if (e.getSource() == vista.lblClientes) {
            vista.panelClientes.setBackground(new Color(0, 204, 204));
        }else if (e.getSource() == vista.lblProveedores) {
            vista.panelProveedores.setBackground(new Color(0, 204, 204));
        }else if (e.getSource() == vista.lblMedidas) {
            vista.panelMedidas.setBackground(new Color(0, 204, 204));
        }else if (e.getSource() == vista.lblUsuarios) {
            vista.panelUsuarios.setBackground(new Color(0, 204, 204));
        }else if (e.getSource() == vista.lblConfiguraciones) {
            vista.panelConfiguracion.setBackground(new Color(0, 204, 204));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == vista.lblNuevaCompra) {
            vista.panelNuevaCompra.setBackground(new Color(0, 102, 102));
        }else if (e.getSource() == vista.lblNuevaVenta) {
            vista.panelNuevaVenta.setBackground(new Color(0, 102, 102));
        }else if (e.getSource() == vista.lblProductos) {
            vista.panelProductos.setBackground(new Color(0, 102, 102));
        }else if (e.getSource() == vista.lblCategoria) {
            vista.panelCategoria.setBackground(new Color(0, 102, 102));
        }else if (e.getSource() == vista.lblClientes) {
            vista.panelClientes.setBackground(new Color(0, 102, 102));
        }else if (e.getSource() == vista.lblProveedores) {
            vista.panelProveedores.setBackground(new Color(0, 102, 102));
        }else if (e.getSource() == vista.lblMedidas) {
            vista.panelMedidas.setBackground(new Color(0, 102, 102));
        }else if (e.getSource() == vista.lblUsuarios) {
            vista.panelUsuarios.setBackground(new Color(0, 102, 102));
        }else if (e.getSource() == vista.lblConfiguraciones) {
            vista.panelConfiguracion.setBackground(new Color(0, 102, 102));
        }
    }
    
    
}
