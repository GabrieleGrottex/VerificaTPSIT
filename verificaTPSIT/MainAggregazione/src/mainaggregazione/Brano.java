/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainaggregazione;

/**
 *
 * @author grottelli.gabriele
 */
public class Brano {
    private String titolo;
    private String artista;
    private int durataSecondi;

    public Brano(String titolo, String artista, int durataSecondi) {
        this.titolo = titolo;
        this.artista = artista;
        this.durataSecondi = durataSecondi;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getArtista() {
        return artista;
    }

    public int getDurataSecondi() {
        return durataSecondi;
    }

    @Override
    public String toString() {
        return "Brano{titolo='" + titolo + "', artista='" + artista + "', durataSecondi=" + durataSecondi + "}";
    }
}
