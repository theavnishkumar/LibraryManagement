/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DAV
 */
public class return_book extends javax.swing.JFrame {

    /**
     * Creates new form return_book
     */
    public return_book() {
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bntf = new javax.swing.JTextField();
        rtf = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        atf = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Return Book");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Library_Management/Icons/icons8_Return_Book_50px.png"))); // NOI18N
        jLabel1.setText("Return Book");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Return Book", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Book No");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Return Date");

        bntf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        rtf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Library_Management/Icons/icons8_Checkmark_50px.png"))); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Adm No");

        atf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(84, 84, 84)
                        .addComponent(atf))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(148, 148, 148)
                                .addComponent(bntf, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(54, 54, 54)
                                .addComponent(rtf, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(atf)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntf, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(rtf, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbl1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student Name", "Student Class", "Adm No", "Book Name", "Book No", "Issue Date", "Return Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl1);
        if (tbl1.getColumnModel().getColumnCount() > 0) {
            tbl1.getColumnModel().getColumn(0).setResizable(false);
            tbl1.getColumnModel().getColumn(1).setResizable(false);
            tbl1.getColumnModel().getColumn(2).setResizable(false);
            tbl1.getColumnModel().getColumn(3).setResizable(false);
            tbl1.getColumnModel().getColumn(4).setResizable(false);
            tbl1.getColumnModel().getColumn(5).setResizable(false);
            tbl1.getColumnModel().getColumn(6).setResizable(false);
        }

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Library_Management/Icons/icons8_Refresh_40px.png"))); // NOI18N
        jButton2.setText("Refresh");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Library_Management/Icons/icons8_Delete_50px_1.png"))); // NOI18N
        jButton3.setText("Book Not Returned");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(19, 19, 19))
        );

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Library_Management/Icons/icons8_Home_50px.png"))); // NOI18N
        jLabel11.setToolTipText("Home");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(415, 415, 415))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int err=JOptionPane.showConfirmDialog(null, "Are you sure?\nYou want to Exit.");
        
        if(err==0)
        
        {
        System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         DefaultTableModel model = (DefaultTableModel) tbl1.getModel();
      
     int rows = model.getRowCount();
        
     if(rows>0)
     
     {
         for (int i=0; i<rows; i++){model.removeRow(0);}
     }
     
     
     
     try{
    Class.forName("java.sql.Driver");
    Connection con = DriverManager.getConnection
    ("jdbc:mysql://localhost/lib","root","root");
    
    Statement stmt = con.createStatement();
    String query = "Select * From school;";
    ResultSet rs = stmt.executeQuery(query);
    
    while(rs.next()){
        String sname = rs.getString("Student_Name");
        String sclass = rs.getString("Class");
        String sadm = rs.getString("Adm_No");
        String sbknm = rs.getString("Book_Name");
        String sbkno = rs.getString("Book_No");
        String sidd = rs.getString("Issue_Date");
        String srd = rs.getString("Return_Date");
        model.addRow(new Object[] {sname,sclass,sadm,sbknm,sbkno,sidd,srd});
    }
    
    
    rs.close();
    stmt.close();
    con.close();
    
}
     
catch(Exception e){
    JOptionPane.showMessageDialog(this, "Error In Connecitivity \n+" +e.getMessage());
}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
         DefaultTableModel model = (DefaultTableModel) tbl1.getModel();
      
     int rows = model.getRowCount();
        
     if(rows>0)
     
     {
         for (int i=0; i<rows; i++){model.removeRow(0);}
     }
     
     
     
     try{
    Class.forName("java.sql.Driver");
    Connection con = DriverManager.getConnection
    ("jdbc:mysql://localhost/lib","root","root");
    
    Statement stmt = con.createStatement();
    String query = "Select * From school;";
    ResultSet rs = stmt.executeQuery(query);
    
    while(rs.next()){
        String sname = rs.getString("Student_Name");
        String sclass = rs.getString("Class");
        String sadm = rs.getString("Adm_No");
        String sbknm = rs.getString("Book_Name");
        String sbkno = rs.getString("Book_No");
        String sidd = rs.getString("Issue_Date");
        String srd = rs.getString("Return_Date");
        model.addRow(new Object[] {sname,sclass,sadm,sbknm,sbkno,sidd,srd});
    }
    
    
    rs.close();
    stmt.close();
    con.close();
    
}
     
catch(Exception e){
    JOptionPane.showMessageDialog(this, "Error In Connecitivity \n+" +e.getMessage());
}
    }//GEN-LAST:event_formWindowActivated

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        DefaultTableModel model = (DefaultTableModel) tbl1.getModel();
      
     int rows = model.getRowCount();
        
     if(rows>0)
     
     {
         for (int i=0; i<rows; i++){model.removeRow(0);}
     }
     
     
     
     try{
    Class.forName("java.sql.Driver");
    Connection con = DriverManager.getConnection
    ("jdbc:mysql://localhost/lib","root","root");
    
    Statement stmt = con.createStatement();
    String query = "Select * From school where Return_Date is NULL;";
    ResultSet rs = stmt.executeQuery(query);
    
    while(rs.next()){
        String sname = rs.getString("Student_Name");
        String sclass = rs.getString("Class");
        String sadm = rs.getString("Adm_No");
        String sbknm = rs.getString("Book_Name");
        String sbkno = rs.getString("Book_No");
        String sidd = rs.getString("Issue_Date");
        String srd = rs.getString("Return_Date");
        model.addRow(new Object[] {sname,sclass,sadm,sbknm,sbkno,sidd,srd});
    }
    
    
    rs.close();
    stmt.close();
    con.close();
    
}
     
catch(Exception ex){
    JOptionPane.showMessageDialog(this, "Error In Connecitivity \n+"+ex.getMessage());
}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(atf.getText().isEmpty()||rtf.getText().isEmpty()||bntf.getText().isEmpty())
        
         {
             JOptionPane.showMessageDialog(null, "All Field Should be Filled");
         } 

         else {  
         
        String s_id,book_no,s_adm,r_id;
        r_id = rtf.getText();
        s_adm = atf.getText();
        book_no = bntf.getText();
       
    
    
        
 DefaultTableModel model = (DefaultTableModel) tbl1.getModel();

int err=JOptionPane.showConfirmDialog(null, "Are you sure ?\n You want to  Update.");
        
        if(err==0)
        
        {
      
     try{
    Class.forName("com.mysql.jdbc.Driver");

    Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/lib","root","root");

    Statement stmt=con.createStatement();

    String query="update school set Return_Date='"+r_id+"' Where Book_No="+book_no+" AND Adm_No="+s_adm+";";

    int qexecute=stmt.executeUpdate(query);


int rows = model.getRowCount();
      if(rows>0)
     {
         for (int i=0; i<rows; i++)
         {model.removeRow(0);}
     }

            
    String query2 = "Select * From school;";
    ResultSet rs = stmt.executeQuery(query2);
    
    
    
   while(rs.next()){
        String sname = rs.getString("Student_Name");
        String sclass = rs.getString("Class");
        String sadm = rs.getString("Adm_No");
        String sbknm = rs.getString("Book_Name");
        String sbkno = rs.getString("Book_No");
        String sidd = rs.getString("Issue_Date");
        String srd = rs.getString("Return_Date");
        model.addRow(new Object[] {sname,sclass,sadm,sbknm,sbkno,sidd,srd});
    }
    
        JOptionPane.showMessageDialog(this, "Your Data has been Updated");
    
    rs.close();
    stmt.close();
    con.close();

        } 
        
    
    catch (Exception e) 
   {
JOptionPane.showMessageDialog(this, e.getMessage());
   }
        
}
          }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
       new home().setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jLabel11MouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(return_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(return_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(return_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(return_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new return_book().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField atf;
    private javax.swing.JTextField bntf;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField rtf;
    private javax.swing.JTable tbl1;
    // End of variables declaration//GEN-END:variables
}
