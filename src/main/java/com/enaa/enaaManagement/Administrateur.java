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
public class Administrateur{
 

   public ArrayList<Apprenant> Apprenants ; 
   public ArrayList<Classe> Classes ;
   
   public Administrateur() {
        this.Apprenants = new ArrayList<>();
        this.Classes = new ArrayList<>();
    }
   

// une fonction qui contient une le menu de gére les apprenants   
   
   
   public void gestionApprenants(){
       
       
       Scanner cl = new Scanner(System.in) ;
       int choice ;
       while(true){
            System.out.println("=====Application Enaa Management=====");
            System.out.println("1. Ajouter un  Apprenant ");
            System.out.println("2. Afficher des Apprenants ");
            System.out.println("3. Modifier un  Apprenant ");
            System.out.println("4. Supprimer un  Apprenant ");
            System.out.println("5. Rechercher un  Apprenant ");
            System.out.println("6. Quitter");
            System.out.print("Entrer votre choix: ");

            Apprenant apprenant = new Apprenant();
            if(cl.hasNextInt()){
                choice= cl.nextInt();
                    switch (choice) {
                    case 1:
                              apprenant.saisirApprenant();
                              apprenant.ajouterApprenant(Apprenants);
                              break;
                    case 2:
                              apprenant.afficherApprenant(Apprenants);
                              break;
                    case 3:
                              apprenant.modifierApprenant(Apprenants);
                              break;
                    case 4:
                              apprenant.supprimerApprenant(Apprenants);
                              break;
                    case 5:
                              int res = apprenant.rechercheApprenant(Apprenants);
                              if (res == -1){
                                System.out.println("Apprenant ne se trouve pas  ");
                              }else{
                                System.out.println("Apprenant se trouve a :"+res);
                                System.out.println(Apprenants.get(res));
                              }
                              break;
                    case 6:
                            System.out.println("back to menu");
                            return;
                    default:
                            System.out.println("Choix invalide  réessayer.");
                    }
            }else{
                    System.out.println("entrer une nombre.");
                    cl.next();
            }
             
        }

    }
    
    // une fonction qui contient une le menu de gere les classes
    
    
     public void gestionClasses(){
        
       Scanner cl = new Scanner(System.in) ;
       int choice ;
       while(true){
            System.out.println("=====Application Enaa Management=====");
            System.out.println("1. Ajouter un  Classe ");
            System.out.println("2. Afficher les Classes ");
            System.out.println("3. Modifier un  Classe ");
            System.out.println("4. Supprimer un  Classe ");
            System.out.println("5. Afficher les apprenant par Classe ");
            System.out.println("6. Quitter");
            System.out.print("Entrer votre choix: ");
            
            Classe classe = new Classe ();
            if (cl.hasNextInt()){
                choice= cl.nextInt();
               switch (choice) {
                case 1:
                        classe.saisirClasse();
                        classe.ajouterClass(Classes);
                          break;
                case 2:
                        classe.afficherClass(Classes);
                          break;
                case 3:
                        classe.modifierClass(Classes);
                          break;
                case 4:
                        classe.supprimerClass(Classes);
                          break;
                case 5: 
                    classe.afficherApprenantsParClasse(Apprenants);
                    break;
                case 6:
                    System.out.println("back to menu");    
                    return;
                default:
                        System.out.println("Choix invalide  réessayer.");
            }
            }else{
               System.out.println("entrer une nombre.");
               cl.next();
            }
            
             
        }

    }
 }

