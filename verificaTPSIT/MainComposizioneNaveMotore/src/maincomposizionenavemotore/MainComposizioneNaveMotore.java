/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maincomposizionenavemotore;

/**
 *
 * @author grottelli.gabriele
 */
public class MainComposizioneNaveMotore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creo una Nave con un motore
        Nave nave1 = new Nave("Aurora", 32000.5, 12000, 40000);
        System.out.println(nave1);  //Nave{nome='Aurora', stazzaTonnellate=32000.5, motore=Motore{cilindrata=12000, cavalli=40000}}
  
        Motore motoreNave1 = nave1.getMotore();
        System.out.println(motoreNave1);    //Motore{cilindrata=12000, cavalli=40000}
    }
}
    

