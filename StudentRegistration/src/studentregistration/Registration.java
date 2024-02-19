/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentregistration;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Registration extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;

    /**
     * Creates new form Registration
     */
    public Registration() {
        initComponents();
        signupLabel.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
              Login log=  new Login();
              log.setVisible(true);
                dispose();
            }
        });
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        popupMenu1 = new java.awt.PopupMenu();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        panel1 = new java.awt.Panel();
        lastNameField = new javax.swing.JTextField();
        firstNameField = new javax.swing.JTextField();
        nationalIdField = new javax.swing.JTextField();
        regNoField = new javax.swing.JTextField();
        pinField = new javax.swing.JPasswordField();
        reEnterPinField = new javax.swing.JPasswordField();
        submitButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        jLabel7 = new javax.swing.JLabel();
        signupLabel = new javax.swing.JLabel();
        collegeField = new javax.swing.JTextField();
        campusField = new javax.swing.JTextField();
        departmentField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        popupMenu1.setLabel("popupMenu1");

        jTextField1.setText("jTextField1");

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 102));
        setFont(new java.awt.Font("Candara", 0, 10)); // NOI18N

        panel1.setBackground(new java.awt.Color(51, 255, 51));

        lastNameField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lastNameField.setText("Enter lastname");
        lastNameField.setToolTipText("");
        lastNameField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lastNameFieldMouseClicked(evt);
            }
        });
        lastNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameFieldActionPerformed(evt);
            }
        });

        firstNameField.setText("Enter firstname");
        firstNameField.setToolTipText("Enter firstname");
        firstNameField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        firstNameField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                firstNameFieldMouseClicked(evt);
            }
        });
        firstNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameFieldActionPerformed(evt);
            }
        });

        nationalIdField.setText("Enter National ID Number");
        nationalIdField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nationalIdFieldMouseClicked(evt);
            }
        });

        regNoField.setText("Enter Your Reg No");
        regNoField.setToolTipText("");
        regNoField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regNoFieldMouseClicked(evt);
            }
        });

        pinField.setText("Enter Password");
        pinField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pinFieldMouseClicked(evt);
            }
        });

        reEnterPinField.setText("Comfirm Password");
        reEnterPinField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reEnterPinFieldMouseClicked(evt);
            }
        });

        submitButton.setBackground(new java.awt.Color(7, 69, 242));
        submitButton.setForeground(new java.awt.Color(255, 255, 255));
        submitButton.setText("SUBMIT");
        submitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        label3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        label3.setText("Enter Password");

        label4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        label4.setText("Confirm Password");

        jLabel7.setText("Already have Account?");

        signupLabel.setForeground(new java.awt.Color(0, 0, 204));
        signupLabel.setText("Sign In");
        signupLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        collegeField.setText("Enter College");
        collegeField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                collegeFieldMouseClicked(evt);
            }
        });
        collegeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                collegeFieldActionPerformed(evt);
            }
        });

        campusField.setText("Enter Campus");
        campusField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                campusFieldMouseClicked(evt);
            }
        });

        departmentField.setText("Enter Your Department");
        departmentField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                departmentFieldMouseClicked(evt);
            }
        });
        departmentField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departmentFieldActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Base 02", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("WELCOME TO MY PROJECT");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("You are new here?  Signup to continue");
        jLabel2.setToolTipText("");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lastNameField))
                            .addComponent(nationalIdField)
                            .addComponent(jLabel4)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(campusField, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(regNoField, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(departmentField)
                            .addComponent(collegeField)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(pinField, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(reEnterPinField))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(98, 98, 98))
                            .addComponent(submitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(signupLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(nationalIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campusField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(regNoField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(departmentField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(collegeField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pinField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reEnterPinField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(submitButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(signupLabel))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        firstNameField.getAccessibleContext().setAccessibleDescription("");

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 255));

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed

        insertData();

    }//GEN-LAST:event_submitButtonActionPerformed

    private void firstNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameFieldActionPerformed
        
       // lastNameField.setText("");
    }//GEN-LAST:event_firstNameFieldActionPerformed

    private void lastNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameFieldActionPerformed

    private void lastNameFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lastNameFieldMouseClicked
        lastNameField.setText("");
        
    }//GEN-LAST:event_lastNameFieldMouseClicked

    private void firstNameFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_firstNameFieldMouseClicked
        firstNameField.setText("");
        //firstNameField.setEchoChar((char)0 );   
    }//GEN-LAST:event_firstNameFieldMouseClicked

    private void collegeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_collegeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_collegeFieldActionPerformed

    private void nationalIdFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nationalIdFieldMouseClicked
        nationalIdField.setText("");
    }//GEN-LAST:event_nationalIdFieldMouseClicked

    private void campusFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campusFieldMouseClicked
        campusField.setText("");
    }//GEN-LAST:event_campusFieldMouseClicked

    private void regNoFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regNoFieldMouseClicked
       regNoField.setText("");
    }//GEN-LAST:event_regNoFieldMouseClicked

    private void departmentFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departmentFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_departmentFieldActionPerformed

    private void departmentFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_departmentFieldMouseClicked
    departmentField.setText("");
            
          
    }//GEN-LAST:event_departmentFieldMouseClicked

    private void collegeFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collegeFieldMouseClicked
       collegeField.setText("");
    }//GEN-LAST:event_collegeFieldMouseClicked

    private void reEnterPinFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reEnterPinFieldMouseClicked
        reEnterPinField.setText("");
    }//GEN-LAST:event_reEnterPinFieldMouseClicked

    private void pinFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pinFieldMouseClicked
        pinField.setText("");
    }//GEN-LAST:event_pinFieldMouseClicked
      
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
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campusField;
    private javax.swing.JTextField collegeField;
    private javax.swing.JTextField departmentField;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JTextField nationalIdField;
    private java.awt.Panel panel1;
    private javax.swing.JPasswordField pinField;
    private java.awt.PopupMenu popupMenu1;
    private javax.swing.JPasswordField reEnterPinField;
    private javax.swing.JTextField regNoField;
    private javax.swing.JLabel signupLabel;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables

    private void insertData() {
        // Get Text Field Values
        String firstName = lastNameField.getText();
        String lastName = firstNameField.getText();
        String regNo = nationalIdField.getText();
        String nationalId = regNoField.getText();
        String campus = campusField.getText();
        String department = departmentField.getText();
        String college = collegeField.getText();
        String pin = String.valueOf(pinField.getPassword());
        String reEnterPin = String.valueOf(reEnterPinField.getPassword());

        // Validate Text Field Inputs
        if (firstName.isEmpty() || lastName.isEmpty() || regNo.isEmpty() || nationalId.isEmpty() || campus.isEmpty() || department.isEmpty() || college.isEmpty() || pin.isEmpty() || reEnterPin.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Fill in all field!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        //check if both password are the same
        if (!pin.equals(reEnterPin)) {
            JOptionPane.showMessageDialog(this, "Password do not match!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        //insert data into database
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "");
            String query = "INSERT INTO student (firstname, lastname, regno, Nationalid, Campus, Department, College, Pin) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, firstName);
            statement.setString(2, lastName);
            statement.setString(3, regNo);
            statement.setString(4, nationalId);
            statement.setString(5, campus);
            statement.setString(6, department);
            statement.setString(7, college);
           statement.setString(8, pin);

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(this, "You Now Registered!");
                dispose();
                Login log = new Login();
                log.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Failed to Register.", "Error", JOptionPane.ERROR_MESSAGE);

            }
            conn.close();
            //if data not sent display this message
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "check your input type or connect database", "Error.", JOptionPane.ERROR_MESSAGE);
            System.out.print(ex);
        }
    }
}