import java.util.*;

public class Druzyna {
    String nazwa;
    ArrayList<Uczestnik> zawodnicy = new ArrayList<>();
    int zwyciestwa = 0;
    int porazki = 0;
    int punkty = 0;
    int bilans = 0;

    public Druzyna(String nazwa) {
        this.nazwa = nazwa;
    }

    public void dodajZawodnika(Uczestnik zawodnik) {
        zawodnicy.add(zawodnik);
        System.out.println("Dodano zawodnika do druzyny.");
    }

    public void wyswietlDruzyne() {
        System.out.println("\nDruzyna: " + nazwa);
        System.out.println("Punkty: " + punkty);
        System.out.println("Zwyciestwa: " + zwyciestwa);
        System.out.println("Porazki: " + porazki);
        System.out.println("Bilans: " + bilans);
        System.out.println("Zawodnicy:");

        for (Uczestnik zawodnik : zawodnicy) {
            zawodnik.wyswietlDane();
            System.out.println("----------");
        }
    }
}
