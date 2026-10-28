public class Medlem {
    private String namn;
    private int medlemsnummer;
    private boolean premium = false;

    public Medlem(String namn, int medlemsnummer) {
        this.namn = namn;
        this.medlemsnummer = medlemsnummer;
    }

    public String getNamn() {
        return namn;
    }

    public int getMedlemsnummer() {
        return medlemsnummer;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    public boolean isPremium() {
        return premium;
    }
}