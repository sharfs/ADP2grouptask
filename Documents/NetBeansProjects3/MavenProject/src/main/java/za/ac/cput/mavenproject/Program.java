/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.mavenproject;

import java.util.Scanner;

/**
 *
 * @author Ameer
 */
public class Program {
        public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        
        int sum = 0;
        String[] candidatesName= new String[10];
        int [] SRCvotes=new int[10];
        
        System.out.println("Please enter the names of the 10 names of SRC candidates:");
        for (int i=0;i<candidatesName.length;i++){
            candidatesName[i]=kbd.nextLine();
        }
        System.out.println("Please enter the amount of votes for each SRC candidate:");
        for (int i=0;i<SRCvotes.length;++i){
            SRCvotes[i]=kbd.nextInt();
        }
        System.out.println("SRC Candidates\t\t\tAmount of Votes");
        for (int i=0;i<SRCvotes.length;i++){
            System.out.println(candidatesName[i]+ "\t\t\t\t\t" + SRCvotes[i]);
            sum += SRCvotes[i];
            }
         System.out.println("The total amounts of votes casted was " + sum);
         
         String voteName = kbd.nextLine();
         System.out.print("Please enter the candidates name you want to vote for: ");
         voteName=kbd.nextLine();
         
         for (int i=0;i<candidatesName.length;i++){
            if(candidatesName[i].equalsIgnoreCase(voteName)){
                 System.out.println("Candidates name you have chosen to vote for: " + voteName);
                 System.out.println(voteName + "'s total updated number of votes: " + (SRCvotes[i] += 1 ));
                 
             }
         }
    }
}

