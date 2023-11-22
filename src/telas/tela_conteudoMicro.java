/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import DAO.Conexao;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static telas.tela_conteudoBD.salavarBlob;

/**
 *
 * @author Américo Ever
 */
public class tela_conteudoMicro extends javax.swing.JFrame {

    /**
     * Creates new form tela_conteudoMicro
     */
    public tela_conteudoMicro() {
        initComponents();
        PopularCBX();
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
        btn_save = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jcb_ids = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        btn_back = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);

        btn_save.setBackground(new java.awt.Color(0, 102, 102));
        btn_save.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        btn_save.setForeground(new java.awt.Color(255, 255, 255));
        btn_save.setText("Salvar Aula");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });
        jPanel1.add(btn_save);
        btn_save.setBounds(1060, 110, 160, 40);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Micro Processadores Aulas");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(43, 56, 310, 32);

        jcb_ids.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jcb_ids.setForeground(new java.awt.Color(0, 102, 102));
        jPanel1.add(jcb_ids);
        jcb_ids.setBounds(40, 100, 460, 30);

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Conteudo da aula");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(1060, 70, 160, 25);

        btn_back.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        btn_back.setForeground(new java.awt.Color(0, 102, 102));
        btn_back.setText("Voltar");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        jPanel1.add(btn_back);
        btn_back.setBounds(1065, 699, 140, 40);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/giphy.gif"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(380, 200, 460, 340);

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Salve a aula com o mesmo nome e extensao que for visualizado na caixa de seleção");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(260, 550, 790, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo todo.jpg"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 1280, 820);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1275, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 789, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        tela_diciplinas objtela_diciplinas = new tela_diciplinas();
        objtela_diciplinas.setVisible(true);

        dispose();
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        // TODO add your handling code here:
        Connection conn;
        PreparedStatement pstm;
        ResultSet rs;

        try {
            conn = new Conexao().connectBD();
            String sql = "select conteudo_micro from micro where tema_micro=?";
            pstm = conn.prepareStatement(sql);

            ///// definindo o valor do parametro para o id do registro
            pstm.setString(1, (String) jcb_ids.getSelectedItem());
            rs = pstm.executeQuery();

            if (rs.next()) {
                Blob blob = rs.getBlob("conteudo_micro");
                //new
                InputStream inputStream = blob.getBinaryStream();

                // abrindo o dialogo de selecao do arquivo
                JFileChooser escolher = new JFileChooser();
                int userSelection = escolher.showSaveDialog(null);

                if (userSelection == JFileChooser.APPROVE_OPTION) {
                    File ficheiroSalvar = escolher.getSelectedFile();

                    //salva o conteudo do blob em um arquivo
                    salavarBlob(inputStream, ficheiroSalvar);
                    JOptionPane.showMessageDialog(null, "arquivo salvo com sucesso");
                }
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ocorreu um erro ao salvar o arquivo" + erro);
        }
    }//GEN-LAST:event_btn_saveActionPerformed

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
            java.util.logging.Logger.getLogger(tela_conteudoMicro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela_conteudoMicro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela_conteudoMicro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela_conteudoMicro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela_conteudoMicro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_save;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jcb_ids;
    // End of variables declaration//GEN-END:variables
public static void salavarBlob(InputStream inputStream, File file) {
        try (FileOutputStream outputStream = new FileOutputStream(file)) {
            byte[] buffer = new byte[4096];
            int bytesRead;

            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
        } catch (IOException erro) {
            JOptionPane.showMessageDialog(null, "erro ao salvar blob" + erro);
        }
    }

    private void PopularCBX() {
        Connection conn;
        PreparedStatement pstm;
        ResultSet rs;

        try {
            conn = new Conexao().connectBD();
            Statement statement = conn.createStatement();

            String sql = "select tema_micro from micro";
            rs = statement.executeQuery(sql);

            //adicionar dados a combobox
            while (rs.next()) {
                String tema = rs.getString("tema_micro");
                jcb_ids.addItem(tema);
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "errooooo" + erro);
        }
    }
}