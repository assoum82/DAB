/*
 * To change this license header, choose License Headers in 
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dab;

import java.util.Scanner;

/**
 *
 * @author pro
 */
public class DAB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean cond = true;
        int op;
        Compte c = new Compte(5, 1000000);
        do {
            System.out.println("1- Consulter solde.");
            System.out.println("2- Retrait.");
            System.out.println("3- Depot.");
            System.out.println("4- Quitter.");
            op = (int) (Math.random() * 4 + 1);
            switch (op) {
                case 1:
                    c.infoCompte();
                    break;
                case 2: {System.out.println("Souhaitez vous retirer:");
                    System.out.println("1- 5000 DA.");
                    System.out.println("2- 10000.");
                    System.out.println("3- 2000.");
                    System.out.println("4- 1000.");
                    op = (int) (Math.random() * 4 + 1);
                    switch (op) {
                        case 1:
                            c.retrait(5000); c.infoCompte();
                            break;
                        case 2:
                            c.retrait(10000); c.infoCompte();
                            break;
                        case 3:
                            c.retrait(2000); c.infoCompte();
                            break;
                        case 4:
                            c.retrait(1000); c.infoCompte();
                            break;
                    }
                }
                  case 3: {
                    op = (int) (Math.random() * 20000+ 1);
                    c.depot(op); c.infoCompte();break;
                }
                  case 4:cond=false;break;
            }
        } while (cond);

    }

}
