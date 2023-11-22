/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Getset.bdDTO;
import Getset.edDTO;
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
public class edDAO {

    ArrayList<edDTO> lista = new ArrayList<>();
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;

    public void excluirED(int id_ed) {
        conn = new Conexao().connectBD();

        try {
            int apagar = JOptionPane.showConfirmDialog(null, "Tem Certeza que Pretende Remover a aula? ", "Actencao", JOptionPane.YES_NO_OPTION);
            if (apagar == JOptionPane.YES_OPTION) {
                pstm = conn.prepareStatement("delete from ed where id_ed like ?");
                pstm.setInt(1, id_ed);
                pstm.execute();
                JOptionPane.showMessageDialog(null, "Aula Excluida com Sucesso");
                pstm.close();
                conn.close();
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro);
        }

    }

    public ArrayList<edDTO> pesquisarcadastroDAO() {
        //pesquisa
        String sql = " select * from ed";

        conn = new Conexao().connectBD();

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                edDTO objedDTO = new edDTO();
                objedDTO.setId_ed(rs.getInt("id_ed"));
                objedDTO.setTema_ed(rs.getString("tema_ed"));
                objedDTO.setConteudo_ed(rs.getString("conteudo_ed"));

                lista.add(objedDTO);
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "erro na pesquisa do cadastro" + erro);
        }
        return lista;
    }

}
