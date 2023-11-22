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
public class cadastroDTO {

    private String nome_cadastro, apelido_cadastro, email_cadastro, senha_cadastro;
    private int id_cadastro;

    public String getNome_cadastro() {
        return nome_cadastro;
    }

    public void setNome_cadastro(String nome_cadastro) {
        this.nome_cadastro = nome_cadastro;
    }

    public String getApelido_cadastro() {
        return apelido_cadastro;
    }

    public void setApelido_cadastro(String apelido_cadastro) {
        this.apelido_cadastro = apelido_cadastro;
    }

    public String getEmail_cadastro() {
        return email_cadastro;
    }

    public void setEmail_cadastro(String email_cadastro) {
        this.email_cadastro = email_cadastro;
    }

    public String getSenha_cadastro() {
        return senha_cadastro;
    }

    public void setSenha_cadastro(String senha_cadastro) {
        this.senha_cadastro = senha_cadastro;
    }
    public int getId_cadastro() {
        return id_cadastro;
    }

    public void setId_cadastro(int id_cadastro) {
        this.id_cadastro = id_cadastro;
    }

}
