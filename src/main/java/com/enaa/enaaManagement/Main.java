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


public class Main {
    

     public static void main(String[] args) {
        
         Administrateur admin = new Administrateur();
         Scanner cl = new Scanner(System.in) ;
         
         
       int choix ;
       while(true){
            System.out.println("=====Application Enaa Management=====");
            System.out.println("1. Gestion Des Apprenants");
            System.out.println("2. Gestion Des Classes");
            System.out.println("3. Quitter");
            System.out.print("Entrer votre choix: ");
            
            if (cl.hasNextInt()){
                choix= cl.nextInt();
                switch (choix) {
                  case 1:
                        admin.gestionApprenants();
                  break;
                  case 2:
                        admin.gestionClasses();
                  break;
                  case 3:
                      System.out.println("Programme terminé.");
                      cl.close();
                      System.exit(0);
                      break;
                  default:
                      System.out.println("Choix invalide  réessayer.");
            }
            }else {
               System.out.println("entrer une nombre.");
               cl.next();
            }
             
        }

    }
}
