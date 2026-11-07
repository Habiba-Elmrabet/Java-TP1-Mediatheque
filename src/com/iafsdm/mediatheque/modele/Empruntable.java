package com.iafsdm.mediatheque.modele;

public interface Empruntable{
    boolean emprunter();
    boolean retourner();
    boolean estDisponible();
}