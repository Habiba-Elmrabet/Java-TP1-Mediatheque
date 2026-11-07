package com.iafsdm.mediatheque.service;
import com.iafsdm.mediatheque.modele.Document;

public class Mediatheque{
    private Document[] documents = new Document[20];
    private int nombreDocuments;

    public int getnombreDocuments(){
        return nombreDocuments;
    }

    public void setnombreDocuments(int nombreDocuments){
        this.nombreDocuments = nombreDocuments;
    }
    
    public boolean ajouter(Document d){
        if(d == null){
            System.out.println("le document est vide ");
            return false;
        }
        for(int i = 0; i<nombreDocuments ; i++){
            if(d.getid() == documents[i].getid()){
                System.out.println("id deja existe!");
                return false;
            }
        }

        if(getnombreDocuments() >= documents.length){
            System.out.println("catalogue plein!");
            return false;
        }

        documents[getnombreDocuments()] = d;
        nombreDocuments++;

        return true;
    }

    public Document chercherParId(int id){
        for(int i=0 ; i < getnombreDocuments() ; i++){
            if(documents[i].getid() == id){
                return documents[i];
            }
        }

        return null;
    }

    public void afficherCatalogue(){
        for(int i=0 ; i < getnombreDocuments() ; i++){
            System.out.println("documents[i].description()");
        }
    }

    public boolean emprunter(int id){
        Document d = chercherParId(id);

        if(d == null){
            System.out.println("ce document n'existe pas");
            return false;
        }

        return d.emprunter();

    }
    
    public boolean retourner(int id){
        Document d = chercherParId(id);

        if(d == null){
            System.out.println("ce document n'existe pas");
            return false;
        }

        return d.retourner();
    }

    public int compterDisponible(){
        int count = 0;
        for(int i=0; i<getnombreDocuments() ; i++){
            if(documents[i].estDisponible()){
                count++;
            }
        }

        return count;
    }
}