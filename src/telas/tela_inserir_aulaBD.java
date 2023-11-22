/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import DAO.Conexao;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Américo Ever
 */
public class tela_inserir_aulaBD extends javax.swing.JFrame {

    /**
     * Creates new form tela_inserir_aulaBD
     */
    public tela_inserir_aulaBD() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        btn_select = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt_caminho = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_tema_aula = new javax.swing.JTextField();
        btn_submeter = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Aulas de Base de Dados");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(330, 390, 270, 32);

        btn_select.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        btn_select.setForeground(new java.awt.Color(0, 102, 102));
        btn_select.setText("Escolher Aula");
        btn_select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_selectActionPerformed(evt);
            }
        });
        jPanel1.add(btn_select);
        btn_select.setBounds(80, 469, 170, 40);

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Caminho da Aula");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(80, 530, 160, 25);
        jPanel1.add(txt_caminho);
        txt_caminho.setBounds(80, 556, 660, 40);

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tema da Aula");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(80, 600, 150, 25);
        jPanel1.add(txt_tema_aula);
        txt_tema_aula.setBounds(80, 636, 660, 40);

        btn_submeter.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        btn_submeter.setForeground(new java.awt.Color(0, 102, 102));
        btn_submeter.setText("Submeter Aula");
        btn_submeter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_submeterActionPerformed(evt);
            }
        });
        jPanel1.add(btn_submeter);
        btn_submeter.setBounds(780, 510, 170, 40);

        btn_clear.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        btn_clear.setForeground(new java.awt.Color(0, 102, 102));
        btn_clear.setText("Limpar Campos");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        jPanel1.add(btn_clear);
        btn_clear.setBounds(780, 590, 170, 40);

        btn_back.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        btn_back.setForeground(new java.awt.Color(0, 102, 102));
        btn_back.setText("Sair");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        jPanel1.add(btn_back);
        btn_back.setBounds(780, 730, 170, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/tudo .png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 0, 1000, 1050);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 823, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        tela_diciplinas_adm objtela_diciplinas_adm = new tela_diciplinas_adm();
        objtela_diciplinas_adm.setVisible(true);

        dispose();
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_submeterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_submeterActionPerformed
        // TODO add your handling code here:
        Connection conn;
        PreparedStatement pstm;

        if (txt_caminho.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o directorio ou selecione um ficheiro");

        } else if (txt_tema_aula.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo com o tema da aula");
        } else if (txt_tema_aula.getText().contains(".txt") || txt_tema_aula.getText().contains(".pdf")
                || txt_tema_aula.getText().contains(".jpg") || txt_tema_aula.getText().contains(".png")) {
            try {
                conn = new Conexao().connectBD();
                String tema_bd = txt_tema_aula.getText();
                String Caminho = txt_caminho.getText();
                File file = new File(Caminho);
                FileInputStream fis = new FileInputStream(file);

                byte[] fileData = new byte[(int) file.length()];
                fis.read(fileData);
                fis.close();

                String sql = "insert into bd (tema_bd,conteudo_bd) values (?,?) ";
                pstm = conn.prepareStatement(sql);
                pstm.setString(1, tema_bd);
                pstm.setBytes(2, fileData);
                pstm.executeUpdate();
                pstm.close();

            } catch (Exception erro) {
                JOptionPane.showMessageDialog(null, "Erro ao submeter aula" + erro);
            }
            JOptionPane.showMessageDialog(null, "Arquivo submetido com sucesso");
        } else {
            JOptionPane.showMessageDialog(null, "adicione a extensao do arquivo a aula para poder submeter");

        }
    }//GEN-LAST:event_btn_submeterActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        // TODO add your handling code here:
        LimparCampos();
    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn_selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_selectActionPerformed
        // TODO add your handling code here:
        JFileChooser escolher = new JFileChooser();
        escolher.setDialogTitle("Procurar aquivo");
        escolher.setFileSelectionMode(JFileChooser.FILES_ONLY);

        FileNameExtensionFilter filter = new FileNameExtensionFilter("ficheiros", "pdf", "txt", "jpg", "png");

        escolher.setFileFilter(filter);
        int retorno = escolher.showOpenDialog(this);

        if (retorno == JFileChooser.APPROVE_OPTION) {
            File file = escolher.getSelectedFile();
            txt_caminho.setText(file.getPath());

        }
    }//GEN-LAST:event_btn_selectActionPerformed

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
            java.util.logging.Logger.getLogger(tela_inserir_aulaBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela_inserir_aulaBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela_inserir_aulaBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela_inserir_aulaBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela_inserir_aulaBD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_select;
    private javax.swing.JButton btn_submeter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_caminho;
    private javax.swing.JTextField txt_tema_aula;
    // End of variables declaration//GEN-END:variables
 private void LimparCampos() {
        txt_tema_aula.setText("");
        txt_caminho.setText("");
    }
}