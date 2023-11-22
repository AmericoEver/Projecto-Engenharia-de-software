/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Getset;

/**
 *
 * @author Américo Ever
 */
public class adminDTO {
    private int id_admin;
    private String nome_admin, senha_admin;

    public int getId_admin() {
        return id_admin;
    }

    public void setId_admin(int id_admin) {
        this.id_admin = id_admin;
    }

    public String getNome_admin() {
        return nome_admin;
    }

    public void setNome_admin(String nome_admin) {
        this.nome_admin = nome_admin;
    }

    public String getSenha_admin() {
        return senha_admin;
    }

    public void setSenha_admin(String senha_admin) {
        this.senha_admin = senha_admin;
    }
    
    
    
}
