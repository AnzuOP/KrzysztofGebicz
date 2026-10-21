public class Uczestnik {
    protected String nick;
    protected String imie;
    protected int wiek;
    protected int punkty;

    public Uczestnik(String nick, String imie, int wiek) {
        this.nick = nick;
        this.imie = imie;
        this.wiek = wiek;
        this.punkty = 0;
    }

    public void wyswietlDane() {
        System.out.println("Nick: " + nick);
        System.out.println("Imie: " + imie);
        System.out.println("Wiek: " + wiek);
        System.out.println("Punkty: " + punkty);
    }
}
