
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

/**
 * @author Giuliana Carnevalle, Bautista Venier y Alan Sebastian Schimpf
 */

public class ModificarCandidato extends javax.swing.JFrame {
    
    public int ID;
    
    //arreglo con las opciones del campo seniority
    String seniority [] = {"", "Trainee", "Jr", "Ssr", "Sr", "Lead"};
    
    //arreglo con las opciones del campo nivel de ingles   
    String niveldeingles [] = {"", "A1", "A2", "B1", "B2", "C1", "C2"};
    
    //arreglo con las opciones para el campo cliente
    String cliente [] = {"", "Claro", "Claro Paraguay", "Naranja X", "Fiat", "Tips Salud",
        "PayPal", "Greenlight", "Nike", "Adidas", "Kforce", "ClearCo", "Health Equity"};       
    
    //arreglo con las opciones para el campo estado
    String estado [] = {"", "Pre-selección", "Entrevista Interna", "Presentado al cliente",              
        "Entrevista con el cliente", "Examen médico/psico", "Contratado", "En espera", "No interesado", "No se considera"};
    
    String reclutadora [] = {"", "Constanza", "Florencia", "Giuliana",              
        "Lucia", "Micaela", "Priscila"};

    /**
     * Creates new form ModificarCandidato
     */
    
    public ModificarCandidato() {
        initComponents();
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);                                        //el usuario no puede modificar las dimensiones del jframeform
        setTitle("Modificar Candidato");
        setLocationRelativeTo(null);
        
        for (String arStr1 : seniority) {choice_seniority.add(arStr1); }       //ciclo para llenar el choice con las opciones
        for (String arStr2 : niveldeingles) {choice_niveldeingles.add(arStr2); }       //ciclo para llenar el choice con las opciones
        for (String arStr3 : cliente) {choice_cliente.add(arStr3); }       //ciclo para llenar el choice con las opciones
        for (String arStr4 : estado) {choice_estado.add(arStr4); }       //ciclo para llenar el choice con las opciones
        for (String arStr5 : reclutadora) {choice_reclutadora.add(arStr5); }       //ciclo para llenar el choice con las opciones
        
        Candidatos eliminar = new Candidatos();
        
        ID = Integer.parseInt(eliminar.valor);
        
        txt_nombre.setText(eliminar.valor1);
        txt_apellido.setText(eliminar.valor2);
        txt_telefono.setText(eliminar.valor3);
        txt_email.setText(eliminar.valor4);
        txt_linkedin.setText(eliminar.valor5);
        txt_perfil.setText(eliminar.valor6);
        
        for (int i = 0; i < seniority.length; i++) {                         
            if(seniority[i].toLowerCase().equals(eliminar.valor7)){
                choice_seniority.select(i);}}
        
        for (int i = 0; i < niveldeingles.length; i++) {                                                     
            if(niveldeingles[i].equals(eliminar.valor8)){
                choice_niveldeingles.select(i);}}
        
        txt_rate.setText(eliminar.valor9);
        
        for (int i = 0; i < cliente.length; i++) {                                
            if(cliente[i].equals(eliminar.valor10)){
                choice_cliente.select(i);}}
        
        for (int i = 0; i < estado.length; i++) {                                       
            if(estado[i].equals(eliminar.valor11)){
                choice_estado.select(i);}}
        
        txt_observacion.setText(eliminar.valor12);
        txt_fecha.setText(eliminar.valor13);
        
        for (int i = 0; i < reclutadora.length; i++) {                                  
            if(reclutadora[i].equals(eliminar.valor14)){
                choice_reclutadora.select(i);}}
        
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        choice_niveldeingles = new java.awt.Choice();
        choice_cliente = new java.awt.Choice();
        txt_email = new javax.swing.JTextField();
        choice_seniority = new java.awt.Choice();
        jLabel6 = new javax.swing.JLabel();
        choice_estado = new java.awt.Choice();
        txt_linkedin = new javax.swing.JTextField();
        choice_reclutadora = new java.awt.Choice();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_observacion = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        txt_rate = new javax.swing.JTextField();
        txt_fecha = new javax.swing.JTextField();
        txt_perfil = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        jLabel2.setText("Nombre:");

        jLabel3.setText("Apellido:");

        jLabel16.setText("Cliente:");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flechaatras.jpg"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Télefono:");

        jLabel5.setText("Email:");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hogar.jpg"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel6.setText("Linkedin:");

        jLabel7.setText("Perfil:");

        jLabel8.setText("Seniority:");

        jLabel9.setText("Nivel de Inglés:");

        jLabel10.setText("Rate:");

        jLabel11.setText("Estado:");

        jLabel12.setText("Observación:");

        jLabel13.setText("Reclutadora:");

        jButton1.setText("Modificar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        jLabel14.setText("jLabel14");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Modificar Candidato");

        jLabel15.setText("Fecha:");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(388, 388, 388)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel12)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel15)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(choice_reclutadora, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE))
                            .addComponent(txt_observacion)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                        .addComponent(txt_telefono))
                                    .addGap(29, 29, 29)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt_apellido)
                                        .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(txt_linkedin))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(choice_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                    .addComponent(choice_niveldeingles, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_perfil))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel10))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(choice_seniority, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addComponent(txt_rate))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(choice_estado, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)))))))
                .addGap(70, 70, 70)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addGap(9, 9, 9)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_linkedin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jLabel8)
                        .addComponent(txt_perfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(choice_seniority, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(txt_rate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel11)
                                .addComponent(jLabel16))
                            .addComponent(choice_estado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(choice_cliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(choice_niveldeingles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jButton1)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_observacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(choice_reclutadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel15)
                                .addComponent(jLabel13)
                                .addComponent(txt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 154, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        Candidatos newFrame = new Candidatos();
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            
            Connection cn = conexion.conectar();
            
            if (txt_nombre.getText().isEmpty() || txt_apellido.getText().isEmpty() ||txt_telefono.getText().isEmpty() ||
                    txt_email.getText().isEmpty() || txt_linkedin.getText().isEmpty() || txt_perfil.getText().isEmpty() ||
                    choice_seniority.getSelectedItem().isEmpty() || choice_niveldeingles.getSelectedItem().isEmpty() 
                    || txt_rate.getText().isEmpty() || choice_cliente.getSelectedItem().isEmpty() || 
                    choice_estado.getSelectedItem().isEmpty() || txt_fecha.getText().isEmpty() || 
                    choice_reclutadora.getSelectedItem().isEmpty()) {
                
                JOptionPane.showMessageDialog(null, "Debe Completar todos los campos");
                
            } else {
                    
                    PreparedStatement pst = cn.prepareStatement("update candidatos set nombre = ?, apellido = ?, telefono = ?, "
                            + "linkedin = ?, perfil = ?, seniority = ?, niveldeingles = ?, rate = ?, cliente = ?,"
                            + "estado = ?, observacion = ?, fecha = ?, reclutador = ?, email = ? where id = " + ID);
                    
                    pst.setString(1, txt_nombre.getText().trim().toLowerCase());
                    pst.setString(2, txt_apellido.getText().trim().toLowerCase());
                    pst.setString(3, txt_telefono.getText().trim());
                    pst.setString(4, txt_linkedin.getText().trim());
                    pst.setString(5, txt_perfil.getText().trim().toLowerCase());
                    pst.setString(6, choice_seniority.getSelectedItem().toLowerCase());
                    pst.setString(7, choice_niveldeingles.getSelectedItem());
                    pst.setString(8, txt_rate.getText().trim());
                    pst.setString(9, choice_cliente.getSelectedItem());
                    pst.setString(10, choice_estado.getSelectedItem());
                    pst.setString(11, txt_observacion.getText().trim());
                    pst.setString(12, txt_fecha.getText().trim());
                    pst.setString(13, choice_reclutadora.getSelectedItem());           
                    pst.setString(14, txt_email.getText().trim());

                    pst.executeUpdate();
                    cn.close();                                      
                    
                    txt_nombre.setBackground(Color.GREEN);
                    txt_apellido.setBackground(Color.GREEN);
                    txt_telefono.setBackground(Color.GREEN);
                    txt_email.setBackground(Color.GREEN);
                    txt_linkedin.setBackground(Color.GREEN);
                    txt_perfil.setBackground(Color.GREEN);
                    choice_seniority.setBackground(Color.GREEN);
                    choice_niveldeingles.setBackground(Color.GREEN);
                    txt_rate.setBackground(Color.GREEN);
                    choice_cliente.setBackground(Color.GREEN);
                    choice_estado.setBackground(Color.GREEN);
                    txt_observacion.setBackground(Color.GREEN);
                    txt_fecha.setBackground(Color.GREEN);
                    choice_reclutadora.setBackground(Color.GREEN);
                    
                    JOptionPane.showMessageDialog(null, "Modificacion Exitosa"); 
                    
                    txt_nombre.setBackground(Color.WHITE);
                    txt_apellido.setBackground(Color.WHITE);
                    txt_telefono.setBackground(Color.WHITE);
                    txt_email.setBackground(Color.WHITE);
                    txt_linkedin.setBackground(Color.WHITE);
                    txt_perfil.setBackground(Color.WHITE);
                    choice_seniority.setBackground(Color.WHITE);
                    choice_niveldeingles.setBackground(Color.WHITE);
                    txt_rate.setBackground(Color.WHITE);
                    choice_cliente.setBackground(Color.WHITE);
                    choice_estado.setBackground(Color.WHITE);
                    txt_observacion.setBackground(Color.WHITE);
                    txt_fecha.setBackground(Color.WHITE);
                    choice_reclutadora.setBackground(Color.WHITE);
                    
                    txt_nombre.setText("");
                    txt_apellido.setText("");
                    txt_telefono.setText("");
                    txt_email.setText("");
                    txt_linkedin.setText("");
                    txt_perfil.setText("");
                    choice_seniority.select(0); 
                    choice_niveldeingles.select(0); 
                    txt_rate.setText("");
                    choice_cliente.select(0); 
                    choice_estado.select(0);
                    txt_observacion.setText("");
                    txt_fecha.setText("");
                    choice_reclutadora.select(0);
                     
            }
             
        } catch (SQLException e) {
            
            System.err.println("Error con el boton modificar candidato. " + e );
            JOptionPane.showMessageDialog(null, "Error al modificar el/la candidato/a!!. Contacte al administrador");
            
        }   
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ModificarCandidato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarCandidato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarCandidato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarCandidato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ModificarCandidato().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Choice choice_cliente;
    private java.awt.Choice choice_estado;
    private java.awt.Choice choice_niveldeingles;
    private java.awt.Choice choice_reclutadora;
    private java.awt.Choice choice_seniority;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_fecha;
    private javax.swing.JTextField txt_linkedin;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_observacion;
    private javax.swing.JTextField txt_perfil;
    private javax.swing.JTextField txt_rate;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
