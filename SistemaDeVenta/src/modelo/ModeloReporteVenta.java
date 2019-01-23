package modelo;

import dao.Conexion;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vista.JFPrincipal;
import vista.JFReVDetalle;

public class ModeloReporteVenta extends Conexion {

    private DefaultTableModel mdlReVentas, mdlReDVentas;
    private JFPrincipal vp;
    private JFReVDetalle vDV;

    public void inicioReVenta() {
        tabla();
    }

    public void tabla() {
        mdlReVentas = (DefaultTableModel) vp.tblReVenta.getModel();
        mdlReDVentas = (DefaultTableModel)vDV.tblReDetallVenta.getModel();
        vp.jSPReVenta.getViewport().setBackground(Color.white);
        vDV.jSPVDetalleVenta.getViewport().setBackground(Color.white);

    }

    public void btnMostrarTodasVentas() {
        try {
            this.conectarBD();
            PreparedStatement ps = this.conexion.prepareStatement("select codVenta, codCli,nombApeCli,fechaVenta, totalVenta, codEmp, nombApeEmp\n"
                    + "from Venta\n"
                    + "inner join Cliente on Venta.codCli1 = Cliente.codCli\n"
                    + "inner join Empleado on Venta.codEmp1 = Empleado.codEmp");
            ResultSet rs = ps.executeQuery();
            limpiarTabla(mdlReVentas);
            while (rs.next()) {
                Float tot = rs.getFloat(5);
                mdlReVentas.addRow(new Object[]{
                    rs.getString(1),//codVenta
                    rs.getString(2),//codCli
                    rs.getString(3),//Cliente
                    rs.getDate(4),//fechaVenta
                    Math.ceil(tot),//TotalVenta
                    rs.getString(6),//codEmp
                    rs.getString(7)//Empleado
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            this.desconectarBD();
        }

    }

    public void btnMostrarDetalleVenta() {
        try {
            this.conectarBD();
            PreparedStatement ps = this.conexion.prepareStatement("select articulo, marca,cantidad, importe\n"
                    + "from Venta\n"
                    + "inner join DetalleVenta on Venta.codVenta = DetalleVenta.codVenta\n"
                    + "inner join Producto on DetalleVenta.codProd = Producto.codProd");
            ResultSet rs = ps.executeQuery();
            vDV.setVisible(true);
            limpiarTabla(mdlReDVentas);
            while (rs.next()) {
                Float imp = rs.getFloat(4);
                mdlReDVentas.addRow(new Object[]{
                    rs.getString(1),//codVenta
                    rs.getString(2),//codCli
                    rs.getString(3),//Cliente
                    Math.ceil(imp),//TotalVenta
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            this.desconectarBD();
        }
    }

    private void limpiarTabla(DefaultTableModel m) {
        //limpiar la tabla
        int filas = m.getRowCount();
        for (int i = 0; i < filas; i++) {
            m.removeRow(0);
        }
    }

}
