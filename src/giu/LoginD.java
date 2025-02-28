/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package giu;
import matr_uns.*;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import persistencia.DB_connection;
/**
 *
 * @author Darwin
 */
public class LoginD extends javax.swing.JFrame {
     private DB_connection objconnect;
     private LoginD1 objlogin1;
     private LoginD2 objlogin2;

    /**
     * Creates new form LoginD
     */
    public LoginD() {
        objconnect = new DB_connection();
        objlogin1 = new LoginD1();
        //this.setLocationRelativeTo(null);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Bingresar = new javax.swing.JButton();
        Bconnec = new javax.swing.JButton();
        txtU = new javax.swing.JTextField();
        txtC = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Cascadia Mono", 0, 24)); // NOI18N
        jLabel1.setText("Usuario");

        jLabel2.setFont(new java.awt.Font("Cascadia Mono", 0, 24)); // NOI18N
        jLabel2.setText("Contraseña");

        Bingresar.setText("Ingresar");
        Bingresar.setEnabled(false);
        Bingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BingresarActionPerformed(evt);
            }
        });

        Bconnec.setText("DB connection");
        Bconnec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BconnecActionPerformed(evt);
            }
        });

        txtU.setEnabled(false);
        txtU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUActionPerformed(evt);
            }
        });

        txtC.setEnabled(false);

        jButton1.setText("Registrarse>>");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Bconnec)
                        .addGap(53, 53, 53)
                        .addComponent(Bingresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtC, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(txtU, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bingresar)
                    .addComponent(jButton1)
                    .addComponent(Bconnec))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(204, 0, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    private void txtUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUActionPerformed

    private void BingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BingresarActionPerformed
    //LoginD1 loginFrame = new LoginD1(); // Crear la instancia del JFrame
    //loginFrame.setVisible(true); // Hacer visible la ventana
    //loginFrame.setLocationRelativeTo(null); // Centrar la ventana en la pantalla (opcional)
    //this.dispose(); // Cierra la ventana actual
     // Obtener los valores ingresados por el usuario
    // Obtener los valores ingresados por el usuario
     String usuario = txtU.getText();
    String contrasena = txtC.getText();

    // Validar que los campos no estén vacíos
    if (usuario.isEmpty() || contrasena.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Obtener el nombre del usuario
    String nombreUsuario = obtenerNombreUsuario(usuario, contrasena);

    if (nombreUsuario != null) {
        JOptionPane.showMessageDialog(this, "Inicio de sesión exitoso");

        // Abrir la nueva ventana y pasar el nombre del usuario
        LoginD1 loginFrame = new LoginD1(nombreUsuario);
        loginFrame.setVisible(true);
        loginFrame.setLocationRelativeTo(null);
        loginFrame.setLocationRelativeTo(null);

        this.dispose(); // Cerrar la ventana actual
    } else {
        JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
    }
} // <--- AQUÍ se cierra correctamente el método BingresarActionPerformed

// Método para validar credenciales (fuera de BingresarActionPerformed)
private String obtenerNombreUsuario(String usuario, String contrasena) {
    String nombre = null;
    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;

    try {
        // Crear la conexión a la base de datos
        DB_connection db = new DB_connection();
        conn = db.conectar();

        // Consulta SQL para obtener el nombre del usuario
        String sql = "SELECT Nombre FROM Estudiante WHERE CUI = (SELECT CUI FROM Users WHERE Users = ? AND Contrasena = ?)";
        stmt = conn.prepareStatement(sql);
        stmt.setString(1, usuario);
        stmt.setString(2, contrasena);

        rs = stmt.executeQuery();

        // Si encuentra el usuario, obtiene su nombre
        if (rs.next()) {
            nombre = rs.getString("Nombre");
        }
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        try {
            if (rs != null) rs.close();
            if (stmt != null) stmt.close();
            if (conn != null) conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    return nombre;
    }//GEN-LAST:event_BingresarActionPerformed

    private void BconnecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BconnecActionPerformed
      Connection conn = objconnect.conectar();
        if (conn != null) { // Si la conexión fue exitosa
            txtC.setEnabled(true);  // Habilitamossss
            txtU.setEnabled(true);  // Habilitamos
            Bingresar.setEnabled(true);
            jButton1.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo conectar a la base de datos.");
        } 
    }//GEN-LAST:event_BconnecActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    Registr R = new Registr(); // Creas la instancia sin parámetros
    R.setVisible(true); // Lo haces visible
    R.setLocationRelativeTo(null);
    dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bconnec;
    private javax.swing.JButton Bingresar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField txtC;
    private javax.swing.JTextField txtU;
    // End of variables declaration//GEN-END:variables
}
