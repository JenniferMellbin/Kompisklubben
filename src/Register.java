import java.util.ArrayList;
import java.util.List;

public class Register {

    private List<Medlem> medlemmar = new ArrayList<>();

public void laggTillMedlem(Medlem medlem) {
    medlemmar.add(medlem);
    System.out.println("Medlem tillagd: " + medlem.getNamn());
}
public void listaMedlemmar() {
    if (medlemmar.isEmpty()) {
        System.out.println("Inga medlemmar i registret.");
    } else {
        System.out.println("--- Medlemslista ---");
        for (Medlem m : medlemmar) {
            System.out.println("Namn: " + m.getNamn() + ", Medlemsnummer: " + m.getMedlemsnummer());
        }
    }
}
public void sokMedlem(String namn) {
    for (Medlem m : medlemmar) {
        if (m.getNamn().equalsIgnoreCase(namn)) {
            System.out.println("Hittad: Namn: " + m.getNamn() + ", Medlemsnummer: " + m.getMedlemsnummer());
            return;
        }
    }
    System.out.println("Medlemmen " + namn + " saknas.");
}
}