/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.enaa.enaaManagement;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Apprenant {
   private String Nom;
   private String prenom;
   private int tele;
   private String addresse;
   private int DateNaissance;
   private int numClasse;
   
        public Apprenant(String n,String p, int t, String ad, int date,int num){
                    Nom=n;
                    prenom=p;
                    tele= t;
                    addresse=ad;
                    DateNaissance=date;
                    numClasse=num;
        }

    public String getNom() {
        return Nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getAddresse() {
        return addresse;
    }

    public int getNumClasse() {
        return numClasse;
    }

    public int getDateNaissance() {
        return DateNaissance;
    }

    public int getTele() {
        return tele;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setTele(int tele) {
        this.tele = tele;
    }

    public void setDateNaissance(int DateNaissance) {
        this.DateNaissance = DateNaissance;
    }

    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }

    public void setNumClasse(int numClasse) {
        this.numClasse = numClasse;
    }

    
        
        static String clavier(){ 
            Scanner cl = new Scanner(System.in) ; 
            return cl.nextLine();
        } 
        
         public void saisirApprenant() { 
            String n,p,ad;
            int date,num,t;
            Apprenant ap;
            System.out.println(":::::Informations de l'apprenant :::::"); 
            System.out.println("Nom :"); 
            n=clavier();
            setNom(n);
            System.out.println("prenom :"); 
            p=clavier();
            setPrenom(p);
            System.out.println("telephone :"); 
            t=Integer.parseInt(clavier());
            setTele(t);
            System.out.println("Adresse :"); 
            ad=clavier();
            setAddresse(ad);
            System.out.println("Date de naissance :"); 
            date=Integer.parseInt(clavier());
            setDateNaissance(date);
            System.out.println("Numero de classe :"); 
            num=Integer.parseInt(clavier());
            setNumClasse(num);
                    } 
   @Override
        public String toString(){
             String ch;
             ch= "Nom :"+Nom+"prenom :"+prenom+"numero de tele :"+tele+"Adresse :"+addresse+"Date de naissance :"+DateNaissance+"N classe"+numClasse;
             return ch;
        }
}
