import java.util.ArrayList;
import java.util.List;

public class Register {

    private List<Medlem> medlemmar = new ArrayList<>();

    public void laggTillMedlem(Medlem medlem) {

        for (Medlem m : medlemmar) {
            if (m.getMedlemsnummer() == medlem.getMedlemsnummer()) {
                System.out.println("Fel! Medlemsnummer "
                        + medlem.getMedlemsnummer()
                        + " finns redan i registret.");
                return;
            }
        }

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

    public boolean taBortMedlem(String namn) {
        for (int i = 0; i < medlemmar.size(); i++) {
            if (medlemmar.get(i).getNamn().equalsIgnoreCase(namn)) {
                medlemmar.remove(i);
                return true;
            }
        }
        return false;
    }

    public void visaAntalMedlemmar() {
        int antal = medlemmar.size(); // (eller vad din lista/variabel heter)

        if (antal == 1) {
            System.out.println("Det är 1 medlem i klubben.");
        } else {
            System.out.println("Det är " + antal + " medlemmar i klubben.");
        }

    }
}
