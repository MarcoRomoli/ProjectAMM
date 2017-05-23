/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nerdbook.Classi;

import java.util.ArrayList;

/**
 *
 * @author moku
 */
public class Gruppi {
    
    private int id;
    private String nome;
    private String imgGruppo;
    private ArrayList<Utente> listaUtenti = new ArrayList<Utente>(); 

    
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the listaUtenti
     */
    public ArrayList<Utente> getListaUtenti() {
        return listaUtenti;
    }

    /**
     * @param listaUtenti the listaUtenti to set
     */
    public void setListaUtenti(ArrayList<Utente> listaUtenti) {
        this.listaUtenti = listaUtenti;
    }

    /**
     * @return the imgGruppo
     */
    public String getImgGruppo() {
        return imgGruppo;
    }

    /**
     * @param imgGruppo the imgGruppo to set
     */
    public void setImgGruppo(String imgGruppo) {
        this.imgGruppo = imgGruppo;
    }

}
