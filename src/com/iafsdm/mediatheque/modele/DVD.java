package com.iafsdm.mediatheque.modele;
import com.iafsdm.mediatheque.modele.Document;
import com.iafsdm.mediatheque.modele.Empruntable;


public class DVD extends Document{
    private int dureeMinutes;

    public void setduree(int duree){
        this.dureeMinutes = duree;
    }

    public int getduree(){
        return dureeMinutes;
    }

    public DVD(int id,String titre, int annee, int durre){
        super(id, titre, annee);
        dureeMinutes = durre;
    }

    @Override
    public String description(){
        String dispo;
        if(estDisponible()){
            dispo = "disponible";
        }else{
            dispo = "pas disponible";
        }
        return "id : "+getid()+", titre: "+gettitre()+", annee : "+getannee()+", dureeMinutes : "+getduree()+" min"+", disponibilité : "+dispo;
    }
}