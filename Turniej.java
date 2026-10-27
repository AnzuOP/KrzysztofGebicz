import java.util.*;

public class Turniej {
    String nazwa;
    String gra;
    ArrayList<Druzyna> druzyny = new ArrayList<>();
    ArrayList<Mecz> mecze = new ArrayList<>();

    public Turniej(String nazwa, String gra) {
        this.nazwa = nazwa;
        this.gra = gra;
    }

    public void dodajDruzyne(Druzyna druzyna) {
        druzyny.add(druzyna);
    }

    public void dodajMecz(Mecz mecz) {
        mecze.add(mecz);
    }

    public void wyswietlTabele() {
        System.out.println("\n=== TABELA TURNIEJOWA ===");
        System.out.println("Turniej: " + nazwa);
        System.out.println("Gra: " + gra);

        for (Druzyna druzyna : druzyny) {
            System.out.println(
                druzyna.nazwa
                + " | Punkty: " + druzyna.punkty
                + " | Wygrane: " + druzyna.zwyciestwa
                + " | Porazki: " + druzyna.porazki
            );
        }
    }

    public void wyswietlMecze() {
        System.out.println("\n=== MECZE ===");

        for (Mecz mecz : mecze) {
            if (mecz.rozegrany) {
                mecz.wyswietlMecz();
            } else {
                System.out.println(
                    mecz.druzyna1.nazwa + " - "
                    + mecz.druzyna2.nazwa + " (nierozegrany)"
                );
            }
        }
    }

    public void wyswietlKlasyfikacje() {
        ArrayList<Druzyna> ranking = new ArrayList<>(druzyny);

        for (int i = 0; i < ranking.size(); i++) {
            for (int j = i + 1; j < ranking.size(); j++) {
                if (ranking.get(j).punkty > ranking.get(i).punkty) {
                    Druzyna pomoc = ranking.get(i);
                    ranking.set(i, ranking.get(j));
                    ranking.set(j, pomoc);
                }
            }
        }

        System.out.println("\n=== KLASYFIKACJA KONCOWA ===");

        for (int i = 0; i < ranking.size(); i++) {
            System.out.println(
                (i + 1) + ". " + ranking.get(i).nazwa
                + " - " + ranking.get(i).punkty + " pkt"
            );
        }
    }
}