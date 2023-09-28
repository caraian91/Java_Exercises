package Car;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner for reading from keyboard
        Scanner scannerNumere = new Scanner(System.in);
        Scanner scannerText = new Scanner(System.in);

        // ARRAY with elements tip of Car and elements from keyboard
        System.out.print("Introduceti numarul de masini care vreti sa il introduceti in parc: ");
        int dimensiuneArray = scannerNumere.nextInt();
        Cars[] carArray = new Cars[dimensiuneArray];

        // Enter the elements of the array
        for (int i = 0; i < carArray.length; i++) {
            System.out.println("Introduceti masina numarul " + (i + 1) + ": ");
            System.out.print((i+1)+".Marca: ");
            String marcaIntrodusa = scannerText.nextLine();
            System.out.print("Capacitate Motor: ");
            int capacitateMotorIntrodusa = scannerNumere.nextInt();
            System.out.print("Pret: ");
            double pretIntrodus = scannerNumere.nextDouble();
            System.out.print("Model: ");
            String modelIntrodus = scannerText.nextLine();
            System.out.print("Anul Fabricatiei: ");
            int anFabrciatieIntrodusa = scannerNumere.nextInt();
            System.out.print("Culoare: ");
            String culoareIntrodusa = scannerText.nextLine();
            Cars car = new Cars(marcaIntrodusa, capacitateMotorIntrodusa, pretIntrodus, modelIntrodus, anFabrciatieIntrodusa, culoareIntrodusa);
            carArray[i] = car;
        }

        int optiuneAleasa;
        do {
            afisareMeniu();
            System.out.print("Alegeti o optiune din Meniu: ");
            optiuneAleasa = scannerNumere.nextInt();
            switch (optiuneAleasa) {
                case 1:
                    afiseazaCar(carArray);
                    break;
                case 2:
                    schimbareCar(carArray);
                    break;
                case 3:
                    schimbaCuloare(carArray);
                    break;
                case 4:
                    System.out.println("La reverdere! Va mai asteptam pe la noi!");
                    break;
                default:
                    System.out.println("Optiune invalida! Alege din nou!");
            }
        } while (optiuneAleasa != 4);

    }

    static void afisareMeniu() {
        System.out.println("----- MENIU -----");
        System.out.println("1.Afisare PARC AUTO");
        System.out.println("2.Schimbare AUTO");
        System.out.println("3.Modificare culoare PARC AUTO");
        System.out.println("4.Exit");
    }

    static void afiseazaCar(Cars[] array) {
        System.out.println("--- Lista cu Parcul AUTO ---");
        for (int i = 0; i < array.length; i++) {
            Cars carAfisare = array[i];
            System.out.println((i+1)+".Marca:" + carAfisare.getMarca() + " Capacitate Motor:" + carAfisare.getCapacitateMotor() + " Pret:" + carAfisare.getPret() + " E" + " Model:" + carAfisare.getModel() + " An Fabricatie:" + carAfisare.getAnulFabricatiei() + " Culoare:" + carAfisare.getCuloare());
        }
    }

    static void schimbareCar(Cars[] array) {
        Scanner inputNumere = new Scanner(System.in);
        Scanner inputText = new Scanner(System.in);
        System.out.print("Alegeti numarul masini care il modificati: ");
        int pozitieMasinaModificata = inputNumere.nextInt() - 1 ;
        if (pozitieMasinaModificata < array.length){
            for (int i = pozitieMasinaModificata; i <= pozitieMasinaModificata; i++) {
                System.out.println("Modificare masina numarul " + (i + 1) + ": ");
                System.out.print((i+1)+".Marca: ");
                String marcaIntrodusa = inputText.nextLine();
                System.out.print("Capacitate Motor: ");
                int capacitateMotorIntrodusa = inputNumere.nextInt();
                System.out.print("Pret: ");
                double pretIntrodus = inputNumere.nextDouble();
                System.out.print("Model: ");
                String modelIntrodus = inputText.nextLine();
                System.out.print("Anul Fabricatiei: ");
                int anFabrciatieIntrodusa = inputNumere.nextInt();
                System.out.print("Culoare: ");
                String culoareIntrodusa = inputText.nextLine();
                Cars car = new Cars(marcaIntrodusa, capacitateMotorIntrodusa, pretIntrodus, modelIntrodus, anFabrciatieIntrodusa, culoareIntrodusa);
                array[pozitieMasinaModificata] = car;
            }
        }else {
            System.out.println("Numarul ales nu exista in PARCUL NOSTRU !!!");
        }
    }

    static void schimbaCuloare(Cars[] array){
        Scanner inputText = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print((i+1) + ".Marca:" + array[i].getMarca() + " va avea noua culoare: ");
            String culoare = inputText.nextLine();
            array[i].schimbaCuloarea(culoare);
        }
    }
}

