package ManagementAssistant;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import groupproject.DBOperations;
import java.awt.Button;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Yasara JLP
 */
public class Form extends javax.swing.JFrame {

    ManagementAssistant_Main parent;
    DefaultTableModel table;
    private int xMouse, yMouse;
    String applicationID;

    public Form(ManagementAssistant_Main parent,String applicationID) {
        initComponents();
        this.parent = parent;
        this.applicationID = applicationID;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        buttonGroup10 = new javax.swing.ButtonGroup();
        buttonGroup11 = new javax.swing.ButtonGroup();
        buttonGroup12 = new javax.swing.ButtonGroup();
        panMain = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblExit = new javax.swing.JLabel();
        lblMinimize = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtRate = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        txtApp = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        rbtnRateYes = new javax.swing.JRadioButton();
        rbtnReteNo = new javax.swing.JRadioButton();
        jLabel33 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        rbtOwnerYes = new javax.swing.JRadioButton();
        rbtnOwnerNo = new javax.swing.JRadioButton();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        rbtnOwnerDocYes = new javax.swing.JRadioButton();
        rbtnOwnerDocNo = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        rbtPlanCopyYes = new javax.swing.JRadioButton();
        rbtPlanCopyNo = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        rbtSurYes = new javax.swing.JRadioButton();
        rbtSurNo = new javax.swing.JRadioButton();
        rbtCorrectYes = new javax.swing.JRadioButton();
        rbtCorrectNo = new javax.swing.JRadioButton();
        rbtMatchedYes = new javax.swing.JRadioButton();
        rbtMatchedNo = new javax.swing.JRadioButton();
        btnSubmit = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        panMain.setBackground(new java.awt.Color(255, 255, 255));
        panMain.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(49, 58, 115), 2));
        panMain.setPreferredSize(new java.awt.Dimension(640, 372));
        panMain.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panMainMouseDragged(evt);
            }
        });
        panMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panMainMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                panMainMouseReleased(evt);
            }
        });
        panMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(49, 58, 115));

        jLabel1.setBackground(new java.awt.Color(49, 58, 115));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Confirmation Form");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        panMain.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 23, 440, -1));

        lblExit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblExit.setForeground(new java.awt.Color(255, 0, 0));
        lblExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblExit.setText("X");
        lblExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitMouseClicked(evt);
            }
        });
        panMain.add(lblExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 20, 20));

        lblMinimize.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblMinimize.setForeground(new java.awt.Color(54, 33, 89));
        lblMinimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMinimize.setText("-");
        lblMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizeMouseClicked(evt);
            }
        });
        panMain.add(lblMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 20, 20));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(txtRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 200, -1));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel29.setText("Application ID");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 182, 20));

        jLabel46.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setText(":");
        jPanel1.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 14, -1));
        jPanel1.add(txtApp, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 200, -1));

        jLabel52.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel52.setText("If There Any Rate Tax Arrears");
        jPanel1.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 190, 20));

        jLabel53.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setText(":");
        jPanel1.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 14, 20));

        rbtnRateYes.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rbtnRateYes);
        rbtnRateYes.setText("Yes");
        jPanel1.add(rbtnRateYes, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, -1, -1));

        rbtnReteNo.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rbtnReteNo);
        rbtnReteNo.setSelected(true);
        rbtnReteNo.setText("No");
        jPanel1.add(rbtnReteNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, -1, -1));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel33.setText("If Not How Much Need To Pay(Rs.)");
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 200, 20));

        jLabel49.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText(":");
        jPanel1.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 14, -1));

        jLabel54.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel54.setText("Owner Approvel");
        jPanel1.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 190, 20));

        jLabel55.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setText(":");
        jPanel1.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 14, 20));

        rbtOwnerYes.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(rbtOwnerYes);
        rbtOwnerYes.setSelected(true);
        rbtOwnerYes.setText("Yes");
        jPanel1.add(rbtOwnerYes, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, -1, -1));

        rbtnOwnerNo.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(rbtnOwnerNo);
        rbtnOwnerNo.setText("No");
        jPanel1.add(rbtnOwnerNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, -1, -1));

        jLabel56.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel56.setText("Owner Documented");
        jPanel1.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 190, 20));

        jLabel57.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel57.setText(":");
        jPanel1.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 14, 20));

        rbtnOwnerDocYes.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup3.add(rbtnOwnerDocYes);
        rbtnOwnerDocYes.setSelected(true);
        rbtnOwnerDocYes.setText("Yes");
        jPanel1.add(rbtnOwnerDocYes, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, -1, -1));

        rbtnOwnerDocNo.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup3.add(rbtnOwnerDocNo);
        rbtnOwnerDocNo.setText("No");
        jPanel1.add(rbtnOwnerDocNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(49, 58, 115));
        jLabel3.setText("1.The Report Of Rate Section");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 210, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 360, 10));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(49, 58, 115));
        jLabel9.setText("2.The Report Of Planning Section");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 240, -1));

        jLabel10.setText("1.) Building Plan Copies Attached ?   ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        rbtPlanCopyYes.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup4.add(rbtPlanCopyYes);
        rbtPlanCopyYes.setSelected(true);
        rbtPlanCopyYes.setText("Yes");
        jPanel1.add(rbtPlanCopyYes, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, -1, -1));

        rbtPlanCopyNo.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup4.add(rbtPlanCopyNo);
        rbtPlanCopyNo.setText("No");
        jPanel1.add(rbtPlanCopyNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, -1, -1));

        jLabel12.setText("2.) Approved Surveyor Plan Attached ?");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText(":");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 20, 30));

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText(":");
        jPanel1.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 20, -1));

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText(":");
        jPanel1.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 20, 30));

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText(":");
        jPanel1.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 20, 30));

        jLabel13.setText("3.) Application Correctly Filled ?");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jLabel14.setText("4.) Assessment Details Matched ? ");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        rbtSurYes.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup5.add(rbtSurYes);
        rbtSurYes.setSelected(true);
        rbtSurYes.setText("Yes");
        jPanel1.add(rbtSurYes, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, -1, -1));

        rbtSurNo.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup5.add(rbtSurNo);
        rbtSurNo.setText("No");
        jPanel1.add(rbtSurNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, -1, -1));

        rbtCorrectYes.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup6.add(rbtCorrectYes);
        rbtCorrectYes.setSelected(true);
        rbtCorrectYes.setText("Yes");
        jPanel1.add(rbtCorrectYes, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, -1, -1));

        rbtCorrectNo.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup6.add(rbtCorrectNo);
        rbtCorrectNo.setText("No");
        jPanel1.add(rbtCorrectNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, -1, -1));

        rbtMatchedYes.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup7.add(rbtMatchedYes);
        rbtMatchedYes.setSelected(true);
        rbtMatchedYes.setText("Yes");
        jPanel1.add(rbtMatchedYes, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, -1, -1));

        rbtMatchedNo.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup7.add(rbtMatchedNo);
        rbtMatchedNo.setText("No");
        jPanel1.add(rbtMatchedNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, -1, -1));

        btnSubmit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSubmit.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnSubmit.setLabel("Submit");
        btnSubmit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSubmitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSubmitMouseExited(evt);
            }
        });
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        jPanel1.add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, 78, -1));

        panMain.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 55, 440, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panMain, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panMain, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked

        int dialogResult = JOptionPane.showConfirmDialog(this, "Would You Like to Cancel...?", "Warning", JOptionPane.YES_NO_OPTION, 0, new ImageIcon(getClass().getResource("Images/message_confirm.png")));
        if (dialogResult == JOptionPane.YES_OPTION) {
            this.dispose();
            parent.setState(0);
        }

    }//GEN-LAST:event_lblExitMouseClicked

    private void lblMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseClicked
        this.setState(1);
    }//GEN-LAST:event_lblMinimizeMouseClicked

    private void panMainMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panMainMousePressed
        setOpacity((float) 0.8);
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_panMainMousePressed

    private void panMainMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panMainMouseDragged
        int x = evt.getXOnScreen(), y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_panMainMouseDragged

    private void panMainMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panMainMouseReleased
        setOpacity((float) 1);
    }//GEN-LAST:event_panMainMouseReleased

    private void btnSubmitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubmitMouseEntered
        setButtonColour(btnSubmit);
    }//GEN-LAST:event_btnSubmitMouseEntered

    private void btnSubmitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubmitMouseExited
        resetButtonColour(btnSubmit);
    }//GEN-LAST:event_btnSubmitMouseExited

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        if (rbtnReteNo.isSelected() && rbtOwnerYes.isSelected() && rbtnOwnerDocYes.isSelected() && rbtPlanCopyYes.isSelected() && rbtSurYes.isSelected() && rbtCorrectYes.isSelected() && rbtMatchedYes.isSelected()) {
            if (new DBOperations().updateApplicationStatus(applicationID, "Technical Officer")) {
                JOptionPane.showMessageDialog(this, "Application Pass Successfull...!", "Pass Succeed", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("Images/message_success.png")));
            } else {
                JOptionPane.showMessageDialog(this, "Failed..!", "Error", JOptionPane.ERROR_MESSAGE, new ImageIcon(getClass().getResource("Images/message_error.png")));
            }
        } else {
            JOptionPane.showMessageDialog(this, "Failed ..!", "Error", JOptionPane.ERROR_MESSAGE, new ImageIcon(getClass().getResource("Images/message_error.png")));
        }
        this.dispose();
        parent.loadTable();
        parent.setState(0);
    }//GEN-LAST:event_btnSubmitActionPerformed

   
    /**
     * @param args the command line arguments
     */
    private void setButtonColour(Button button) {
        button.setBackground(new Color(0, 153, 0));
        button.setForeground(new Color(255, 255, 255));

    }

    private void resetButtonColour(Button button) {
        button.setBackground(new Color(240, 240, 240));
        button.setForeground(new Color(0, 0, 0));

    }

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
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(
                            UIManager.getSystemLookAndFeelClassName());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                new Form(null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnSubmit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup10;
    private javax.swing.ButtonGroup buttonGroup11;
    private javax.swing.ButtonGroup buttonGroup12;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblMinimize;
    private javax.swing.JPanel panMain;
    private javax.swing.JRadioButton rbtCorrectNo;
    private javax.swing.JRadioButton rbtCorrectYes;
    private javax.swing.JRadioButton rbtMatchedNo;
    private javax.swing.JRadioButton rbtMatchedYes;
    private javax.swing.JRadioButton rbtOwnerYes;
    private javax.swing.JRadioButton rbtPlanCopyNo;
    private javax.swing.JRadioButton rbtPlanCopyYes;
    private javax.swing.JRadioButton rbtSurNo;
    private javax.swing.JRadioButton rbtSurYes;
    private javax.swing.JRadioButton rbtnOwnerDocNo;
    private javax.swing.JRadioButton rbtnOwnerDocYes;
    private javax.swing.JRadioButton rbtnOwnerNo;
    private javax.swing.JRadioButton rbtnRateYes;
    private javax.swing.JRadioButton rbtnReteNo;
    private javax.swing.JTextField txtApp;
    private javax.swing.JTextField txtRate;
    // End of variables declaration//GEN-END:variables

}
