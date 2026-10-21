public class Gracz extends Uczestnik {
    protected String rola;

    public Gracz(String nick, String imie, int wiek, String rola) {
        super(nick, imie, wiek);
        this.rola = rola;
    }

    @Override
    public void wyswietlDane() {
        super.wyswietlDane();
        System.out.println("Rola: " + rola);
    }
}
