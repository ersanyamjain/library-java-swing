
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MembNavUI.java
 *
 * Created on Dec 23, 2011, 11:51:26 AM
 */

/**
 *
 * @author d
 */
public class MembNavUI extends javax.swing.JFrame {
    Statement stmt=null;
ResultSet rs=null;
String SQL="Select * from member";
        public void disable_textfields(){
    txtMNo.setEditable(false);
        txtMName.setEditable(false);
        txtMAdd.setEditable(false);
        txtMPh.setEditable(false);
        txtMFee.setEditable(false);
        txtMStatus.setEditable(false);
        txtMIssue.setEditable(false);
}


    /** Creates new form MembNavUI */
    public MembNavUI() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMNo = new javax.swing.JTextField();
        txtMName = new javax.swing.JTextField();
        txtMAdd = new javax.swing.JTextField();
        txtMPh = new javax.swing.JTextField();
        txtMDate = new javax.swing.JTextField();
        txtMFee = new javax.swing.JTextField();
        txtMStatus = new javax.swing.JTextField();
        txtMIssue = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cmdFirst = new javax.swing.JButton();
        cmdNext = new javax.swing.JButton();
        cmdPrev = new javax.swing.JButton();
        cmdLast = new javax.swing.JButton();
        cmdExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("MEMBER INFORMATION");

        jLabel2.setText("Member No.");

        jLabel3.setText("Name");

        jLabel4.setText("Address");

        jLabel5.setText("Phone");

        jLabel6.setText("Membership Fee");

        txtMNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMNoActionPerformed(evt);
            }
        });

        jLabel7.setText("Issue Status");

        jLabel8.setText("Status");

        jLabel9.setText("Membership Date");

        cmdFirst.setText("First");
        cmdFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdFirstActionPerformed(evt);
            }
        });

        cmdNext.setText("Next");
        cmdNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdNextActionPerformed(evt);
            }
        });

        cmdPrev.setText("Previous");
        cmdPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdPrevActionPerformed(evt);
            }
        });

        cmdLast.setText("Last");
        cmdLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLastActionPerformed(evt);
            }
        });

        cmdExit.setText("Exit");
        cmdExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jLabel7)))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtMPh, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addComponent(txtMFee)
                                    .addComponent(txtMIssue, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(jLabel9))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel8)
                                        .addGap(30, 30, 30)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMDate, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                                    .addComponent(txtMStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMName, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                                    .addComponent(txtMNo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(cmdFirst)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmdNext)
                        .addGap(18, 18, 18)
                        .addComponent(cmdPrev)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmdLast)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmdExit)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtMPh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtMDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtMFee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtMStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(txtMIssue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdFirst)
                    .addComponent(cmdNext)
                    .addComponent(cmdPrev)
                    .addComponent(cmdLast)
                    .addComponent(cmdExit))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdPrevActionPerformed
        // TODO add your handling code here:
        try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=(Connection)
                DriverManager.getConnection("jdbc:mysql://localhost:3306/lbsystem","root","tiger");
        if(rs.previous())
        {
        String Mno=rs.getString("memb_no");
        String MName=rs.getString("memb_name");
        String MAdd=rs.getString("memb_add");
        String MPh1=rs.getString("memb_phone");
        String MDate=rs.getString("mdate");
        String MEDate=rs.getString("medate");
        String MFee=rs.getString("mfee");
        String MStatus=rs.getString("mem_status");
        String MIssue=rs.getString("mem_issue");
        txtMNo.setText(Mno);
        txtMName.setText(MName);
        txtMAdd.setText(MAdd);
        txtMPh.setText(MPh1);
        txtMFee.setText(MFee);
        txtMStatus.setText(MStatus);
        txtMIssue.setText(MIssue);
        cmdFirst.setEnabled(true);
        cmdNext.setEnabled(true);
        cmdPrev.setEnabled(true);
        cmdLast.setEnabled(true);
  
        }
        else{
        cmdPrev.setEnabled(false);
        JOptionPane.showMessageDialog(this,"You Are At First Position","Student",0);

        }
        }
        catch (Exception e){
        JOptionPane.showMessageDialog(this,e.getMessage());

        }

}//GEN-LAST:event_cmdPrevActionPerformed

    private void cmdLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLastActionPerformed
        // TODO add your handling code here:
        try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=(Connection)
                DriverManager.getConnection("jdbc:mysql://localhost:3306/lbsystem","root","tiger");
        if(rs.previous())
        {
        String Mno=rs.getString("memb_no");
        String MName=rs.getString("memb_name");
        String MAdd=rs.getString("memb_add");
        String MPh1=rs.getString("memb_phone");
        String MDate=rs.getString("mdate");
        String MEDate=rs.getString("medate");
        String MFee=rs.getString("mfee");
        String MStatus=rs.getString("mem_status");
        String MIssue=rs.getString("mem_issue");
        txtMNo.setText(Mno);
        txtMName.setText(MName);
        txtMAdd.setText(MAdd);
        txtMPh.setText(MPh1);
        txtMFee.setText(MFee);
        txtMStatus.setText(MStatus);
        txtMIssue.setText(MIssue);
        cmdFirst.setEnabled(true);
        cmdNext.setEnabled(true);
        cmdPrev.setEnabled(true);
        cmdLast.setEnabled(true);

        }
        else{
      
        JOptionPane.showMessageDialog(this,"You Alredy At Last Position","Student",0);

        }
        }
        catch (Exception e){
        JOptionPane.showMessageDialog(this,e.getMessage());

        }


    }//GEN-LAST:event_cmdLastActionPerformed

    private void cmdNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdNextActionPerformed
        // TODO add your handling code here:
        try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=(Connection)
                DriverManager.getConnection("jdbc:mysql://localhost:3306/lbsystem","root","tiger");
        if(rs.previous())
        {
        String Mno=rs.getString("memb_no");
        String MName=rs.getString("memb_name");
        String MAdd=rs.getString("memb_add");
        String MPh1=rs.getString("memb_phone");
        String MDate=rs.getString("mdate");
        String MEDate=rs.getString("medate");
        String MFee=rs.getString("mfee");
        String MStatus=rs.getString("mem_status");
        String MIssue=rs.getString("mem_issue");
        txtMNo.setText(Mno);
        txtMName.setText(MName);
        txtMAdd.setText(MAdd);
        txtMPh.setText(MPh1);
        txtMFee.setText(MFee);
        txtMStatus.setText(MStatus);
        txtMIssue.setText(MIssue);
        cmdFirst.setEnabled(true);
        cmdNext.setEnabled(true);
        cmdPrev.setEnabled(true);
        cmdLast.setEnabled(true);

        }
        else{
        cmdNext.setEnabled(false);
        JOptionPane.showMessageDialog(this,"You Are At Last Position","Student",0);

        }
        }
        catch (Exception e){
        JOptionPane.showMessageDialog(this,e.getMessage());

        }

    }//GEN-LAST:event_cmdNextActionPerformed

    private void cmdExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdExitActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);

    }//GEN-LAST:event_cmdExitActionPerformed

    private void cmdFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdFirstActionPerformed

        // TODO add your handling code here:
        try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=(Connection)
                DriverManager.getConnection("jdbc:mysql://localhost:3306/lbsystem","root","tiger");
        if(rs.previous())
        {
        String Mno=rs.getString("memb_no");
        String MName=rs.getString("memb_name");
        String MAdd=rs.getString("memb_add");
        String MPh1=rs.getString("memb_phone");
        String MDate=rs.getString("mdate");
        String MEDate=rs.getString("medate");
        String MFee=rs.getString("mfee");
        String MStatus=rs.getString("mem_status");
        String MIssue=rs.getString("mem_issue");
        txtMNo.setText(Mno);
        txtMName.setText(MName);
        txtMAdd.setText(MAdd);
        txtMPh.setText(MPh1);
        txtMFee.setText(MFee);
        txtMStatus.setText(MStatus);
        txtMIssue.setText(MIssue);
        cmdFirst.setEnabled(true);
        cmdNext.setEnabled(true);
        cmdPrev.setEnabled(true);
        cmdLast.setEnabled(true);

        }
        else{
        cmdPrev.setEnabled(false);
        cmdFirst.setEnabled(false);
        cmdLast.setEnabled(false);
        cmdNext.setEnabled(false);
        JOptionPane.showMessageDialog(this,"You Are At First Position","Student",0);

        }
        }
        catch (Exception e){
        JOptionPane.showMessageDialog(this,e.getMessage());

        }

    }//GEN-LAST:event_cmdFirstActionPerformed

    private void txtMNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMNoActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
        diable_textfields();
        try{
         Class.forName("com.mysql.jdbc.Driver");
        Connection con=(Connection)
                DriverManager.getConnection("jdbc:mysql://localhost:3306/lbsystem","root","tiger");
        stmt=con.createStatement();
        rs=stmt.executeQuery(SQL);
        if(rs.next()){
        String Mno=rs.getString("memb_no");
        String MName=rs.getString("memb_name");
        String MNAdd=rs.getString("memb_add");
        String MPh1=rs.getString("memb_phone");
        String MDate=rs.getString("mdate");
        String MEDate=rs.getString("medate");
        String MFee=rs.getString("mfee");
        String MStatus=rs.getString("mem_status");
        String MIssue=rs.getString("mem_issue");

        txtMNo.setText(Mno);
        txtMName.setText(MName);
        txtMAdd.setText(MAdd);
        txtMPh.setText(MPh1);
        txtMDate.setText(MDate);
        txtMFee.setText(MFee);
        txtMStatus.setText(MStatus);
        txtMIssue.setText(MIssue);
        cmdFirst.setEnabled(false);
        cmdNext.setEnabled(true);
        cmdPrev.setEnabled(false);
        cmdLast.setEnabled(true);

        }



        else{
            cmdFirst.setEnabled(false);
        cmdNext.setEnabled(false);
        cmdPrev.setEnabled(false);
        cmdLast.setEnabled(false);

        JOptionPane.showMessageDialog(this,"Here is no record in table","Student",0);

        }
        }catch(Exception e){
        JOptionPane.showMessageDialog(this,e.getMessage());
        }


        
    }//GEN-LAST:event_formWindowGainedFocus

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MembNavUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdExit;
    private javax.swing.JButton cmdFirst;
    private javax.swing.JButton cmdLast;
    private javax.swing.JButton cmdNext;
    private javax.swing.JButton cmdPrev;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtMAdd;
    private javax.swing.JTextField txtMDate;
    private javax.swing.JTextField txtMFee;
    private javax.swing.JTextField txtMIssue;
    private javax.swing.JTextField txtMName;
    private javax.swing.JTextField txtMNo;
    private javax.swing.JTextField txtMPh;
    private javax.swing.JTextField txtMStatus;
    // End of variables declaration//GEN-END:variables

}
