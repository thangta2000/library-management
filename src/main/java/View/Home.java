/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.BookTitlesJpaController;
import View.BookTitle.Main;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JPanel;
import Controller.CategoriesJpaController;
import Controller.CountriesJpaController;
import Controller.PublishersJpaController;
import Model.Categories;
import Model.Countries;
import Model.Publishers;

/**
 *
 * @author Admin
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    List<JPanel> panes = new ArrayList<>();
    List<JPanel> indicators = new ArrayList<>();

    private ArrayList<Categories> categories;
    private ArrayList<Countries> countries;
    private ArrayList<Publishers> publishers;

    public Home() {
        initComponents();
        customizeFrame();

        panes.addAll(Arrays.asList(jPanel_Title, jPanel_Store, jPanel_Reader, jPanel_Borrow, jPanel_Report, jPanel_Users));
        indicators.addAll(Arrays.asList(ind_1, ind_2, ind_3, ind_4, ind_5, ind_6));

        setColor(jPanel_Title);
        ind_1.setOpaque(true);

        decolorUnselected(jPanel_Title, ind_1);

        setTitle("LIBRARY MANAGEMENT");
        categories = new ArrayList<>(CategoriesJpaController.findCategoriesEntities());
        countries = new ArrayList<>(CountriesJpaController.findCountriesEntities());
        publishers = new ArrayList<>(PublishersJpaController.findPublishersEntities());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        side_pane = new javax.swing.JPanel();
        jPanel_Title = new javax.swing.JPanel();
        ind_1 = new javax.swing.JPanel();
        jlbBookTitle = new javax.swing.JLabel();
        jPanel_Store = new javax.swing.JPanel();
        ind_3 = new javax.swing.JPanel();
        jlbBook = new javax.swing.JLabel();
        jPanel_Borrow = new javax.swing.JPanel();
        ind_4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel_Users = new javax.swing.JPanel();
        ind_5 = new javax.swing.JPanel();
        jLabel_Users = new javax.swing.JLabel();
        jPanel_Reader = new javax.swing.JPanel();
        ind_6 = new javax.swing.JPanel();
        jlbBook1 = new javax.swing.JLabel();
        jPanel_Report = new javax.swing.JPanel();
        ind_2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        mainView = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Library Management");
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);

        side_pane.setBackground(new java.awt.Color(23, 35, 51));
        side_pane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel_Title.setBackground(new java.awt.Color(23, 35, 51));
        jPanel_Title.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jPanel_TitleMouseClicked(evt);
            }
        });

        ind_1.setOpaque(false);
        ind_1.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_1Layout = new javax.swing.GroupLayout(ind_1);
        ind_1.setLayout(ind_1Layout);
        ind_1Layout.setHorizontalGroup(
            ind_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_1Layout.setVerticalGroup(
            ind_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jlbBookTitle.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jlbBookTitle.setForeground(new java.awt.Color(255, 255, 255));
        jlbBookTitle.setText("Tên sách");

        javax.swing.GroupLayout jPanel_TitleLayout = new javax.swing.GroupLayout(jPanel_Title);
        jPanel_Title.setLayout(jPanel_TitleLayout);
        jPanel_TitleLayout.setHorizontalGroup(
            jPanel_TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TitleLayout.createSequentialGroup()
                .addComponent(ind_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jlbBookTitle)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel_TitleLayout.setVerticalGroup(
            jPanel_TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TitleLayout.createSequentialGroup()
                .addComponent(ind_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel_TitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbBookTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        side_pane.add(jPanel_Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 180, -1));

        jPanel_Store.setBackground(new java.awt.Color(23, 35, 51));
        jPanel_Store.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jPanel_StoreMousePressed(evt);
            }
        });

        ind_3.setOpaque(false);
        ind_3.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_3Layout = new javax.swing.GroupLayout(ind_3);
        ind_3.setLayout(ind_3Layout);
        ind_3Layout.setHorizontalGroup(
            ind_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_3Layout.setVerticalGroup(
            ind_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jlbBook.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jlbBook.setForeground(new java.awt.Color(255, 255, 255));
        jlbBook.setText("Kho sách");

        javax.swing.GroupLayout jPanel_StoreLayout = new javax.swing.GroupLayout(jPanel_Store);
        jPanel_Store.setLayout(jPanel_StoreLayout);
        jPanel_StoreLayout.setHorizontalGroup(
            jPanel_StoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_StoreLayout.createSequentialGroup()
                .addComponent(ind_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jlbBook, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        jPanel_StoreLayout.setVerticalGroup(
            jPanel_StoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_StoreLayout.createSequentialGroup()
                .addComponent(ind_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_StoreLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        side_pane.add(jPanel_Store, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 180, -1));

        jPanel_Borrow.setBackground(new java.awt.Color(23, 35, 51));
        jPanel_Borrow.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jPanel_BorrowMousePressed(evt);
            }
        });

        ind_4.setOpaque(false);
        ind_4.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_4Layout = new javax.swing.GroupLayout(ind_4);
        ind_4.setLayout(ind_4Layout);
        ind_4Layout.setHorizontalGroup(
            ind_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_4Layout.setVerticalGroup(
            ind_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Mượn/Trả sách");

        javax.swing.GroupLayout jPanel_BorrowLayout = new javax.swing.GroupLayout(jPanel_Borrow);
        jPanel_Borrow.setLayout(jPanel_BorrowLayout);
        jPanel_BorrowLayout.setHorizontalGroup(
            jPanel_BorrowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_BorrowLayout.createSequentialGroup()
                .addComponent(ind_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel11)
                .addGap(0, 62, Short.MAX_VALUE))
        );
        jPanel_BorrowLayout.setVerticalGroup(
            jPanel_BorrowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_BorrowLayout.createSequentialGroup()
                .addGroup(jPanel_BorrowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ind_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        side_pane.add(jPanel_Borrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 180, 40));

        jPanel_Users.setBackground(new java.awt.Color(23, 35, 51));
        jPanel_Users.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jPanel_UsersMouseClicked(evt);
            }
        });

        ind_5.setOpaque(false);
        ind_5.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_5Layout = new javax.swing.GroupLayout(ind_5);
        ind_5.setLayout(ind_5Layout);
        ind_5Layout.setHorizontalGroup(
            ind_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_5Layout.setVerticalGroup(
            ind_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel_Users.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel_Users.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Users.setText("Tài khoản");

        javax.swing.GroupLayout jPanel_UsersLayout = new javax.swing.GroupLayout(jPanel_Users);
        jPanel_Users.setLayout(jPanel_UsersLayout);
        jPanel_UsersLayout.setHorizontalGroup(
            jPanel_UsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_UsersLayout.createSequentialGroup()
                .addComponent(ind_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel_Users)
                .addGap(0, 91, Short.MAX_VALUE))
        );
        jPanel_UsersLayout.setVerticalGroup(
            jPanel_UsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_UsersLayout.createSequentialGroup()
                .addComponent(ind_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel_UsersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Users, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        side_pane.add(jPanel_Users, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 180, -1));

        jPanel_Reader.setBackground(new java.awt.Color(23, 35, 51));
        jPanel_Reader.setPreferredSize(new java.awt.Dimension(180, 43));
        jPanel_Reader.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jPanel_ReaderMouseClicked(evt);
            }
        });

        ind_6.setOpaque(false);
        ind_6.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_6Layout = new javax.swing.GroupLayout(ind_6);
        ind_6.setLayout(ind_6Layout);
        ind_6Layout.setHorizontalGroup(
            ind_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_6Layout.setVerticalGroup(
            ind_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jlbBook1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jlbBook1.setForeground(new java.awt.Color(255, 255, 255));
        jlbBook1.setText("Độc giả");

        javax.swing.GroupLayout jPanel_ReaderLayout = new javax.swing.GroupLayout(jPanel_Reader);
        jPanel_Reader.setLayout(jPanel_ReaderLayout);
        jPanel_ReaderLayout.setHorizontalGroup(
            jPanel_ReaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ReaderLayout.createSequentialGroup()
                .addComponent(ind_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jlbBook1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel_ReaderLayout.setVerticalGroup(
            jPanel_ReaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ReaderLayout.createSequentialGroup()
                .addGroup(jPanel_ReaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ind_6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbBook1, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        side_pane.add(jPanel_Reader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 180, -1));

        jPanel_Report.setBackground(new java.awt.Color(23, 35, 51));
        jPanel_Report.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                jPanel_ReportMouseReleased(evt);
            }
        });

        ind_2.setOpaque(false);
        ind_2.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_2Layout = new javax.swing.GroupLayout(ind_2);
        ind_2.setLayout(ind_2Layout);
        ind_2Layout.setHorizontalGroup(
            ind_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_2Layout.setVerticalGroup(
            ind_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Thống kê");

        javax.swing.GroupLayout jPanel_ReportLayout = new javax.swing.GroupLayout(jPanel_Report);
        jPanel_Report.setLayout(jPanel_ReportLayout);
        jPanel_ReportLayout.setHorizontalGroup(
            jPanel_ReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ReportLayout.createSequentialGroup()
                .addComponent(ind_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel9)
                .addGap(0, 93, Short.MAX_VALUE))
        );
        jPanel_ReportLayout.setVerticalGroup(
            jPanel_ReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ReportLayout.createSequentialGroup()
                .addComponent(ind_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel_ReportLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        side_pane.add(jPanel_Report, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 180, -1));

        javax.swing.GroupLayout mainViewLayout = new javax.swing.GroupLayout(mainView);
        mainView.setLayout(mainViewLayout);
        mainViewLayout.setHorizontalGroup(
            mainViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1231, Short.MAX_VALUE)
        );
        mainViewLayout.setVerticalGroup(
            mainViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 492, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(side_pane, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(side_pane, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(mainView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel_StoreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_StoreMousePressed
        // TODO add your handling code here:
        setColor(jPanel_Store);
        ind_3.setOpaque(true);
        decolorUnselected(jPanel_Store, ind_3);

        // Đổ vào mainview
        mainView.removeAll();
        mainView.revalidate();
        mainView.repaint();
    }//GEN-LAST:event_jPanel_StoreMousePressed

    private void jPanel_BorrowMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_BorrowMousePressed
        // TODO add your handling code here:
        setColor(jPanel_Borrow);
        ind_4.setOpaque(true);
        decolorUnselected(jPanel_Borrow, ind_4);

        // Đổ vào mainview
        mainView.removeAll();
        mainView.revalidate();
        mainView.repaint();
    }//GEN-LAST:event_jPanel_BorrowMousePressed

    private void jPanel_ReportMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_ReportMouseReleased
        // TODO add your handling code here:
        setColor(jPanel_Report);
        ind_2.setOpaque(true);

        decolorUnselected(jPanel_Report, ind_2);

        // Đổ vào mainview
        mainView.removeAll();
        mainView.revalidate();
        mainView.repaint();
    }//GEN-LAST:event_jPanel_ReportMouseReleased

    private void jPanel_TitleMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jPanel_TitleMouseClicked
    {//GEN-HEADEREND:event_jPanel_TitleMouseClicked
        // TODO add your handling code here:
        setColor(jPanel_Title);
        ind_1.setOpaque(true);

        decolorUnselected(jPanel_Title, ind_1);

        // Đổ vào mainview
        mainView.removeAll();
        mainView.setLayout(new BorderLayout());
        mainView.add(new Main(categories, countries, publishers));
        mainView.validate();
    }//GEN-LAST:event_jPanel_TitleMouseClicked

    private void jPanel_UsersMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jPanel_UsersMouseClicked
    {//GEN-HEADEREND:event_jPanel_UsersMouseClicked
        // TODO add your handling code here:
        setColor(jPanel_Users);
        ind_5.setOpaque(true);

        decolorUnselected(jPanel_Users, ind_5);

        // Đổ vào mainview
        mainView.removeAll();
        mainView.setLayout(new BorderLayout());
        mainView.add(new UsersPanel());
        mainView.validate();
    }//GEN-LAST:event_jPanel_UsersMouseClicked

    private void jPanel_ReaderMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jPanel_ReaderMouseClicked
    {//GEN-HEADEREND:event_jPanel_ReaderMouseClicked
        // TODO add your handling code here:
        setColor(jPanel_Reader);
        ind_6.setOpaque(true);

        decolorUnselected(jPanel_Reader, ind_6);

        // Đổ vào mainview
        mainView.removeAll();
        mainView.setLayout(new BorderLayout());
        mainView.add(new ReaderPanel());
        mainView.validate();
    }//GEN-LAST:event_jPanel_ReaderMouseClicked

    int xx, xy;

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }

        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ind_1;
    private javax.swing.JPanel ind_2;
    private javax.swing.JPanel ind_3;
    private javax.swing.JPanel ind_4;
    private javax.swing.JPanel ind_5;
    private javax.swing.JPanel ind_6;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Users;
    private javax.swing.JPanel jPanel_Borrow;
    private javax.swing.JPanel jPanel_Reader;
    private javax.swing.JPanel jPanel_Report;
    private javax.swing.JPanel jPanel_Store;
    private javax.swing.JPanel jPanel_Title;
    private javax.swing.JPanel jPanel_Users;
    private javax.swing.JLabel jlbBook;
    private javax.swing.JLabel jlbBook1;
    private javax.swing.JLabel jlbBookTitle;
    private javax.swing.JPanel mainView;
    private javax.swing.JPanel side_pane;
    // End of variables declaration//GEN-END:variables

    private void setColor(JPanel pane) {
        pane.setBackground(new Color(41, 57, 80));
    }

    private void resetColor(List<JPanel> panes, List<JPanel> indicators) {
        panes.forEach((pane)
                -> {
            pane.setBackground(new Color(23, 35, 51));
        });

        indicators.forEach((indicator)
                -> {
            indicator.setOpaque(false);
        });
    }

    private void decolorUnselected(JPanel pane, JPanel indicator) {
        var subPanes = panes.stream().filter(obj -> obj != pane).collect(Collectors.toList());
        var subIndi = indicators.stream().filter(obj -> obj != indicator).collect(Collectors.toList());
        resetColor(subPanes, subIndi);
    }

    private void customizeFrame() {
        setLayout(new BorderLayout());
        add(side_pane, BorderLayout.LINE_START);
        add(mainView, BorderLayout.CENTER);
    }
}
