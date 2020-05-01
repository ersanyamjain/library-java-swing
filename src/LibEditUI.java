import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
import javax.swing.DefaultComboBoxModel;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * LibEditUI.java
 *
 * Created on Jan 27, 2012, 5:28:21 PM
 */

/**
 *
 * @author Jain
 */
public class LibEditUI extends javax.swing.JFrame {
    Statement stmt1=null;
        String SQL1="Select * from publisher";
        ResultSet rs1=null;
        Statement stmt=null;
        ResultSet rs=null;
        String SQL="select * from lib";

    /** Creates new form LibEditUI */
    public LibEditUI() {
        
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPDate = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtBTitle = new javax.swing.JTextField();
        txtAuth1 = new javax.swing.JTextField();
        txtAuth2 = new javax.swing.JTextField();
        txtAcno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPages = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtEdition = new javax.swing.JTextField();
        cmdUpdate = new javax.swing.JButton();
        cmdExit = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtPID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("(YYYY-MM-DD)");

        jLabel8.setText("Purchase Date");

        jLabel9.setText("Status");

        jLabel4.setText("Publisher");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Book Title");

        jLabel1.setText("Accesion No.");

        jLabel3.setText("Authers");

        txtBTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBTitleActionPerformed(evt);
            }
        });

        txtAcno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAcnoActionPerformed(evt);
            }
        });

        jLabel5.setText("Price");

        jLabel6.setText("Pages");

        jLabel7.setText("Edition");

        cmdUpdate.setText("Update");
        cmdUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdUpdateActionPerformed(evt);
            }
        });

        cmdExit.setText("Exit");
        cmdExit.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                cmdExitStateChanged(evt);
            }
        });
        cmdExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdExitActionPerformed(evt);
            }
        });
        cmdExit.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cmdExitFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cmdExitFocusLost(evt);
            }
        });

        jLabel11.setText("Pub ID");

        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel12.setText("Select a Book");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(cmdUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(96, 96, 96))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(77, 77, 77)
                                        .addComponent(jComboBox1, 0, 281, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(jLabel3))
                                        .addGap(39, 39, 39)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtBTitle, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtAcno, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtAuth2, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                                                    .addComponent(txtAuth1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtPID, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel6)
                                        .addGap(12, 12, 12)
                                        .addComponent(txtPages, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtEdition, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel11)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtPDate, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cmdExit)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(16, 16, 16)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGap(39, 39, 39))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 307, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txtAcno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAuth1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(txtAuth2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addGap(5, 5, 5)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(txtPages, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(txtEdition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtPDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmdUpdate)
                            .addComponent(cmdExit)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(txtPID, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jComboBox1ActionPerformed

    private void txtBTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBTitleActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_txtBTitleActionPerformed

    private void cmdUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdUpdateActionPerformed
        // TODO add your handling code here:
      
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=(Connection)
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/lbsystem","root","tiger");

            stmt=con.createStatement();
            rs=stmt.executeQuery(SQL);
            int Acno=Integer.parseInt(txtAcno.getText().trim());
            String bTitle=txtBTitle.getText();
           String Auth1=txtAuth1.getText();
            String Auth2=txtAuth2.getText();
            String pName=(String)jComboBox1.getSelectedItem();
            String NPubNo=String.valueOf(pName.substring(0,3).trim());
            int Npno=Integer.parseInt(NPubNo);
            int PID=Integer.parseInt(txtPID.getText());
            if(Npno!=PID)
                PID=Npno;
            float Price=Float.parseFloat(txtPrice.getText());
            int pages=Integer.parseInt(txtPages.getText());
            int edition=Integer.parseInt(txtEdition.getText());
String Pdate=txtPDate.getText();
String BStatus=txtStatus.getText();

String strSQL="update lib set btitle='"+(bTitle)+"',author1='"(Auth1)+"',author2='"+(Auth2)"',pub_id="+(PID)+",price="+(Price)+"',pdate='"+(Pdate)+"',pages="+(pages)+",edition="+(edition)+"',status='"+(BStatus)+"'where acc_no="+(Acno);
int rowsEffected=stmt.executeUpdate(strSQL);
if(rowsEffected==0)
    JOptionPane.showMessageDialog(this,"record does not exist");
else
    JOptionPane.showMessageDialog(this,"Record Modified");
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,e.getMessage));


        }
}//GEN-LAST:event_cmdUpdateActionPerformed

private void cmdExitStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cmdExitStateChanged
    // TODO add your handling code here:
}//GEN-LAST:event_cmdExitStateChanged

private void cmdExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdExitActionPerformed
    // TODO add your handling code here:
    this.setVisible(false);

   
}//GEN-LAST:event_cmdExitActionPerformed

private void cmdExitFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmdExitFocusGained

}//GEN-LAST:event_cmdExitFocusGained

private void cmdExitFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmdExitFocusLost
    // TODO add your handling code here:
}//GEN-LAST:event_cmdExitFocusLost

private void txtAcnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAcnoActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_txtAcnoActionPerformed

private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
    // TODO add your handling code here:
    txtAcno.setEditable(false);
     txtPID.setEditable(false);
     txtStatus.setEditable(false);
     DefaultListModel dModel=(DefaultListModel)jList1.getModel();
     dModel.clear();
     try{
     Class.forName("com.mysql.jdbc.Driver");
     Connection con=(Connection)
     DriverManager.getConnection("jdbc:mysql://localhost:3306/lbsystem","root","tiger");

            stmt=con.createStatement();
            rs=stmt.executeQuery(SQL);
           while(rs.next()){
           String Ano=rs.getString("acc_no");
           String BTitle=rs.getString("btitle");
           if(Ano.length()<4)
           {
               int x=Ano.length();
               int ln=4-x;
               while(nl>0){
                   Ano=Ano+"";
                   nl--;

               }
           }
     dModel.addElement(Ano+" "+BTitle);
     }
     jList.setModel(dModel);
     DefaultComboBoxModel cModel=(DefaultComboBoxModel)jComboBox1.getModel();
     cModel.removeAllElements();

            stmt1=con.createStatement();
            rs=stmt.executeQuery(SQL1);
           while(rs1.next()){
           String pubno=rs.getString("pub_id");
           String pubName=rs.getString("pub_name");
           txtStatus.setText("Y");
           if(pubno.length()<4)
           {
               int x=pubno.length();
               int ln=4-x;
               while(nl>0){
                   Ano=Ano+"";
                   nl--;
                   
               }
           }
     cModel.addElement(pubno+" "+pubName);
     }
     }catch(Exception e){
            JOptionPane.showMessageDialog(this,e.getMessage));
e.printStackTrace();

        }

}//GEN-LAST:event_formWindowGainedFocus

private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
    // TODO add your handling code here:
    String MBook=(String)jList1.getSelectedValue();
    String Acno=MBook.trim().substring(0,3);
    String query="select * from lib where acc_no="+Acno+";";
     try{
     Class.forName("com.mysql.jdbc.Driver").newInstance();
     Connection con=(Connection)
     DriverManager.getConnection("jdbc:mysql://localhost:3306/lbsystem","root","tiger");

            stmt=con.createStatement();
            rs=stmt.executeQuery(query);
    if(rs.next()){
        String bTitle=rs.getString("btitle");
         String Auth1=rs.getString("author1");
         String Auth2=rs.getString("author2");
         String PID=rs.getString("pub_id");
         String Price=rs.getString("price");
         String PDate=rs.getString("pdate");
         String pages=rs.getString("pages");
         String edition=rs.getString("edition");
         String PStatus=rs.getString("status");

         txtAcno.setText(Acno);
        txtBTitle.setText(bTitle);
         txtAuth1.setText(Auth1);
         txtAuth2.setText(Auth2);
         txtPID.setText(PID);
         txtPrice.setText(Price);

         txtPDate.setText(PDate);

         txtPages.setText(pages);
         txtEdition.setText(edition);
         txtStatus.setText(PStatus);
         con.close();
         stmt.close();
         rs.close();
    }else{
                JOptionPane.showMessageDialog(null,"Record does not found in student table");
    }
     }catch(Exception e){
     JOptionPane.showMessageDialog(this,e.getMessage());

     }
    }


    


}//GEN-LAST:event_jList1MouseClicked

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LibEditUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdExit;
    private javax.swing.JButton cmdUpdate;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAcno;
    private javax.swing.JTextField txtAuth1;
    private javax.swing.JTextField txtAuth2;
    private javax.swing.JTextField txtBTitle;
    private javax.swing.JTextField txtEdition;
    private javax.swing.JTextField txtPDate;
    private javax.swing.JTextField txtPID;
    private javax.swing.JTextField txtPages;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtStatus;
    // End of variables declaration//GEN-END:variables

}