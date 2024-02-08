/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.enaa.enaaManagement;

/**
 *
 * @author user
 */
public class Classe {
   int numClasse;
   String nomClasse;
   int effictif;
   
        public Classe(int numClasse,String nomClasse,int effictif){
            this.numClasse=numClasse;
            this.nomClasse=nomClasse;
            this.effictif=effictif;
        }

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
        
   @Override
        public String toString(){
             String ch2;
             ch2= "Numero de classe :"+numClasse+"Nom de classe :"+nomClasse+"L'effictif:"+effictif;
             return ch2;
        }

    
}
