/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Getset.adminDTO;
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
public class adminDAO {
      Connection conn;
    
    public ResultSet autenticacaoAdmin(adminDTO objadmindto){
        conn=new Conexao().connectBD();
        
        try {
            String sql = "select * from administrador where nome_admin=? and senha_admin=?";
            
            PreparedStatement pstm = conn.prepareStatement(sql);
            
            pstm.setString(1, objadmindto.getNome_admin());
            pstm.setString(2, objadmindto.getSenha_admin());
            
            ResultSet rs =pstm.executeQuery();
            return rs;
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"erro na classe adminDAO"+ erro);
            return null;
        }
    }
    
}
