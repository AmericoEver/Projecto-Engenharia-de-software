/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Getset.cadastroDTO;
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
public class cadastroDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<cadastroDTO> lista = new ArrayList<>();

    //declarei as variaveis fora do metodo pois elas serao necessarias para
    //executar outras  tarefas como alterar ou excluir 
    public void novocadastro(cadastroDTO objcadastroDTO) {
        String sql = "insert into cadastro (nome_cadastro, apelido_cadastro, email_cadastro, senha_cadastro) values (?,?,?,?)";

        conn = new Conexao().connectBD();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objcadastroDTO.getNome_cadastro());
            pstm.setString(2, objcadastroDTO.getApelido_cadastro());
            pstm.setString(3, objcadastroDTO.getEmail_cadastro());
            pstm.setString(4, objcadastroDTO.getSenha_cadastro());

            pstm.execute();
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");
            pstm.close();

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "erro no cadastroDAO" + erro);
        }

    }

    public ResultSet logarCadastro(cadastroDTO objcadastroDTO) {
        conn = new Conexao().connectBD();

        try {
            String sql = "select * from cadastro where nome_cadastro=? and senha_cadastro=?";
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objcadastroDTO.getNome_cadastro());
            pstm.setString(2, objcadastroDTO.getSenha_cadastro());
            ResultSet rs = pstm.executeQuery();
            return rs;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "erro no Logarcadastro" + erro);
            return null;
        }

    }

    public ArrayList<cadastroDTO> pesquisarcadastroDAO() {
        //pesquisa
        String sql = " select * from cadastro";

        conn = new Conexao().connectBD();

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                cadastroDTO objcadastroDTO = new cadastroDTO();
                objcadastroDTO.setId_cadastro(rs.getInt("id_cadastro"));
                objcadastroDTO.setNome_cadastro(rs.getString("nome_cadastro"));
                objcadastroDTO.setApelido_cadastro(rs.getString("apelido_cadastro"));
                objcadastroDTO.setEmail_cadastro(rs.getString("email_cadastro"));
                objcadastroDTO.setSenha_cadastro(rs.getString("senha_cadastro"));

                lista.add(objcadastroDTO);
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "erro na pesquisa do cadastro" + erro);
        }
        return lista;
    }

    public void atualizarCadastro(cadastroDTO objcadastroDTO) {

        String sql = ("update cadastro set nome_cadastro=?, apelido_cadastro=?, email_cadastro=? where id_cadastro=?");
        conn = new Conexao().connectBD();

        try {
            pstm = conn.prepareStatement(sql);

            pstm.setString(1, objcadastroDTO.getNome_cadastro());
            pstm.setString(2, objcadastroDTO.getApelido_cadastro());
            pstm.setString(3, objcadastroDTO.getEmail_cadastro());
            pstm.setInt(4, objcadastroDTO.getId_cadastro());

            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "erro no metodo actualizar cadastro" + erro);
        }
    }

    public void excluirCadastro(cadastroDTO objcadastroDTO) {
        int apagar = JOptionPane.showConfirmDialog(null, "Tem Certeza que pretende remover o estudante Cadastrado? ", "Actencao", JOptionPane.YES_NO_OPTION);
        if (apagar == JOptionPane.YES_OPTION) {
            String sql = "delete from cadastro where id_cadastro = ?";
            conn = new Conexao().connectBD();

            try {
                pstm = conn.prepareStatement(sql);

                pstm.setInt(1, objcadastroDTO.getId_cadastro());

                JOptionPane.showMessageDialog(null, "Estudante Excluido com Sucesso");

                pstm.execute();
                conn.close();
            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "erro no metodo excluir cadastro" + erro);
            }
        }

    }

//    public ResultSet pesquisar() {
//        conn = new Conexao().connectBD();
//        try {
//            String sql = "Select id_cadastro,Nome_cadastro, apelido_cadastro,email_cadastro,senha_cadastro  from cadastro ";
//            pstm = conn.prepareStatement(sql);
//            rs = pstm.executeQuery();
//
//            return rs;
//
//        } catch (SQLException erro) {
//            JOptionPane.showMessageDialog(null, "erro no metodo pesquisar cadastro" + erro);
//        }
//        return null;
//
//    }
    public ResultSet consultar(cadastroDTO objcadastroDTO) {
        conn = new Conexao().connectBD();

        try {
            String sql = "select * from cadastro where nome_cadastro=?";

            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            pstm.setString(1, objcadastroDTO.getNome_cadastro());
            rs = pstm.executeQuery();
            return rs;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "erro na no metodo consultar" + erro);
        }
        return null;
    }

}
// CarpintariaDAO.conn = Conexao.getConexao();
//         try {
//                 String sql = "Select Id_carp,Nome_carp,Codigo_Estudante_carp,Categoria,Contacto,Email from carpintaria ";
//                stmt=conn.prepareStatement(sql);
//                rs=stmt.executeQuery();
//             
//                return rs;
//           
//            }catch(SQLException e){
//                 JOptionPane.showMessageDialog(null, e);
//            }
