package tampilan;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import kelas.category;

/**
 *
 * @author HP
 */
public class Framecategory extends javax.swing.JFrame {

    public Framecategory() {
        initComponents();
        otoID();
        loadTabel();
    }

    void loadTabel() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID Category");
        model.addColumn("Nama Category");

        try {
            category cat = new category();
            ResultSet data = cat.tampilCategory();

            while (data.next()) {
                model.addRow(new Object[]{
                    data.getString("category_id"),
                    data.getString("category_name"),});

            }

        } catch (SQLException sQLException) {
        }

        tCategory.setModel(model);

    }

    void otoID() {
        try {
            category cat = new category();
            ResultSet id = cat.otoID();

            if (id.next()) {
                int auto = id.getInt("category_id") + 1;
                tIDcategory.setText(String.valueOf(auto));

            } else {
                tIDcategory.setText("1");
            }
            tIDcategory.setEditable(false);
        } catch (SQLException sQLException) {
        }

    }

    void reset() {

        tNamacategory.setText(null);
        otoID();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tIDcategory = new javax.swing.JTextField();
        tNamacategory = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tCategory = new javax.swing.JTable();
        bTamabah = new javax.swing.JButton();
        bHapus = new javax.swing.JButton();
        bUbah = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Nama Category    :");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("ID Category          :");

        tNamacategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tNamacategoryActionPerformed(evt);
            }
        });

        tCategory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "ID kategori", "kategori "
            }
        ));
        tCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tCategoryMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tCategory);

        bTamabah.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bTamabah.setText("Tambah");
        bTamabah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTamabahActionPerformed(evt);
            }
        });

        bHapus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bHapus.setText("Hapus");
        bHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHapusActionPerformed(evt);
            }
        });

        bUbah.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bUbah.setText("Ubah");
        bUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUbahActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tNamacategory, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addComponent(tIDcategory))
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(bTamabah)
                        .addGap(18, 18, 18)
                        .addComponent(bUbah)
                        .addGap(18, 18, 18)
                        .addComponent(bHapus)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tIDcategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tNamacategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bTamabah)
                    .addComponent(bUbah)
                    .addComponent(bHapus))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tNamacategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tNamacategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tNamacategoryActionPerformed

    private void bTamabahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTamabahActionPerformed
        try {
            category category = new category();

            category.setCategory_id(Integer.parseInt(tIDcategory.getText()));
            category.setCategory_name(tNamacategory.getText());

            category.tambahCategory();

        } catch (SQLException sQLException) {
        }
        loadTabel();
        reset();


    }//GEN-LAST:event_bTamabahActionPerformed

    private void tCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tCategoryMouseClicked
        int baris = tCategory.rowAtPoint(evt.getPoint());
        String idCategory = tCategory.getValueAt(baris, 0).toString();
        String namaCategory = tCategory.getValueAt(baris, 1).toString();

        tIDcategory.setText(idCategory);
        tIDcategory.setEditable(false);
        tNamacategory.setText(namaCategory);


    }//GEN-LAST:event_tCategoryMouseClicked

    private void bUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUbahActionPerformed
        try {
            category cub = new category();
            cub.setCategory_id(Integer.parseInt(tIDcategory.getText()));
            cub.setCategory_name(tNamacategory.getText());

            cub.ubahCategory();
        } catch (SQLException sQLException) {
        }

        loadTabel();
        reset();


    }//GEN-LAST:event_bUbahActionPerformed

    private void bHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHapusActionPerformed
        try {
            category cty = new category();
            cty.setCategory_id(Integer.parseInt(tIDcategory.getText()));
            cty.hapusCategory();
        } catch (SQLException sQLException) {
        }
        loadTabel();
        reset();
    }//GEN-LAST:event_bHapusActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Framecategory().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bHapus;
    private javax.swing.JButton bTamabah;
    private javax.swing.JButton bUbah;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tCategory;
    private javax.swing.JTextField tIDcategory;
    private javax.swing.JTextField tNamacategory;
    // End of variables declaration//GEN-END:variables

}
