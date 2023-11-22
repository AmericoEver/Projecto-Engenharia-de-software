/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import DAO.Conexao;
import DAO.UsuarioDAO;
import DAO.adminDAO;
import DAO.cadastroDAO;
import Getset.adminDTO;
import Getset.cadastroDTO;
import Getset.usuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author Américo Ever
 */
public class tela_login extends javax.swing.JFrame {

    /**
     * Creates new form tela_login
     */
    public tela_login() {
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
        bnt_enviar_usuario = new javax.swing.JButton();
        btn_cancelar_usuario = new javax.swing.JButton();
        btn_cadastrar_usuario = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_nome_usuario = new javax.swing.JTextField();
        txt_Senha_usuario = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);

        bnt_enviar_usuario.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        bnt_enviar_usuario.setForeground(new java.awt.Color(0, 102, 102));
        bnt_enviar_usuario.setText("Entrar");
        bnt_enviar_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt_enviar_usuarioActionPerformed(evt);
            }
        });
        jPanel1.add(bnt_enviar_usuario);
        bnt_enviar_usuario.setBounds(810, 440, 139, 40);

        btn_cancelar_usuario.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        btn_cancelar_usuario.setForeground(new java.awt.Color(0, 102, 102));
        btn_cancelar_usuario.setText("Cancelar");
        btn_cancelar_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelar_usuarioActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cancelar_usuario);
        btn_cancelar_usuario.setBounds(810, 560, 140, 40);

        btn_cadastrar_usuario.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        btn_cadastrar_usuario.setForeground(new java.awt.Color(0, 102, 102));
        btn_cadastrar_usuario.setText("Cadastrar-se");
        btn_cadastrar_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrar_usuarioActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cadastrar_usuario);
        btn_cadastrar_usuario.setBounds(810, 500, 140, 40);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Senha");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(100, 460, 93, 40);

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Nome");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(100, 370, 93, 40);
        jPanel1.add(txt_nome_usuario);
        txt_nome_usuario.setBounds(100, 410, 636, 40);

        txt_Senha_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Senha_usuarioActionPerformed(evt);
            }
        });
        jPanel1.add(txt_Senha_usuario);
        txt_Senha_usuario.setBounds(100, 510, 636, 40);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/tudo .png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 0, 1003, 1060);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1003, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 713, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_Senha_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Senha_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Senha_usuarioActionPerformed

    private void btn_cadastrar_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrar_usuarioActionPerformed
        // TODO add your handling code here:
        tela_cadastro objtelacadastro = new tela_cadastro();
        objtelacadastro.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_cadastrar_usuarioActionPerformed

    private void btn_cancelar_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelar_usuarioActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_cancelar_usuarioActionPerformed

    private void bnt_enviar_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt_enviar_usuarioActionPerformed
        // TODO add your handling code here:
        Logaradimin();
        logar();
        logarCadastro();
        tratamento();
    }//GEN-LAST:event_bnt_enviar_usuarioActionPerformed

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
            java.util.logging.Logger.getLogger(tela_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnt_enviar_usuario;
    private javax.swing.JButton btn_cadastrar_usuario;
    private javax.swing.JButton btn_cancelar_usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txt_Senha_usuario;
    private javax.swing.JTextField txt_nome_usuario;
    // End of variables declaration//GEN-END:variables

    private void logar() {
        try {
            String nome_usuario, senha_usuario;

            nome_usuario = txt_nome_usuario.getText();
            senha_usuario = txt_Senha_usuario.getText();

            usuarioDTO objusuario = new usuarioDTO();
            objusuario.setNome_usuario(nome_usuario);
            objusuario.setSenha_usuario(senha_usuario);

            UsuarioDAO objusuarioDAO = new UsuarioDAO();
            ResultSet rsusuariodao = objusuarioDAO.autenticacaoUsuario(objusuario);

            if (rsusuariodao.next()) {
                //chamar tela que quero abrir
                tela_diciplinas objtela_diciplinas = new tela_diciplinas();
                objtela_diciplinas.setVisible(true);

                dispose();

            }
//            else {
//                //enviar msg de erro
//                JOptionPane.showMessageDialog(null, "usuario ou senha envalida");
//            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "erro na tela de login" + erro);

        }
    }

    private void Logaradimin() {
        try {
            String nome_admin, senha_admin;
            nome_admin = txt_nome_usuario.getText();
            senha_admin = txt_Senha_usuario.getText();

            adminDTO objadmin = new adminDTO();
            objadmin.setNome_admin(nome_admin);
            objadmin.setSenha_admin(senha_admin);

            adminDAO objadminDAO = new adminDAO();
            ResultSet rsadmindao = objadminDAO.autenticacaoAdmin(objadmin);

            if (rsadmindao.next()) {
                //chamar tela que quero abrir
                tela_menu_adimin objtela_menu_admin = new tela_menu_adimin();
                objtela_menu_admin.setVisible(true);

                dispose();
            }
//            else {
//                //enviar msg de erro
//                JOptionPane.showMessageDialog(null, "usuario ou senha envalida");
//            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "erro na tela de login" + erro);
        }

    }

    private void logarCadastro() {
        try {
            String nome_cadastro, senha_cadastro;
            nome_cadastro = txt_nome_usuario.getText();
            senha_cadastro = txt_Senha_usuario.getText();

            cadastroDTO objcadastro = new cadastroDTO();
            objcadastro.setNome_cadastro(nome_cadastro);
            objcadastro.setSenha_cadastro(senha_cadastro);

            cadastroDAO objcadastroDAO = new cadastroDAO();
            ResultSet rscadastrodao = objcadastroDAO.logarCadastro(objcadastro);

            if (rscadastrodao.next()) {
                //chamar tela que quero abrir
                tela_diciplinas objtela_diciplinas = new tela_diciplinas();
                objtela_diciplinas.setVisible(true);

                dispose();

                capturar();
    } 
//else if (txt_nome_usuario.getText().isEmpty() || txt_Senha_usuario.getText().isEmpty()) {
//                JOptionPane.showMessageDialog(null, "Insira as credenciais para que possa fazer o login");
//            } else {
//                //enviar msg de erro
//                JOptionPane.showMessageDialog(null, "usuario ou senha invalida");
//            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "erro na tela de loginCadastro" + erro);
        }

    }

    private void capturar() {
        String nome;
        nome = txt_nome_usuario.getText();
        try (Connection conn = new Conexao().connectBD();) {

            PreparedStatement pstm;

            ///capturando data e hora
            String sql = "insert into registro_acesso (nome,data_hora) values (?,?)";
            pstm = conn.prepareStatement(sql);

            //obtendo a data e hora actual
            LocalDateTime acesso = LocalDateTime.now();

            //convertendo para formato de hora adequado
            String tempoFormatado = acesso.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

            //definindo o valor do parametro
            pstm.setString(1, nome);
            pstm.setObject(2, tempoFormatado);

            pstm.executeUpdate();
            pstm.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "registro inserido na BD" + erro);
        }
    }

    private void tratamento() {
        if (txt_nome_usuario.getText().isEmpty() || txt_Senha_usuario.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Insira as credenciais para que possa fazer o login");
        }
    }
}
