/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.enaa.enaaManagement;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Classe {
   int numClasse;
   String nomClasse;
   int effictif;

        public int getNumClasse() {
            return numClasse;
        }

        public String getNomClasse() {
            return nomClasse;
        }

        public int getEffictif() {
            return effictif;
        }

        public void setNumClasse(int numClasse) {
            this.numClasse = numClasse;
        }

        public void setNomClasse(String nomClasse) {
            this.nomClasse = nomClasse;
        }

        public void setEffictif(int effictif) {
            this.effictif = effictif;
        }
        
        static String clavier(){ 
            Scanner cl = new Scanner(System.in) ; 
            return cl.nextLine();
        }
        
        public void saisirClasse() {
            int num;
            String nom;
            int eff;
            System.out.println(":::::Informations de la classe :::::");
            System.out.println("Numero de classe :");
            num = Integer.parseInt(clavier());
            setNumClasse(num);
            System.out.println("Nom de la classe :");
            nom = clavier();
            setNomClasse(nom);
            System.out.println("Effectif de la classe :");
            eff = Integer.parseInt(clavier());
            setEffictif(eff);
        }
        
   @Override
        public String toString() {
        String ch2;
        ch2 = "Numero de classe :" + numClasse + "\n" +
             "Nom de la classe :" + nomClasse + "\n" +
             "Effectif de la classe :" + effictif + "\n";
        return ch2;
        }
        
       public void ajouterClass(ArrayList<Classe> cl){
            cl.add(this);
            System.out.println("Classe ajouter avec success");
        }
       
       public void afficherClass(ArrayList<Classe> cl){
            int M= cl.size();
            System.out.println("**********************************************************************");
            for (int i =0; i<M ; i++){
            System.out.println(cl.get(i).toString());
            System.out.println("----------------------------------------------------------------------");
            }
            System.out.println("**********************************************************************");
        }
       
        public void modifierClass(ArrayList<Classe> cl){
            int numeroRechercher;
            int M= cl.size();
            System.out.println("Entrer le n° classe que vous modifier");
            numeroRechercher = Integer.parseInt(clavier());
            int existe =0;
            for (int i =0; i<M ; i++){
                if (cl.get(i).getNumClasse() == numeroRechercher){
                    cl.get(i).saisirClasse();
                    existe = 1;
                    break;
                }
            }

            if (existe == 1) {
            System.out.println("Modifier avec success.\n");
            } else {
            System.out.println("La classe n'existe pas \n");
            }
        }
        
        public void supprimerClass(ArrayList<Classe> cl){
            int numeroSupprimer;
            int M= cl.size();
            System.out.println("Entrer le n° classe que vous supprimer");
            numeroSupprimer = Integer.parseInt(clavier());
            int existe =0;
            for (int i =0; i<M ; i++){
                if (cl.get(i).getNumClasse() == numeroSupprimer){
                    cl.remove(i);
                    existe = 1;
                    break;
                }
            }

            if (existe == 1) {
            System.out.println("supprimer avec success.\n");
            } else {
            System.out.println("La classe n'existe pas \n");
            }
        }
        
        
        public void afficherApprenantsParClasse(ArrayList<Apprenant> ap){
           int existe = 0;
           int M= ap.size();
           
           System.out.println("Entrez le numéro de la classe pour afficher les apprenants : ");
           int numeroClasse = Integer.parseInt(clavier());
           
           System.out.println("Apprenants de la classe " + numeroClasse + " est :");
                for (int i =0; i<M ; i++){
                     if (ap.get(i).getNumClasse() == numeroClasse){
                         System.out.println(ap.get(i).toString());
                         existe = 1;
                     }
                 }
           
           if(existe != 1)
             System.out.println("Aucun apprenant trouvé pour cette classe " );
           
        }
        

    
}
