/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pertemuan.pkg9;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Irzi Rhmtllh
 */
public final class Frame extends javax.swing.JFrame {

    InputDataMhs dataMahasiswa;
    DefaultTableModel tableModel;
    
    public Frame() {
        initComponents();
        dataMahasiswa = new InputDataMhs();
        ViewDataTable();
    };
    
    public void ViewDataTable() {
        String[] columns = {"NIM", "Nama", "Alamat", "Mata Kuliah", "Nilai Akhir"};
        Object[][] objekMhs = new Object[dataMahasiswa.getAllData().size()][5];
        
        int i = 0;
        for(Mahasiswa mhs: dataMahasiswa.getAllData()) {
            String mahasiswa[] = {mhs.getNim(), mhs.getName(), mhs.getAddress(), mhs.getMataKuliah(), mhs.getNilaiAkhir() + ""};
            objekMhs[i] = mahasiswa;
            i++;
        };
        tableModel = new DefaultTableModel(objekMhs, columns) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            };
        };
        resultTable.setModel(tableModel);
    };

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nimField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        addressField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        mkField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        nilai4Field = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        nilai1Field = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        nilai2Field = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        nilai3Field = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        nilai5Field = new javax.swing.JTextField();
        nilaiAkhirField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultTable = new javax.swing.JTable();
        nilaiAkhirBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("NIM");

        jLabel2.setText("Nama");

        jLabel3.setText("Alamat");

        jLabel4.setText("Mata Kuliah");

        mkField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mkFieldActionPerformed(evt);
            }
        });

        jLabel5.setText("Nilai 4 [15%]");

        nilai4Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nilai4FieldActionPerformed(evt);
            }
        });

        jLabel6.setText("Nilai 1 [10%]");

        jLabel7.setText("Nilai 2 [15%]");

        nilai2Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nilai2FieldActionPerformed(evt);
            }
        });

        jLabel8.setText("Nilai 3 -UTS [25%]");

        nilai3Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nilai3FieldActionPerformed(evt);
            }
        });

        jLabel9.setText("Nilai 5 [35%]");

        nilai5Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nilai5FieldActionPerformed(evt);
            }
        });

        nilaiAkhirField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nilaiAkhirFieldActionPerformed(evt);
            }
        });

        jLabel10.setText("Nilai Akhir");

        saveBtn.setText("Simpan");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        deleteBtn.setText("Hapus");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        resultTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NIM", "Nama", "Alamat", "Mata Kuliah"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        resultTable.setShowGrid(false);
        jScrollPane1.setViewportView(resultTable);

        nilaiAkhirBtn.setText("Hitung Nilai Akhir");
        nilaiAkhirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nilaiAkhirBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                                .addComponent(mkField, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nimField, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(saveBtn)
                                .addGap(18, 18, 18)
                                .addComponent(nilaiAkhirBtn)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nilai5Field, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nilai4Field, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nilai1Field, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nilai2Field, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nilai3Field, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nilaiAkhirField, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(nilai1Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(nilai2Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(nilai3Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(nilai4Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(nimField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(mkField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(nilai5Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(saveBtn)
                        .addComponent(deleteBtn)
                        .addComponent(nilaiAkhirBtn))
                    .addComponent(nilaiAkhirField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nilai5FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nilai5FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nilai5FieldActionPerformed

    private void nilaiAkhirFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nilaiAkhirFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nilaiAkhirFieldActionPerformed

    private void mkFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mkFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mkFieldActionPerformed

    private void nilai2FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nilai2FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nilai2FieldActionPerformed

    private void nilai3FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nilai3FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nilai3FieldActionPerformed

    private void nilai4FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nilai4FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nilai4FieldActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        if(isFieldEmpty()) {
          JOptionPane.showMessageDialog(rootPane, "Field tidak boleh ada yang kosong!", "Error!", JOptionPane.ERROR_MESSAGE);
          return;
        };
        
        if(nilaiAkhirField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Hitung nilai akhir terlebih dahulu!", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        };
        
        dataMahasiswa.insertData(nimField.getText(), nameField.getText(), addressField.getText(), mkField.getText(), createArrayNilai());
        clearField();
        ViewDataTable();
    }//GEN-LAST:event_saveBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        dataMahasiswa.deleteData(resultTable.getSelectedRow());
        ViewDataTable();
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void nilaiAkhirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nilaiAkhirBtnActionPerformed
        double[] arrNilai = createArrayNilai();
        double nilaiAkhir = 0.0;
        
        for(int i = 0; i < arrNilai.length; i++){
            if(i == 0 ) {
                nilaiAkhir +=  arrNilai[i] * 0.10;
            };
            if(i == 1 || i == 3) {
                nilaiAkhir += arrNilai[i] * 0.15;
            };
            if(i == 2) {
                nilaiAkhir += arrNilai[i] * 0.25;
            };
            if(i == 4) {
                nilaiAkhir += arrNilai[i] * 0.35;
            };
        };
        
        nilaiAkhirField.setText(nilaiAkhir+"");
    }//GEN-LAST:event_nilaiAkhirBtnActionPerformed
    
    private void clearField() {
        nimField.setText("");
        nameField.setText("");
        addressField.setText("");
        mkField.setText("");
        nilai1Field.setText("");
        nilai2Field.setText("");
        nilai3Field.setText("");
        nilai4Field.setText("");
        nilai5Field.setText("");
        nilaiAkhirField.setText("");
        nimField.requestFocus();
    };
    
    private double[] createArrayNilai() {
        double[] arrayNilai = {Double.parseDouble(nilai1Field.getText()), Double.parseDouble(nilai2Field.getText()), Double.parseDouble(nilai3Field.getText()), Double.parseDouble(nilai4Field.getText()), Double.parseDouble(nilai5Field.getText())};
        
        return arrayNilai;
    };
    
    private boolean isFieldEmpty() {        
        if(nimField.getText().isEmpty()) {
            return true;
        }
        if(nameField.getText().isEmpty()) {
            return true;
        }
        if(addressField.getText().isEmpty()) {
            return true;
        }
        if(mkField.getText().isEmpty()) {
            return true;
        }
        if(nilai1Field.getText().isEmpty()) {
            return true;
        }
        if(nilai2Field.getText().isEmpty()) {
            return true;
        }
        if(nilai3Field.getText().isEmpty()) {
            return true;
        }
        if(nilai4Field.getText().isEmpty()) {
            return true;
        }
        return false;
    };
    
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
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressField;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mkField;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField nilai1Field;
    private javax.swing.JTextField nilai2Field;
    private javax.swing.JTextField nilai3Field;
    private javax.swing.JTextField nilai4Field;
    private javax.swing.JTextField nilai5Field;
    private javax.swing.JButton nilaiAkhirBtn;
    private javax.swing.JTextField nilaiAkhirField;
    private javax.swing.JTextField nimField;
    private javax.swing.JTable resultTable;
    private javax.swing.JButton saveBtn;
    // End of variables declaration//GEN-END:variables
}
