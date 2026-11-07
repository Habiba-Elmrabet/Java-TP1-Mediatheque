package com.iafsdm.mediatheque.modele;
import com.iafsdm.mediatheque.modele.Document;
import com.iafsdm.mediatheque.modele.Empruntable;

public class Livre extends Document{
    private String auteur;
    
    public void setauteur(String auteur){
        this.auteur = auteur;
    }

    public String getauteur(){
        return auteur;
    }

    public Livre(int id, String titre, int annee, String auteur){
        super(id, titre, annee);
        this.auteur = auteur;
    }
    
    @Override
    public String description(){
        String dispo;
        if(estDisponible()){
            dispo = "disponible";
        }else{
            dispo = "pas disponible";
        }
        return "id : "+getid()+", titre: "+gettitre()+", annee : "+getannee()+", auteur : "+getauteur()+", disponibilité : "+dispo;
    }

}