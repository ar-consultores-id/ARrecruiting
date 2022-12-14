
package reclutamiento;

import clases.conexion;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static reclutamiento.Inicio.permiso;
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
    
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/iconoVEC.png"));
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

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        choice_estado = new java.awt.Choice();
        txt_fechacomienzo = new javax.swing.JTextField();
        choice_cliente = new java.awt.Choice();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        choice_vacante = new java.awt.Choice();
        txt_cantidad = new javax.swing.JTextField();
        txt_fechacierre = new javax.swing.JTextField();
        txt_identificador = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Modificar Vacante");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel3.setText("Cliente:");

        jLabel5.setText("Fecha Comienzo:");

        jLabel7.setText("Estado:");

        txt_cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cantidadActionPerformed(evt);
            }
        });

        txt_fechacierre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fechacierreActionPerformed(evt);
            }
        });

        txt_identificador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_identificadorActionPerformed(evt);
            }
        });

        jLabel6.setText("Identificador:");

        jLabel8.setText("Fecha Cierre:");

        jLabel10.setText("Cantidad:");

        jLabel4.setText("Vacante:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(380, 380, 380)
                                .addComponent(jLabel1)
                                .addGap(0, 275, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(730, 730, 730)
                                .addComponent(jButton1)
                                .addGap(0, 37, Short.MAX_VALUE)))
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_fechacomienzo)
                                    .addComponent(choice_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(choice_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel8)))
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_cantidad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                            .addComponent(txt_identificador, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_fechacierre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(choice_vacante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
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
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(choice_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(choice_vacante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10))
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
                            .addComponent(txt_identificador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            
            Connection cn = conexion.conectar();
            
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
                    
                    choice_cliente.setBackground(Color.green);
                    choice_vacante.setBackground(Color.green);
                    txt_fechacomienzo.setBackground(Color.green);
                    txt_cantidad.setBackground(Color.green);
                    choice_estado.setBackground(Color.green);
                    txt_fechacierre.setBackground(Color.green);
                    txt_identificador.setBackground(Color.green);
                    
                    JOptionPane.showMessageDialog(null, "Modificacion Exitosa");
                    
                    Vacantes newFrame = new Vacantes();
                    newFrame.setVisible(true);                                     //hace visible la vantana
                    this.dispose();
                             
            }
             
        } catch (SQLException e) {
            
            System.err.println("Error con el boton modificar vacante. " + e );
            JOptionPane.showMessageDialog(null, "Error al modificar la vacante!!. Contacte al administrador");
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        Vacantes newFrame = new Vacantes();
        newFrame.setVisible(true);                                     //hace visible la vantana
        this.dispose();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        if (permiso.equalsIgnoreCase("superadministrador")) {
                        
            SuperAdministrador newFrame = new SuperAdministrador();
            newFrame.setVisible(true);                                     //hace visible la vantana
            this.dispose();
                    
        } else {
                        
            Principal newFrame = new Principal();
            newFrame.setVisible(true);                                     //hace visible la vantana
            this.dispose();
                        
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void txt_cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cantidadActionPerformed

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
