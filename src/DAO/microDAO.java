/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Getset.edDTO;
import Getset.microDTO;
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
public class microDAO {

    ArrayList<microDTO> lista = new ArrayList<>();
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;

    public void excluirMicro(int id) {
        conn = new Conexao().connectBD();

        try {
            int apagar = JOptionPane.showConfirmDialog(null, "Tem Certeza que Pretende Remover o Profissional? ", "Actencao", JOptionPane.YES_NO_OPTION);
            if (apagar == JOptionPane.YES_OPTION) {
                pstm = conn.prepareStatement("delete from programacao where id_prog like ?");
                pstm.setInt(1, id);
                pstm.execute();
                JOptionPane.showMessageDialog(null, "Aula Excluido com Sucesso");
                pstm.close();
                conn.close();
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro);
        }

    }

    public ArrayList<microDTO> pesquisarcadastroDAO() {
        //pesquisa
        String sql = " select * from micro";

        conn = new Conexao().connectBD();

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                microDTO objmicroDTO = new microDTO();
                objmicroDTO.setId_micro(rs.getInt("id_micro"));
                objmicroDTO.setTema_micro(rs.getString("tema_micro"));
                objmicroDTO.setConteudo_micro(rs.getString("conteudo_micro"));

                lista.add(objmicroDTO);
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "erro na pesquisa do cadastro" + erro);
        }
        return lista;
    }

}
