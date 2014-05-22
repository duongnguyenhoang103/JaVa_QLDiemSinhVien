/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MonHoc;

import Check.Check;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultButtonModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Anonymous
 */
public class frmMonHoc extends javax.swing.JPanel {

    private DefaultTableModel dtm;
    private DefaultComboBoxModel dcbmthi;
    private ArrayList<MonHoc> list;

    public frmMonHoc() {
        initComponents();
        dcbmthi = new DefaultComboBoxModel();

        dtm = new DefaultTableModel();


        dcbmthi.addElement("Thi Viết");
        dcbmthi.addElement("Thi Thực Hành");
        dcbmthi.addElement("Thi Vấn Đáp");
        jcbThi.setModel(dcbmthi);

        dtm.addColumn("Mã MH");
        dtm.addColumn("Tên MH");
        dtm.addColumn("Số Trình");
        dtm.addColumn("Hình Thức Thi");
        dtm.addColumn("Học Kỳ");
        dtm.addColumn("Phòng Học");

        loaddata();
    }

    private void loaddata() {
        try {

            IMonHocDAO monHocDAO = (IMonHocDAO) Class.forName("MonHoc.MonHocDAO").newInstance();
            list = new MonHocDAO().getAll();
            for (MonHoc mh : list) {
                dtm.addRow(toObjectsData(mh));
            }
            jtbMonHoc.setModel(dtm);
        } catch (InstantiationException ex) {
            Logger.getLogger(frmMonHoc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(frmMonHoc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(frmMonHoc.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Object[] toObjectsData(MonHoc hoc) {
        Object[] objectsData = {hoc.getMamh(), hoc.getTenmh(), hoc.getSotrinh(), hoc.getHinhthucthi(), hoc.getHocky(), hoc.getPhonghoc()};
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtbMonHoc = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtfMaMH = new javax.swing.JTextField();
        jtfPhongHoc = new javax.swing.JTextField();
        jtfSoTrinh = new javax.swing.JTextField();
        jtfTenMH = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtffhocky = new javax.swing.JTextField();
        jcbThi = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jbNew = new javax.swing.JButton();
        jbUpdate = new javax.swing.JButton();
        jbDelete = new javax.swing.JButton();
        jbExit = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(0, 102, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setForeground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("THÔNG TIN VỀ MÔN HỌC");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        jtbMonHoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã Môn Học", "Tên Môn Học", "Số Trình", "Học Kỳ", "Phòng Học", "Hình Thức Thi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtbMonHoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbMonHocMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtbMonHoc);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 811, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Tên Môn Học");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Mã Môn Học");

        jtfSoTrinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfSoTrinhActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Số Trình");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("Học Kỳ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("Phòng Học");

        jcbThi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jcbThi.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Hình Thức Thi" }));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("Hình Thức Thi");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(204, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jtfSoTrinh, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jtffhocky, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jtfTenMH, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfMaMH, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtfPhongHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jcbThi, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(111, 111, 111))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfMaMH, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfTenMH, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfSoTrinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jtffhocky, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfPhongHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbThi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jcbThi, jtfMaMH, jtfPhongHoc, jtfSoTrinh, jtfTenMH, jtffhocky});

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));

        jbNew.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbNew.setForeground(new java.awt.Color(255, 0, 0));
        jbNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/new.png"))); // NOI18N
        jbNew.setText("New");
        jbNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNewActionPerformed(evt);
            }
        });

        jbUpdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbUpdate.setForeground(new java.awt.Color(255, 0, 0));
        jbUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Update.png"))); // NOI18N
        jbUpdate.setText("Update");
        jbUpdate.setEnabled(false);
        jbUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbUpdateActionPerformed(evt);
            }
        });

        jbDelete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbDelete.setForeground(new java.awt.Color(255, 0, 0));
        jbDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Remove.png"))); // NOI18N
        jbDelete.setText("Delete");
        jbDelete.setEnabled(false);
        jbDelete.setIconTextGap(2);
        jbDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDeleteActionPerformed(evt);
            }
        });

        jbExit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbExit.setForeground(new java.awt.Color(255, 0, 0));
        jbExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/reset.png"))); // NOI18N
        jbExit.setText("Reset");
        jbExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                    .addComponent(jbNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbUpdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbNew, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbExit, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jbDelete, jbExit, jbNew, jbUpdate});

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtfSoTrinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfSoTrinhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfSoTrinhActionPerformed
    private void jbNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNewActionPerformed
        String maMH = jtfMaMH.getText();
        String tenMH = jtfTenMH.getText();
        String soTrinh = jtfSoTrinh.getText();
        String htThi = (String) jcbThi.getSelectedItem();
        String hocKy = jtffhocky.getText();
        String phongHoc = jtfPhongHoc.getText();
        Check c = new Check();
        if (!checkinfo()) {
            return;
        }



        int strinh;
        strinh = Integer.parseInt(soTrinh);
        int hky;
        hky = Integer.parseInt(hocKy);

        MonHoc monHoc = new MonHoc(maMH, strinh, tenMH, htThi, hky, phongHoc);
        ArrayList<MonHoc> listCheck = new MonHocDAO().CheckID(maMH);
        if (listCheck.size() > 0) {
            JOptionPane.showMessageDialog(this, "Mã ID bị trùng", "vui lòng kiểm tra lại", JOptionPane.ERROR_MESSAGE);
            jtfMaMH.setText("");
            jtfMaMH.requestFocus();
        } else {
            MonHoc insert = new MonHocDAO().addNew(monHoc);
            if (insert != null) {
                showAll();
            }
        }

    }//GEN-LAST:event_jbNewActionPerformed

    private void jbUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbUpdateActionPerformed
        String maMH = jtfMaMH.getText();
        String tenMH = jtfTenMH.getText();
        String soTrinh = jtfSoTrinh.getText();
        String htThi = (String) jcbThi.getSelectedItem();
        String hocKy = jtffhocky.getText();
        String phongHoc = jtfPhongHoc.getText();
        Check c = new Check();
        if (!checkinfo()) {
            return;
        }


        int strinh;
        strinh = Integer.parseInt(soTrinh);
        int hky;
        hky = Integer.parseInt(hocKy);
        MonHoc monHoc = new MonHoc(maMH, strinh, tenMH, htThi, hky, phongHoc);
        MonHoc update = new MonHocDAO().updateByID(monHoc);
        if (update != null) {
            showAll();
        }
        jbNew.setEnabled(true);
        jbUpdate.setEnabled(false);
        jbDelete.setEnabled(false);
        jtfMaMH.setEnabled(true);
    }//GEN-LAST:event_jbUpdateActionPerformed

    private void jtbMonHocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbMonHocMouseClicked
        jtfMaMH.setText(jtbMonHoc.getValueAt(jtbMonHoc.getSelectedRow(), 0).toString());
        jtfTenMH.setText(jtbMonHoc.getValueAt(jtbMonHoc.getSelectedRow(), 1).toString());
        jtfSoTrinh.setText(jtbMonHoc.getValueAt(jtbMonHoc.getSelectedRow(), 2).toString());
        jcbThi.setSelectedItem(jtbMonHoc.getValueAt(jtbMonHoc.getSelectedRow(), 3).toString());
        jtffhocky.setText(jtbMonHoc.getValueAt(jtbMonHoc.getSelectedRow(), 4).toString());
        jtfPhongHoc.setText(jtbMonHoc.getValueAt(jtbMonHoc.getSelectedRow(), 5).toString());

        jbNew.setEnabled(false);
        jbUpdate.setEnabled(true);
        jbDelete.setEnabled(true);
        jtfMaMH.setEnabled(false);
    }//GEN-LAST:event_jtbMonHocMouseClicked

    private void jbDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDeleteActionPerformed
        String maMh = jtfMaMH.getText();
        int b = JOptionPane.showConfirmDialog(null, "Bạn chắc chắn muốn xóa dữ liệu này?", "Thông Báo", JOptionPane.YES_NO_OPTION);
        if (b == JOptionPane.YES_OPTION) {
            try {
                new MonHocDAO().delMonHoc(maMh);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Dữ liệu chưa thể xóa, có tồn tại điểm của môn này, hãy xóa dữ liệu điểm trước", "Thông báo", JOptionPane.ERROR_MESSAGE);
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(this, "Dữ liệu chưa thể xóa, có tồn tại điểm của môn này, hãy xóa dữ liệu điểm trước", "Thông báo", JOptionPane.ERROR_MESSAGE);
            }
            while (dtm.getRowCount() > 0) {
                dtm.removeRow(0);
            }
            resetForm();
            loaddata();
            jbNew.setEnabled(true);
            jbUpdate.setEnabled(false);
            jbDelete.setEnabled(false);
            jtfMaMH.setEnabled(true);
        }
    }//GEN-LAST:event_jbDeleteActionPerformed
    private void showAll() {
        while (dtm.getRowCount() > 0) {
            dtm.removeRow(0);
        }
        ArrayList<MonHoc> hocs = new MonHocDAO().getAll();
        for (MonHoc mh : hocs) {
            Vector v = new Vector();
            v.add(mh.getMamh());
            v.add(mh.getTenmh());
            v.add(mh.getSotrinh());
            v.add(mh.getHinhthucthi());
            v.add(mh.getHocky());
            v.add(mh.getPhonghoc());

            dtm.addRow(v);
        }
        resetForm();
        // jtfthi.setText("");
    }

    public void resetForm() {
        jtfMaMH.setText("");
        jtfTenMH.setText("");
        jtfPhongHoc.setText("");
        jtfSoTrinh.setText("");
        jtffhocky.setText("");
        jtfMaMH.requestFocus();
    }

    public boolean checkinfo() {
        Check c = new Check();
        if (!c.checkID(jtfMaMH.getText())) {
            JOptionPane.showMessageDialog(this, "Nhập mã sai", "Hãy nhập lại", JOptionPane.ERROR_MESSAGE);
            jtfMaMH.setText("");
            jtfMaMH.requestFocus();
            return false;
        } else if (!c.checkSpace(jtfTenMH.getText()) || !c.check(jtfTenMH.getText())) {
            JOptionPane.showMessageDialog(this, "Nhập tên môn học sai", "Hãy nhập lại", JOptionPane.ERROR_MESSAGE);
            jtfTenMH.setText("");
            jtfTenMH.requestFocus();
            return false;

        } else if (!c.checkSpace(jtfSoTrinh.getText()) || !c.checkNumber(jtfSoTrinh.getText())) {
            JOptionPane.showMessageDialog(this, "Kiểm tra lại số trình", "Hãy nhập lại", JOptionPane.ERROR_MESSAGE);
            jtfSoTrinh.setText("");
            jtfSoTrinh.requestFocus();
            return false;
        } else if (!c.checkSpace(jtffhocky.getText()) || !c.checkNumber(jtffhocky.getText())) {
            JOptionPane.showMessageDialog(this, "Nhập sai học kỳ phải là số", "Hãy nhập lại", JOptionPane.ERROR_MESSAGE);
            jtffhocky.setText("");
            jtffhocky.requestFocus();
            return false;
        } else if (!c.checkSpace(jtfPhongHoc.getText()) || !c.check(jtfPhongHoc.getText())) {
            JOptionPane.showMessageDialog(this, "Nhập tên phòng học sai", "Hãy nhập lại", JOptionPane.ERROR_MESSAGE);
            jtfPhongHoc.setText("");
            jtfPhongHoc.requestFocus();
            return false;

        }
        return true;
    }
    private void jbExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExitActionPerformed
        this.resetForm();
    }//GEN-LAST:event_jbExitActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbDelete;
    private javax.swing.JButton jbExit;
    private javax.swing.JButton jbNew;
    private javax.swing.JButton jbUpdate;
    private javax.swing.JComboBox jcbThi;
    private javax.swing.JTable jtbMonHoc;
    private javax.swing.JTextField jtfMaMH;
    private javax.swing.JTextField jtfPhongHoc;
    private javax.swing.JTextField jtfSoTrinh;
    private javax.swing.JTextField jtfTenMH;
    private javax.swing.JTextField jtffhocky;
    // End of variables declaration//GEN-END:variables
}
