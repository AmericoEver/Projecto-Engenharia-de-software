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
public class progDTO {
     private int id_prog;
    private String tema_prog;
    private String conteudo_prog;

    public int getId_prog() {
        return id_prog;
    }

    public void setId_prog(int id_prog) {
        this.id_prog = id_prog;
    }

    public String getTema_prog() {
        return tema_prog;
    }

    public void setTema_prog(String tema_prog) {
        this.tema_prog = tema_prog;
    }

    public String getConteudo_prog() {
        return conteudo_prog;
    }

    public void setConteudo_prog(String conteudo_prog) {
        this.conteudo_prog = conteudo_prog;
    }
}
