/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import DAO.Conexao;
import DAO.bdDAO;
import DAO.edDAO;
import DAO.microDAO;
import DAO.progDAO;
import DAO.pwDAO;
import DAO.sdDAO;
import Getset.bdDTO;
import Getset.edDTO;
import Getset.microDTO;
import Getset.progDTO;
import Getset.pwDTO;
import Getset.sdDTO;
import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Américo Ever
 */
public class tela_pesq_aulas extends javax.swing.JFrame {

    /**
     * Creates new form tela_pesq_aulas
     */
    public tela_pesq_aulas() {
        initComponents();
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

        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        cbx_discplinas = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_tema = new javax.swing.JTextField();
        Jscrol = new javax.swing.JScrollPane();
        tbl_data = new javax.swing.JTable();
        btn_carregar = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_apagar = new javax.swing.JButton();
        btn_selectNew = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txt_caminho = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Menu de Modificacao e insersao de novas Aulas");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(340, 20, 550, 32);

        cbx_discplinas.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        cbx_discplinas.setForeground(new java.awt.Color(0, 102, 102));
        cbx_discplinas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Selecione Disciplina--", "Programacao", "Prog_WEB", "Sistemas_Distribuidos", "Micro_Comp_Pessoais", "Eletronica_Digital", "Base_de_Dados" }));
        cbx_discplinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_discplinasActionPerformed(evt);
            }
        });
        jPanel3.add(cbx_discplinas);
        cbx_discplinas.setBounds(70, 100, 230, 31);

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("ID:");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(70, 160, 22, 25);
        jPanel3.add(txt_id);
        txt_id.setBounds(100, 146, 40, 40);

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("Tema Da Aula: ");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(70, 200, 140, 25);
        jPanel3.add(txt_tema);
        txt_tema.setBounds(70, 236, 770, 40);

        Jscrol.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        Jscrol.setToolTipText("");
        Jscrol.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                JscrolAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        tbl_data.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        tbl_data.setForeground(new java.awt.Color(0, 102, 102));
        tbl_data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Tema da Aula"
            }
        ));
        tbl_data.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tbl_dataAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        Jscrol.setViewportView(tbl_data);

        jPanel3.add(Jscrol);
        Jscrol.setBounds(70, 440, 1140, 240);

        btn_carregar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        btn_carregar.setForeground(new java.awt.Color(0, 102, 102));
        btn_carregar.setText("Carregar Campos");
        btn_carregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_carregarActionPerformed(evt);
            }
        });
        jPanel3.add(btn_carregar);
        btn_carregar.setBounds(805, 749, 190, 40);

        btn_back.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        btn_back.setForeground(new java.awt.Color(0, 102, 102));
        btn_back.setText("Sair");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        jPanel3.add(btn_back);
        btn_back.setBounds(1051, 749, 150, 40);

        btn_clear.setBackground(new java.awt.Color(0, 102, 102));
        btn_clear.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        btn_clear.setForeground(new java.awt.Color(255, 255, 255));
        btn_clear.setText("Limpar Campos");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        jPanel3.add(btn_clear);
        btn_clear.setBounds(1043, 230, 170, 40);

        btn_update.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        btn_update.setForeground(new java.awt.Color(0, 102, 102));
        btn_update.setText("Actualizar");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        jPanel3.add(btn_update);
        btn_update.setBounds(1043, 179, 170, 40);

        btn_apagar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        btn_apagar.setForeground(new java.awt.Color(0, 102, 102));
        btn_apagar.setText("Apagar");
        btn_apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_apagarActionPerformed(evt);
            }
        });
        jPanel3.add(btn_apagar);
        btn_apagar.setBounds(1043, 129, 170, 40);

        btn_selectNew.setBackground(new java.awt.Color(0, 102, 102));
        btn_selectNew.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        btn_selectNew.setForeground(new java.awt.Color(255, 255, 255));
        btn_selectNew.setText("Selecionar Nova Aula");
        btn_selectNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_selectNewActionPerformed(evt);
            }
        });
        jPanel3.add(btn_selectNew);
        btn_selectNew.setBounds(70, 290, 209, 40);

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Caminho da Aula");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(70, 350, 180, 40);

        txt_caminho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_caminhoActionPerformed(evt);
            }
        });
        jPanel3.add(txt_caminho);
        txt_caminho.setBounds(70, 390, 1140, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo todo.jpg"))); // NOI18N
        jPanel3.add(jLabel1);
        jLabel1.setBounds(0, 0, 1310, 890);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1279, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 869, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        // TODO add your handling code here:
        updade();
        listarValores();
    }//GEN-LAST:event_btn_updateActionPerformed

    private void cbx_discplinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_discplinasActionPerformed
        // TODO add your handling code here:
        listarValores();
        selectAllFrom();

    }//GEN-LAST:event_cbx_discplinasActionPerformed

    private void tbl_dataAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tbl_dataAncestorAdded
        // TODO add your handling code here:
        listarValores();

    }//GEN-LAST:event_tbl_dataAncestorAdded

    private void JscrolAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_JscrolAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_JscrolAncestorAdded

    private void btn_carregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_carregarActionPerformed
        // TODO add your handling code here:
        CarregarCampos();
    }//GEN-LAST:event_btn_carregarActionPerformed

    private void btn_apagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_apagarActionPerformed
        // TODO add your handling code here:

        excluir();
        listarValores();
    }//GEN-LAST:event_btn_apagarActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        // TODO add your handling code here:
        LimparCampos();
    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn_selectNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_selectNewActionPerformed
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
    }//GEN-LAST:event_btn_selectNewActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        tela_menu_adimin objtela_menu_adimin = new tela_menu_adimin();
        objtela_menu_adimin.setVisible(true);

        dispose();
    }//GEN-LAST:event_btn_backActionPerformed

    private void txt_caminhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_caminhoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_caminhoActionPerformed

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
            java.util.logging.Logger.getLogger(tela_pesq_aulas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela_pesq_aulas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela_pesq_aulas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela_pesq_aulas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela_pesq_aulas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane Jscrol;
    private javax.swing.JButton btn_apagar;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_carregar;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_selectNew;
    private javax.swing.JButton btn_update;
    private javax.swing.JComboBox<String> cbx_discplinas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTable tbl_data;
    private javax.swing.JTextField txt_caminho;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_tema;
    // End of variables declaration//GEN-END:variables
 private void selectAllFrom() {
        Connection conn;
        PreparedStatement pstm;
        ResultSet rs;
        if (cbx_discplinas.getSelectedItem().equals("Programacao")) {
            conn = new Conexao().connectBD();
            try {
                String sql = "Select * from programacao";
                pstm = conn.prepareStatement(sql);
                rs = pstm.executeQuery();

                tbl_data.setModel(DbUtils.resultSetToTableModel(rs));

            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "erro na programacao" + erro);
            }
        } else if (cbx_discplinas.getSelectedItem().equals("Prog_WEB")) {
            conn = new Conexao().connectBD();
            try {
                String sql = "Select * from pw";
                pstm = conn.prepareStatement(sql);
                rs = pstm.executeQuery();

                tbl_data.setModel(DbUtils.resultSetToTableModel(rs));

            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "erro na programacao web" + erro);
            }
        } else if (cbx_discplinas.getSelectedItem().equals("Sistemas_Distribuidos")) {
            conn = new Conexao().connectBD();
            try {
                String sql = "Select * from sd";
                pstm = conn.prepareStatement(sql);
                rs = pstm.executeQuery();

                tbl_data.setModel(DbUtils.resultSetToTableModel(rs));

            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "erro na sd" + erro);
            }
        } else if (cbx_discplinas.getSelectedItem().equals("Micro_Comp_Pessoais")) {
            conn = new Conexao().connectBD();
            try {
                String sql = "Select * from micro";
                pstm = conn.prepareStatement(sql);
                rs = pstm.executeQuery();

                tbl_data.setModel(DbUtils.resultSetToTableModel(rs));

            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "erro na micro" + erro);
            }
        } else if (cbx_discplinas.getSelectedItem().equals("Eletronica_Digital")) {
            conn = new Conexao().connectBD();
            try {
                String sql = "Select * from ed";
                pstm = conn.prepareStatement(sql);
                rs = pstm.executeQuery();

                tbl_data.setModel(DbUtils.resultSetToTableModel(rs));

            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "erro na ed" + erro);
            }
        } else if (cbx_discplinas.getSelectedItem().equals("Base_de_Dados")) {
            conn = new Conexao().connectBD();
            try {
                String sql = "Select * from bd";
                pstm = conn.prepareStatement(sql);
                rs = pstm.executeQuery();

                tbl_data.setModel(DbUtils.resultSetToTableModel(rs));

            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "erro na bd" + erro);
            }
        }
    }

    private void LimparCampos() {
        txt_id.setText("");
        txt_caminho.setText("");
        txt_tema.setText("");

    }

    private void CarregarCampos() {

        if (cbx_discplinas.getSelectedItem().equals("Programacao")) {
            int setar = tbl_data.getSelectedRow();

            txt_id.setText(tbl_data.getModel().getValueAt(setar, 0).toString());
            txt_tema.setText(tbl_data.getModel().getValueAt(setar, 1).toString());
        } else if (cbx_discplinas.getSelectedItem().equals("Prog_WEB")) {
            int setar = tbl_data.getSelectedRow();

            txt_id.setText(tbl_data.getModel().getValueAt(setar, 0).toString());
            txt_tema.setText(tbl_data.getModel().getValueAt(setar, 1).toString());
        } else if (cbx_discplinas.getSelectedItem().equals("Sistemas_Distribuidos")) {
            int setar = tbl_data.getSelectedRow();

            txt_id.setText(tbl_data.getModel().getValueAt(setar, 0).toString());
            txt_tema.setText(tbl_data.getModel().getValueAt(setar, 1).toString());
        } else if (cbx_discplinas.getSelectedItem().equals("Micro_Comp_Pessoais")) {
            int setar = tbl_data.getSelectedRow();

            txt_id.setText(tbl_data.getModel().getValueAt(setar, 0).toString());
            txt_tema.setText(tbl_data.getModel().getValueAt(setar, 1).toString());
        } else if (cbx_discplinas.getSelectedItem().equals("Eletronica_Digital")) {
            int setar = tbl_data.getSelectedRow();

            txt_id.setText(tbl_data.getModel().getValueAt(setar, 0).toString());
            txt_tema.setText(tbl_data.getModel().getValueAt(setar, 1).toString());
        } else if (cbx_discplinas.getSelectedItem().equals("Base_de_Dados")) {
            int setar = tbl_data.getSelectedRow();

            txt_id.setText(tbl_data.getModel().getValueAt(setar, 0).toString());
            txt_tema.setText(tbl_data.getModel().getValueAt(setar, 1).toString());
        } else {
            JOptionPane.showMessageDialog(null, "Tem de selecionar uma linha para carregar os campos");

        }
    }

    private void excluir() {
        if (txt_id.getText().isEmpty() || txt_tema.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Tem de carregar os campos para efectuar qualquer modificacao");
        } else {
            if (cbx_discplinas.getSelectedItem().equals("Programacao")) {
                int id_prog = Integer.parseInt(txt_id.getText());
                progDAO obj_progDAO = new progDAO();
                obj_progDAO.excluirProg(id_prog);
                txt_id.setText(null);

            } else if (cbx_discplinas.getSelectedItem().equals("Prog_WEB")) {
                int id_pw = Integer.parseInt(txt_id.getText());
                pwDAO obj_pwDAO = new pwDAO();
                obj_pwDAO.excluirPW(id_pw);
                txt_id.setText(null);

            } else if (cbx_discplinas.getSelectedItem().equals("Sistemas_Distribuidos")) {
                int id_sd = Integer.parseInt(txt_id.getText());
                sdDAO obj_sdDAO = new sdDAO();
                obj_sdDAO.excluirSD(id_sd);
                txt_id.setText(null);

            } else if (cbx_discplinas.getSelectedItem().equals("Micro_Comp_Pessoais")) {
                int id_micro = Integer.parseInt(txt_id.getText());
                microDAO obj_microDAO = new microDAO();
                obj_microDAO.excluirMicro(id_micro);
                txt_id.setText(null);

            } else if (cbx_discplinas.getSelectedItem().equals("Eletronica_Digital")) {
                int id_ed = Integer.parseInt(txt_id.getText());
                edDAO obj_edDAO = new edDAO();
                obj_edDAO.excluirED(id_ed);
                txt_id.setText(null);

            } else if (cbx_discplinas.getSelectedItem().equals("Base_de_Dados")) {
                int id_bd = Integer.parseInt(txt_id.getText());
                bdDAO obj_bdDAO = new bdDAO();
                obj_bdDAO.excluirBD(id_bd);
                txt_id.setText(null);

            }
        }

    }

    private void listarValores() {
        if (cbx_discplinas.getSelectedItem().equals("Programacao")) {
            try {
                progDAO objprogDAO = new progDAO();

                DefaultTableModel model = (DefaultTableModel) tbl_data.getModel();
                model.setNumRows(0);

                ArrayList<progDTO> lista = objprogDAO.pesquisarcadastroDAO();

                for (int num = 0; num < lista.size(); num++) {
                    model.addRow(new Object[]{
                        lista.get(num).getId_prog(),
                        lista.get(num).getTema_prog(),
                        lista.get(num).getConteudo_prog()
                    });

                }

            } catch (Exception erro) {
                JOptionPane.showMessageDialog(null, "erro ao listar valores" + erro);
            }
        } else if (cbx_discplinas.getSelectedItem().equals("Prog_WEB")) {
            try {
                pwDAO objpwDAO = new pwDAO();

                DefaultTableModel model = (DefaultTableModel) tbl_data.getModel();
                model.setNumRows(0);

                ArrayList<pwDTO> lista = objpwDAO.pesquisarcadastroDAO();

                for (int num = 0; num < lista.size(); num++) {
                    model.addRow(new Object[]{
                        lista.get(num).getId_pw(),
                        lista.get(num).getTema_pw(),
                        lista.get(num).getConteudo_pw()
                    });

                }

            } catch (Exception erro) {
                JOptionPane.showMessageDialog(null, "erro ao listar valores" + erro);
            }
        } else if (cbx_discplinas.getSelectedItem().equals("Sistemas_istribuidos")) {
            try {
                sdDAO objsdDAO = new sdDAO();

                DefaultTableModel model = (DefaultTableModel) tbl_data.getModel();
                model.setNumRows(0);

                ArrayList<sdDTO> lista = objsdDAO.pesquisarcadastroDAO();

                for (int num = 0; num < lista.size(); num++) {
                    model.addRow(new Object[]{
                        lista.get(num).getId_sd(),
                        lista.get(num).getTema_sd(),
                        lista.get(num).getConteudo_sd()
                    });

                }

            } catch (Exception erro) {
                JOptionPane.showMessageDialog(null, "erro ao listar valores" + erro);
            }
        } else if (cbx_discplinas.getSelectedItem().equals("Micro_Comp_Pessoais")) {
            try {
                microDAO objmicroDAO = new microDAO();

                DefaultTableModel model = (DefaultTableModel) tbl_data.getModel();
                model.setNumRows(0);

                ArrayList<microDTO> lista = objmicroDAO.pesquisarcadastroDAO();

                for (int num = 0; num < lista.size(); num++) {
                    model.addRow(new Object[]{
                        lista.get(num).getId_micro(),
                        lista.get(num).getTema_micro(),
                        lista.get(num).getConteudo_micro()
                    });

                }

            } catch (Exception erro) {
                JOptionPane.showMessageDialog(null, "erro ao listar valores" + erro);
            }
        } else if (cbx_discplinas.getSelectedItem().equals("Eletronica_Digital")) {
            try {
                edDAO objedDAO = new edDAO();

                DefaultTableModel model = (DefaultTableModel) tbl_data.getModel();
                model.setNumRows(0);

                ArrayList<edDTO> lista = objedDAO.pesquisarcadastroDAO();

                for (int num = 0; num < lista.size(); num++) {
                    model.addRow(new Object[]{
                        lista.get(num).getId_ed(),
                        lista.get(num).getTema_ed(),
                        lista.get(num).getConteudo_ed()
                    });

                }

            } catch (Exception erro) {
                JOptionPane.showMessageDialog(null, "erro ao listar valores" + erro);
            }
        } else if (cbx_discplinas.getSelectedItem().equals("Base_de_Dados")) {
            try {
                bdDAO objbdDAO = new bdDAO();

                DefaultTableModel model = (DefaultTableModel) tbl_data.getModel();
                model.setNumRows(0);

                ArrayList<bdDTO> lista = objbdDAO.pesquisarcadastroDAO();

                for (int num = 0; num < lista.size(); num++) {
                    model.addRow(new Object[]{
                        lista.get(num).getId_bd(),
                        lista.get(num).getTema_bd(),
                        lista.get(num).getConteudo_bd()
                    });

                }

            } catch (Exception erro) {
                JOptionPane.showMessageDialog(null, "erro ao listar valores" + erro);
            }
        }
    }

    private void updade() {
        Connection conn;
        PreparedStatement pstm;

        if (txt_id.getText().isEmpty() || txt_tema.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Tem de carregar os campos para efectuar qualquer modificacao");
        } else if (txt_tema.getText().contains(".txt") || txt_tema.getText().contains(".pdf")
                || txt_tema.getText().contains(".jpg") || txt_tema.getText().contains(".png")) {
            if (cbx_discplinas.getSelectedItem().equals("Base_de_Dados")) {

                try {

                    conn = new Conexao().connectBD();

                    int id_bd = Integer.parseInt(txt_id.getText());
                    String tema_bd = txt_tema.getText();
                    String conteudo_bd = txt_caminho.getText();
                    File file = new File(conteudo_bd);
                    FileInputStream fis = new FileInputStream(file);
                    byte[] fileData = new byte[(int) file.length()];
                    fis.read(fileData);
                    fis.close();

                    String sql = "update bd set tema_bd=?, conteudo_bd=? where id_bd=?";
                    pstm = conn.prepareStatement(sql);
                    pstm.setString(1, tema_bd);
                    pstm.setBytes(2, fileData);
                    pstm.setInt(3, id_bd);

                    pstm.executeUpdate();
                    pstm.close();
                    JOptionPane.showMessageDialog(null, "Aula actualizada com sucesso");

                } catch (IOException | NumberFormatException | SQLException erro) {
                    JOptionPane.showMessageDialog(null, "Erro ao actualizar aula" + erro);
                }

            } else if (cbx_discplinas.getSelectedItem().equals("Eletronica_Digital")) {

                try {

                    conn = new Conexao().connectBD();

                    int id_ed = Integer.parseInt(txt_id.getText());
                    String tema_ed = txt_tema.getText();
                    String conteudo_ed = txt_caminho.getText();
                    File file = new File(conteudo_ed);
                    FileInputStream fis = new FileInputStream(file);
                    byte[] fileData = new byte[(int) file.length()];
                    fis.read(fileData);
                    fis.close();

                    String sql = "update ed set tema_ed=?, conteudo_ed=? where id_ed=?";
                    pstm = conn.prepareStatement(sql);
                    pstm.setString(1, tema_ed);
                    pstm.setBytes(2, fileData);
                    pstm.setInt(3, id_ed);

                    pstm.executeUpdate();
                    pstm.close();
                    JOptionPane.showMessageDialog(null, "Aula actualizada com sucesso");

                } catch (Exception erro) {
                    JOptionPane.showMessageDialog(null, "Erro ao actualizar aula" + erro);
                }
            } else if (cbx_discplinas.getSelectedItem().equals("Micro_Comp_Pessoais")) {

                try {

                    conn = new Conexao().connectBD();

                    int id_micro = Integer.parseInt(txt_id.getText());
                    String tema_micro = txt_tema.getText();
                    String conteudo_micro = txt_caminho.getText();
                    File file = new File(conteudo_micro);
                    FileInputStream fis = new FileInputStream(file);
                    byte[] fileData = new byte[(int) file.length()];
                    fis.read(fileData);
                    fis.close();

                    String sql = "update micro set tema_micro=?, conteudo_micro=? where id_micro=?";
                    pstm = conn.prepareStatement(sql);
                    pstm.setString(1, tema_micro);
                    pstm.setBytes(2, fileData);
                    pstm.setInt(3, id_micro);

                    pstm.executeUpdate();
                    pstm.close();
                    JOptionPane.showMessageDialog(null, "Aula actualizada com sucesso");

                } catch (Exception erro) {
                    JOptionPane.showMessageDialog(null, "Erro ao actualizar aula" + erro);
                }
            } else if (cbx_discplinas.getSelectedItem().equals("Sistemas_istribuidos")) {

                try {

                    conn = new Conexao().connectBD();

                    int id_sd = Integer.parseInt(txt_id.getText());
                    String tema_sd = txt_tema.getText();
                    String conteudo_sd = txt_caminho.getText();
                    File file = new File(conteudo_sd);
                    FileInputStream fis = new FileInputStream(file);
                    byte[] fileData = new byte[(int) file.length()];
                    fis.read(fileData);
                    fis.close();

                    String sql = "update sd set tema_sd=?, conteudo_sd=? where id_sd=?";
                    pstm = conn.prepareStatement(sql);
                    pstm.setString(1, tema_sd);
                    pstm.setBytes(2, fileData);
                    pstm.setInt(3, id_sd);

                    pstm.executeUpdate();
                    pstm.close();
                    JOptionPane.showMessageDialog(null, "Aula actualizada com sucesso");

                } catch (IOException | NumberFormatException | SQLException erro) {
                    JOptionPane.showMessageDialog(null, "Erro ao actualizar aula" + erro);
                }
            } else if (cbx_discplinas.getSelectedItem().equals("Prog_WEB")) {

                try {

                    conn = new Conexao().connectBD();

                    int id_pw = Integer.parseInt(txt_id.getText());
                    String tema_pw = txt_tema.getText();
                    String conteudo_pw = txt_caminho.getText();
                    File file = new File(conteudo_pw);
                    FileInputStream fis = new FileInputStream(file);
                    byte[] fileData = new byte[(int) file.length()];
                    fis.read(fileData);
                    fis.close();

                    String sql = "update pw set tema_pw=?, conteudo_pw=? where id_pw=?";
                    pstm = conn.prepareStatement(sql);
                    pstm.setString(1, tema_pw);
                    pstm.setBytes(2, fileData);
                    pstm.setInt(3, id_pw);

                    pstm.executeUpdate();
                    pstm.close();
                    JOptionPane.showMessageDialog(null, "Aula actualizada com sucesso");

                } catch (Exception erro) {
                    JOptionPane.showMessageDialog(null, "Erro ao actualizar aula" + erro);
                }
            } else if (cbx_discplinas.getSelectedItem().equals("Programacao")) {

                try {

                    conn = new Conexao().connectBD();

                    int id_prog = Integer.parseInt(txt_id.getText());
                    String tema_prog = txt_tema.getText();
                    String conteudo_prog = txt_caminho.getText();
                    File file = new File(conteudo_prog);
                    FileInputStream fis = new FileInputStream(file);
                    byte[] fileData = new byte[(int) file.length()];
                    fis.read(fileData);
                    fis.close();

                    String sql = "update programacao set tema_prog=?, conteudo_prog=? where id_prog=?";
                    pstm = conn.prepareStatement(sql);
                    pstm.setString(1, tema_prog);
                    pstm.setBytes(2, fileData);
                    pstm.setInt(3, id_prog);

                    pstm.executeUpdate();
                    pstm.close();
                    JOptionPane.showMessageDialog(null, "Aula actualizada com sucesso");

                } catch (Exception erro) {
                    JOptionPane.showMessageDialog(null, "Erro ao actualizar aula" + erro);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Tem de adicionar a extensao do arquivo");

        }
    }

}
