package Products;

import Car.Cars;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner for read from keyboard numeric or text
        Scanner scannerNumere = new Scanner(System.in);
        Scanner scannerText = new Scanner(System.in);

        // Size of array
        System.out.print("Numarul de produse pe care vreti sa le introduceti: ");
        int dimensiuneArray = scannerNumere.nextInt();
        Product[] productArray = new Product[dimensiuneArray];
        adaugareProduse(productArray);

        int optiuneAleasa;
        do {
            afisareMeniu();
            System.out.print("Alegeti o optiune: ");
            optiuneAleasa = scannerNumere.nextInt();
            switch (optiuneAleasa) {
                case 1:
                    // I only display a product with the method made in the product - test
                    //productArray[0].afiseazaProdus();
                    afisareProduse(productArray);
                    break;
                case 2:
                    double pret = pretTotal(productArray);
                    System.out.println("Pretul total al produselor din magazin este: " + pret + " RON");
                    break;
                case 3:
                    System.out.print("Introduceti pretul(>) dupa care sortati: ");
                    double pretMare = scannerNumere.nextDouble();
                    pretTastaturaMare(productArray,pretMare);
                    break;
                case 4:
                    schimbareUltimulProdus(productArray);
                    break;
                case 5:
                    System.out.println("La revedere!Va Multumim!");
                    break;
                default:
                    System.out.println("Optiune invalida!!!Alegeti din nou!");
            }
        } while (optiuneAleasa != 5);
    }

    static void afisareMeniu() {
        System.out.println("----- MENIU -----");
        System.out.println("1.Listare Produse");
        System.out.println("2.Calcul total produse");
        System.out.println("3.Produse cu pret mai mare");
        System.out.println("4.Modificare ultimul produs");
        System.out.println("5.Exit");
    }

    static void afisareProduse(Product[] array) {
        for (int i = 0; i < array.length; i++) {
            Product productAfisare = array[i];
            System.out.println("** Produsul ** " + (i + 1) + " :");
            System.out.println("Nume:" + productAfisare.getNume() + " Pret:" + productAfisare.getPret() + " RON" + " Greutate:" + productAfisare.getGreutate() + " KG");
        }
    }

    static void adaugareProduse(Product[] array) {
        Scanner scannerNumere = new Scanner(System.in);
        Scanner scannerText = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Intro produsul " + (i + 1) + ":");
            System.out.print("Nume: ");
            String numeIntrodus = scannerText.nextLine();
            System.out.print("Pret: ");
            double pretIntrodus = scannerNumere.nextDouble();
            System.out.print("Greutate: ");
            double greutateIntrodusa = scannerNumere.nextDouble();
            Product product = new Product(numeIntrodus, pretIntrodus, greutateIntrodusa);
            array[i] = product;
        }
    }

    static void schimbareUltimulProdus(Product[] array) {
        Scanner inputNumere = new Scanner(System.in);
        Scanner inputText = new Scanner(System.in);
        for (int i = (array.length-1); i == (array.length-1); i--) {
            System.out.println("Produsul modificat " + (i + 1) + ":");
            System.out.print("Nume: ");
            String numeIntrodus = inputText.nextLine();
            System.out.print("Pret: ");
            double pretIntrodus = inputNumere.nextDouble();
            System.out.print("Greutate: ");
            double greutateIntrodusa = inputNumere.nextDouble();
            Product product = new Product(numeIntrodus, pretIntrodus, greutateIntrodusa);
            array[i] = product;
            }
        System.out.println("Lista a fost updata cu SUCCES !");
        }

    static double pretTotal(Product[] array) {
        double pretTotal = 0;
        for (int i = 0; i < array.length; i++) {
            pretTotal += array[i].getPret();
        }
        return pretTotal;
    }

    static void pretTastaturaMare(Product[] array, double pretulIntrodus) {
        for (int i = 0; i < array.length; i++) {
            if (pretulIntrodus < array[i].getPret()) {
                System.out.println("** Produsul ** " + (i + 1) + " :");
                System.out.println("Nume:" + array[i].getNume());
                System.out.println("Pret:" + array[i].getPret() + " RON");
                System.out.println("Greutate:" + array[i].getGreutate() + " KG");
            }

        }
    }
}


