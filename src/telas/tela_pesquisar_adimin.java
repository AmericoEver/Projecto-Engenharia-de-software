/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import DAO.CapturaDeAcessoDAO;
import DAO.Conexao;
import DAO.cadastroDAO;
import Getset.Captura_AcessoDTO;
import Getset.cadastroDTO;
//import com.itextpdf.text.Document;
//import com.itextpdf.text.DocumentException;
//import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Américo Ever
 */
public class tela_pesquisar_adimin extends javax.swing.JFrame {

    /**
     * Creates new form tela_pesquisar_adimin
     */
    public tela_pesquisar_adimin() {
        initComponents();
        captura();
        listarValores();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_captura = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_cadastrados = new javax.swing.JTable();
        btn_Actualizar = new javax.swing.JButton();
        btn_limpar_campos = new javax.swing.JButton();
        txt_id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_nome = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        txt_apelido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btn_excluir = new javax.swing.JButton();
        btn_carregar_campos = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);

        tbl_captura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "id", "nome", "data_hora"
            }
        ));
        tbl_captura.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tbl_capturaAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane2.setViewportView(tbl_captura);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(30, 630, 1210, 130);

        jLabel6.setBackground(new java.awt.Color(0, 102, 102));
        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tabela de Captura de acesso");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(480, 590, 300, 40);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("ID");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 130, 45, 25);

        tbl_cadastrados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id", "nome", "apelido", "email"
            }
        ));
        tbl_cadastrados.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tbl_cadastradosAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(tbl_cadastrados);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(30, 470, 1207, 120);

        btn_Actualizar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        btn_Actualizar.setForeground(new java.awt.Color(0, 102, 102));
        btn_Actualizar.setText("Actualizar");
        btn_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Actualizar);
        btn_Actualizar.setBounds(1043, 150, 180, 40);

        btn_limpar_campos.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        btn_limpar_campos.setForeground(new java.awt.Color(0, 102, 102));
        btn_limpar_campos.setText("Limpar Campos");
        btn_limpar_campos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpar_camposActionPerformed(evt);
            }
        });
        jPanel1.add(btn_limpar_campos);
        btn_limpar_campos.setBounds(1043, 100, 180, 40);

        txt_id.setEnabled(false);
        jPanel1.add(txt_id);
        txt_id.setBounds(30, 166, 90, 40);

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Nome");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 210, 80, 25);

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Apelido");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 300, 100, 25);

        txt_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nomeActionPerformed(evt);
            }
        });
        jPanel1.add(txt_nome);
        txt_nome.setBounds(30, 250, 900, 40);
        jPanel1.add(txt_email);
        txt_email.setBounds(30, 420, 900, 40);

        txt_apelido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apelidoActionPerformed(evt);
            }
        });
        jPanel1.add(txt_apelido);
        txt_apelido.setBounds(30, 330, 900, 40);

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("E-mail");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 390, 70, 25);

        btn_excluir.setBackground(new java.awt.Color(0, 102, 102));
        btn_excluir.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        btn_excluir.setForeground(new java.awt.Color(255, 255, 255));
        btn_excluir.setText("Excluir");
        btn_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirActionPerformed(evt);
            }
        });
        jPanel1.add(btn_excluir);
        btn_excluir.setBounds(1043, 200, 180, 40);

        btn_carregar_campos.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        btn_carregar_campos.setForeground(new java.awt.Color(0, 102, 102));
        btn_carregar_campos.setText("Carregar Campos");
        btn_carregar_campos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_carregar_camposActionPerformed(evt);
            }
        });
        jPanel1.add(btn_carregar_campos);
        btn_carregar_campos.setBounds(820, 780, 174, 40);

        btn_back.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        btn_back.setForeground(new java.awt.Color(0, 102, 102));
        btn_back.setText("Sair");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        jPanel1.add(btn_back);
        btn_back.setBounds(1053, 778, 180, 40);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo todo.jpg"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 0, 1280, 900);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1262, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 846, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ActualizarActionPerformed
        // TODO add your handling code here:

        AlterarAlunos();
        listarValores();

        //para salvar o pdf
        //        String path = "";
        //        JFileChooser pdf = new JFileChooser();
        //        pdf.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        //        int x = pdf.showSaveDialog(this);
        //
        //        if (x == JFileChooser.APPROVE_OPTION) {
        //            path = pdf.getSelectedFile().getPath();
        //        }
        //
        //        Document doc = new Document();
        //
        //        try {
        //            PdfWriter.getInstance(doc, new FileOutputStream(path + "abc.pdf"));
        //
        //            doc.open();
        //
        //
        //        } catch (DocumentException ex) {
        //            Logger.getLogger(tela_pesquisar_adimin.class.getName()).log(Level.SEVERE, null, ex);
        //        } catch (FileNotFoundException ex) {
        //            Logger.getLogger(tela_pesquisar_adimin.class.getName()).log(Level.SEVERE, null, ex);
        //        }
    }//GEN-LAST:event_btn_ActualizarActionPerformed

    private void txt_apelidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apelidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apelidoActionPerformed

    private void btn_carregar_camposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_carregar_camposActionPerformed
        // TODO add your handling code here:
        CarregarCampos();
    }//GEN-LAST:event_btn_carregar_camposActionPerformed

    private void btn_limpar_camposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpar_camposActionPerformed
        // TODO add your handling code here:

        LimparCampos();
    }//GEN-LAST:event_btn_limpar_camposActionPerformed

    private void btn_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirActionPerformed
        // TODO add your handling code here:

        ExcluirAluno();
        listarValores();
        LimparCampos();
    }//GEN-LAST:event_btn_excluirActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        tela_menu_adimin objtela_menu_adimin = new tela_menu_adimin();
        objtela_menu_adimin.setVisible(true);

        dispose();
    }//GEN-LAST:event_btn_backActionPerformed

    private void tbl_cadastradosAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tbl_cadastradosAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tbl_cadastradosAncestorAdded

    private void txt_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nomeActionPerformed

    private void tbl_capturaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tbl_capturaAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tbl_capturaAncestorAdded

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
            java.util.logging.Logger.getLogger(tela_pesquisar_adimin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela_pesquisar_adimin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela_pesquisar_adimin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela_pesquisar_adimin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela_pesquisar_adimin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Actualizar;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_carregar_campos;
    private javax.swing.JButton btn_excluir;
    private javax.swing.JButton btn_limpar_campos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbl_cadastrados;
    private javax.swing.JTable tbl_captura;
    private javax.swing.JTextField txt_apelido;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_nome;
    // End of variables declaration//GEN-END:variables

    private void captura() {
        ResultSet rs;
        PreparedStatement pstm;
        Connection conn = new Conexao().connectBD();
        try {
            String sql = "Select * from registro_acesso";
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            tbl_captura.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "erro na programacao" + erro);
        }
//       try {
//           CapturaDeAcessoDAO objCapturaDeAcessoDAO = new CapturaDeAcessoDAO();
//           
//           DefaultTableModel model = (DefaultTableModel) tbl_captura.getModel();
//           model.setNumRows(0);
//           
//           ArrayList <Captura_AcessoDTO> lista = objCapturaDeAcessoDAO.Capturar();
//           
//            for (int num = 0; num < lista.size(); num++) {
//                model.addRow(new Object[]{
//                    lista.get(num).getId(),
//                    lista.get(num).getNome(),
//                    lista.get(num).getData_hora()
//                         });
//            }
//       } catch (Exception erro) {
//           JOptionPane.showMessageDialog(null, "erro ao listar valores" + erro);
//       }
    }

    private void listarValores() {

        try {
            cadastroDAO objcadastroDAO = new cadastroDAO();

            DefaultTableModel model = (DefaultTableModel) tbl_cadastrados.getModel();
            model.setNumRows(0);

            ArrayList<cadastroDTO> lista = objcadastroDAO.pesquisarcadastroDAO();

            for (int num = 0; num < lista.size(); num++) {
                model.addRow(new Object[]{
                    lista.get(num).getId_cadastro(),
                    lista.get(num).getNome_cadastro(),
                    lista.get(num).getApelido_cadastro(),
                    lista.get(num).getEmail_cadastro(),
                    lista.get(num).getSenha_cadastro()
                });

            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "erro ao listar valores" + erro);
        }
    }

    private void CarregarCampos() {
        try {
            int setar = tbl_cadastrados.getSelectedRow();

            txt_id.setText(tbl_cadastrados.getModel().getValueAt(setar, 0).toString());
            txt_nome.setText(tbl_cadastrados.getModel().getValueAt(setar, 1).toString());
            txt_apelido.setText(tbl_cadastrados.getModel().getValueAt(setar, 2).toString());
            txt_email.setText(tbl_cadastrados.getModel().getValueAt(setar, 3).toString());
        } catch (ArrayIndexOutOfBoundsException erro) {
            JOptionPane.showMessageDialog(null,"errooo array"+ erro);
        }

    }

    private void LimparCampos() {
        txt_id.setText("");
        txt_nome.setText("");
        txt_apelido.setText("");
        txt_email.setText("");
        txt_nome.requestFocus();

    }

    private void AlterarAlunos() {
        if (txt_nome.getText().isEmpty() || txt_apelido.getText().isEmpty() || txt_email.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Tem de carregar os campos para efectuar qualquer modificacao");
        } else if (txt_email.getText().contains("@")) {

            int id_cadastro;
            String nome_cadastro, apelido_cadastro, email_cadastro;

            id_cadastro = Integer.parseInt(txt_id.getText());
            nome_cadastro = txt_nome.getText();
            apelido_cadastro = txt_apelido.getText();
            email_cadastro = txt_email.getText();

            cadastroDTO objcadastroDTO = new cadastroDTO();
            objcadastroDTO.setId_cadastro(id_cadastro);
            objcadastroDTO.setNome_cadastro(nome_cadastro);
            objcadastroDTO.setApelido_cadastro(apelido_cadastro);
            objcadastroDTO.setEmail_cadastro(email_cadastro);

            cadastroDAO objcadastroDAO = new cadastroDAO();
            objcadastroDAO.atualizarCadastro(objcadastroDTO);
            JOptionPane.showMessageDialog(null, "Actualizacao bem sucedida");

        } else {
            JOptionPane.showMessageDialog(null, "O email tem de conter @ para que seja actualizado");

        }
    }

    private void ExcluirAluno() {
        if (txt_nome.getText().isEmpty() || txt_apelido.getText().isEmpty() || txt_email.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Tem de carregar os campos para efectuar qualquer modificacao");
        } else {
            int id_cadastro;
            id_cadastro = Integer.parseInt(txt_id.getText());

            cadastroDTO objcadastroDTO = new cadastroDTO();
            objcadastroDTO.setId_cadastro(id_cadastro);

            cadastroDAO objcadastroDAO = new cadastroDAO();
            objcadastroDAO.excluirCadastro(objcadastroDTO);
        }

    }

}
