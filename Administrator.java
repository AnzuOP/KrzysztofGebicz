import java.util.*;

public class Administrator {
    Scanner scanner;
    Turniej turniej;

    public Administrator(Scanner scanner, Turniej turniej) {
        this.scanner = scanner;
        this.turniej = turniej;
    }

    public void dodajDruzyne() {
        System.out.print("Podaj nazwe druzyny: ");
        String nazwa = scanner.nextLine();

        Druzyna druzyna = new Druzyna(nazwa);
        turniej.dodajDruzyne(druzyna);

        System.out.println("Dodano druzyne!");
    }

    public void dodajZawodnika() {
        if (turniej.druzyny.isEmpty()) {
            System.out.println("Najpierw dodaj druzyne!");
            return;
        }

        for (int i = 0; i < turniej.druzyny.size(); i++) {
            System.out.println(
                (i + 1) + ". " + turniej.druzyny.get(i).nazwa
            );
        }

        System.out.print("Wybierz druzyne: ");
        int numer = Integer.parseInt(scanner.nextLine());

        if (numer < 1 || numer > turniej.druzyny.size()) {
            System.out.println("Nie ma takiej druzyny!");
            return;
        }

        System.out.print("Podaj nick: ");
        String nick = scanner.nextLine();

        System.out.print("Podaj imie: ");
        String imie = scanner.nextLine();

        System.out.print("Podaj wiek: ");
        int wiek = Integer.parseInt(scanner.nextLine());

        System.out.print("Podaj role: ");
        String rola = scanner.nextLine();

        Gracz gracz = new Gracz(nick, imie, wiek, rola);

        turniej.druzyny.get(numer - 1).dodajZawodnika(gracz);
    }

    public void utworzMecz() {
        if (turniej.druzyny.size() < 2) {
            System.out.println("Potrzebujesz dwoch druzyn!");
            return;
        }

        for (int i = 0; i < turniej.druzyny.size(); i++) {
            System.out.println(
                (i + 1) + ". " + turniej.druzyny.get(i).nazwa
            );
        }

        System.out.print("Numer pierwszej druzyny: ");
        int numer1 = Integer.parseInt(scanner.nextLine());

        System.out.print("Numer drugiej druzyny: ");
        int numer2 = Integer.parseInt(scanner.nextLine());

        if (numer1 < 1 || numer1 > turniej.druzyny.size()
                || numer2 < 1 || numer2 > turniej.druzyny.size()
                || numer1 == numer2) {
            System.out.println("Nieprawidlowy wybor!");
            return;
        }

        Druzyna d1 = turniej.druzyny.get(numer1 - 1);
        Druzyna d2 = turniej.druzyny.get(numer2 - 1);

        Mecz mecz = new Mecz(d1, d2);
        turniej.dodajMecz(mecz);

        System.out.println("Utworzono mecz!");
    }

    public void wprowadzWynik() {
        if (turniej.mecze.isEmpty()) {
            System.out.println("Nie ma jeszcze zadnych meczow!");
            return;
        }

        for (int i = 0; i < turniej.mecze.size(); i++) {
            Mecz mecz = turniej.mecze.get(i);

            System.out.print((i + 1) + ". ");
            System.out.print(mecz.druzyna1.nazwa + " - ");
            System.out.println(mecz.druzyna2.nazwa);

        }

        System.out.print("Wybierz mecz: ");
        int numer = Integer.parseInt(scanner.nextLine());

        if (numer < 1 || numer > turniej.mecze.size()) {
            System.out.println("Nie ma takiego meczu!");
            return;
        }

        Mecz mecz = turniej.mecze.get(numer - 1);

        System.out.print("Wynik pierwszej druzyny: ");
        int wynik1 = Integer.parseInt(scanner.nextLine());

        System.out.print("Wynik drugiej druzyny: ");
        int wynik2 = Integer.parseInt(scanner.nextLine());

        mecz.ustawWynik(wynik1, wynik2);
    }
}
