/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package elearning.ui;

import elearning.models.ProfessorDataModel;
import elearning.models.StudentDataModel;
import elearning.models.UserDefaultDataModel;
import elearning.ui.admin.AdminDashboardPanel;
import elearning.models.UserModel;
import elearning.models.UserDirectory;
import elearning.ui.professor.ProfessorDashboardPanel;
import elearning.ui.student.StudentDashboardPanel;
import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author harsh
 */
public class Login extends javax.swing.JPanel {

    JPanel appContainerPanel;
    JButton logoutButton;
    JButton loginButton;

    UserDirectory userSignUpObj;
    UserDefaultDataModel userDefaultDataObj;
    ProfessorDataModel professorDataObj;
    StudentDataModel studentDataObj;

    /**
     * Creates new form Login
     *
     * @param appContainerPanel
     * @param logoutButton
     * @param loginButton
     * @param userSignUpObj
     * @param userDefaultDataObj
     * @param professorDataObj
     * @param studentDataObj
     */
    public Login(JPanel appContainerPanel,
            JButton logoutButton, JButton loginButton,
            UserDirectory userSignUpObj, UserDefaultDataModel userDefaultDataObj,
            ProfessorDataModel professorDataObj,
            StudentDataModel studentDataObj) {
        initComponents();

        this.jDialog1.setVisible(false);
        this.jLabel5.setVisible(false);

        this.appContainerPanel = appContainerPanel;
        this.logoutButton = logoutButton;
        this.loginButton = loginButton;

        this.logoutButton.setVisible(false);
        this.loginButton.setVisible(true);

        this.userSignUpObj = userSignUpObj;
        this.userDefaultDataObj = userDefaultDataObj;
        this.professorDataObj = professorDataObj;
        this.studentDataObj = studentDataObj;
    }

    public Login(JPanel appContainerPanel,
            UserDirectory userSignUpObj, UserDefaultDataModel userDefaultDataObj,
            ProfessorDataModel professorDataObj,
            StudentDataModel studentDataObj) {
        initComponents();
        this.jDialog1.setVisible(false);
        this.jLabel5.setVisible(false);
        this.appContainerPanel = appContainerPanel;
        this.userSignUpObj = userSignUpObj;
        this.userDefaultDataObj = userDefaultDataObj;
        this.professorDataObj = professorDataObj;
        this.studentDataObj = studentDataObj;

        System.out.println("User Details Size : " + this.userSignUpObj.getUserLi().size());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("LOGIN");

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("username");

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(102, 102, 102));

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Password");

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Professor Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 102, 102));
        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Student Login");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setText("I don't have an account");

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 51, 51));
        jButton2.setText("Sign Up");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 102, 102));
        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Admin Login");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setText("Invalid Credentails ...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(259, 259, 259)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jButton2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel4))))))))
                .addGap(66, 66, 66))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String userName = this.jTextField1.getText();
        String password = this.jPasswordField1.getText();

        if (validateCredentials(userName, password)) {
            if (validateCredentials(userName, password)) {
                UserModel validUserObj = this.userSignUpObj.getUserLi().stream()
                        .filter(userObj -> ((userObj.getUsername().equalsIgnoreCase(userName))
                        && (userObj.getPassword().equalsIgnoreCase(password))))
                        .findAny()
                        .orElse(null);

                if (validUserObj != null) {
                    if (validUserObj.getUserType().equalsIgnoreCase("professor")) {
                        ProfessorDashboardPanel profDash
                                = new ProfessorDashboardPanel(appContainerPanel, this.userSignUpObj,
                                        validUserObj, this.userDefaultDataObj,
                                        this.professorDataObj, this.studentDataObj);
                        appContainerPanel.add("ProfessorDashboard", profDash);
                        CardLayout layout = (CardLayout) appContainerPanel.getLayout();
                        layout.next(appContainerPanel);
                        this.logoutButton.setVisible(true);
                        this.loginButton.setVisible(false);
                    } else {
                        StudentDashboardPanel studentDash
                                = new StudentDashboardPanel(appContainerPanel, this.userSignUpObj,
                                        validUserObj, userDefaultDataObj,
                                        professorDataObj, studentDataObj);
                        appContainerPanel.add("StudentDashboard", studentDash);
                        CardLayout layout = (CardLayout) appContainerPanel.getLayout();
                        layout.next(appContainerPanel);
                        this.logoutButton.setVisible(true);
                        this.loginButton.setVisible(false);
                    }
                } else {
                    this.jLabel5.setVisible(true);
                    this.jLabel5.setText("");
                    this.jLabel5.setText("Invalid User Credentials !");
                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String userName = this.jTextField1.getText();
        String password = this.jPasswordField1.getText();
        if (validateCredentials(userName, password)) {
            if (validateCredentials(userName, password)) {
                UserModel validUserObj = this.userSignUpObj.getUserLi().stream()
                        .filter(userObj -> ((userObj.getUsername().equalsIgnoreCase(userName))
                        && (userObj.getPassword().equalsIgnoreCase(password))))
                        .findAny()
                        .orElse(null);

                if (validUserObj != null && validUserObj.getUserType().equalsIgnoreCase("student")) {
                    StudentDashboardPanel studentDash
                            = new StudentDashboardPanel(appContainerPanel, this.userSignUpObj,
                                    validUserObj, userDefaultDataObj,
                                    professorDataObj, studentDataObj);
                    appContainerPanel.add("StudentDashboard", studentDash);
                    CardLayout layout = (CardLayout) appContainerPanel.getLayout();
                    layout.next(appContainerPanel);
                    this.logoutButton.setVisible(true);
                    this.loginButton.setVisible(false);
                } else {
                    this.jLabel5.setVisible(true);
                    this.jLabel5.setText("");
                    this.jLabel5.setText("Invalid User Credentials !");
                }
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        SignUp signUpPanel = new SignUp(appContainerPanel, userSignUpObj, userDefaultDataObj, professorDataObj, studentDataObj);
        appContainerPanel.add("SignUp", signUpPanel);
        CardLayout layout = (CardLayout) appContainerPanel.getLayout();
        layout.next(appContainerPanel);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String userName = this.jTextField1.getText();
        String password = this.jPasswordField1.getText();

        if (validateCredentials(userName, password)) {
            UserModel validUserObj = this.userSignUpObj.getUserLi().stream()
                    .filter(userObj -> ((userObj.getUsername().equalsIgnoreCase(userName))
                    && (userObj.getPassword().equalsIgnoreCase(password))))
                    .findAny()
                    .orElse(null);

            if (validUserObj != null && validUserObj.getUserType().equalsIgnoreCase("admin")) {
                AdminDashboardPanel adminDash = new AdminDashboardPanel(
                        appContainerPanel, this.userSignUpObj, validUserObj,
                        this.userDefaultDataObj);
                appContainerPanel.add("AdminDashboard", adminDash);
                CardLayout layout = (CardLayout) appContainerPanel.getLayout();
                layout.next(appContainerPanel);
                this.logoutButton.setVisible(true);
                this.loginButton.setVisible(false);
            } else {
                this.jLabel5.setVisible(true);
                this.jLabel5.setText("");
                this.jLabel5.setText("Invalid User Credentials !");
            }
        }


    }//GEN-LAST:event_jButton4ActionPerformed

    private boolean validateCredentials(String userName, String password) {
        if (userName.trim().isEmpty()) {
            this.jLabel5.setVisible(true);
            this.jLabel5.setText("");
            this.jLabel5.setText("Please enter Username !");
            return false;
        }
        if (password.trim().isEmpty()) {
            this.jLabel5.setVisible(true);
            this.jLabel5.setText("");
            this.jLabel5.setText("Please enter Password !");
            return false;
        }
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
