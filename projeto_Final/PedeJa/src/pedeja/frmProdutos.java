/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pedeja;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Eliseu
 */
public class frmProdutos extends javax.swing.JFrame {

    /**
     * Creates new form frmProdutos
     */
    public frmProdutos() {
        initComponents();
        listarProduto();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        btnVoltarProduto = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtNomeProduto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtValorProduto = new javax.swing.JTextField();
        txtIdProduto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtImagemProduto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaProdutos = new javax.swing.JTable();
        btnCarregarProdutos = new javax.swing.JButton();
        btnAtualizarProduto = new javax.swing.JButton();
        btnExcluirProduto = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescProduto = new javax.swing.JTextArea();
        btnLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTextField5.setBackground(new java.awt.Color(242, 242, 242));
        jTextField5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setText("PRODUTOS");
        jTextField5.setAutoscrolls(false);
        jTextField5.setBorder(null);
        jTextField5.setEnabled(false);
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jTextField6.setBackground(new java.awt.Color(242, 242, 242));
        jTextField6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setText("PEDE JÁ LANCHONETE");
        jTextField6.setAutoscrolls(false);
        jTextField6.setBorder(null);
        jTextField6.setEnabled(false);
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        btnVoltarProduto.setBackground(new java.awt.Color(102, 102, 102));
        btnVoltarProduto.setText("Voltar");
        btnVoltarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarProdutoActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome");

        jLabel3.setText("Valor");

        jLabel1.setText("ID");

        txtIdProduto.setEditable(false);
        txtIdProduto.setEnabled(false);

        jLabel4.setText("Imagem");

        TabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Identificação", "Produto", "Valor", "Imagem", "Descrição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TabelaProdutos);
        if (TabelaProdutos.getColumnModel().getColumnCount() > 0) {
            TabelaProdutos.getColumnModel().getColumn(0).setResizable(false);
            TabelaProdutos.getColumnModel().getColumn(1).setResizable(false);
            TabelaProdutos.getColumnModel().getColumn(2).setResizable(false);
            TabelaProdutos.getColumnModel().getColumn(3).setResizable(false);
            TabelaProdutos.getColumnModel().getColumn(4).setResizable(false);
        }

        btnCarregarProdutos.setBackground(new java.awt.Color(0, 255, 255));
        btnCarregarProdutos.setText("Carregar");
        btnCarregarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarProdutosActionPerformed(evt);
            }
        });

        btnAtualizarProduto.setBackground(new java.awt.Color(0, 204, 0));
        btnAtualizarProduto.setText("Atualizar");
        btnAtualizarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarProdutoActionPerformed(evt);
            }
        });

        btnExcluirProduto.setBackground(new java.awt.Color(255, 0, 0));
        btnExcluirProduto.setText("Excluir");
        btnExcluirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirProdutoActionPerformed(evt);
            }
        });

        jLabel5.setText("Descrição");

        txtDescProduto.setColumns(20);
        txtDescProduto.setRows(5);
        jScrollPane2.setViewportView(txtDescProduto);

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(456, 456, 456)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btnVoltarProduto))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(btnCarregarProdutos)
                                .addGap(18, 18, 18)
                                .addComponent(btnAtualizarProduto)
                                .addGap(18, 18, 18)
                                .addComponent(btnExcluirProduto)
                                .addGap(18, 18, 18)
                                .addComponent(btnLimpar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                                .addComponent(txtImagemProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtValorProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2)))))
                .addContainerGap(162, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(779, Short.MAX_VALUE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(16, 16, 16)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(183, 183, 183)
                    .addComponent(jLabel1)
                    .addContainerGap(861, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(txtIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValorProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtImagemProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCarregarProdutos)
                    .addComponent(btnAtualizarProduto)
                    .addComponent(btnExcluirProduto)
                    .addComponent(btnLimpar))
                .addGap(23, 23, 23)
                .addComponent(btnVoltarProduto)
                .addGap(20, 20, 20))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(579, Short.MAX_VALUE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(16, 16, 16)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(62, 62, 62)
                    .addComponent(jLabel1)
                    .addContainerGap(549, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void btnVoltarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarProdutoActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnVoltarProdutoActionPerformed

    private void btnCarregarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarProdutosActionPerformed
        // TODO add your handling code here:

        int setar = TabelaProdutos.getSelectedRow();
        txtIdProduto.setText(TabelaProdutos.getModel().getValueAt(setar, 0).toString());
        txtNomeProduto.setText(TabelaProdutos.getModel().getValueAt(setar, 1).toString());
        txtValorProduto.setText(TabelaProdutos.getModel().getValueAt(setar, 2).toString());
        txtImagemProduto.setText(TabelaProdutos.getModel().getValueAt(setar, 3).toString());
        txtDescProduto.setText(TabelaProdutos.getModel().getValueAt(setar, 4).toString());

        txtNomeProduto.requestFocus();
    }//GEN-LAST:event_btnCarregarProdutosActionPerformed

    private void btnAtualizarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarProdutoActionPerformed
        // TODO add your handling code here:
        int IdProduto;
        String nomeProduto, imagemProduto, descProduto;
        double valorProduto;

        IdProduto = Integer.parseInt(txtIdProduto.getText());
        nomeProduto = txtNomeProduto.getText();
        valorProduto = Double.parseDouble(txtValorProduto.getText());
        imagemProduto = txtImagemProduto.getText();
        descProduto = txtDescProduto.getText();

        ControllerDTO objControllerDTO = new ControllerDTO();
        objControllerDTO.setIdProduto(IdProduto);
        objControllerDTO.setNomeProduto(nomeProduto);
        objControllerDTO.setValorProduto(valorProduto);
        objControllerDTO.setImagemProduto(imagemProduto);
        objControllerDTO.setDescProduto(descProduto);

        ModelDAO objModelDAO = new ModelDAO();
        objModelDAO.alterarProduto(objControllerDTO);
        limparDados();
        listarProduto();
    }//GEN-LAST:event_btnAtualizarProdutoActionPerformed

    private void btnExcluirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirProdutoActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(null, "Deseja excluir este produto?", 
                "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == 0) { 
            int id_produto; 
            
            int setar = TabelaProdutos.getSelectedRow();
            id_produto = Integer.parseInt(TabelaProdutos.getModel().getValueAt(setar, 0).toString());
            
            ControllerDTO objControllerDTO = new ControllerDTO();
            objControllerDTO.setIdProduto(id_produto);

            ModelDAO objModelDAO = new ModelDAO();
            objModelDAO.excluirProduto(objControllerDTO);
            listarProduto();
        }
    }//GEN-LAST:event_btnExcluirProdutoActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // TODO add your handling code here:
        limparDados();
    }//GEN-LAST:event_btnLimparActionPerformed
    
    public void listarProduto(){
        try{
                ModelDAO objModelDAO = new ModelDAO();

                DefaultTableModel model = (DefaultTableModel) TabelaProdutos.getModel();
                model.setNumRows(0);
                ArrayList<ControllerDTO> lista = objModelDAO.ListarProdutos();

                for(int num=0; num < lista.size(); num++){
                    model.addRow(new Object[]{
                        lista.get(num).getIdProduto(),
                        lista.get(num).getNomeProduto(),
                        lista.get(num).getValorProduto(),
                        lista.get(num).getImagemProduto(),
                        lista.get(num).getDescProduto(),
                    });
                }
            } catch (Exception e) { 
            }
    }

    public void limparDados(){
        txtIdProduto.setText("");
        txtNomeProduto.setText("");
        txtValorProduto.setText("");
        txtImagemProduto.setText("");
        txtDescProduto.setText("");
    }
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
            java.util.logging.Logger.getLogger(frmProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelaProdutos;
    private javax.swing.JButton btnAtualizarProduto;
    private javax.swing.JButton btnCarregarProdutos;
    private javax.swing.JButton btnExcluirProduto;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnVoltarProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextArea txtDescProduto;
    private javax.swing.JTextField txtIdProduto;
    private javax.swing.JTextField txtImagemProduto;
    private javax.swing.JTextField txtNomeProduto;
    private javax.swing.JTextField txtValorProduto;
    // End of variables declaration//GEN-END:variables
}
