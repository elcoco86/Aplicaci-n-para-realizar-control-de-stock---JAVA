package insagas;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CambioPass extends JFrame {

    private static String legajo;

    public CambioPass() throws SQLException {
        this.setSize(400, 170);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle("Cambio de Password");
        setLocationRelativeTo(null);
        iniciarBusqueda();
    }

    private void iniciarBusqueda() throws SQLException {
        JPanel panel = new JPanel();
        aplicaDisenio(panel);
        agregaEtiquetas(panel);
        JTextField cajaTexto = new JTextField();
        cajaTexto.setBounds(120, 50, 100, 20);
        panel.add(cajaTexto);
        JButton buscaLegajo = new JButton("Buscar Legajo");
        buscaLegajo.setBounds(120, 80, 150, 20);
        panel.add(buscaLegajo);
        ActionListener buscaLeg = (ActionEvent e) -> {
            legajo = cajaTexto.getText();
            try {
                comparaenbase(legajo);
            } catch (SQLException ex) {
                Logger.getLogger(CambioPass.class.getName()).log(Level.SEVERE, null, ex);
            }
        };
        buscaLegajo.addActionListener(buscaLeg);
    }

    private void agregaEtiquetas(JPanel panel) {
        JLabel etiqueta = new JLabel("Cambio de Password");
        panel.add(etiqueta);
        etiqueta.setBounds(120, 0, 140, 50);
        JLabel etiquetaUsuario = new JLabel("Ingrese legajo");
        panel.add(etiquetaUsuario);
        etiquetaUsuario.setBounds(20, 10, 100, 100);
    }

    private void aplicaDisenio(JPanel panel) {
        panel.setLayout(null);  //desactivar el disenio
        this.getContentPane().add(panel);
        panel.setBackground(Color.GRAY);
    }

    private void cajaDeBusqueda(JPanel panel) {
        JTextField cajaTexto = new JTextField();
        cajaTexto.setBounds(120, 50, 100, 20);
        panel.add(cajaTexto);

    }

    private void comparaenbase(String legajo) throws SQLException {
        Conectar C = new Conectar();
        Connection con = C.getConnection();
        PreparedStatement ps;
        ResultSet rs;
        
        try {
            ps = con.prepareStatement("SELECT legajo FROM vendedores where legajo = ?");
            ps.setString(1, legajo);
            rs = ps.executeQuery();
            if (rs.next()) {
                System.out.println("Legajo encontrado");
            } else {

                JOptionPane.showMessageDialog(null, "Legajo no encontrado");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Contactese con Soporte");
            System.out.println(e);
        }
    }
}

