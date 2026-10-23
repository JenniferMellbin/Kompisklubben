public class Medlem {
    private String namn;
    private int medlemsnummer;
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
}