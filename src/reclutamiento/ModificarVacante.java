
package reclutamiento;

import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static reclutamiento.Vacantes.identificadormodificar;

/**
 * @author Giuliana Carnevalle, Bautista Venier y Alan Sebastian Schimpf
 */

public class ModificarVacante extends javax.swing.JFrame {
    
    //arreglo con las opciones del campo cliente
    String cliente [] = {"", "Claro", "Claro Paraguay", "Fiat", "Tips Salud", "Naranja X", "Naranja Paraguay",
        "Dominion", "PayPal", "Greenlight", "Health Equity", "Nike", "Adidas", "BlockFi", "Health Equity", "ClearCo", "Kforce"}; 
   
    //arreglo con las opciones del campo vacante
    String vacante [] = {"", "Java", "Angular", "Qa Manual", "Qa Automation", "iOS", "Android",       
        ".Net", "Fullstack", "Analista Funcional", "Scrum Master", "Python"};
    
    //arreglo con las opciones del campo estado
    String estado [] = {"", "Activo", "En espera", "No Activo"};

    /**
     * Creates new form ModificarVacante
     */
    
    public ModificarVacante() {
        initComponents();
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);                                        //el usuario no puede modificar las dimensiones del jframeform
        setTitle("Modificar Vacante");
        setLocationRelativeTo(null);
        
        for (String arStr1 : cliente) {choice_cliente.add(arStr1); }       //ciclo para llenar el choice con las opciones
        for (String arStr2 : vacante) {choice_vacante.add(arStr2); }   
        for (String arStr3 : estado) {choice_estado.add(arStr3); } 
        
        Vacantes modificar = new Vacantes();
        
        //se carga la opcion seleccionada en la tabla
        for (int i = 0; i < cliente.length; i++) {                         
            if(cliente[i].toLowerCase().equals(modificar.clientemodificar)){
                choice_cliente.select(i);}}
        
        for (int i = 0; i < vacante.length; i++) {                         
            if(vacante[i].toLowerCase().equals(modificar.vacantemodificar)){
                choice_vacante.select(i);}}
        
        txt_fechacomienzo.setText(modificar.fechadecomienzomodificar);
        txt_cantidad.setText(modificar.cantidadmodificar);
        
        for (int i = 0; i < estado.length; i++) {                         
            if(estado[i].equals(modificar.estadomodificar)){
                choice_estado.select(i);}}
        
        txt_fechacierre.setText(modificar.fechacierremodificar);
        txt_identificador.setText(modificar.identificadormodificar);
        
        txt_identificador.setEditable(false);
        
        
        
    }
    
    @Override
    public Image getIconImage(){                    //cambiamos el icono del jframeform
    
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/iconoAR.png"));
        return retValue;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        choice_cliente = new java.awt.Choice();
        jLabel5 = new javax.swing.JLabel();
        choice_vacante = new java.awt.Choice();
        txt_cantidad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        choice_estado = new java.awt.Choice();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txt_fechacomienzo = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txt_fechacierre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_identificador = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        jLabel10.setText("Cantidad:");

        jLabel3.setText("Cliente:");

        jLabel5.setText("Fecha Comienzo:");

        txt_cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cantidadActionPerformed(evt);
            }
        });

        jLabel4.setText("Vacante:");

        jButton1.setText("Modificar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flechaatras.jpg"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hogar.jpg"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel7.setText("Estado:");

        txt_fechacierre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fechacierreActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Modificar Vacante");

        jLabel8.setText("Fecha Cierre:");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        txt_identificador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_identificadorActionPerformed(evt);
            }
        });

        jLabel6.setText("Identificador:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(380, 380, 380)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_fechacomienzo, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                                    .addComponent(choice_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(choice_estado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel8)))
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_cantidad)
                            .addComponent(choice_vacante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton1)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_identificador, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_fechacierre, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(34, 34, 34)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(choice_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(choice_vacante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addComponent(jLabel3))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_fechacomienzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_fechacierre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(choice_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txt_identificador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cantidadActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "";
            String usuario = "system";
            String pass = "admin";
            
            Connection cn = DriverManager.getConnection(url, usuario, pass);
            
            if (choice_cliente.getSelectedItem().isEmpty() || choice_vacante.getSelectedItem().isEmpty()
                    || txt_fechacomienzo.getText().isEmpty() || txt_cantidad.getText().isEmpty() ||
                    choice_estado.getSelectedItem().isEmpty() || txt_fechacierre.getText().isEmpty()) {
                
                JOptionPane.showMessageDialog(null, "Debe Completar todos los campos");
                
            } else {
                    
                    PreparedStatement pst = cn.prepareStatement("update vacantes set cliente = ?, vacante = ?,"
                            + "fechacomienzo = ?, cantidad = ?, estado = ?, fechacierre = ?"
                            + "where identificador = " + identificadormodificar);
                    
                    pst.setString(1, choice_cliente.getSelectedItem().trim().toLowerCase());
                    pst.setString(2, choice_vacante.getSelectedItem().trim().toLowerCase());
                    pst.setString(3, txt_fechacomienzo.getText().trim());
                    pst.setString(4, txt_cantidad.getText().trim());
                    pst.setString(5, choice_estado.getSelectedItem().trim());
                    pst.setString(6, txt_fechacierre.getText().trim());

                    pst.executeUpdate();
                    cn.close();                                      
                    
                    JOptionPane.showMessageDialog(null, "Modificacion Exitosa");
                    
                    choice_cliente.select(0); 
                    choice_vacante.select(0); 
                    txt_fechacomienzo.setText("");
                    txt_cantidad.setText("");
                    choice_estado.select(0); 
                    txt_fechacierre.setText("");
                    txt_identificador.setText("");
                    
                      
            }
             
        } catch (SQLException e) {
            
            System.err.println("Error con el boton modificar. " + e );
            JOptionPane.showMessageDialog(null, "Error al modificar la vacante!!. Contacte al administrador");
            
        } catch (ClassNotFoundException ex) {
            
            Logger.getLogger(AgregarCandidato.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        Vacantes newFrame = new Vacantes();
        newFrame.setVisible(true);                                     //hace visible la vantana
        this.dispose();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        Principal newFrame = new Principal();
        newFrame.setVisible(true);                                     //hace visible la vantana
        this.dispose();

    }//GEN-LAST:event_jButton3ActionPerformed

    private void txt_fechacierreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fechacierreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fechacierreActionPerformed

    private void txt_identificadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_identificadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_identificadorActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ModificarVacante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarVacante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarVacante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarVacante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarVacante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Choice choice_cliente;
    private java.awt.Choice choice_estado;
    private java.awt.Choice choice_vacante;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txt_cantidad;
    private javax.swing.JTextField txt_fechacierre;
    private javax.swing.JTextField txt_fechacomienzo;
    private javax.swing.JTextField txt_identificador;
    // End of variables declaration//GEN-END:variables
}
