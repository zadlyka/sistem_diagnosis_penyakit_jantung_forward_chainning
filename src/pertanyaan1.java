/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tara zadlyka
 */
public class pertanyaan1 extends javax.swing.JFrame {

    /**
     * Creates new form pertanyaan1
     */
    String[] p = new String[24];
    boolean[] bp = new boolean[24];
    int i=0;
   
    public pertanyaan1() {
        initComponents();
        p[0] = "Nyeri Dada";
        p[1] = "Bahu kiri terasa tidak enak";
        p[2] = "Keringan Dingin";
        p[3] = "Sesak Napas";
        p[4] = "Gangguan pencernaan";
        p[5] = "Mual";
        p[6] = "Detak jantung tidak teratur";
        p[7] = "Pusing";
        p[8] = "Kaki bengkak";
        p[9] = "Jantung berdebar-debar";  
        p[10] = "Mudah lelah";
        p[11] = "Nyeri didaerah dada tengah"; 
        p[12] =  "Mudah berkeringat";    
        p[13] =  "Dada mengencang";      
        p[14] =  "Pembengkakan pada jantung";      
        p[15] =  "Kelainan fungs hati";      
        p[16] =  "Pendarahan dari hidung";      
        p[17] =  "Wajah kemerahan";      
        p[18] =  "Batuk";
        p[19] =  "Sakit perut";
        p[20] =  "Detak jantung cepat";
        p[21] =  "Nyeri didaerah lengan kiri";
        p[22] =  "Punggung terasa tidak enak";
        p[23] =  "Sakit Kepala";
        gejala.setText(p[0]+" ?");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LTA = new javax.swing.JLabel();
        LTA1 = new javax.swing.JLabel();
        gejala = new javax.swing.JLabel();
        LTA3 = new javax.swing.JLabel();
        buttontext1 = new javax.swing.JPanel();
        textb1 = new javax.swing.JLabel();
        buttontext2 = new javax.swing.JPanel();
        textb2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        LTA.setFont(new java.awt.Font("Futura Bk BT", 0, 18)); // NOI18N
        LTA.setForeground(new java.awt.Color(171, 182, 200));
        LTA.setText("Document A");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LTA1.setFont(new java.awt.Font("Futura Bk BT", 0, 18)); // NOI18N
        LTA1.setForeground(new java.awt.Color(171, 182, 200));
        LTA1.setText("Apakah Anda Memiliki Gejala");
        getContentPane().add(LTA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 250, -1));

        gejala.setFont(new java.awt.Font("Futura Bk BT", 0, 18)); // NOI18N
        gejala.setForeground(new java.awt.Color(171, 182, 200));
        gejala.setText(" ?");
        getContentPane().add(gejala, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 340, -1));

        LTA3.setFont(new java.awt.Font("Futura Bk BT", 0, 18)); // NOI18N
        LTA3.setForeground(new java.awt.Color(171, 182, 200));
        LTA3.setText("Pertanyaan");
        getContentPane().add(LTA3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 100, -1));

        buttontext1.setBackground(new java.awt.Color(171, 182, 200));

        textb1.setFont(new java.awt.Font("Futura Bk BT", 0, 18)); // NOI18N
        textb1.setForeground(new java.awt.Color(255, 255, 255));
        textb1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textb1.setText("TIDAK");
        textb1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textb1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                textb1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                textb1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout buttontext1Layout = new javax.swing.GroupLayout(buttontext1);
        buttontext1.setLayout(buttontext1Layout);
        buttontext1Layout.setHorizontalGroup(
            buttontext1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textb1, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        buttontext1Layout.setVerticalGroup(
            buttontext1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textb1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        getContentPane().add(buttontext1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 120, 30));

        buttontext2.setBackground(new java.awt.Color(171, 182, 200));

        textb2.setFont(new java.awt.Font("Futura Bk BT", 0, 18)); // NOI18N
        textb2.setForeground(new java.awt.Color(255, 255, 255));
        textb2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textb2.setText("YA");
        textb2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textb2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                textb2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                textb2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout buttontext2Layout = new javax.swing.GroupLayout(buttontext2);
        buttontext2.setLayout(buttontext2Layout);
        buttontext2Layout.setHorizontalGroup(
            buttontext2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textb2, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        buttontext2Layout.setVerticalGroup(
            buttontext2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textb2, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        getContentPane().add(buttontext2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 120, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/SIM.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textb1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textb1MouseClicked
        // TODO add your handling code here:
        if(i<24){
            gejala.setText(p[i]+" ?");
            bp[i] = false;
            i++;
        }else{
            diagnosa d = new diagnosa(p,bp);
            d.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_textb1MouseClicked

    private void textb1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textb1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_textb1MouseEntered

    private void textb1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textb1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_textb1MouseExited

    private void textb2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textb2MouseClicked
        // TODO add your handling code here:
        if(i<24){
            gejala.setText(p[i]+" ?");
            bp[i] = true;
            i++;
        }else{
            diagnosa d = new diagnosa(p,bp);
            d.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_textb2MouseClicked

    private void textb2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textb2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_textb2MouseEntered

    private void textb2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textb2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_textb2MouseExited

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
            java.util.logging.Logger.getLogger(pertanyaan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pertanyaan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pertanyaan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pertanyaan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pertanyaan1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LTA;
    private javax.swing.JLabel LTA1;
    private javax.swing.JLabel LTA3;
    private javax.swing.JPanel buttontext1;
    private javax.swing.JPanel buttontext2;
    private javax.swing.JLabel gejala;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel textb1;
    private javax.swing.JLabel textb2;
    // End of variables declaration//GEN-END:variables
}
