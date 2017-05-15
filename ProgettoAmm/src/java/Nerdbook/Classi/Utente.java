/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nerdbook.Classi;

/**
 *
 * @author moku
 */
public class Utente {
    
    private int id;
    private String data;
    private String nome;
    private String cognome;
    private String email;
    private String password;
    private String frasepresentazione;
    private String urlFoto;
    
    
    public Utente() {
        
        id=0;
        data="";
        nome = "";
        cognome= "";
        email = "";
        password = "";
        urlFoto=""; 
    }
    
    
        /**
     * @return l'id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id l'id da impostare
     */
    public void setId(int id) {
        this.id = id;
    }
    
    
        /**
     * @return data di nascita
     */
    public String getData() {
        return data;
    }

    /**
     * @param data data di nascita inserire
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return il nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome il nome dell'utente
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return il cognome
     */
    public String getCognome() {
        return cognome;
    }

    /**
     * @param cognome il cognome dell'utente 
     */
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    /**
     * @return l'emil
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email l'email da impostare
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return la password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password la password da impostare
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    @Override
    public boolean equals(Object altroUtente) {
        if (altroUtente instanceof Utente)
            if (this.getId() == ((Utente)altroUtente).getId()) return true;
        return false;
    }
    
    /**
     * @return the frasepresentazione
     */
    public String getFrasepresentazione() {
        return frasepresentazione;
    }

    /**
     * @param frasepresentazione the frasepresentazione to set
     */
    public void setFrasepresentazione(String frasepresentazione) {
        this.frasepresentazione = frasepresentazione;
    }

    /**
     * @return the urlFoto
     */
    public String getUrlFoto() {
        return urlFoto;
    }

    /**
     * @param urlFoto the urlFoto to set
     */
    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    
}

 
