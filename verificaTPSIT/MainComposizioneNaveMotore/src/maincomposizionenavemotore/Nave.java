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
public class Nave {
    private String nome;
    private double stazzaTonnellate;
    private Motore motore;

    public Nave(String nome, double stazzaTonnellate, int cilindrataMotore, int cavalliMotore) {
        this.nome = nome;
        this.stazzaTonnellate = stazzaTonnellate;
       
        this.motore = new Motore(cilindrataMotore, cavalliMotore);
    }

    public String getNome() {
        return nome;
    }

    public double getStazzaTonnellate() {
        return stazzaTonnellate;
    }

    public Motore getMotore() {
        return motore;
    }

    @Override
    public String toString() {
        return "Nave{" + "nome='" + nome + '\'' + ", stazzaTonnellate=" + stazzaTonnellate + ", motore=" + motore + '}';
    }
}
