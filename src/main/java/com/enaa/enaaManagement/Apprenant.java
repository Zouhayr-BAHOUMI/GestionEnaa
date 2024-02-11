/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.enaa.enaaManagement;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Apprenant {
   private String Nom;
   private String prenom;
   private String tele;
   private String addresse;
   private String DateNaissance;
   private int numClasse;
   
      
 
    public String getNom() {
        return Nom;
    }

    public String getPrenom() {
        return prenom;
    }
    
    public String getTele() {
        return tele;
    }
    public String getAddresse() {
        return addresse;
    }
    
    public String getDateNaissance() {
        return DateNaissance;
    }
     public int getNumClasse() {
        return numClasse;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }

    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }
    
    public void setDateNaissance(String DateNaissance) {
        this.DateNaissance = DateNaissance;
    }

    public void setNumClasse(int numClasse) {
        this.numClasse = numClasse;
    }

    
        
        static String clavier(){ 
            Scanner cl = new Scanner(System.in) ; 
            return cl.nextLine();
        } 
        
         public void saisirApprenant() { 
            String n,p,ad,t,date;
            int num;
            System.out.println(":::::Informations de l'apprenant :::::"); 
            System.out.println("Nom :"); 
            n=clavier();
            setNom(n);
            System.out.println("prenom :"); 
            p=clavier();
            setPrenom(p);
            System.out.println("telephone :"); 
            t=clavier();
            while (!t.matches("(\\+212|0(6|7))([ \\-_/]*)(\\d[ \\-_/]*){8}")) {
            System.out.println("Invalid phone number format");
            t = clavier();
            }
            setTele(t);
            System.out.println("Adresse :"); 
            ad=clavier();
            setAddresse(ad);
            System.out.println("Date de naissance : yyyy-mm-dd"); 
            date=clavier();
            String[] tab = date.split("-");
            LocalDate birthDate = LocalDate.of(Integer.parseInt(tab[0]), Integer.parseInt(tab[1]), Integer.parseInt(tab[2]));
            if (birthDate.isAfter(LocalDate.now().minusYears(18))){
                    while (tab.length != 3 || 
                     ((Integer.parseInt(tab[0]) > 2006) || 
                    (Integer.parseInt(tab[1]) < 1 || Integer.parseInt(tab[1]) > 12) ||
                    (Integer.parseInt(tab[2]) < 1 || Integer.parseInt(tab[2]) > 31))) {
                            System.out.println("Invalid date of birth format or year must be 2006 or later.");
                            date = clavier();
                            tab = date.split("-");
                    }
            }
            setDateNaissance(date);
            
            System.out.println("Numero de classe :"); 
            num=Integer.parseInt(clavier());
            setNumClasse(num);
            
            }
   @Override
        public String toString(){
             String ch;
             ch= "Nom de l'apprenant est :"+Nom+"\n"+
                 "prenom de l'apprenant est :"+prenom+"\n"+
                  "numero de tele de l'apprenant est :"+tele+"\n"+
                  "Adresse de l'apprenant est :"+addresse+"\n"+
                  "Date de naissance de l'apprenant est :"+DateNaissance+"\n"+
                  "N classe de l'apprenant est:"+numClasse+"\n" ;
             return ch;
        }
        
        
        public void ajouterApprenant(ArrayList<Apprenant> ap){
            ap.add(this);
            System.out.println("add avec success");
        }
        
        public void afficherApprenant(ArrayList<Apprenant> ap){
            int M= ap.size();
            for (int i =0; i<M ; i++){
            System.out.println(ap.get(i).toString());
            }
        }
        
        public void modifierApprenant(ArrayList<Apprenant> ap){
            String nom;
            String prenom;
            int M= ap.size();
            System.out.println("Entrer le nom  que vous modifier");
            nom = clavier();
            System.out.println("Entrer le prenom  que vous modifier");
            prenom = clavier();
            int existe =0;
            for (int i =0; i<M ; i++){
                if (ap.get(i).getNom().equals(nom) && ap.get(i).getPrenom().equals(prenom)){
                    ap.get(i).saisirApprenant();
                    existe = 1;
                    break;
                }
            }
            
            if (existe == 1) {
            System.out.println("Modifier avec success.\n");
            } else {
            System.out.println("L'apprenant n'existe pas \n");
            }
        }
        
        public void supprimerApprenant(ArrayList<Apprenant> ap){
            String nom;
            String prenom;
            int M= ap.size();
            System.out.println("Entrer le nom  que vous supprimer");
            nom = clavier();
            System.out.println("Entrer le prenom  que vous supprimer");
            prenom = clavier();
            int existe =0;
            for (int i =0; i<M ; i++){
                if (ap.get(i).getNom().equals(nom) && ap.get(i).getPrenom().equals(prenom)){
                    ap.remove(i);
                    existe = 1;
                    break;
                }
            }
            
            if (existe == 1) {
            System.out.println("supprimer  avec success.\n");
            } else {
            System.out.println("L'apprenant n'existe pas \n");
            }
        }
        
        
}
