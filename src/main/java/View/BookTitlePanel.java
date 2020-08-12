/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author tkang_85a
 */
import Controller.BookTitlesJpaController;
import Controller.exceptions.NonexistentEntityException;
import Model.*;
import Utility.CustomTableModel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;

public class BookTitlePanel extends javax.swing.JPanel
{

    /**
     * Creates new form BookTitlePanel
     */
    private List<BookTitles> bookTitleList;
    private int newHeight = 0;
    private int newWidth = 0;

    private ArrayList<BookTitles> bookTitles;
    private ArrayList<Categories> categories;
    private ArrayList<Countries> countries;
    private ArrayList<Publishers> publishers;
    private BookTitlePanel main;

    public BookTitlePanel(int width, int height)
    {
        initComponents();

        newHeight = height;
        newWidth = width;

        customizePalette();

        populateTable();
    }

    public BookTitlePanel()
    {
        initComponents();

        customizePalette();

        populateTable();
    }

    public BookTitlePanel(ArrayList<Categories> categories)
    {
        initComponents();

        customizePalette();

        populateTable();
        this.categories = categories;
        this.main = this;
    }

    public BookTitlePanel(int width, int height, ArrayList<Categories> categories, ArrayList<Countries> countries, ArrayList<Publishers> publishers)
    {
        initComponents();

        newHeight = height;
        newWidth = width;
        
        customizePalette();

        populateTable();
        this.categories = categories;
        this.countries = countries;
        this.publishers = publishers;

    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanelTop = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bookTitleName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jPanelTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel_Page = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        setName("Danh mục sách"); // NOI18N
        setPreferredSize(new java.awt.Dimension(900, 550));

        jPanelTop.setBackground(new java.awt.Color(255, 255, 255));
        jPanelTop.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanelTop.setPreferredSize(new java.awt.Dimension(667, 50));

        jLabel1.setText("Nhập tên:");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        bookTitleName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bookTitleName.setPreferredSize(new java.awt.Dimension(200, 28));
        bookTitleName.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                bookTitleNameActionPerformed(evt);
            }
        });

        jLabel2.setText("Lĩnh vực:");

        jComboBox1.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jComboBox1.setPreferredSize(new java.awt.Dimension(150, 26));
        jComboBox1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jComboBox1ActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(0, 255, 51));
        btnAdd.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(56, 138, 52));
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_plus_math_16px.png"))); // NOI18N
        btnAdd.setText("Thêm");
        btnAdd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(56, 138, 52)));
        btnAdd.setContentAreaFilled(false);
        btnAdd.setIconTextGap(10);
        btnAdd.setPreferredSize(new java.awt.Dimension(90, 30));
        btnAdd.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAddActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(0, 188, 253));
        btnEdit.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(0, 83, 156));
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_eraser_16px.png"))); // NOI18N
        btnEdit.setText("Sửa");
        btnEdit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 83, 156)));
        btnEdit.setContentAreaFilled(false);
        btnEdit.setIconTextGap(10);
        btnEdit.setPreferredSize(new java.awt.Dimension(90, 28));
        btnEdit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(255, 123, 255));
        btnDelete.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(161, 38, 13));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_trash_can_16px_1.png"))); // NOI18N
        btnDelete.setText("Xóa");
        btnDelete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(161, 38, 13)));
        btnDelete.setContentAreaFilled(false);
        btnDelete.setIconTextGap(10);
        btnDelete.setPreferredSize(new java.awt.Dimension(90, 28));
        btnDelete.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelTopLayout = new javax.swing.GroupLayout(jPanelTop);
        jPanelTop.setLayout(jPanelTopLayout);
        jPanelTopLayout.setHorizontalGroup(
            jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTopLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(bookTitleName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelTopLayout.setVerticalGroup(
            jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTopLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(bookTitleName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13))
        );

        jPanelTable.setBackground(new java.awt.Color(255, 255, 255));
        jPanelTable.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane1.setViewportBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jTable1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTable1.setFont(new java.awt.Font("sansserif", 0, 11)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "No.", "Title", "Pages", "Publish Year"
            }
        )
        {
            boolean[] canEdit = new boolean []
            {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        jTable1.setFillsViewportHeight(true);
        jTable1.setGridColor(new java.awt.Color(204, 204, 255));
        jTable1.setRowHeight(28);
        jTable1.setShowGrid(true);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanelTableLayout = new javax.swing.GroupLayout(jPanelTable);
        jPanelTable.setLayout(jPanelTableLayout);
        jPanelTableLayout.setHorizontalGroup(
            jPanelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTableLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1)
                .addGap(0, 0, 0))
        );
        jPanelTableLayout.setVerticalGroup(
            jPanelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTableLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel_Page.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_Page.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel_Page.setPreferredSize(new java.awt.Dimension(900, 40));

        javax.swing.GroupLayout jPanel_PageLayout = new javax.swing.GroupLayout(jPanel_Page);
        jPanel_Page.setLayout(jPanel_PageLayout);
        jPanel_PageLayout.setHorizontalGroup(
            jPanel_PageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel_PageLayout.setVerticalGroup(
            jPanel_PageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTop, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
            .addComponent(jPanelTable, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel_Page, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jPanelTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel_Page, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void bookTitleNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookTitleNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookTitleNameActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        BookTitleCreatePanel bookTitleCreate = new BookTitleCreatePanel(categories, countries, publishers, this);
        bookTitleCreate.setVisible(true);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnEditActionPerformed
    {//GEN-HEADEREND:event_btnEditActionPerformed
        // TODO add your handling code here:        
        int id = (int) jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 10);
        BookTitleEditPanel bookTitleCreate = new BookTitleEditPanel(categories, countries, publishers, this, id);
        bookTitleCreate.setVisible(true);
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnDeleteActionPerformed
    {//GEN-HEADEREND:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int id = (int) jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 10);
        
        try
        {
            BookTitlesJpaController.destroy(id);
            
            populateTable();
            
            JOptionPane.showMessageDialog(null, "Xóa thông tin thành công", "Thông báo", JOptionPane.OK_OPTION);
        }
        catch (NonexistentEntityException ex)
        {
            Logger.getLogger(BookTitlePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bookTitleName;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanelTable;
    private javax.swing.JPanel jPanelTop;
    private javax.swing.JPanel jPanel_Page;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void customizePalette()
    {
        btnAdd.setBorderPainted(true);
        btnAdd.setFocusPainted(false);
        btnAdd.setContentAreaFilled(false);

        // Design table header
        JTableHeader header = jTable1.getTableHeader();
        header.setOpaque(false);
        header.setBackground(new Color(135, 178, 253));
        header.setForeground(Color.white);

        header.setPreferredSize(new Dimension(454, 34));
        header.setFont(new Font("sansserif", Font.PLAIN, 12));
    }

    public void populateTable()
    {
        bookTitleList = new ArrayList<>(BookTitlesJpaController.findBookTitlesEntities());
        var maxRow = (newHeight - this.getPreferredSize().height + jScrollPane1.getViewport().getPreferredSize().height) / 28;

        String[] columnName =
        {
            "#", "Tên sách", "Tác giả", "Lĩnh vực", "Nhà xuất bản", "Nơi xuất bản", "Số trang", "Năm xuất bản", "Khổ", "ISBN", "Id"
        };

        // Create model booktitles by creating anonymous nest class of CustomTableModel<T>
        CustomTableModel<BookTitles> model = new CustomTableModel<BookTitles>(bookTitleList.size() <= maxRow
                ? bookTitleList : bookTitleList.subList(0, maxRow - 1), columnName)
        {
            @Override
            public Object getValueAt(int rowIndex, int columnIndex)
            {
                Object temp = null;
                BookTitles bookTitle = getDataObject(rowIndex);
                switch (columnIndex)
                {
                    case 0:
                        return temp = rowIndex + 1;
                    case 1:
                        return temp = bookTitle.getTitle();
                    case 2:
                        var list = bookTitle.getBooksByAuthorsList();

                        List<String> strings = new ArrayList<>();

                        list.forEach((authorBook) ->
                        {
                            strings.add(authorBook.getAuthorId().getFullName());
                        });

                        return temp = String.join(", ", strings);
                    case 3:
                        return temp = bookTitle.getCategoryId().getName();
                    case 4:
                        return temp = bookTitle.getPublisherId().getName();
                    case 5:
                        return temp = bookTitle.getCountryId().getName();
                    case 6:
                        return temp = bookTitle.getPages();
                    case 7:
                        return temp = bookTitle.getPublishYear();
                    case 8:
                        return temp = bookTitle.getWidth() + " cm";
                    case 9:
                        return temp = bookTitle.getIbsn();
                    case 10:
                        return temp = bookTitle.getId();
                    default:
                        throw new ArrayIndexOutOfBoundsException(columnIndex);
                }
            }

        };

        jTable1.setModel(model);

        jScrollPane1.getViewport().add(jTable1);
        customizeColumn();
        jPanelTable.setLayout(new BorderLayout());
        jPanelTable.add(jScrollPane1);
        jPanelTable.validate();

        jPanelTable.setVisible(true);
    }

    private void customizeColumn()
    {
        int remainWidth = newWidth - 30 - 60 - 90 - 100 - 70 - 90 - 60 - 120 - 0;
        int autoSize = Math.round(remainWidth * 0.6f);

        int[] columnWidth =
        {
            30, autoSize, remainWidth - autoSize, 60, 90, 100, 70, 90, 60, 120, 0
        };

        //Design table column
        TableColumnModel columnModel = jTable1.getColumnModel();
        for (int i = 0; i < columnWidth.length; i++)
        {
            var column = columnModel.getColumn(i);
            column.setMinWidth(columnWidth[i]);
            column.setMaxWidth(columnWidth[i]);
            column.setPreferredWidth(columnWidth[i]);
        }

    }

}
