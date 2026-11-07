package com.iafsdm.mediatheque.modele;
import com.iafsdm.mediatheque.modele.Empruntable;
import java.util.Scanner;

public abstract class Document implements Empruntable {
    private int id;
    private String titre;
    private int annee;
    private boolean emprunte;
    public Scanner sc = new Scanner(System.in);

    public Document(int id, String titre, int annee){
        this.id = id;
        this.titre = titre;
        this.annee = annee;
        emprunte = false;
    }

        public Document() {
        }

    public void settitre(String titre){
        while(titre == null || titre.trim().isEmpty()){
          System.out.print("le titre est vide, donner un nauveau titre : ");
          titre = sc.nextLine();
       }
       this.titre = titre;
    }

    public  void setannee(int annee){
        while(annee <= 0){
            System.out.print("l'annee doit etre superieur a 0 , donner un nauveau annee : ");
            annee = sc.nextInt();
            sc.nextLine();
        }
        this.annee = annee;
    }

    public int getid(){
        return id;
    }

    public String gettitre(){
        return titre;
    }

    public int getannee(){
        return annee;
    }

    public boolean getemprunte(){
        return emprunte;
    }
    
    public abstract String description();
    
    public boolean emprunter(){
         if(!emprunte){
            emprunte = true;
            return true;
         }else{
            return false;
         }
    }

    public boolean retourner(){
         if(emprunte){
            emprunte = false;
            return true;
         }else{
            return false;
         }
    }

    public boolean estDisponible(){
         if(emprunte){
            return false;
         }else{
            return true;
         }
    }

   
}