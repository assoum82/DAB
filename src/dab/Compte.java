/*
 * To change this license header, choose License Headers 
Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dab;

/**
 *
 * @author pro
 */
public class Compte {
    static int ID;
    private int taux;

    public static void setID(int ID) {
        Compte.ID = ID;
    }

    public void setTaux(int taux) {
        this.taux = taux;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
    private double solde;

    public static int getID() {
        return ID;
    }

    public int getTaux() {
        return taux;
    }

    public double getSolde() {
        return solde;
    }
    
    public Compte(int taux, double solde) {
        ID++;
        this.taux = taux;
        this.solde = solde;
    }
    
    public void infoCompte(){
        System.out.println("Compte n°"+ ID+ " solde="+solde+" DA");
    }
    public double calcul_interet(){
        solde=solde - solde * taux/100;
        return solde;
    }
    public void depot(double s){
        solde=solde+s;
    }
    public void retrait(double s){
        solde=solde-s;
    }
}
