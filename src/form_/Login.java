/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package form_;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
/**
 *
 * @author FLEX5
 */
public class Login extends javax.swing.JFrame {

    private PreparedStatement stat;
    private ResultSet rs;
    Koneksi k = new Koneksi();
    
    
    public Login() {
        initComponents();
        k.connect();
    }
    
    class user {
        int id_akun;
        String username,password,name_user,role;
        
        public user(){
            this.id_akun = 0;
            this.username = txtusername.getText();
            this.password = new String(txtpassword.getPassword());
//            this.name_user = ""; 
            this.role =  "";
            
        }
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
        bgdalam = new javax.swing.JPanel();
        namatoko = new javax.swing.JLabel();
        iconusername = new javax.swing.JLabel();
        iconpassword = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();
        gambar = new javax.swing.JLabel();
        ButtonLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(124, 197, 242));

        bgdalam.setBackground(new java.awt.Color(166, 223, 245));

        namatoko.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        namatoko.setText("TOKO KAMI");

        iconusername.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        iconusername.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Custom-Icon-Design-Pretty-Office-8-User-blue.32.png"))); // NOI18N
        iconusername.setText("Username");

        iconpassword.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        iconpassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Paomedia-Small-N-Flat-Key.32.png"))); // NOI18N
        iconpassword.setText("Password");

        txtusername.setPreferredSize(new java.awt.Dimension(90, 22));

        gambar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Untitled design (6).png"))); // NOI18N

        ButtonLogin.setBackground(new java.awt.Color(124, 197, 242));
        ButtonLogin.setText("LOGIN");
        ButtonLogin.setBorder(null);
        ButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bgdalamLayout = new javax.swing.GroupLayout(bgdalam);
        bgdalam.setLayout(bgdalamLayout);
        bgdalamLayout.setHorizontalGroup(
            bgdalamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgdalamLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(bgdalamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgdalamLayout.createSequentialGroup()
                        .addGroup(bgdalamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(iconusername)
                            .addComponent(iconpassword))
                        .addGroup(bgdalamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgdalamLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(bgdalamLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(bgdalamLayout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(ButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgdalamLayout.createSequentialGroup()
                        .addComponent(namatoko)
                        .addGap(93, 93, 93)))
                .addComponent(gambar)
                .addGap(20, 20, 20))
        );
        bgdalamLayout.setVerticalGroup(
            bgdalamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgdalamLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(bgdalamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gambar, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bgdalamLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(iconusername)
                        .addGap(28, 28, 28)
                        .addComponent(iconpassword))
                    .addGroup(bgdalamLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(namatoko)
                        .addGap(18, 18, 18)
                        .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(ButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(bgdalam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(bgdalam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLoginActionPerformed
        user u = new user();
        
        try {
            this.stat = k.getCon().prepareStatement("SELECT * FROM akun WHERE username='"+u.username+"' AND password='"+u.password+"';"
             );
            this.rs = this.stat.executeQuery();
            int status = 0;
            int id;
            String fn, us, ps, lv, al, no = null;
            UserProfile up = new UserProfile();
            while (rs.next()) {                
                u.role = rs.getString("role");
                
                
                id = rs.getInt("id_akun");
                fn = rs.getString("nama_user");
                us = rs.getString("username");
                ps = rs.getString("password");
                lv = rs.getString("role");
                al = rs.getString("alamat");
                no = rs.getString("nomer_telepon");
                up.setId(id);
                up.setName_user(fn);
                up.setUsername(us);
                up.setPassword(ps);
                up.setRole(lv);
                up.setAlamat(al);
                up.setNo_telp(no);
                
                status++;
                
            }
            System.out.println(status);
//            System.out.println(up.getName_user());
            if(u.role=="" ){
                JOptionPane.showMessageDialog(this,"AKUN TIDAK DITEMUKAN");
            }else {
                switch(u.role){
                    case "Admin" :
                        Profile Profil = new Profile(up);
                        DashboardAdmin Admin = new DashboardAdmin(up);
                        Admin.setVisible(true);
                        this.setVisible(false);
                        break;
                    case "Kasir" :
                        HalamanKasir Kasir = new HalamanKasir();
                        Kasir.setVisible(true);
                        this.setVisible(false);
                        break;
                    case "Owner" :
                        HalamanOwner Owner = new HalamanOwner();
                        Owner.setVisible(true);
                        this.setVisible(false);
                        break;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }//GEN-LAST:event_ButtonLoginActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonLogin;
    private javax.swing.JPanel bgdalam;
    private javax.swing.JLabel gambar;
    private javax.swing.JLabel iconpassword;
    private javax.swing.JLabel iconusername;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel namatoko;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
