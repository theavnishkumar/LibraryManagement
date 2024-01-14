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
public class modify_record extends javax.swing.JFrame {

    /**
     * Creates new form modify_record
     */
    public modify_record() {
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

        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        idtf = new javax.swing.JTextField();
        sntf = new javax.swing.JTextField();
        sctf = new javax.swing.JTextField();
        atf = new javax.swing.JTextField();
        bktf = new javax.swing.JTextField();
        bntf = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        ridtf = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Modify Record");
        setLocation(new java.awt.Point(176, 130));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                close(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Library_Management/Icons/icons8_Home_50px.png"))); // NOI18N
        jLabel11.setToolTipText("Home");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Library_Management/Icons/icons8_Exit_40px.png"))); // NOI18N
        jLabel7.setToolTipText("Logout");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Library_Management/Icons/icons8_Edit_File_48px.png"))); // NOI18N
        jLabel1.setText("Modify Record");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Issue Date");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Student Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Student Class");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Adm No.");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Book name");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Book No.");

        idtf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        idtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idtfActionPerformed(evt);
            }
        });

        sntf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sntf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sntfActionPerformed(evt);
            }
        });

        sctf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sctf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sctfActionPerformed(evt);
            }
        });

        atf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        bktf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        bntf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bntf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntfActionPerformed(evt);
            }
        });

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Library_Management/Icons/icons8_Edit_File_48px.png"))); // NOI18N
        jButton1.setText("Update");
        jButton1.setToolTipText("Update database");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Show Records", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        tbl1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student Name", "Student Class", "Adm No.", "Book Name", "Book No.", "Issue Date", "Return Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl1.getTableHeader().setReorderingAllowed(false);
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

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Library_Management/Icons/icons8_Refresh_40px.png"))); // NOI18N
        jButton3.setText("Refresh");
        jButton3.setToolTipText("Refresh Database");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton3)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addContainerGap())
        );

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Return Date");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel11)
                .addGap(376, 376, 376)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idtf)
                            .addComponent(ridtf)
                            .addComponent(bntf, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bktf)
                            .addComponent(sctf)
                            .addComponent(atf)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(27, 27, 27)
                        .addComponent(sntf))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 178, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jSeparator1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sntf, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sctf)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(atf, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bktf, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bntf, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idtf, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ridtf, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        new home().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
       int err=JOptionPane.showConfirmDialog(null, "Are you sure?\nYou want to Logout.");
        
        if(err==0)
        
        {
        JOptionPane.showMessageDialog(this, "Thanks for using this Application");
        new login().setVisible(true);
        this.setVisible(false);
        }
    }//GEN-LAST:event_jLabel7MouseClicked

    private void idtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idtfActionPerformed

    private void sntfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sntfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sntfActionPerformed

    private void sctfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sctfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sctfActionPerformed

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

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    if(idtf.getText().isEmpty()&&sntf.getText().isEmpty()&&sctf.getText().isEmpty()&&atf.getText().isEmpty()&&bktf.getText().isEmpty())
        
         {
             JOptionPane.showMessageDialog(null, "All Field Should be Filled");
         } 
    else if(bntf.getText().isEmpty()&&idtf.getText().isEmpty()&&ridtf.getText().isEmpty()){JOptionPane.showMessageDialog(null, "All Field Should be Filled");}
         else {  
         
        String s_name,s_class,book_name,s_id,book_no,s_adm,r_id;
        r_id = ridtf.getText();
        s_id = idtf.getText();
        s_name = sntf.getText();
        s_class = sctf.getText();
        s_adm = atf.getText();
        book_name = bktf.getText();
        book_no = bntf.getText();
       
    
    
        
 DefaultTableModel model = (DefaultTableModel) tbl1.getModel();

int err=JOptionPane.showConfirmDialog(null, "Are you sure ?\n You want to  Update.");
        
        if(err==0)
        
        {
      
     try{
    Class.forName("com.mysql.jdbc.Driver");

    Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/lib","root","root");

    Statement stmt=con.createStatement();

    String query="update school set Student_Name='"+s_name+"', Class='"+s_class+"', Adm_No="+s_adm+", Book_Name='"+book_name+"', Book_No="+book_no+", Issue_Date='"+s_id+"', Return_Date='"+r_id+"' Where Book_No="+book_no+";";

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

    private void close(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_close
        int err=JOptionPane.showConfirmDialog(null, "Are you sure?\nYou want to Exit.");
        
        if(err==0)
        
        {
        System.exit(0);
        }
    }//GEN-LAST:event_close

    private void bntfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bntfActionPerformed

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
            java.util.logging.Logger.getLogger(modify_record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(modify_record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(modify_record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(modify_record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new modify_record().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField atf;
    private javax.swing.JTextField bktf;
    private javax.swing.JTextField bntf;
    private javax.swing.JTextField idtf;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField ridtf;
    private javax.swing.JTextField sctf;
    private javax.swing.JTextField sntf;
    private javax.swing.JTable tbl1;
    // End of variables declaration//GEN-END:variables
}
