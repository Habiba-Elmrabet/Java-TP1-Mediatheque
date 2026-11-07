package com.iafsdm.mediatheque.app;
import com.iafsdm.mediatheque.modele.Document;
import com.iafsdm.mediatheque.modele.Empruntable;
import com.iafsdm.mediatheque.modele.Livre;
import com.iafsdm.mediatheque.modele.DVD;



public class Main {
    public static void main (String[] args){
        Document l = new Livre(1,"java",2026);
        //l.setid(1);
        /*l.setannee(2026);*/
        ((Livre) l).setauteur("habiba");
        System.out.println(l.description());
        Document d = new DVD(1, "sql",2027);
        ((DVD) d).setduree(60);
        System.out.println(d.description());
    }
}
