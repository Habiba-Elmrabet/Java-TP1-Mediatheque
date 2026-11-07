package com.iafsdm.mediatheque.app;
import com.iafsdm.mediatheque.modele.Document;
import com.iafsdm.mediatheque.modele.Empruntable;
import com.iafsdm.mediatheque.modele.Livre;
import com.iafsdm.mediatheque.modele.DVD;
import com.iafsdm.mediatheque.service.Mediatheque;
import java.util.Scanner;



public class Main {
    public static void main (String[] args){
        Livre l1 = new Livre(1, "java", 2026, "hamza");
        Livre l2 = new Livre(2, "sql", 2025, "fadoua");
        DVD d1 = new DVD(3, "name_dvd", 2024, 60);
        Mediatheque m = new Mediatheque();
        m.ajouter(l1);
        m.ajouter(l2);
        m.ajouter(d1);
        Scanner sc = new Scanner(System.in);
        int choix;
        System.out.println("===MEDIATHEQUE===");
        System.out.println("1.afficher le catalogue");
        System.out.println("2.ajouter un livre");
        System.out.println("3.ajouter un DVD");
        System.out.println("4.emprunter un document");
        System.out.println("5.retourner un document");
        System.out.println("6.afficherle nombre de documents disponibles");
        System.out.println("0.Quitter");
        System.out.print("Votre choix : ");
        choix = sc.nextInt();
        while(choix != 0){
            switch (choix){
                case 1 :
                    m.afficherCatalogue();
                    break;
                case 2 :{
                    System.out.print("donner l'id du livre : ");
                    int id = sc.nextInt();
                    while(id<0){
                       System.out.println("id doit etre superieur a 0");
                       System.err.print("donner l'id : ");
                       id = sc.nextInt();
                    }
                    System.out.print("donner le titre du livre : ");
                    String titre = sc.nextLine();
                    System.out.print("donner l'annee du livre : ");
                    int annee = sc.nextInt();
                    System.out.print("donner l'auteur du livre : ");
                    String auteur = sc.nextLine();

                    Livre l = new Livre(id, titre, annee, auteur);
                    if(m.ajouter(l)){
                        System.out.println("livre ajouter avec succes");
                    }else{
                        System.out.println("erreur dans l'ajout");
                    }
                    break;
                }
                case 3 :{
                    System.out.print("donner l'id du DVD : ");
                    int id = sc.nextInt();
                    while(id<0){
                       System.out.println("id doit etre superieur a 0");
                       System.err.print("donner l'id : ");
                       id = sc.nextInt();
                    }
                    System.out.print("donner le titre du DVD : ");
                    String titre = sc.nextLine();
                    System.out.print("donner l'annee du DVD : ");
                    int annee = sc.nextInt();
                    System.out.print("donner la duree du DVD : ");
                    int durre = sc.nextInt();

                    DVD d = new DVD(id, titre, annee, durre);
                    if(m.ajouter(d)){
                        System.out.println("DVD ajouter avec succes");
                    }else{
                        System.out.println("erreur dans l'ajout");
                    }
                    break;
                }
                case 4 :{
                    System.out.println("donner l'id du livre que tu veut emprunter : ");
                    int id = sc.nextInt();
                    if(m.emprunter(id)){
                        System.out.println("emprunter avec succes");
                    }else{
                        System.out.println("le document ne peut pas etre emprunter");
                    }
                    break;
                }
                case 5 :{
                    System.out.println("donner l'id du livre que tu veut retourner : ");
                    int id = sc.nextInt();
                    if(m.retourner(id)){
                        System.out.println("retourner avec succes");
                    }else{
                        System.out.println("le document ne peut pas etre retourner");
                    }
                    break;
                }
                case 6 :{
                    System.out.println("le nombre des documents disponible est : "+m.compterDisponible());
                    break;
                }
                default :
                    System.out.println("nombre inconnue, votre coix doit etre entre 0 et 6");
            }
        }
        System.out.print("Votre choix : ");
        choix = sc.nextInt();
    }
}
