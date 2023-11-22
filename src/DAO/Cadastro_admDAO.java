/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Getset.Cadastro_admDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Américo Ever
 */
public class Cadastro_admDAO {
     Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<Cadastro_admDTO> lista = new ArrayList<>();

    //declarei as variaveis fora do metodo pois elas serao necessarias para
    //executar outras  tarefas como alterar ou excluir 
    public void adminCadastro(Cadastro_admDTO objCadastro_admDTO) {
        String sql = "insert into  administrador (nome_admin, apelido_admin, bi_admin,nuit_admin,morrada_admin, senha_admin) values (?,?,?,?,?,?)";

        conn = new Conexao().connectBD();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objCadastro_admDTO.getNome_admin());
            pstm.setString(2, objCadastro_admDTO.getApelido_admin());
            pstm.setString(3, objCadastro_admDTO.getBi_admin());
            pstm.setInt(4, objCadastro_admDTO.getNuit_admin());
            pstm.setString(5, objCadastro_admDTO.getMorrada_admin());
            pstm.setString(6, objCadastro_admDTO.getSenha_admin());

            pstm.execute();
            JOptionPane.showMessageDialog(null, "Administrador Cadastrado com sucesso");
            pstm.close();

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "erro no ADMcadastroDAO" + erro);
        }

    }

    
}
