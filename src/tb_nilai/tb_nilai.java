/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tb_nilai;

import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class tb_nilai extends javax.swing.JFrame {

    private Connection koneksi;
    
    public tb_nilai() {
        initComponents();
        KoneksiDatabase();
        TampilData();
        setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtnim = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        txtsemester = new javax.swing.JComboBox<>();
        txtprodi = new javax.swing.JComboBox<>();
        txtkehadiran = new javax.swing.JTextField();
        txttugas = new javax.swing.JTextField();
        txtuts = new javax.swing.JTextField();
        txtuas = new javax.swing.JTextField();
        txtratarata = new javax.swing.JTextField();
        txtgrade = new javax.swing.JTextField();
        hitung = new javax.swing.JButton();
        simpan = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_nilai = new javax.swing.JTable();
        ubah = new javax.swing.JButton();
        jPanelImage1 = new org.tm.container.JPanelImage();
        jPanelImage2 = new org.tm.container.JPanelImage();
        jMenuBar1 = new javax.swing.JMenuBar();
        print = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        help = new javax.swing.JMenu();
        logout = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tekton Pro Cond", 1, 24)); // NOI18N
        jLabel1.setText("FORM INPUT NILAI MAHASISWA");

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("NIM");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("NAMA");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("SEMESTER");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("PRODI");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("KEHADIRAN");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("NILAI TUGAS");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("NILAI UTS");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("NILAI UAS");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("RATA-RATA");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("GRADE");

        txtsemester.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---PILIH SEMESTER---", "I", "II", "III", "IV", "V", "VI", "VII", "VIII" }));

        txtprodi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----PILIH PRODI-----", "TEKNIK KOMPUTER", "TEKNIK ELEKTRO", "TEKNIK INFORMATIKA", "TEKNIK MESIN", "AKUNTANSI", "FARMASI", "KEBIDANAN", "PERHOTELAN", "DKV", "ASP" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtnim)
                    .addComponent(txtnama, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                    .addComponent(txtsemester, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtprodi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtkehadiran)
                        .addComponent(txttugas)
                        .addComponent(txtuts)
                        .addComponent(txtuas, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                        .addComponent(txtratarata))
                    .addComponent(txtgrade, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(txtnim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtkehadiran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(txtsemester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtuts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(txtprodi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtuas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtratarata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtgrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        hitung.setFont(new java.awt.Font("Tekton Pro Ext", 1, 12)); // NOI18N
        hitung.setText("HITUNG");
        hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitungActionPerformed(evt);
            }
        });

        simpan.setFont(new java.awt.Font("Tekton Pro Ext", 1, 12)); // NOI18N
        simpan.setText("SIMPAN");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        reset.setFont(new java.awt.Font("Tekton Pro Ext", 1, 12)); // NOI18N
        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        hapus.setFont(new java.awt.Font("Tekton Pro Ext", 1, 12)); // NOI18N
        hapus.setText("HAPUS");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        tb_nilai.setBackground(new java.awt.Color(255, 153, 0));
        tb_nilai.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        tb_nilai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NIM", "Nama", "Semester", "Prodi", "Nilai Absen", "Nilai Tugas", "Nilai UTS", "Nilai UAS", "Rata-Rata", "Grade"
            }
        ));
        tb_nilai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_nilaiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_nilai);

        ubah.setFont(new java.awt.Font("Tekton Pro Ext", 1, 12)); // NOI18N
        ubah.setText("UBAH");
        ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahActionPerformed(evt);
            }
        });

        jPanelImage1.setPosition(1);
        jPanelImage1.setWallpaper(new javax.swing.ImageIcon("E:\\ALDO\\Kuliah\\PBO 1\\icon\\Logo-Politeknik-Harapan-Bersama-Tegal.png")); // NOI18N

        javax.swing.GroupLayout jPanelImage1Layout = new javax.swing.GroupLayout(jPanelImage1);
        jPanelImage1.setLayout(jPanelImage1Layout);
        jPanelImage1Layout.setHorizontalGroup(
            jPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 69, Short.MAX_VALUE)
        );
        jPanelImage1Layout.setVerticalGroup(
            jPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 73, Short.MAX_VALUE)
        );

        jPanelImage2.setPosition(1);
        jPanelImage2.setWallpaper(new javax.swing.ImageIcon("E:\\ALDO\\Kuliah\\PBO 1\\icon\\Logo_of_the_Ministry_of_Research,_Technology,_and_Higher_Education_of_the_Republic_of_Indonesia.png")); // NOI18N

        javax.swing.GroupLayout jPanelImage2Layout = new javax.swing.GroupLayout(jPanelImage2);
        jPanelImage2.setLayout(jPanelImage2Layout);
        jPanelImage2Layout.setHorizontalGroup(
            jPanelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 69, Short.MAX_VALUE)
        );
        jPanelImage2Layout.setVerticalGroup(
            jPanelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 73, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 102, 0));
        jMenuBar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuBar1.setForeground(new java.awt.Color(255, 102, 0));

        print.setText("File");

        jMenu3.setText("Print");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        print.add(jMenu3);

        help.setText("Help");
        help.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                helpMouseClicked(evt);
            }
        });
        print.add(help);

        jMenuBar1.add(print);

        logout.setText("Logout");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        jMenuBar1.add(logout);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanelImage2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jPanelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hitung, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(reset, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(simpan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ubah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanelImage2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(32, 32, 32)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(hitung)
                                .addGap(18, 18, 18)
                                .addComponent(simpan)
                                .addGap(18, 18, 18)
                                .addComponent(ubah)
                                .addGap(18, 18, 18)
                                .addComponent(reset)
                                .addGap(18, 18, 18)
                                .addComponent(hapus)
                                .addGap(63, 63, 63)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitungActionPerformed
       double nilai_tugas,nilai_uts,nilai_uas,nilai_absen,ratarata;
       String rata__rata;
       nilai_tugas=Double.parseDouble(txttugas.getText());
       nilai_uts=Double.parseDouble(txtuts.getText());
       nilai_uas=Double.parseDouble(txtuas.getText());
       nilai_absen=Double.parseDouble(txtkehadiran.getText());
       
       ratarata=((nilai_tugas*0.40)+(nilai_uts*0.25)+(nilai_uas*0.40)+(nilai_absen*0.1));
       rata__rata=String.valueOf(ratarata);
       txtratarata.setText(rata__rata);
       
       if((ratarata>=81)&&(ratarata<100)){txtgrade.setText("A");}
       else if((ratarata>=69)&&(ratarata<81)){txtgrade.setText("B");}
       else if((ratarata>=60)&&(ratarata<69)){txtgrade.setText("C");}
       else if((ratarata>=49)&&(ratarata<60)){txtgrade.setText("D");}
       else if((ratarata<49)){txtgrade.setText("E");}
    }//GEN-LAST:event_hitungActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        txtnim.setText(null);
        txtnama.setText(null);
        txtsemester.setSelectedIndex(-0);
        txtprodi.setSelectedIndex(-0);
        txttugas.setText(null);
        txtuts.setText(null);
        txtuas.setText(null);
        txtkehadiran.setText(null);
        txtratarata.setText(null);
        txtgrade.setText(null);
    }//GEN-LAST:event_resetActionPerformed

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        String nim = txtnim.getText();
        String nama = txtnama.getText();
        String semester = (String) txtsemester.getSelectedItem();
        String prodi = (String) txtprodi.getSelectedItem();
        String nilai_absen = txtkehadiran.getText();
        String nilai_tugas = txttugas.getText();
        String nilai_uts = txtuts.getText();
        String nilai_uas = txtuas.getText();
        String rata_rata = txtratarata.getText();
        String grade = txtgrade.getText();

        if (txtnim.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Mohon Masukan Data Untuk Di Input", "PERHATIAN", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                java.sql.Statement stat = koneksi.createStatement();
                ResultSet data = stat.executeQuery("SELECT * FROM tb_nilai WHERE nim ='" + txtnim.getText() + "'");
                if (data.next()) {
                    JOptionPane.showMessageDialog(null, "NIM Sudah Ada", "PERHATIAN", JOptionPane.WARNING_MESSAGE);
                    txtnim.requestFocus();
                } else {
                    String sql = "INSERT INTO tb_nilai VALUES('" + nim + "'"
                            + ",'" + nama + "'"
                            + ",'" + semester + "'"
                            + ",'" + prodi + "'"
                            + ",'" + nilai_absen + "'"
                            + ",'" + nilai_uts + "'"
                            + ",'" + nilai_tugas + "'"
                            + ",'" + nilai_uas + "'"
                            + ",'" + rata_rata + "'"
                            + ",'" + grade + "')";
                    stat.executeUpdate(sql);
                    txtnim.setText("");
                    txtnama.setText("");
                    txtsemester.setSelectedIndex(-0);
                    txtprodi.setSelectedIndex(-0);
                    txtkehadiran.setText("");
                    txttugas.setText("");
                    txtuts.setText("");
                    txtuas.setText("");
                    txtratarata.setText("");
                    txtgrade.setText("");
                    txtnim.requestFocus();
                    JOptionPane.showMessageDialog(null, "Data Berhasil Di Simpan", "SUKSES", JOptionPane.INFORMATION_MESSAGE);
                    TampilData();
                }
                stat.close();
            } catch (Exception exc) {
                System.err.println("Terjadi Kesalahan :" + exc);
            }
        }
    }//GEN-LAST:event_simpanActionPerformed

    private void tb_nilaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_nilaiMouseClicked
        int baris = tb_nilai.getSelectedRow();
        if (baris != -1) {
            txtnim.setText(tb_nilai.getValueAt(baris, 0).toString());
            txtnama.setText(tb_nilai.getValueAt(baris, 1).toString());
            txtsemester.setSelectedItem(tb_nilai.getValueAt(baris, 2).toString());
            txtprodi.setSelectedItem(tb_nilai.getValueAt(baris, 3).toString());
            txtkehadiran.setText(tb_nilai.getValueAt(baris, 4).toString());
            txttugas.setText(tb_nilai.getValueAt(baris, 5).toString());
            txtuts.setText(tb_nilai.getValueAt(baris, 6).toString());
            txtuas.setText(tb_nilai.getValueAt(baris, 7).toString());
            txtratarata.setText(tb_nilai.getValueAt(baris, 8).toString());
            txtgrade.setText(tb_nilai.getValueAt(baris, 9).toString());
        }
        
    }//GEN-LAST:event_tb_nilaiMouseClicked

    private void ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahActionPerformed
       int ok = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin mengubah data ini?", "Konfirmasi Dialog", JOptionPane.YES_NO_OPTION);
        String sql = "update tb_nilai set nama='" + txtnama.getText()
                + "',semester='" + txtsemester.getSelectedItem()
                + "',prodi='" + txtprodi.getSelectedItem()
                + "',nilai_absen='" + txtkehadiran.getText()
                + "',nilai_tugas='" + txttugas.getText()
                + "',nilai_uts='" + txtuts.getText()
                + "',nilai_uas='" + txtuas.getText()
                + "',rata_rata='" + txtratarata.getText()
                + "',grade='" + txtgrade.getText()
                + "'where nim='" + txtnim.getText().trim()+"'";
        if (txtnim.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Data Masih Kosong!", "Ubah Data", JOptionPane.WARNING_MESSAGE);
            txtnim.requestFocus();
        } else {
            try {
                Statement stat = koneksi.createStatement();
                stat.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Data Berhasil di Ubah", "Ubah Data", JOptionPane.INFORMATION_MESSAGE);
                stat.close();
                txtnim.requestFocus();
                TampilData();
            } catch (Exception exc) {
                System.err.println("Error :" + exc);
            }
          }
    }//GEN-LAST:event_ubahActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        int ok = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin menghapus data ini?", "Konfirmasi Dialog", JOptionPane.YES_NO_OPTION);
        if (ok == 0) {
            String sql = "DELETE FROM tb_nilai WHERE nim='" + txtnim.getText().trim() + "'";
            try {
                Statement stat = koneksi.createStatement();
                stat.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Data Berhasil di Hapus", "Hapus Data", JOptionPane.INFORMATION_MESSAGE);
                stat.close();
                txtnim.setText("");
                txtnama.setText("");
                txtsemester.setSelectedIndex(-0);
                txtprodi.setSelectedIndex(-0);
                txtkehadiran.setText("");
                txttugas.setText("");
                txtuts.setText("");
                txtuas.setText("");
                txtratarata.setText("");
                txtgrade.setText("");
                txtnim.requestFocus();
                TampilData();
            } catch (SQLException exc) {
                System.err.println(sql);
                System.err.println("Error : " + exc);
            }
        }
    }//GEN-LAST:event_hapusActionPerformed

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        try{
            boolean complete=tb_nilai.print();
            if(complete){
                JOptionPane.showMessageDialog(null,"SUKSES");   
            }
            else{
                JOptionPane.showMessageDialog(null,"ERROR");
            }
        }catch (PrinterException e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jMenu3MouseClicked

    private void helpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpMouseClicked
        help menu=new help(); //mendeklarasikan form home sebagai variabel menu, menu disini hanya nama, jadi bebas sebenarnya
        menu.setVisible(true); //memanggil form home;
        this.dispose();
    }//GEN-LAST:event_helpMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        login menu = new login(); //mendeklarasikan form home sebagai variabel menu, menu disini hanya nama, jadi bebas sebenarnya
        menu.setVisible(true); //memanggil form home;
        
        this.dispose();
    }//GEN-LAST:event_logoutMouseClicked

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
            java.util.logging.Logger.getLogger(tb_nilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tb_nilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tb_nilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tb_nilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JOptionPane.showMessageDialog(null, "Selamat Datang Tekan OK Untuk Melanjutkan");
                new tb_nilai().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton hapus;
    private javax.swing.JMenu help;
    private javax.swing.JButton hitung;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private org.tm.container.JPanelImage jPanelImage1;
    private org.tm.container.JPanelImage jPanelImage2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu logout;
    private javax.swing.JMenu print;
    private javax.swing.JButton reset;
    private javax.swing.JButton simpan;
    private javax.swing.JTable tb_nilai;
    private javax.swing.JTextField txtgrade;
    private javax.swing.JTextField txtkehadiran;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtnim;
    private javax.swing.JComboBox<String> txtprodi;
    private javax.swing.JTextField txtratarata;
    private javax.swing.JComboBox<String> txtsemester;
    private javax.swing.JTextField txttugas;
    private javax.swing.JTextField txtuas;
    private javax.swing.JTextField txtuts;
    private javax.swing.JButton ubah;
    // End of variables declaration//GEN-END:variables

    private void TampilData() {
       //membuat tampilan model tabel
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("NIM");
        model.addColumn("Nama");
        model.addColumn("Semester");
        model.addColumn("Prodi");
        model.addColumn("Nilai Absen");
        model.addColumn("Nilai Tugas");
        model.addColumn("Nilai UTS");
        model.addColumn("Nilai UAS");
        model.addColumn("Rata-Rata");
        model.addColumn("Grade");
        tb_nilai.setModel(model);

        //menampilkan data database kedalam tabel
        try {
            java.sql.Statement stat = koneksi.createStatement();
            ResultSet data = stat.executeQuery("SELECT * FROM tb_nilai");
            while (data.next()) {
                model.addRow(new Object[]{
                    data.getString("nim"),
                    data.getString("nama"),
                    data.getString("semester"),
                    data.getString("prodi"),
                    data.getString("nilai_absen"),
                    data.getString("nilai_tugas"),
                    data.getString("nilai_uts"),
                    data.getString("nilai_uas"),
                    data.getString("rata_rata"),
                    data.getString("grade")
                });
                tb_nilai.setModel(model);
            }
        } catch (Exception e) {
            System.err.println("Terjadi Kesalahan :" + e);
        }
    }

    private void KoneksiDatabase() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException cnf) {
        }
        try {
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost/mahasiswa", "root", "");
            System.out.println("Koneksi Database Berhasil");
        } catch (SQLException se) {
            System.out.println("Koneksi Database Gagal :" + se);
        } catch (Exception e) {
        }
    }

}

