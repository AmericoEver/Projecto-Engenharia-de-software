/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Getset.bdDTO;
import Getset.cadastroDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Américo Ever
 */
public class bdDAO {

    ArrayList<bdDTO> lista = new ArrayList<>();
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;

    public void excluirBD(int id_bd) {
        conn = new Conexao().connectBD();

        try {
            int apagar = JOptionPane.showConfirmDialog(null, "Tem Certeza que Pretende Remover o Profissional? ", "Actencao", JOptionPane.YES_NO_OPTION);
            if (apagar == JOptionPane.YES_OPTION) {
                pstm = conn.prepareStatement("delete from bd where id_bd like ?");
                pstm.setInt(1, id_bd);
                pstm.execute();
                JOptionPane.showMessageDialog(null, "Aula Excluido com Sucesso");
                pstm.close();
                conn.close();
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro);
        }

    }
//     public List<bdDAO> listar(){
//        
//        List<bdDAO> lst = new ArrayList<bdDAO>();
//        try{
//            pstm = conn.prepareStatement("select * from  carpintaria");
//            rs = pstm.executeQuery();
//            
//            while(rs.next()) {
//               bdDAO obj_bdDAO = new bdDAO(); 
//               
//               obj_bdDAO.setId_bd(rs.getInt(1));
//               obj_bdDAO.setNome_carp(rs.getString(2));
//               obj_bdDAO.setCodigo_carp(rs.getString(3));
//               obj_bdDAO.setCategoria_carp(rs.getString(4));
//               obj_bdDAO.setCurso(rs.getString(5));
//               obj_bdDAO.setContacto(rs.getInt(6));
//               obj_bdDAO.setEmail(rs.getString(7));
//               
//               lst.add(carp);
//            }
//            stmt.close();
//            rs.close();
//            conn.close();
//             return lst;
//        }catch(SQLException e){
//            System.out.println(e.getMessage());
//        }
//        return null;
//    }

    public ArrayList<bdDTO> pesquisarcadastroDAO() {
        //pesquisa
        String sql = " select * from bd";

        conn = new Conexao().connectBD();

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                bdDTO objbdDTO = new bdDTO();
                objbdDTO.setId_bd(rs.getInt("id_bd"));
                objbdDTO.setTema_bd(rs.getString("tema_bd"));
                objbdDTO.setConteudo_bd(rs.getString("conteudo_bd"));

                lista.add(objbdDTO);
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "erro na pesquisa do cadastro" + erro);
        }
        return lista;
    }

    public void atualizarBD(bdDTO objbdDTO) {

        String sql = ("update bd set tema_bd=?, conteudo_bd=? where id_bd=?");
        conn = new Conexao().connectBD();

        try {
            pstm = conn.prepareStatement(sql);

            pstm.setString(1, objbdDTO.getTema_bd());
            pstm.setString(2, objbdDTO.getConteudo_bd());
            pstm.setInt(3, objbdDTO.getId_bd());

            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "erro no metodo actualizar cadastro" + erro);
        }
    }

}
