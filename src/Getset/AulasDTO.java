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
public class AulasDTO {

    private int id_aula;
    private String nome_aula, conteudo_aula;

    public int getId_aula() {
        return id_aula;
    }

    public void setId_aula(int id_aula) {
        this.id_aula = id_aula;
    }

    public String getNome_aula() {
        return nome_aula;
    }

    public void setNome_aula(String nome_aula) {
        this.nome_aula = nome_aula;
    }

    public String getConteudo_aula() {
        return conteudo_aula;
    }

    public void setConteudo_aula(String conteudo_aula) {
        this.conteudo_aula = conteudo_aula;
    }
}
