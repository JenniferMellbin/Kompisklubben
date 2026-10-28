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
            System.out.println("4. Ta bort medlem");
            System.out.println("5. Visa antal medlemmar");
            System.out.println("6. Visa statistik");
            System.out.println("7. Lägg till Premium-medlem");
            System.out.println("8. Avsluta");
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
                System.out.println("\n--- Tryck Enter för att fortsätta ---");
                sc.nextLine();

            } else if (val.equals("3")) {
                System.out.print("Sok namn: ");
                String sokNamn = sc.nextLine();
                register.sokMedlem(sokNamn);
                System.out.println("\n--- Tryck Enter... ---");
                sc.nextLine();

            } else if (val.equals("4")) {
                System.out.print("Skriv namnet på den medlem du vill ta bort: ");
                String bortNamn = sc.nextLine();
                boolean bort = register.taBortMedlem(bortNamn);
                if (bort) {
                    System.out.println(bortNamn + " har tagits bort från klubben.");
                } else {
                    System.out.println("Hittade ingen medlem med namnet: " + bortNamn);
                }

            } else if (val.equals("5")) {
                register.visaAntalMedlemmar();
                System.out.println("\n--- Tryck Enter för att fortsätta ---");
                sc.nextLine();

            } else if (val.equals("6")) {
                    register.visaStatistik();
                    System.out.println("\n--- Tryck Enter för att fortsätta ---");
                    sc.nextLine();

            } else if (val.equals("7")) {
                System.out.print("Namn: ");
                String namn = sc.nextLine();

                System.out.print("Medlemsnummer: ");
                int nummer = Integer.parseInt(sc.nextLine());

                Medlem ny = new Medlem(namn, nummer);
                ny.setPremium(true);

                register.laggTillMedlem(ny);

            } else if (val.equals("8")) {
                System.out.println("Avslutar...");
                break;

            } else {
                System.out.println("Fel val, forsok igen.");
            }
        }
        sc.close();
    }
}