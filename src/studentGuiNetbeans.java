/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author call8880
 */
public class studentGuiNetbeans extends javax.swing.JFrame {

    Student s[];
    int size, currentStudent;

    
    
    public studentGuiNetbeans() {
        initComponents();
        s = new Student[10];
        size = 0;
        currentStudent = -1;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblname = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        lbltst1 = new javax.swing.JLabel();
        lbltst2 = new javax.swing.JLabel();
        lbltst3 = new javax.swing.JLabel();
        txttst1 = new javax.swing.JTextField();
        txttst2 = new javax.swing.JTextField();
        txttst3 = new javax.swing.JTextField();
        lbllavg = new javax.swing.JLabel();
        lblavgshow = new javax.swing.JLabel();
        btnadd = new javax.swing.JButton();
        btnmod = new javax.swing.JButton();
        btn2back = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        btnfore = new javax.swing.JButton();
        btnforwards = new javax.swing.JButton();
        lblcount = new javax.swing.JLabel();
        lblindex = new javax.swing.JLabel();
        lblcountnum = new javax.swing.JLabel();
        lblindexnum = new javax.swing.JLabel();
        txtavg = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblname.setText("Name");

        txtname.setEditable(false);

        lbltst1.setText("Test 1");

        lbltst2.setText("Test 2");

        lbltst3.setText("Test 3 ");

        txttst1.setEditable(false);
        txttst1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttst1ActionPerformed(evt);
            }
        });

        txttst2.setEditable(false);
        txttst2.setToolTipText("");
        txttst2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttst2ActionPerformed(evt);
            }
        });

        txttst3.setEditable(false);

        lbllavg.setText("Average");

        btnadd.setText("Add");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btnmod.setText("modify");
        btnmod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodActionPerformed(evt);
            }
        });

        btn2back.setText("<<");

        btnback.setText("<");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        btnfore.setText(">");
        btnfore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnforeActionPerformed(evt);
            }
        });

        btnforwards.setText(">>");

        lblcount.setText("Count");

        lblindex.setText("Current Index");

        lblcountnum.setText("0");

        lblindexnum.setText("0");

        txtavg.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn2back)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnback))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblcount)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblcountnum)))
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnfore)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnforwards))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblindex)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblindexnum))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbllavg)
                                .addGap(25, 25, 25)
                                .addComponent(txtavg)
                                .addGap(112, 112, 112)
                                .addComponent(lblavgshow)))
                        .addGap(46, 46, 46))
                    .addComponent(lbltst3)
                    .addComponent(lbltst2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblname)
                            .addComponent(lbltst1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txttst2)
                                    .addComponent(txttst1)
                                    .addComponent(txttst3, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnadd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnmod, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(62, 62, 62))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblname)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltst1)
                    .addComponent(txttst1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnadd))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltst2)
                    .addComponent(txttst2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnmod))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltst3)
                    .addComponent(txttst3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbllavg)
                    .addComponent(lblavgshow)
                    .addComponent(txtavg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn2back)
                    .addComponent(btnback)
                    .addComponent(btnfore)
                    .addComponent(btnforwards))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcount)
                    .addComponent(lblindex)
                    .addComponent(lblcountnum)
                    .addComponent(lblindexnum))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txttst1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttst1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttst1ActionPerformed

    private void txttst2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttst2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttst2ActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
           studentPopup spop = new studentPopup(this, true);
           spop.setModal(true);
           spop.setLocationRelativeTo(this);
           spop.setVisible(true);
           //code wont run till popup is disposed
           String name = spop.getName();
           txtname.setText(name); 
           int m[] = spop.getMarks();
           txttst1.setText("" + m[0]);
           txttst2.setText("" + m[1]);
           txttst3.setText("" + m[2]);
           
           
    }//GEN-LAST:event_btnaddActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        if(currentStudent > 0){
            currentStudent--;
            showStudent();
        }
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnforeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnforeActionPerformed
        if(currentStudent < size - 1 && currentStudent > -1){
            currentStudent++;
            showStudent();
        }
    }//GEN-LAST:event_btnforeActionPerformed

    private void btnmodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodActionPerformed
        studentPopup form = new studentPopup(this, true);
        form.setForm(s[currentStudent]);
        form.setModal(true);
        form.setLocationRelativeTo(this);
        form.setVisible(true);
        
    }//GEN-LAST:event_btnmodActionPerformed

    public void showStudent(){
        txtname.setText(s[currentStudent].getName());
        txttst1.setText("" + s[currentStudent].getMark(1));
        txttst2.setText("" + s[currentStudent].getMark(2));
        txttst3.setText("" + s[currentStudent].getMark(3));
        txtavg.setText("" + s[currentStudent].getAverage());
        lblcount.setText("" + size);
        lblindex.setText("" + currentStudent);
    }
    
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
            java.util.logging.Logger.getLogger(studentGuiNetbeans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(studentGuiNetbeans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(studentGuiNetbeans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(studentGuiNetbeans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new studentGuiNetbeans().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn2back;
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnfore;
    private javax.swing.JButton btnforwards;
    private javax.swing.JButton btnmod;
    private javax.swing.JLabel lblavgshow;
    private javax.swing.JLabel lblcount;
    private javax.swing.JLabel lblcountnum;
    private javax.swing.JLabel lblindex;
    private javax.swing.JLabel lblindexnum;
    private javax.swing.JLabel lbllavg;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lbltst1;
    private javax.swing.JLabel lbltst2;
    private javax.swing.JLabel lbltst3;
    private javax.swing.JTextField txtavg;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txttst1;
    private javax.swing.JTextField txttst2;
    private javax.swing.JTextField txttst3;
    // End of variables declaration//GEN-END:variables
}
