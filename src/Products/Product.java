package Products;
public class Product {
    // FIELDS
    private String nume;
    private double pret;
    private double greutate;

    // CONSTRUCTOR Default
    public Product(){

    }

    // CONSTRUCTOR Parameterized
    public Product(String nume, double pret, double greutate) {
        this.nume = nume;
        this.pret = pret;
        this.greutate = greutate;
    }

    //GETTERS and SETTERS
    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public double getGreutate() {
        return greutate;
    }

    public void setGreutate(double greutate) {
        this.greutate = greutate;
    }

    // METHODS
    public void schimbaPret(double pretProdus){
        pret = pretProdus;
    }

    public void afiseazaProdus(){
        int i = 1;
        System.out.println((i++) + ".Nume:" + getNume() + " Pret:" + getPret() + " Greutate:" + getGreutate());

    }
}
