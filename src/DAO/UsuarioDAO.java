/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Getset.usuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Américo Ever
 */
public class UsuarioDAO {
    
    Connection conn;
    
    public ResultSet autenticacaoUsuario(usuarioDTO objusuariodto){
        conn=new Conexao().connectBD();
        
        try {
            String sql = "select * from usuario where nome_usuario=? and senha_usuario=?";
            
            PreparedStatement pstm = conn.prepareStatement(sql);
            
            pstm.setString(1, objusuariodto.getNome_usuario());
            pstm.setString(2, objusuariodto.getSenha_usuario());
            
            ResultSet rs =pstm.executeQuery();
            return rs;
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"erro na classe usuarioDAO"+ erro);
            return null;
        }
    }
    
}
