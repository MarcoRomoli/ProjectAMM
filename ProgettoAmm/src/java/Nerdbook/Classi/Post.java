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
public class Post {
    
    public enum Type {
        TEXT, IMAGE, LINK;
    };

    protected int id;
    private int gruppoid;
    protected Utente user;
    private Utente autore;
    private String content;
    private String allegato;
    private Type postType;

    public Post() {
        
        id = 0;
        user = null;
        gruppoid=-1;
        autore=null;
        allegato="";
        content = "";
        postType = Type.TEXT;
    }

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
     * @return the user
     */
    public Utente getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(Utente user) {
        this.user = user;
    }

    /**
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content the content to set
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return the postType
     */
    public Type getPostType() {
        return postType;
    }

    /**
     * @param postType the postType to set
     */
    public void setPostType(Type postType) {
        this.postType = postType;
    }

    /**
     * @return the allegato
     */
    public String getAllegato() {
        return allegato;
    }

    /**
     * @param allegato the allegato to set
     */
    public void setAllegato(String allegato) {
        this.allegato = allegato;
    }


    /**
     * @param autore the autore to set
     */
    public void setAutore(Utente autore) {
        this.autore = autore;
    }

    /**
     * @return the autore
     */
    public Utente getAutore() {
        return autore;
    }

    /**
     * @return the gruppoid
     */
    public int getGruppoid() {
        return gruppoid;
    }

    /**
     * @param gruppoid the gruppoid to set
     */
    public void setGruppoid(int gruppoid) {
        this.gruppoid = gruppoid;
    }
}
