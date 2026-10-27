import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Turniej turniej = new Turniej("Turniej Gamingowy", "CS2");
        Administrator admin = new Administrator(scanner, turniej);

        int wybor = 0;

        while (wybor != 8) {
            System.out.println("\n===== TURNIEJ CS2 =====");
            System.out.println("1. Dodaj druzyne");
            System.out.println("2. Dodaj zawodnika");
            System.out.println("3. Utworz mecz");
            System.out.println("4. Wprowadz wynik meczu");
            System.out.println("5. Wyswietl tabele");
            System.out.println("6. Wyswietl mecze");
            System.out.println("7. Wyswietl klasyfikacje koncowa");
            System.out.println("8. Wyjscie");
            System.out.print("Wybierz opcje: ");

            try {
                wybor = Integer.parseInt(scanner.nextLine());

                switch (wybor) {
                    case 1:
                        admin.dodajDruzyne();
                        break;

                    case 2:
                        admin.dodajZawodnika();
                        break;

                    case 3:
                        admin.utworzMecz();
                        break;

                    case 4:
                        admin.wprowadzWynik();
                        break;

                    case 5:
                        turniej.wyswietlTabele();
                        break;

                    case 6:
                        turniej.wyswietlMecze();
                        break;

                    case 7:
                        turniej.wyswietlKlasyfikacje();
                        break;

                    case 8:
                        System.out.println("Koniec turnieju!");
                        break;

                    default:
                        System.out.println("Nie ma takiej opcji!");
                }

            } catch (NumberFormatException e) {
                System.out.println("Wpisz prawidlowa liczbe!");
            }
        }

        scanner.close();
    }
}
