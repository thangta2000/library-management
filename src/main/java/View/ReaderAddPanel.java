/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.CountriesJpaController;
import Controller.ReadersJpaController;
import Model.Countries;
import Model.Readers;
import Utility.Validation.DateTimeVerifier;
import Utility.Validation.EmailVerifier;
import Utility.Validation.GroupVerifier;
import Utility.Validation.NumberVerifier;
import Utility.Validation.RequiredVerifier;
import Utility.Validation.StringLengthVerifier;
import Utility.Validation.StringMatchVerifier;
import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author admin
 */
public class ReaderAddPanel extends javax.swing.JPanel
{

    JLabel[] validateLabels;

    /**
     * Creates new form ReaderAddPanel
     */
    public ReaderAddPanel()
    {
        initComponents();

        customizePanel();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_IdCard = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField_Tel = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField_Address = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField_Email = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField_BirthDate = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel_IdCard = new javax.swing.JLabel();
        jLabel_Country = new javax.swing.JLabel();
        jLabel_BirthDate = new javax.swing.JLabel();
        jLabel_Address = new javax.swing.JLabel();
        jLabel_Email = new javax.swing.JLabel();
        jLabel_Tel = new javax.swing.JLabel();
        jRadioButton_Male = new javax.swing.JRadioButton();
        jRadioButton_Female = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jTextField_Name = new javax.swing.JTextField();
        jLabel_Name = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField_JobTitle = new javax.swing.JTextField();
        jLabel_JobTitle = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField_WorkPlace = new javax.swing.JTextField();
        jLabel_WorkPlace = new javax.swing.JLabel();
        jComboBox_Country = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButton_Add = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setName("Thêm"); // NOI18N
        setPreferredSize(new java.awt.Dimension(830, 580));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.PAGE_AXIS));

        jPanel3.setBackground(new java.awt.Color(102, 255, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel3.setPreferredSize(new java.awt.Dimension(830, 40));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Thêm mới");
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel3.add(jLabel1, gridBagConstraints);

        add(jPanel3);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(830, 480));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 432));

        jLabel2.setText("Ngày sinh:");

        jTextField_IdCard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField_IdCard.setName("idcard"); // NOI18N
        jTextField_IdCard.setPreferredSize(new java.awt.Dimension(250, 28));

        jLabel3.setText("Điện thoại:");
        jLabel3.setToolTipText("");

        jTextField_Tel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField_Tel.setName("tel"); // NOI18N
        jTextField_Tel.setPreferredSize(new java.awt.Dimension(250, 28));

        jLabel5.setText("Địa chỉ:");

        jLabel6.setText("Email:");

        jTextField_Address.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField_Address.setName("address"); // NOI18N
        jTextField_Address.setPreferredSize(new java.awt.Dimension(250, 28));

        jLabel7.setText("Quốc tịch:");

        jTextField_Email.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField_Email.setName("email"); // NOI18N
        jTextField_Email.setPreferredSize(new java.awt.Dimension(250, 28));

        jLabel8.setText("Giới tính:");
        jLabel8.setToolTipText("");

        jTextField_BirthDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField_BirthDate.setName("birthday"); // NOI18N
        jTextField_BirthDate.setPreferredSize(new java.awt.Dimension(250, 28));

        jLabel9.setText("CCCD/Hộ chiếu:");
        jLabel9.setToolTipText("");

        jLabel_IdCard.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_IdCard.setText("Nhập căn cước công dân/hộ chiếu");
        jLabel_IdCard.setName("idcard"); // NOI18N
        jLabel_IdCard.setPreferredSize(new java.awt.Dimension(250, 28));

        jLabel_Country.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Country.setText("Chọn quốc tịch.");
        jLabel_Country.setName("country"); // NOI18N
        jLabel_Country.setPreferredSize(new java.awt.Dimension(250, 28));

        jLabel_BirthDate.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_BirthDate.setText("Nhập ngày sinh.");
        jLabel_BirthDate.setName("birthday"); // NOI18N
        jLabel_BirthDate.setPreferredSize(new java.awt.Dimension(250, 28));

        jLabel_Address.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Address.setText("Nhập địa chỉ.");
        jLabel_Address.setName("address"); // NOI18N
        jLabel_Address.setPreferredSize(new java.awt.Dimension(250, 28));

        jLabel_Email.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Email.setText("Nhập email.");
        jLabel_Email.setName("email"); // NOI18N
        jLabel_Email.setPreferredSize(new java.awt.Dimension(250, 28));

        jLabel_Tel.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Tel.setText("Nhập điện thoại.");
        jLabel_Tel.setName("tel"); // NOI18N
        jLabel_Tel.setPreferredSize(new java.awt.Dimension(250, 28));

        jRadioButton_Male.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton_Male.setSelected(true);
        jRadioButton_Male.setText("Nam");
        jRadioButton_Male.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jRadioButton_Female.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton_Female.setText("Nữ");
        jRadioButton_Female.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel10.setText("Họ và tên:");

        jTextField_Name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField_Name.setName("name"); // NOI18N
        jTextField_Name.setPreferredSize(new java.awt.Dimension(250, 28));

        jLabel_Name.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Name.setText("Chọn quốc tịch.");
        jLabel_Name.setName("name"); // NOI18N
        jLabel_Name.setPreferredSize(new java.awt.Dimension(250, 28));

        jLabel11.setText("Nghề nghiệp:");

        jTextField_JobTitle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField_JobTitle.setName("job"); // NOI18N
        jTextField_JobTitle.setPreferredSize(new java.awt.Dimension(250, 28));

        jLabel_JobTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_JobTitle.setText("Nhập nghề nghiệp.");
        jLabel_JobTitle.setName("job"); // NOI18N
        jLabel_JobTitle.setPreferredSize(new java.awt.Dimension(250, 28));

        jLabel12.setText("Nơi làm việc:");

        jTextField_WorkPlace.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField_WorkPlace.setName("office"); // NOI18N
        jTextField_WorkPlace.setPreferredSize(new java.awt.Dimension(250, 28));

        jLabel_WorkPlace.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_WorkPlace.setText("Nhập nơi làm việc.");
        jLabel_WorkPlace.setName("office"); // NOI18N
        jLabel_WorkPlace.setPreferredSize(new java.awt.Dimension(250, 28));

        jComboBox_Country.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox_Country.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel_JobTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel11))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_Tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_Tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_JobTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField_Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel_Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel_Country, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel_BirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField_BirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jComboBox_Country, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_IdCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_IdCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jRadioButton_Male)
                                        .addGap(29, 29, 29)
                                        .addComponent(jRadioButton_Female))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel12))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_WorkPlace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_WorkPlace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(11, 11, 11))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jTextField_IdCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_IdCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jComboBox_Country, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_Country, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jRadioButton_Male)
                        .addComponent(jRadioButton_Female))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_BirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(4, 4, 4)
                        .addComponent(jLabel_BirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_JobTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jTextField_WorkPlace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_JobTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_WorkPlace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel1.add(jPanel2, gridBagConstraints);

        add(jPanel1);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setPreferredSize(new java.awt.Dimension(830, 60));
        jPanel6.setLayout(new java.awt.GridBagLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel4.setPreferredSize(new java.awt.Dimension(350, 35));
        jPanel4.setLayout(new java.awt.GridBagLayout());

        jButton_Add.setBackground(new java.awt.Color(51, 255, 51));
        jButton_Add.setText("Thêm");
        jButton_Add.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton_Add.setContentAreaFilled(false);
        jButton_Add.setOpaque(true);
        jButton_Add.setPreferredSize(new java.awt.Dimension(90, 30));
        jButton_Add.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton_AddActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 58;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.insets = new java.awt.Insets(1, 0, 4, 0);
        jPanel4.add(jButton_Add, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        jPanel6.add(jPanel4, gridBagConstraints);

        add(jPanel6);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_AddActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton_AddActionPerformed
    {//GEN-HEADEREND:event_jButton_AddActionPerformed
        // TODO add your handling code here:
        boolean validateForm = true;

        for (JLabel label : validateLabels)
        {
            if (label.getForeground() != Color.WHITE)
            {
                validateForm = false;
                break;
            }
        }
        
        if (validateForm)
        {
            Readers reader = new Readers();

            // Insert staff
            reader.setFullName(jTextField_Name.getText());

            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            try
            {
                reader.setBirthDay(formatter.parse(jTextField_BirthDate.getText()));
            }
            catch (ParseException ex)
            {
                Logger.getLogger(ReaderAddPanel.class.getName()).log(Level.SEVERE, null, ex);
            }

            reader.setPhone(jTextField_Tel.getText());
            reader.setAddress(jTextField_Address.getText());
            reader.setEmail(jTextField_Email.getText());
            reader.setIdentityCard(jTextField_IdCard.getText());
            reader.setGender(jRadioButton_Male.isSelected());
            reader.setCountryId(CountriesJpaController.findCountries(jComboBox_Country.getSelectedIndex() + 1));
            reader.setJobTitle(jTextField_JobTitle.getText());
            reader.setWorkPlace(jTextField_WorkPlace.getText());

            ReadersJpaController.create(reader);

            JOptionPane.showMessageDialog(null, "Thêm bạn đọc thành công!", "Thông báo", JOptionPane.OK_OPTION);

            // refresh
            this.getParent().remove(this);
            this.getParent().add(this);
            this.getParent().validate();
            this.getParent().repaint();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Vui lòng điền đầy đủ thông tin!", "Thông báo", JOptionPane.OK_OPTION);
        }
    }//GEN-LAST:event_jButton_AddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Add;
    private javax.swing.JComboBox<String> jComboBox_Country;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Address;
    private javax.swing.JLabel jLabel_BirthDate;
    private javax.swing.JLabel jLabel_Country;
    private javax.swing.JLabel jLabel_Email;
    private javax.swing.JLabel jLabel_IdCard;
    private javax.swing.JLabel jLabel_JobTitle;
    private javax.swing.JLabel jLabel_Name;
    private javax.swing.JLabel jLabel_Tel;
    private javax.swing.JLabel jLabel_WorkPlace;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jRadioButton_Female;
    private javax.swing.JRadioButton jRadioButton_Male;
    private javax.swing.JTextField jTextField_Address;
    private javax.swing.JTextField jTextField_BirthDate;
    private javax.swing.JTextField jTextField_Email;
    private javax.swing.JTextField jTextField_IdCard;
    private javax.swing.JTextField jTextField_JobTitle;
    private javax.swing.JTextField jTextField_Name;
    private javax.swing.JTextField jTextField_Tel;
    private javax.swing.JTextField jTextField_WorkPlace;
    // End of variables declaration//GEN-END:variables

    private void customizePanel()
    {
        // populate combobox
        var countries = CountriesJpaController.findCountriesEntities();
        for (Countries country : countries)
        {
            jComboBox_Country.addItem(country.getName());
        }
        
        // set inputverifier
        jTextField_Address.setInputVerifier(new RequiredVerifier());
        jTextField_BirthDate.setInputVerifier(new GroupVerifier(new RequiredVerifier(), new DateTimeVerifier()));
        jTextField_Email.setInputVerifier(new GroupVerifier(new RequiredVerifier(), new EmailVerifier()));
        jTextField_IdCard.setInputVerifier(new GroupVerifier(new RequiredVerifier(), new NumberVerifier(), new StringLengthVerifier(-1, 12)));
        jTextField_JobTitle.setInputVerifier(new RequiredVerifier());
        jTextField_Name.setInputVerifier(new RequiredVerifier());
        jTextField_Tel.setInputVerifier(new GroupVerifier(new RequiredVerifier(), new NumberVerifier()));
        jTextField_WorkPlace.setInputVerifier(new RequiredVerifier());

        validateLabels = new JLabel[]
        {
            jLabel_Address, jLabel_BirthDate, jLabel_Email, jLabel_IdCard, jLabel_JobTitle, jLabel_Name, jLabel_Tel, jLabel_WorkPlace
        };

        JComponent[] components =
        {
            jTextField_Address,
            jTextField_BirthDate,
            jTextField_Email,
            jTextField_IdCard,
            jTextField_JobTitle,
            jTextField_Name,
            jTextField_Tel,
            jTextField_WorkPlace
        };

        // add listener to validate while typing
        for (JComponent component : components)
        {
            createListener(component);
        }
    }

    private void createListener(JComponent component)
    {
        // While typing
        ((JTextField) component).getDocument().addDocumentListener(new DocumentListener()
        {
            @Override
            public void insertUpdate(DocumentEvent e)
            {
                displayValidationResult(component);
            }

            @Override
            public void removeUpdate(DocumentEvent e)
            {
                displayValidationResult(component);
            }

            @Override
            public void changedUpdate(DocumentEvent e)
            {
            }

        });

        // Lose focus
        ((JTextField) component).addFocusListener(new FocusAdapter()
        {
            @Override
            public void focusLost(FocusEvent e)
            {
                displayValidationResult(component);
            }

        });
    }

    private void displayValidationResult(JComponent jcomponent)
    {
        boolean valid = jcomponent.getInputVerifier().verify(jcomponent);
        
        for (JLabel label : validateLabels)
        {
            if (label.getName() == jcomponent.getName())
            {
                if (valid)
                {
                    label.setText(jcomponent.getToolTipText());
                    label.setForeground(Color.white);
                }
                else
                {
                    label.setText(jcomponent.getToolTipText());
                    label.setForeground(new Color(229, 30, 37));
                }
            }
        }
    }

}
