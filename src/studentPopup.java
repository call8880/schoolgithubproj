
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author call8880
 */
public class studentPopup extends javax.swing.JDialog {

    /**
     * Creates new form studentPopup
     */
    Student temp;
    public studentPopup(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public String getName(){
       
        return txtname.getText();
    }
    
    public int[] getMarks(){
        
       
        int marks[] = new int[3];
        try {
            String name = txtname.getText();
        marks[0] = Integer.parseInt(tblmarks.getValueAt(0, 0).toString());
        marks[1] = Integer.parseInt(tblmarks.getValueAt(0, 1).toString());
        marks[2] = Integer.parseInt(tblmarks.getValueAt(0, 2).toString());
        temp = new Student(name, marks);
        }catch(Exception e ){
            JOptionPane.showMessageDialog(this, "Fill out all blanks");
    }
        return marks;
    }
     

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblmarks = new javax.swing.JTable();
        btnok = new javax.swing.JButton();
        txtname = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setText("Student Name");

        tblmarks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Mark 1 ", "Mark 2", "Mark 3"
            }
        ));
        tblmarks.setColumnSelectionAllowed(true);
        tblmarks.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblmarks);
        tblmarks.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tblmarks.getColumnModel().getColumnCount() > 0) {
            tblmarks.getColumnModel().getColumn(0).setResizable(false);
            tblmarks.getColumnModel().getColumn(1).setResizable(false);
            tblmarks.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        btnok.setText("Okay");
        btnok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnokActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(btnok))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnok)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnokActionPerformed
        
        int marks [] = new int[3];
        String name = txtname.getText();
        try{
            marks[0] = Integer.parseInt(tblmarks.getValueAt(0,0).toString());
            marks[1] = Integer.parseInt(tblmarks.getValueAt(0,1).toString());
            marks[2] = Integer.parseInt(tblmarks.getValueAt(0,2).toString());
        }catch (Exception e){
            JOptionPane.showMessageDialog(this, "Fill Out all Fields\n(Press <enter> on each mark)");
            return;
        }
        temp = new Student(name, marks);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_btnokActionPerformed
    
    public void setForm(Student s){
        DefaultTableModel model = (DefaultTableModel)(tblmarks.getModel());
        txtname.setText(s.getName());
        model.setValueAt(s.getMark(1), 0,0);
        model.setValueAt(s.getMark(2), 0,1);
        model.setValueAt(s.getMark(3), 0,2);
        
    }
    
    public Student getStudent(){
        return temp;
    } 
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnok;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblmarks;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
