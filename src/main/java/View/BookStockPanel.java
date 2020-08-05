/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.BooksJpaController;
import Model.Books;
import Utility.CustomTableModel;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class BookStockPanel extends javax.swing.JPanel
{

    /**
     * Creates new form BookStore
     */
    ArrayList<Books> bookList = new ArrayList<>();

    public BookStockPanel()
    {
        initComponents();

        customizePalette();

        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanelTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanelTop = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bookTitleName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnAdd = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setName("Kho sách"); // NOI18N

        jPanelTable.setBackground(new java.awt.Color(255, 255, 255));
        jPanelTable.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jTable1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "No.", "Tên sách", "Mã sách", "Tác giả", "Ngày nhập", "Trạng thái"
            }
        )
        {
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        jTable1.setFillsViewportHeight(true);
        jTable1.setGridColor(new java.awt.Color(33, 115, 247));
        jTable1.setRowHeight(28);
        jTable1.setShowGrid(true);
        jTable1.setShowVerticalLines(false);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanelTableLayout = new javax.swing.GroupLayout(jPanelTable);
        jPanelTable.setLayout(jPanelTableLayout);
        jPanelTableLayout.setHorizontalGroup(
            jPanelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanelTableLayout.setVerticalGroup(
            jPanelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelTop.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Tên đầu sách");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        bookTitleName.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                bookTitleNameActionPerformed(evt);
            }
        });

        jLabel2.setText("Tên tác giả");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jComboBox1ActionPerformed(evt);
            }
        });

        btnAdd.setText("Thêm mới");
        btnAdd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnAdd.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelTopLayout = new javax.swing.GroupLayout(jPanelTop);
        jPanelTop.setLayout(jPanelTopLayout);
        jPanelTopLayout.setHorizontalGroup(
            jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bookTitleName, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelTopLayout.setVerticalGroup(
            jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTopLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(bookTitleName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelTable, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bookTitleNameActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_bookTitleNameActionPerformed
    {//GEN-HEADEREND:event_bookTitleNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookTitleNameActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAddActionPerformed
    {//GEN-HEADEREND:event_btnAddActionPerformed
        //        BookTitleCreate bookTitleCreate = new BookTitleCreate();
        //        bookTitleCreate.setVisible(true);
    }//GEN-LAST:event_btnAddActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jComboBox1ActionPerformed
    {//GEN-HEADEREND:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bookTitleName;
    private javax.swing.JButton btnAdd;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanelTable;
    private javax.swing.JPanel jPanelTop;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void customizePalette()
    {
        btnAdd.setBorderPainted(true);
        btnAdd.setFocusPainted(false);  
        btnAdd.setContentAreaFilled(false);

        jTable1.getTableHeader().setOpaque(false);
    }

    private void populateTable()
    {
        bookList = new ArrayList<>(BooksJpaController.findBooksEntities());
        String[] columnName =
        {
            "No.", "Tên sách", "Mã sách", "Tác giả", "Ngày nhập", "Trạng thái"
        };

        // Create model booktitles by creating anonymous nest class of CustomTableModel<T>
        CustomTableModel<Books> model = new CustomTableModel<Books>(bookList, columnName)
        {
            @Override
            public Object getValueAt(int rowIndex, int columnIndex)
            {
                Object temp = null;
                Books book = getDataObject(rowIndex);
                switch (columnIndex)
                {
                    case 0:
                        return temp = rowIndex + 1;
                    case 1:
                        return temp = book.getBookTitleId().getTitle();
                    case 2:
                        return temp = book.getCode();                        
                    case 3:
                        var list = book.getBookTitleId().getBooksByAuthorsList();
                        
                        List<String> strings = new ArrayList<>();
                        
                        list.forEach((authorBook) ->
                        {
                            strings.add(authorBook.getAuthorId().getFullName());
                        });
                        
                        return temp = String.join(", ", strings);
                    case 4:
                        return temp = book.getCreatedDate();
                    case 5:
                        if (book.getStatus() == 0)
                        {
                            return temp = "Không có sẵn";
                        }
                        else
                        {
                            return temp = "OK";
                        }
                    default:
                        throw new ArrayIndexOutOfBoundsException(columnIndex);
                }
            }

        };

        jTable1.setModel(model);

        jScrollPane1.getViewport().add(jTable1);
        jPanelTable.setLayout(new BorderLayout());
        jPanelTable.add(jScrollPane1);
        jPanelTable.validate();

        jPanelTable.setVisible(true);
    }

}
