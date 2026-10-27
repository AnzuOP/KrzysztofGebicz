
public class Mecz {
    Druzyna druzyna1;
    Druzyna druzyna2;
    int wynik1;
    int wynik2;
    boolean rozegrany = false;

    public Mecz(Druzyna druzyna1, Druzyna druzyna2) {
        this.druzyna1 = druzyna1;
        this.druzyna2 = druzyna2;
    }

    public void ustawWynik(int wynik1, int wynik2) {
        if (rozegrany || wynik1 < 0 || wynik2 < 0) {
            System.out.println("Nie mozna ustawic tego wyniku.");
            return;
        }

        this.wynik1 = wynik1;
        this.wynik2 = wynik2;
        rozegrany = true;

        if (wynik1 > wynik2) {
            druzyna1.zwyciestwa++;
            druzyna1.punkty += 3;
            druzyna2.porazki++;

        } else if (wynik2 > wynik1) {
            druzyna2.zwyciestwa++;
            druzyna2.punkty += 3;
            druzyna1.porazki++;

        } else {
            druzyna1.punkty++;
            druzyna2.punkty++;
        }

        System.out.println("Wynik zapisany!");
    }

    public void wyswietlMecz() {
        System.out.println(druzyna1.nazwa + " " + wynik1 + " : " + wynik2 + " " + druzyna2.nazwa);
    }
}