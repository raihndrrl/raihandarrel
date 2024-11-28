import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;


public class KeuanganPribadiGUI extends javax.swing.JFrame {
    
//    private PengelolaKeuangan pengelola = new PengelolaKeuangan();
    private double saldo = 0;
    private ArrayList<Transaksi> daftarTransaksi = new ArrayList<>();
    private DefaultTableModel tableModel;
    private int selectedRow = -1;
    private Transaksi selectedTransaksi;
    
    public KeuanganPribadiGUI() {
        initComponents();
        tableModel = new DefaultTableModel(new String[]{"Tipe", "Keterangan", "Jumlah"}, 0);
        transaksiTable.setModel(tableModel);

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        keteranganField = new javax.swing.JTextField();
        jumlahField = new javax.swing.JTextField();
        addIncomeButton = new javax.swing.JButton();
        addExpenseButton = new javax.swing.JButton();
        saldoLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        transaksiTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Keuangan Pribadi App");

        jLabel2.setText("Keterangan");

        jLabel3.setText("Jumlah");

        addIncomeButton.setText("Tambah Pemasukan");
        addIncomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addIncomeButtonActionPerformed(evt);
            }
        });

        addExpenseButton.setText("Tambah Pengeluaran");
        addExpenseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addExpenseButtonActionPerformed(evt);
            }
        });

        saldoLabel.setText("Saldo Saat Ini : Rp ");

        transaksiTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(transaksiTable);

        jButton1.setText("Edit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(saldoLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                    .addGap(77, 77, 77)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jumlahField)
                                        .addComponent(keteranganField, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addIncomeButton)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(addExpenseButton)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addComponent(saldoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(keteranganField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jumlahField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addIncomeButton)
                    .addComponent(addExpenseButton)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addIncomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addIncomeButtonActionPerformed
        // TODO add your handling code here:
    try {
        double jumlah = Double.parseDouble(jumlahField.getText()); 
        String keterangan = keteranganField.getText();

        saldo += jumlah;
        saldoLabel.setText("Saldo Saat Ini: Rp " + saldo);
        tableModel.addRow(new Object[]{"Pemasukan", keteranganField, jumlah});
        
        // Simpan ke database
        DatabaseConnection.saveTransaction("Pemasukan", keterangan, jumlah);
        
        // Bersihkan field setelah digunakan
        jumlahField.setText("");
        keteranganField.setText("");
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Masukkan angka yang valid untuk jumlah!");
    }
    }//GEN-LAST:event_addIncomeButtonActionPerformed

    private void addExpenseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addExpenseButtonActionPerformed
        // TODO add your handling code here:

    double jumlah = Double.parseDouble(jumlahField.getText());
    String keterangan = keteranganField.getText();

    if (jumlah > saldo) {
        JOptionPane.showMessageDialog(this, "Saldo tidak mencukupi!");
        return;
    }
    saldo -= jumlah;
    saldoLabel.setText("Saldo Saat Ini: Rp " + saldo);
    tableModel.addRow(new Object[]{"Pengeluaran", keterangan, jumlah});
    
    // Simpan ke database
        DatabaseConnection.saveTransaction("Pengeluaran", keterangan, jumlah);
        
    jumlahField.setText("");
    keteranganField.setText("");
    }//GEN-LAST:event_addExpenseButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Mendapatkan indeks baris yang dipilih
    selectedRow = transaksiTable.getSelectedRow();

    if (selectedRow != -1) {
        // Ambil data dari tabel
        String tipe = tableModel.getValueAt(selectedRow, 0).toString();
        String keterangan = tableModel.getValueAt(selectedRow, 1).toString();
        double jumlah = Double.parseDouble(tableModel.getValueAt(selectedRow, 2).toString());

        // Tampilkan data di input field
        keteranganField.setText(keterangan);
        jumlahField.setText(String.valueOf(jumlah));

        // Menonaktifkan tombol sesuai tipe transaksi
        if (tipe.equals("Pemasukan")) {
            addIncomeButton.setEnabled(true);
            addExpenseButton.setEnabled(false);
        } else if (tipe.equals("Pengeluaran")) {
            addIncomeButton.setEnabled(false);
            addExpenseButton.setEnabled(true);
        }

        // Update data ketika pengguna klik tombol "Tambah Pemasukan" atau "Tambah Pengeluaran"
        addIncomeButton.addActionListener(e -> {
            try {
                double jumlahBaru = Double.parseDouble(jumlahField.getText());
                String keteranganBaru = keteranganField.getText();

                // Update saldo
                saldo -= jumlah; // Kembalikan jumlah lama ke saldo
                saldo += jumlahBaru; // Tambahkan jumlah baru ke saldo
                saldoLabel.setText("Saldo Saat Ini: Rp " + saldo);

                // Update tabel
                tableModel.setValueAt("Pemasukan", selectedRow, 0);
                tableModel.setValueAt(keteranganBaru, selectedRow, 1);
                tableModel.setValueAt(jumlahBaru, selectedRow, 2);

                // Bersihkan field
                keteranganField.setText("");
                jumlahField.setText("");

                // Reset tombol
                addIncomeButton.setEnabled(true);
                addExpenseButton.setEnabled(true);

                // Tambahkan logika untuk update database jika diperlukan
                // DatabaseConnection.updateTransaction(selectedRow, "Pemasukan", keteranganBaru, jumlahBaru);

                JOptionPane.showMessageDialog(this, "Data berhasil diperbarui!");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Masukkan angka yang valid untuk jumlah!");
            }
        });

        addExpenseButton.addActionListener(e -> {
            try {
                double jumlahBaru = Double.parseDouble(jumlahField.getText());
                String keteranganBaru = keteranganField.getText();

                // Update saldo
                saldo += jumlah; // Kembalikan jumlah lama ke saldo
                saldo -= jumlahBaru; // Kurangi jumlah baru dari saldo
                saldoLabel.setText("Saldo Saat Ini: Rp " + saldo);

                // Update tabel
                tableModel.setValueAt("Pengeluaran", selectedRow, 0);
                tableModel.setValueAt(keteranganBaru, selectedRow, 1);
                tableModel.setValueAt(jumlahBaru, selectedRow, 2);

                // Bersihkan field
                keteranganField.setText("");
                jumlahField.setText("");

                // Reset tombol
                addIncomeButton.setEnabled(true);
                addExpenseButton.setEnabled(true);

                // Tambahkan logika untuk update database jika diperlukan
                // DatabaseConnection.updateTransaction(selectedRow, "Pengeluaran", keteranganBaru, jumlahBaru);

                JOptionPane.showMessageDialog(this, "Data berhasil diperbarui!");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Masukkan angka yang valid untuk jumlah!");
            }
        });
    } else {
        JOptionPane.showMessageDialog(this, "Pilih baris data yang ingin diedit!");
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Mendapatkan indeks baris yang dipilih
    selectedRow = transaksiTable.getSelectedRow();

    if (selectedRow != -1) {
        // Ambil nilai tipe, jumlah, dan keterangan dari baris yang dipilih
        String tipe = tableModel.getValueAt(selectedRow, 0).toString();
        double jumlah = Double.parseDouble(tableModel.getValueAt(selectedRow, 2).toString());

        // Mengembalikan jumlah ke saldo jika tipe transaksi adalah "Pemasukan"
        if (tipe.equals("Pemasukan")) {
            saldo -= jumlah; // Mengurangi saldo karena data pemasukan dihapus
        } else if (tipe.equals("Pengeluaran")) {
            saldo += jumlah; // Menambahkan saldo karena data pengeluaran dihapus
        }

        // Perbarui label saldo
        saldoLabel.setText("Saldo Saat Ini: Rp " + saldo);

        // Hapus baris dari JTable
        tableModel.removeRow(selectedRow);

        // Reset selectedRow
        selectedRow = -1;

        // Tambahkan logika untuk menghapus data di database jika diperlukan
        // DatabaseConnection.deleteTransaction(tipe, keterangan, jumlah);

    } else {
        JOptionPane.showMessageDialog(this, "Pilih baris data yang ingin dihapus!");
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        SwingUtilities.invokeLater(() -> {
            KeuanganPribadiGUI frame = new KeuanganPribadiGUI();
            frame.setVisible(true);
        });

    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addExpenseButton;
    private javax.swing.JButton addIncomeButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jumlahField;
    private javax.swing.JTextField keteranganField;
    private javax.swing.JLabel saldoLabel;
    private javax.swing.JTable transaksiTable;
    // End of variables declaration//GEN-END:variables
}
