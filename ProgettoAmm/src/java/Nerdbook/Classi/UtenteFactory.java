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
public class UtenteFactory {
    
       //Pattern Design Singleton
    private static UtenteFactory singleton;

    public static UtenteFactory getInstance() {
        if (singleton == null) {
            singleton = new UtenteFactory();
        }
        return singleton;
    }

    private ArrayList<Utente> listaUtenti = new ArrayList<Utente>();

    private UtenteFactory() {
        //Creazione utenti

        //Monkey D. Luffy
        Utente utente1 = new Utente();
        utente1.setId(0);
        utente1.setNome("Monkey D.");
        utente1.setCognome("Luffy");
        utente1.setEmail("monkeyd@gmail.com");
        utente1.setPassword("123");
        utente1.setFrasepresentazione("");                   
        utente1.setData("18/08/1996");
        utente1.setUrlFoto("Assets/luffy1.jpg");
        
        //FatCat
        Utente utente2 = new Utente();
        utente2.setId(1);
        utente2.setNome("Fat");
        utente2.setCognome("Cat");
        utente2.setEmail("");
        utente2.setPassword("123");
        utente2.setFrasepresentazione("Sono affamato");
        utente2.setData("11/06/2000");
        utente2.setUrlFoto("");
        
        //Maestro Muten
        Utente utente3 = new Utente();
        utente3.setId(2);
        utente3.setNome("Maestro");
        utente3.setCognome("Muten");
        utente3.setEmail("");
        utente3.setPassword("123");
        utente3.setFrasepresentazione("Dove sono le ragazze?");        
        utente3.setData("01/01/1930");
        utente3.setUrlFoto("");
        

        listaUtenti.add(utente1);
        listaUtenti.add(utente2);
        listaUtenti.add(utente3);
    }

    public Utente getUtenteById(int id) {
        for (Utente utente : this.listaUtenti) {
            if (utente.getId() == id) {
                return utente;
            }
        }
        return null;
    }
    
    public int getUtenteByEmailAndPassword(String email, String password) {
        for (Utente utente : this.listaUtenti) {
            if (utente.getEmail().equals(email) && utente.getPassword().equals(password)) {
                return utente.getId();
            }
        }
        return -1;
    }
    
}
