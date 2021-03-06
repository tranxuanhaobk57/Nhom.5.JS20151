/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Khoa;

import Check.Check;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tran Xuan Hao
 */
public class JfrmKhoa extends javax.swing.JPanel {

    /**
     * Creates new form JfrmKhoa
     */
    private DefaultTableModel dtm;
    ArrayList<Khoa> list = null;

    public JfrmKhoa() {
        initComponents();
        dtm = new DefaultTableModel();
        dtm.addColumn("Mã Khoa");
        dtm.addColumn("Tên Khoa");
        dtm.addColumn("Số Điện Thoại");
        LoadData();
    }

    private void LoadData() {
        try {
            InKhoaSQL khoaSQL = (InKhoaSQL) Class.forName("Khoa.KhoaSQL").newInstance();
            list = new KhoaSQL().getAll();
            for (Khoa khoa : list) {
                dtm.addRow(toObjectsData(khoa));
            }
            tbKhoa.setModel(dtm);

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(JfrmKhoa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static Object[] toObjectsData(Khoa k) {
        Object[] objectsData = {k.getMaKhoa(), k.getTenKhoa(), k.getSdt()};
        return objectsData;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txMaKhoa = new javax.swing.JTextField();
        txTenKhoa = new javax.swing.JTextField();
        txSDT = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbKhoa = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        btAdd = new javax.swing.JButton();
        btUpdate = new javax.swing.JButton();
        btDelete = new javax.swing.JButton();
        btReset = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(0, 0, 153));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("FACULTY INFORMATION");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Mã Khoa");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Tên Khoa");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Số Điện Thoại");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txSDT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txTenKhoa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txMaKhoa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txMaKhoa, txSDT, txTenKhoa});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txMaKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txTenKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txMaKhoa, txSDT, txTenKhoa});

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)));

        tbKhoa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã Khoa", "Tên Khoa", "Số điện thoại"
            }
        ));
        tbKhoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbKhoaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbKhoa);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)));

        btAdd.setBackground(new java.awt.Color(102, 255, 255));
        btAdd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btAdd.setForeground(new java.awt.Color(204, 0, 0));
        btAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Item/new.png"))); // NOI18N
        btAdd.setText("Add");
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });

        btUpdate.setBackground(new java.awt.Color(102, 255, 255));
        btUpdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btUpdate.setForeground(new java.awt.Color(204, 0, 0));
        btUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Item/Update.png"))); // NOI18N
        btUpdate.setText("Update");
        btUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUpdateActionPerformed(evt);
            }
        });

        btDelete.setBackground(new java.awt.Color(102, 255, 255));
        btDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btDelete.setForeground(new java.awt.Color(204, 0, 0));
        btDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Item/Remove.png"))); // NOI18N
        btDelete.setText("Delete");
        btDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteActionPerformed(evt);
            }
        });

        btReset.setBackground(new java.awt.Color(102, 255, 255));
        btReset.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btReset.setForeground(new java.awt.Color(204, 0, 0));
        btReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Item/reset.png"))); // NOI18N
        btReset.setText("Reset");
        btReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btDelete)
                    .addComponent(btReset)
                    .addComponent(btUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btAdd, btDelete, btReset, btUpdate});

        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btUpdate)
                .addGap(18, 18, 18)
                .addComponent(btDelete)
                .addGap(18, 18, 18)
                .addComponent(btReset)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btAdd, btDelete, btReset, btUpdate});

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    public void resetForm() {
        txMaKhoa.setText("");
        txTenKhoa.setText("");
        txSDT.setText("");
        txMaKhoa.requestFocus();
    }
    private void btResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResetActionPerformed
        // TODO add your handling code here:
        resetForm();
    }//GEN-LAST:event_btResetActionPerformed

    private void tbKhoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbKhoaMouseClicked
        // TODO add your handling code here:
        txMaKhoa.setText(tbKhoa.getValueAt(tbKhoa.getSelectedRow(), 0).toString());
        txTenKhoa.setText(tbKhoa.getValueAt(tbKhoa.getSelectedRow(), 1).toString());
        txSDT.setText(tbKhoa.getValueAt(tbKhoa.getSelectedRow(), 2).toString());

        btAdd.setEnabled(false);
        btUpdate.setEnabled(true);
        btDelete.setEnabled(true);
        txMaKhoa.setEnabled(false);
    }//GEN-LAST:event_tbKhoaMouseClicked

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
        // TODO add your handling code here:
        if (!checkInfomation()) {
            return;
        }
        String makhoa = txMaKhoa.getText();
        String tenkhoa = txTenKhoa.getText();
        String sdt = txSDT.getText();
        Khoa k = new Khoa(makhoa, tenkhoa, sdt);
        ArrayList<Khoa> listCheck = new KhoaSQL().checkID(makhoa);
        if (listCheck.size() > 0) {
            JOptionPane.showMessageDialog(this, "Mã ID bị trùng", "vui lòng kiểm tra lại", JOptionPane.ERROR_MESSAGE);
            txMaKhoa.setText("");
            txMaKhoa.requestFocus();
        } else {
            Khoa insert = new KhoaSQL().addNew(k);
            if (insert != null) {
                Display();
            }
        }
    }//GEN-LAST:event_btAddActionPerformed

    private void btUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUpdateActionPerformed
        // TODO add your handling code here:
        if (!checkInfomation()) {
            return;
        }
        String makhoa = txMaKhoa.getText();
        String tenkhoa = txTenKhoa.getText();
        String sdt = txSDT.getText();
        Khoa k = new Khoa(makhoa, tenkhoa, sdt);
        Khoa update = new KhoaSQL().updateBangID(k);
        if (update != null) {
            Display();
        }
        btAdd.setEnabled(true);
        btUpdate.setEnabled(false);
        btDelete.setEnabled(false);
        txMaKhoa.setEnabled(true);
    }//GEN-LAST:event_btUpdateActionPerformed

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
        // TODO add your handling code here:
        int b = JOptionPane.showConfirmDialog(null, "Bạn chắc chắn muốn xóa dữ liệu này?", "Thông Báo", JOptionPane.YES_NO_OPTION);
        if (b == JOptionPane.YES_OPTION) {
            try {
                String makhoa = txMaKhoa.getText();
                new KhoaSQL().deleteKhoabyID(makhoa);
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(JfrmKhoa.class.getName()).log(Level.SEVERE, null, ex);
            }
            while (dtm.getRowCount() > 0) {
                dtm.removeRow(0);
            }

            resetForm();
            LoadData();
            btAdd.setEnabled(true);
            btUpdate.setEnabled(false);
            btDelete.setEnabled(false);
            txMaKhoa.setEnabled(true);
        }
    }//GEN-LAST:event_btDeleteActionPerformed
    private boolean checkInfomation() {
        Check c = new Check();
        if (!c.checkID(txMaKhoa.getText())) {
            JOptionPane.showMessageDialog(null, "Bạn nhập Mã Khoa không hợp lệ", "Error", JOptionPane.ERROR_MESSAGE);
            txMaKhoa.setText("");
            txMaKhoa.requestFocus();
            return false;
        } else if (!c.checkSpace(txTenKhoa.getText()) || !c.checkSpace(txTenKhoa.getText())) {
            JOptionPane.showMessageDialog(null, "Bạn nhập Tên Khoa không hợp lệ", "Error", JOptionPane.ERROR_MESSAGE);
            txTenKhoa.setText("");
            txTenKhoa.requestFocus();
            return false;
        } else if (!c.checkSpace(txSDT.getText()) || !c.checkSpace(txSDT.getText())) {
            JOptionPane.showMessageDialog(null, "Bạn nhập Số Điện Thoại không hợp lệ", "Error", JOptionPane.ERROR_MESSAGE);
            txSDT.setText("");
            txSDT.requestFocus();
            return false;
        }
        return true;
    }

    private void Display() {
        while (dtm.getRowCount() > 0) {
            dtm.removeRow(0);
        }

        ArrayList<Khoa> khoas = new KhoaSQL().getAll();
        for (Khoa khoa : khoas) {
            Vector v = new Vector();
            v.add(khoa.getMaKhoa());
            v.add(khoa.getTenKhoa());
            v.add(khoa.getSdt());
            dtm.addRow(v);
        }
        resetForm();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btReset;
    private javax.swing.JButton btUpdate;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbKhoa;
    private javax.swing.JTextField txMaKhoa;
    private javax.swing.JTextField txSDT;
    private javax.swing.JTextField txTenKhoa;
    // End of variables declaration//GEN-END:variables
}
