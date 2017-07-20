/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nerdbook.Classi;

import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author moku
 */
public class PostFactory {
    //Pattern Design Singleton
    private static PostFactory singleton;
    private String connectionString;

    public static PostFactory getInstance() {
        if (singleton == null) {
            singleton = new PostFactory();
        }
        return singleton;
    }

    private ArrayList<Post> listaPost = new ArrayList<Post>();

    private PostFactory() {
        
        UtenteFactory utenteFactory = UtenteFactory.getInstance();

        //Creazione Post
        Post post1 = new Post();
        post1.setContent("Che fame!");
        post1.setAutore(utenteFactory.getUtenteById(0));
        post1.setId(0);
        post1.setUser(utenteFactory.getUtenteById(0));

        Post post2 = new Post();
        post2.setContent("il mio padrone che ci nutre!");
        post2.setAutore(utenteFactory.getUtenteById(1));
        post2.setId(1);
        post2.setUser(utenteFactory.getUtenteById(1));
        post2.setPostType(Post.Type.IMAGE);
        post2.setAllegato("Assets/download.jpg");

        Post post3 = new Post();
        post3.setContent("Io e il mio amico in vacanza!");
        post3.setId(2);
        post3.setAutore(utenteFactory.getUtenteById(2));
        post3.setUser(utenteFactory.getUtenteById(2));
        post3.setPostType(Post.Type.LINK);
        post3.setAllegato("Assets/muten.png");

        listaPost.add(post1);
        listaPost.add(post2);
        listaPost.add(post3);
    }

    public Post getPostById(int id) {
        for (Post post : this.listaPost) {
            if (post.getId() == id) {
                return post;
            }
        }
        return null;
    }

    public ArrayList<Post> getPostList(Utente utn) {

        ArrayList<Post> listaPost = new ArrayList<Post>();

        for (Post post : this.listaPost) {
            if (post.getUser().equals(utn)) {
                listaPost.add(post);
            }
        }
        return listaPost;
    }
       public ArrayList<Post> getPostList(Gruppi grp) {

        ArrayList<Post> listaPost = new ArrayList<Post>();
        
        for (Post post : this.listaPost) { 
            if (post.getGruppoid()== grp.getId()) {
                listaPost.add(post);
            }
        }
        return listaPost;
    }
       
       public void setConnectionString(String s){
	this.connectionString = s;
       }
       
       public String getConnectionString(){
	return this.connectionString;
       }
}
