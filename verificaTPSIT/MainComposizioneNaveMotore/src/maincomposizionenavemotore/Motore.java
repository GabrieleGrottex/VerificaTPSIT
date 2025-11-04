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
public class Motore {
    private int cilindrata;
    private int cavalli;

    public Motore(int cilindrata, int cavalli) {
        this.cilindrata = cilindrata;
        this.cavalli = cavalli;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    public int getCavalli() {
        return cavalli;
    }

    @Override
    public String toString() {
        return "Motore{cilindrata=" + cilindrata + ", cavalli=" + cavalli + "}";
    }
}
