import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Register register = new Register();

        while (true) {
            System.out.println("\n--- KLUBBENS MEDLEMSREGISTER ---");
            System.out.println("1. Lagg till medlem");
            System.out.println("2. Lista alla medlemmar");
            System.out.println("3. Sok medlem");
            System.out.println("4. Avsluta");
            System.out.print("Valj: ");
            String val = sc.nextLine();

if (val.equals("1")) {
    System.out.print("Namn: ");
    String namn = sc.nextLine();
    System.out.print("Medlemsnummer: ");
    int nummer = Integer.parseInt(sc.nextLine());
    Medlem ny = new Medlem(namn, nummer);
    register.laggTillMedlem(ny);

} else if (val.equals("2")) {
    register.listaMedlemmar();

 } else if (val.equals("3")) {
    System.out.print("Sok namn: ");
    String sokNamn = sc.nextLine();
    register.sokMedlem(sokNamn);

} else if (val.equals("4")) {
    System.out.println("Avslutar...");
    break;
} else {
    System.out.println("Fel val, forsok igen.");
}
        }
        sc.close();
    }
}