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
public class MainAggregazione {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Brano brano1 = new Brano("In the End", "Linkin Park", 216);
        Brano brano2 = new Brano("Fix You", "Coldplay", 294);
        Brano brano3 = new Brano("Always Summer", "Yellowcard", 188);

        Playlist miaPlaylist = new Playlist("Focus Coding", "Classe4INF");
        miaPlaylist.aggiungi(brano1);
        miaPlaylist.aggiungi(brano2);
        miaPlaylist.aggiungi(brano3);

        System.out.println(miaPlaylist); //Playlist{nome='Focus Coding', proprietario='Classe4INF', nBrani=3, durataTotaleSec=698}    
        for (Brano brano : miaPlaylist.getBrani()) {
            System.out.println(" - " + brano);
        }

        // Un brano può esistere anche senza playlist
        Brano standalone = new Brano("Stand Alone", "Indie", 200);
        System.out.println(standalone);   // Brano{titolo='Stand Alone', artista='Indie', durataSecondi=200}    
    }
}
    

