/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainaggregazione;

import java.util.ArrayList;

/**
 *
 * @author grottelli.gabriele
 */
public class Playlist {
    private String nome;
    private String proprietario;
    private ArrayList<Brano> brani;

    public Playlist(String nome, String proprietario) {
        this.nome = nome;
        this.proprietario = proprietario;
        this.brani = new ArrayList<>();
    }

    public void aggiungi(Brano b) {
        if (b != null) {
            brani.add(b);
        }
    }

    public ArrayList<Brano> getBrani() {
        return brani;
    }

    public int getDurataTotale() {
        int totale = 0;
        for (Brano b : brani) {
            totale += b.getDurataSecondi();
        }
        return totale;
    }

    @Override
    public String toString() {
        return "Playlist{nome='" + nome + "', proprietario='" + proprietario +  "', nBrani=" + brani.size() + ", durataTotaleSec=" + getDurataTotale() + "}";
    }
}
