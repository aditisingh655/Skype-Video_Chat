/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chat;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author aatmin
 */
public class Chat_C extends javax.swing.JFrame {

    ImageIcon i1,i3;
    Image i2;
    /**
     * Creates new form Chat_C
     */
    public Chat_C() {
       initComponents();
       i1 = new ImageIcon(ClassLoader.getSystemResource("Chat/icons/3.png"));
       i2 = i1.getImage().getScaledInstance(l1.getWidth(), l1.getHeight(), Image.SCALE_DEFAULT);
       i3 = new ImageIcon(i2);
       l1.setIcon(i3);
       
       i1 = new ImageIcon(ClassLoader.getSystemResource("Chat/icons/2.png"));
       i2 = i1.getImage().getScaledInstance(l2.getWidth(), l2.getHeight(), Image.SCALE_DEFAULT);
       i3 = new ImageIcon(i2);
       l2.setIcon(i3);
       
       i1 = new ImageIcon(ClassLoader.getSystemResource("Chat/icons/video.png"));
       i2 = i1.getImage().getScaledInstance(l5.getWidth(), l5.getHeight(), Image.SCALE_DEFAULT);
       i3 = new ImageIcon(i2);
       l5.setIcon(i3);
       
       i1 = new ImageIcon(ClassLoader.getSystemResource("Chat/icons/phone.png"));
       i2 = i1.getImage().getScaledInstance(l6.getWidth(), l6.getHeight(), Image.SCALE_DEFAULT);
       i3 = new ImageIcon(i2);
       l6.setIcon(i3);
       
       i1 = new ImageIcon(ClassLoader.getSystemResource("Chat/icons/3icon.png"));
       i2 = i1.getImage().getScaledInstance(l7.getWidth(), l7.getHeight(), Image.SCALE_DEFAULT);
       i3 = new ImageIcon(i2);
       l7.setIcon(i3);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p1 = new javax.swing.JPanel();
        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        l7 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.white);
        setLocation(new java.awt.Point(1100, 200));
        setUndecorated(true);

        p1.setBackground(new java.awt.Color(7, 94, 84));
        p1.setLayout(null);

        l1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l1MouseClicked(evt);
            }
        });
        p1.add(l1);
        l1.setBounds(5, 17, 30, 30);
        p1.add(l2);
        l2.setBounds(40, 5, 60, 60);
        p1.add(l5);
        l5.setBounds(290, 20, 30, 30);
        p1.add(l6);
        l6.setBounds(350, 20, 35, 30);
        p1.add(l7);
        l7.setBounds(410, 20, 13, 25);

        l3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        l3.setForeground(new java.awt.Color(254, 254, 254));
        l3.setText("Bunty");
        p1.add(l3);
        l3.setBounds(110, 15, 100, 18);

        l4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        l4.setForeground(new java.awt.Color(254, 254, 254));
        l4.setText("Active Now");
        p1.add(l4);
        l4.setBounds(110, 35, 100, 20);

        t1.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        t1.setText("jTextField1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(585, 585, 585)
                .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void l1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l1MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_l1MouseClicked

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
            java.util.logging.Logger.getLogger(Chat_C.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Chat_C.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Chat_C.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Chat_C.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Chat_C().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel l7;
    private javax.swing.JPanel p1;
    private javax.swing.JTextField t1;
    // End of variables declaration//GEN-END:variables
}
