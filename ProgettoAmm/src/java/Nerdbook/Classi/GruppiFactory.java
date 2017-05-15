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
public class GruppiFactory {
    
    private static GruppiFactory singleton;

    public static GruppiFactory getInstance() {
        if (singleton == null) {
            singleton = new GruppiFactory();
        }
        return singleton;
    }
    
    private ArrayList<Gruppi> listaGruppi = new ArrayList<Gruppi>();
    private GruppiFactory(){
        
        UtenteFactory utenteFactory = UtenteFactory.getInstance();
        
        Gruppi gruppi1 = new Gruppi();
        ArrayList<Utente> listaUtenti= new ArrayList<>();
        listaUtenti.add(utenteFactory.getUtenteById(0));
        listaUtenti.add(utenteFactory.getUtenteById(1));
        gruppi1.setId(0);
        gruppi1.setNome("Mongolfieristi");
        gruppi1.setListaUtenti(listaUtenti);
        
        Gruppi gruppi2 = new Gruppi();
        listaUtenti= new ArrayList<>();
        listaUtenti.add(utenteFactory.getUtenteById(3));
        gruppi2.setId(1);
        gruppi2.setNome("Ritardatari");
        gruppi2.setListaUtenti(listaUtenti);
        
        listaGruppi.add(gruppi1);
        listaGruppi.add(gruppi2);
    }
    
    public Gruppi getGruppiById (int id){
        for (Gruppi gruppi : this.listaGruppi) {
            if (gruppi.getId() == id) {
                return gruppi;
            }
        }
        return null;
    }
}
