/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product;

import Connection.ConnectionProvider;
import Login.NewBuyer;
import Login.home;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author vicky
 */
public class newproduct extends javax.swing.JFrame {

    /**
     * Creates new form newproduct
     */
    public newproduct() {
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

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        pid = new javax.swing.JLabel();
        pname = new javax.swing.JLabel();
        rate = new javax.swing.JLabel();
        des = new javax.swing.JLabel();
        ac = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        prate = new javax.swing.JTextField();
        description = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        pr = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/New Product ani.gif"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new product.png"))); // NOI18N

        pid.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        pid.setText("Product ID");

        pname.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        pname.setText("Product Name");

        rate.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        rate.setText("Rate");

        des.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        des.setText("Desrcription");

        ac.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ac.setText("Active");

        name.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        prate.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        prate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prateActionPerformed(evt);
            }
        });

        description.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        description.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descriptionActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Inactive" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Reset.png"))); // NOI18N
        jButton1.setText("Reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close Jframe.png"))); // NOI18N
        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        jButton3.setText("Save");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/all page background image.png"))); // NOI18N
        jLabel8.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jLabel8ComponentShown(evt);
            }
        });

        pr.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pr.setForeground(new java.awt.Color(255, 0, 51));
        pr.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(pid)
                .addGap(80, 80, 80)
                .addComponent(pr, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(230, 230, 230)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(54, 54, 54)
                            .addComponent(pname))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(270, 270, 270)
                            .addComponent(jButton1)
                            .addGap(113, 113, 113)
                            .addComponent(jButton2))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(54, 54, 54)
                            .addComponent(ac))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(310, 310, 310)
                            .addComponent(description, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(120, 120, 120)
                            .addComponent(jLabel2))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(54, 54, 54)
                            .addComponent(rate))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(310, 310, 310)
                            .addComponent(prate, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(48, 48, 48)
                            .addComponent(jButton3))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(54, 54, 54)
                            .addComponent(des))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(310, 310, 310)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(310, 310, 310)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jSeparator1))
                        .addComponent(jLabel8))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pid)
                    .addComponent(pr, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel1)
                            .addGap(81, 81, 81)
                            .addComponent(pname)
                            .addGap(191, 191, 191)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton1)
                                .addComponent(jButton2)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(273, 273, 273)
                            .addComponent(ac))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(240, 240, 240)
                            .addComponent(description, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel2))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(195, 195, 195)
                            .addComponent(rate))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(190, 190, 190)
                            .addComponent(prate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(363, 363, 363)
                            .addComponent(jButton3))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(232, 232, 232)
                            .addComponent(des))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(280, 280, 280)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(150, 150, 150)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(85, 85, 85)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel8))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void prateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prateActionPerformed

    private void descriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descriptionActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        setVisible(false);
        new newproduct().setVisible(true);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new home().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        String productid = pr.getText();
        String pname = name.getText();
        String rate = prate.getText();
        String pdescription = des.getText();
        String active = (String)jComboBox1.getSelectedItem();

        try{
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            st.executeUpdate("insert into product values('"+productid+"','"+pname+"','"+rate+"','"+pdescription+"','"+active+"')");
            JOptionPane.showMessageDialog(null,"Product successfully added");
            setVisible(false);
            new newproduct().setVisible(true);

        }catch(Exception e){

            JOptionPane.showConfirmDialog(null, "Product already Exist");

        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel8ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel8ComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8ComponentShown

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
           try{
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            
            ResultSet rs = st.executeQuery("select max(productid) from product");
            if(rs.first()){
            
            int pid = rs.getInt(1);
            pid = pid+1;
            String str = String.valueOf(pid);
            pr.setText(str);
            
            }

         else{
           pr.setText("1");
          }
        
        }catch(Exception e){

            JOptionPane.showConfirmDialog(null, e);

        }
        
        
        
        
        
    }//GEN-LAST:event_formComponentShown

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
            java.util.logging.Logger.getLogger(newproduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newproduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newproduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newproduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newproduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ac;
    private javax.swing.JLabel des;
    private javax.swing.JTextField description;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField name;
    private javax.swing.JLabel pid;
    private javax.swing.JLabel pname;
    private javax.swing.JLabel pr;
    private javax.swing.JTextField prate;
    private javax.swing.JLabel rate;
    // End of variables declaration//GEN-END:variables
}