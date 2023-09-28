package Mouse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner for read from keyboard numeric or text
        Scanner scannerNumere = new Scanner(System.in);
        Scanner scannerText = new Scanner(System.in);

        // Size of array
        System.out.print("Introduceti numarul de soricei pe care vreti sa ii introduceti: ");
        int dimensiuneArray = scannerNumere.nextInt();
        Mouse[] mouseArray = new Mouse[dimensiuneArray];

        // Add and popular array
        for (int i = 0; i < mouseArray.length; i++) {
            System.out.println("Introduceti datele soricelului numar " + (i + 1) + ": ");
            System.out.print("Nume: ");
            String numeIntrodus = scannerText.nextLine();
            System.out.print("Varsta: ");
            int varstaIntrodusa = scannerNumere.nextInt();
            System.out.print("Greutate: ");
            double greutateIntrodusa = scannerNumere.nextDouble();
            System.out.print("Culoare: ");
            String culoareIntrodusa = scannerText.nextLine();
            System.out.print("Lungime: ");
            double lungimeIntrodusa = scannerNumere.nextDouble();
            System.out.print("Latime: ");
            double latimeIntrodusa = scannerNumere.nextDouble();
            Mouse mouse = new Mouse(numeIntrodus, varstaIntrodusa, greutateIntrodusa, culoareIntrodusa, lungimeIntrodusa, latimeIntrodusa);
            mouseArray[i] = mouse;
        }
        //mouseArray[0].mananca(4);
        int optiuneAleasa;
        do {
            afisareMeniu();
            System.out.print("Alegeti o optiune din Meniu: ");
            optiuneAleasa = scannerNumere.nextInt();
            switch (optiuneAleasa) {
                case 1:
                    afisareMouse(mouseArray);
                    break;
                case 2:
                    gasireMouseNume(mouseArray);
                    break;
                case 3:
                    System.out.print("Numarul mouse care va manca: ");
                    int nrMouse = scannerNumere.nextInt();
                    nrMouse -= 1;
                    System.out.print("Cantitatea care va manca: ");
                    int cantitateMouse = scannerNumere.nextInt();
                    mouseArray[nrMouse].mananca(cantitateMouse);
                    break;
                case 4:
                    System.out.print("Numele nou: ");
                    String numeNouMouse = scannerText.nextLine();
                    mouseArray[0].schimbaNume(numeNouMouse);
                    break;
                case 5:
                    System.out.println("Ati parasit aplicatia! La revedere!");
                    break;
                default:
                    System.out.println("Optiune invalida!!!Alegeti din nou!\"");
            }
        } while (optiuneAleasa != 5);

    }

    static void afisareMouse(Mouse[] array) {
        System.out.println("~~Lista cu MOUSE este urmatoarea:~~");
        for (int i = 0; i < array.length; i++) {
            Mouse afisareMouse = array[i];
            System.out.println((i + 1) + ".Nume:" + afisareMouse.getNume() + " Varsta:" + afisareMouse.getVarsta() + " Greutate:" + afisareMouse.getGreutate() + " Culoare:" + afisareMouse.getCuloare() + " Lungime:" + afisareMouse.getLungime() + " Latime:" + afisareMouse.getLatime());
        }
    }

    static void afisareMeniu() {
        System.out.println("----- MENIU -----");
        System.out.println("1.Afisare Mouse");
        System.out.println("2.Verificare nume Mouse exista in baza noastra + schimbare proprietati");
        System.out.println("3.Hranire Mouse");
        System.out.println("4.Schimba primul nume de Mouse");
        System.out.println("5.Exit");
    }

    static void gasireMouseNume(Mouse[] array) {
        Scanner scannerNumere = new Scanner(System.in);
        Scanner scannerText = new Scanner(System.in);
        System.out.print("Introduceti numele pe care il cautati: ");
        String numeIntrodusTastatura = scannerText.nextLine();

        // Variable String for save the name; to give a proper display message not in the FOR instruction;
        String numeSalvare = "";
        for (int i = 0; i < array.length; i++) {
            if (numeIntrodusTastatura.equalsIgnoreCase(array[i].getNume())) {
                numeSalvare = array[i].getNume();
                System.out.println("Introduceti datele noi " + (i + 1) + ": ");
                System.out.print("Nume: ");
                String numeIntrodus = scannerText.nextLine();
                System.out.print("Varsta: ");
                int varstaIntrodusa = scannerNumere.nextInt();
                System.out.print("Greutate: ");
                double greutateIntrodusa = scannerNumere.nextDouble();
                System.out.print("Culoare: ");
                String culoareIntrodusa = scannerText.nextLine();
                System.out.print("Lungime: ");
                double lungimeIntrodusa = scannerNumere.nextDouble();
                System.out.print("Latime: ");
                double latimeIntrodusa = scannerNumere.nextDouble();
                Mouse mouse = new Mouse(numeIntrodus, varstaIntrodusa, greutateIntrodusa, culoareIntrodusa, lungimeIntrodusa, latimeIntrodusa);
                array[i] = mouse;
            }
        }
        if (numeSalvare.equalsIgnoreCase(numeIntrodusTastatura)){
            System.out.println("DATE SCHIMBATE CU SUCCES!");
        }else {
            System.out.println("Nu exista in BAZA DE DATE!");
        }
    }
}
