package insagas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AgregarUsuario extends javax.swing.JFrame {

    private static PreparedStatement ps;
    private static ResultSet rs;

    public AgregarUsuario() {
        initComponents();
        iniciarBotones();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();
        textTel = new javax.swing.JTextField();
        textDir = new javax.swing.JTextField();
        textLeg = new javax.swing.JTextField();
        modificar = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        buscar = new javax.swing.JButton();
        textPass1 = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        textPassDos = new javax.swing.JPasswordField();
        eliminar = new javax.swing.JButton();
        nuevo = new javax.swing.JButton();
        cambiaPass = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("GESTION DE USUARIOS");

        jLabel2.setText("Nombre");

        jLabel3.setText("Telefono");

        jLabel4.setText("Direccion");

        jLabel5.setText("Password");

        jLabel6.setText("Legajo");

        textNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNombreActionPerformed(evt);
            }
        });

        modificar.setText("Guardar Modificacion");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });

        guardar.setText("Guardar Nueva Alta");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        jLabel7.setText("Re-ingrese Password");

        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        nuevo.setText("Modificar");
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });

        cambiaPass.setText("Cambiar Password");
        cambiaPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiaPassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cambiaPass))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(nuevo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(guardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(modificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(limpiar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(eliminar)
                                .addGap(20, 20, 20)
                                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textLeg, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textPassDos, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textTel, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textDir, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textPass1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buscar)))
                        .addGap(0, 11, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(cambiaPass, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(buscar)
                    .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(textPass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(textPassDos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textDir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textLeg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(eliminar)
                            .addComponent(limpiar)
                            .addComponent(modificar)
                            .addComponent(guardar)
                            .addComponent(nuevo))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        nuevo.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed

        try {
            Conectar C = new Conectar();
            try (Connection con = C.getConnection()) {
                ps = con.prepareStatement("UPDATE vendedores set Nombre =?, Direccion=?, Legajo=?, idTelefonos=? WHERE nombre = ?");
                ps.setString(1, textNombre.getText());
                ps.setString(2, textDir.getText());
                ps.setString(3, textLeg.getText());
                ps.setString(4, textTel.getText());
                ps.setString(5, textNombre.getText());
                int confirmar = ps.executeUpdate();
                
                if (confirmar > 0) {
                    JOptionPane.showMessageDialog(null, "Registro Guardado");
                    limpiarCampos();
                } else {
                    JOptionPane.showMessageDialog(null, "Error, contactese con Soporte Tecnico");
                    limpiarCampos();
                }
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error, la clave no coincide");
            System.out.println(e);
        }
    }//GEN-LAST:event_modificarActionPerformed


    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed

        try {
            Conectar C = new Conectar();
            Connection con = C.getConnection();
            ps = con.prepareStatement("INSERT INTO vendedores (Nombre, Direccion, Legajo, idTelefonos, Password)VALUES(?,?,?,?,?)");
            ps.setString(1, textNombre.getText());
            ps.setString(2, textDir.getText());
            ps.setString(3, textLeg.getText());
            ps.setString(4, textTel.getText());
            ps.setString(5, textPass1.getText());

            String passUno = new String(textPass1.getPassword());
            String passDos = new String(textPassDos.getPassword());

            if (!passUno.equals(passDos) || passUno.length() < 8) {
                JOptionPane.showMessageDialog(null, "Las claves no coinciden o tiene menos de 8 caracteres");
            } else {
                int confirmar = ps.executeUpdate();

                if (confirmar > 0) {
                    JOptionPane.showMessageDialog(null, "Registro Guardado");
                    limpiarCampos();
                } else {
                    JOptionPane.showMessageDialog(null, "Error, contactese con Soporte Tecnico");
                }
                con.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error, contactese con Soporte Tecnico" + e);
        }
    }//GEN-LAST:event_guardarActionPerformed


    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void limpiarCampos() {
        textNombre.setText(null);
        textDir.setText(null);
        textLeg.setText(null);
        textTel.setText(null);
        textPass1.setText(null);
        textPassDos.setText(null);
        textPass1.setEnabled(true);
        textPassDos.setEnabled(true);
        textDir.setEnabled(true);
        textLeg.setEnabled(true);
        textTel.setEnabled(true);
        guardar.setEnabled(true);
        modificar.setEnabled(false);

    }

    private void textNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNombreActionPerformed

    }//GEN-LAST:event_textNombreActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_limpiarActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed

        try {
            Conectar C = new Conectar();
            Connection con = C.getConnection();
            ps = con.prepareStatement("SELECT * FROM vendedores where nombre = ?");
            ps.setString(1, textNombre.getText());
            rs = ps.executeQuery();

            if (rs.next()) {
                textNombre.setText(rs.getString("Nombre"));
                textDir.setText(rs.getString("Direccion"));
                textLeg.setText(rs.getString("Legajo"));
                textTel.setText(rs.getString("idTelefonos"));
                textPass1.setText(rs.getString("Password"));
                modificar.setEnabled(false);
            } else {
                JOptionPane.showMessageDialog(null, "Verifique los datos ingresados");
                limpiarCampos();

            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Contactese con Soporte");
            limpiarCampos();
            System.out.println(e);
        }
    }//GEN-LAST:event_buscarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
       try {
            Conectar C = new Conectar();
           try (Connection con = C.getConnection()) {
               ps = con.prepareStatement("DELETE FROM vendedores WHERE nombre = ?");
               ps.setString(1, textNombre.getText());
               
               int confirmar = ps.executeUpdate();
               
               if (confirmar > 0) {
                   JOptionPane.showMessageDialog(null, "Registro Eliminado");
                   limpiarCampos();
               } else {
                   JOptionPane.showMessageDialog(null, "Error, verifique los datos ingresados");
                   limpiarCampos();
               }
           }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error, contactese con Soporte Tecnico " + e);
            System.out.println(e);
        }
    }//GEN-LAST:event_eliminarActionPerformed

    private void cambiaPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiaPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cambiaPassActionPerformed

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nuevoActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new AgregarUsuario().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar;
    private javax.swing.JButton cambiaPass;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JButton limpiar;
    private javax.swing.JButton modificar;
    private javax.swing.JButton nuevo;
    private javax.swing.JButton salir;
    private javax.swing.JTextField textDir;
    private javax.swing.JTextField textLeg;
    private javax.swing.JTextField textNombre;
    private javax.swing.JPasswordField textPass1;
    private javax.swing.JPasswordField textPassDos;
    private javax.swing.JTextField textTel;
    // End of variables declaration//GEN-END:variables

    private boolean sonDistintas() {
        boolean esDistinto = false;

        if (textPass1 != textPassDos) {
            esDistinto = true;
        }

        return esDistinto;
    }

    private boolean existe(String nombre) {
        boolean existe = false;
        
        try {
           Conectar C = new Conectar();
            Connection con = C.getConnection();
            ps = con.prepareStatement("SELECT nombre FROM vendedores where nombre = ?");
            ps.setString(1, nombre);
            rs = ps.executeQuery();
            if (rs.next()) {
                System.out.println("Nombre encontrado");
                existe = true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Contactese con Soporte");
            System.out.println(e);
        }
        return existe;

    }

    private void iniciarBotones() {
        ActionListener nuevos = (ActionEvent e) -> {
            if (existe(textNombre.getText())) {
                textPass1.setEnabled(false);
                textPassDos.setEnabled(false);
                guardar.setEnabled(false);
                modificar.setEnabled(true);
            } else {
                textPass1.setEnabled(true);
                textPassDos.setEnabled(true);
                guardar.setEnabled(true);
            }
            textTel.setEnabled(true);
            textDir.setEnabled(true);

            textLeg.setEnabled(true);
        };
        nuevo.addActionListener(nuevos);

        ActionListener modifica = (ActionEvent e) -> {
            guardar.setEnabled(true);
            textTel.setEnabled(true);
            textDir.setEnabled(true);
            textPass1.setEnabled(false);
            textPassDos.setEnabled(false);
            textLeg.setEnabled(true);

        };
        modificar.addActionListener(modifica);

        ActionListener cambio = (ActionEvent e) -> {
            guardar.setEnabled(false);
            textTel.setEnabled(false);
            textDir.setEnabled(false);
            textPass1.setEnabled(false);
            textPassDos.setEnabled(false);
            textLeg.setEnabled(false);
            modificar.setEnabled(true);
        };
        buscar.addActionListener(cambio);

        ActionListener cambiPass = (ActionEvent e) -> {
            try {
                CambioPass c = new CambioPass();
                c.setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(AgregarUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        };

        cambiaPass.addActionListener(cambiPass);
    }

}


