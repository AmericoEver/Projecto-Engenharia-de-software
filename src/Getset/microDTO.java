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
public class microDTO {
     private int id_micro;
    private String tema_micro;
    private String conteudo_micro;

    public int getId_micro() {
        return id_micro;
    }

    public void setId_micro(int id_micro) {
        this.id_micro = id_micro;
    }

    public String getTema_micro() {
        return tema_micro;
    }

    public void setTema_micro(String tema_micro) {
        this.tema_micro = tema_micro;
    }

    public String getConteudo_micro() {
        return conteudo_micro;
    }

    public void setConteudo_micro(String conteudo_micro) {
        this.conteudo_micro = conteudo_micro;
    }
}
