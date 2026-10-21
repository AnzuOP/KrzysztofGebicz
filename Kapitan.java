public class Kapitan extends Gracz {

    public Kapitan(String nick, String imie, int wiek) {
        super(nick, imie, wiek, "Kapitan");
    }

    public void zarzadzajDruzyna() {
        System.out.println("Kapitan zarzadza druzyna.");
    }
}
