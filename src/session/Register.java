/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

/**
 *
 * @author THINKPAD
 */
public class Register extends javax.swing.JFrame {

    int xx, xy;

    /**
     * Creates new form Login
     */
    public Register() {
        initComponents();
        this.setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelPutih = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();
        btnClose = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1000, 515));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 102, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/loginImg.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel1)
                .addContainerGap(95, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jLabel1)
                .addContainerGap(122, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 520));

        panelPutih.setBackground(new java.awt.Color(255, 255, 255));
        panelPutih.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        panelPutih.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelPutih.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 30)); // NOI18N
        jLabel2.setText("Create Account");
        panelPutih.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 270, -1));

        txtEmail.setToolTipText("Username");
        panelPutih.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 430, 40));

        txtPassword.setToolTipText("Username");
        panelPutih.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 430, 40));

        txtName.setToolTipText("Username");
        panelPutih.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 430, 40));

        jButton1.setBackground(new java.awt.Color(51, 102, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Create Account");
        panelPutih.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 430, 40));

        jLabel3.setText("Sudah punya akun?");
        panelPutih.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 470, -1, -1));

        lblLogin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(0, 102, 255));
        lblLogin.setText("Login");
        lblLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLoginMouseClicked(evt);
            }
        });
        panelPutih.add(lblLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, -1, -1));

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/close-button.png"))); // NOI18N
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
        });
        panelPutih.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, -1, -1));

        jLabel4.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 102, 255));
        jLabel4.setText("Password");
        panelPutih.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        jLabel5.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 102, 255));
        jLabel5.setText("Nama Lengkap");
        panelPutih.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        jLabel6.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 102, 255));
        jLabel6.setText("Email");
        panelPutih.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        getContentPane().add(panelPutih, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 590, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // TODO add your handling code here:
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_formMouseDragged

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCloseMouseClicked

    private void lblLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoginMouseClicked
        // TODO add your handling code here:
        this.dispose();
        Login l = new Login();
        l.setVisible(true);
    }//GEN-LAST:event_lblLoginMouseClicked

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnClose;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JPanel panelPutih;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    // End of variables declaration//GEN-END:variables
}
