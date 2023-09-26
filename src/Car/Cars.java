package Car;

import java.util.Scanner;

public class Cars {
    // FILDS
    private String marca;
    private int capacitateMotor;
    private double pret;
    private String model;
    private int anulFabricatiei;
    private String culoare;

    // CONSTRUCTOR Default
    public Cars() {

    }

    // CONSTRUCTOR Parameterized
    public Cars(String marca, int capacitateMotor, double pret, String model, int anulFabricatiei, String culoare) {
        this.marca = marca;
        this.capacitateMotor = capacitateMotor;
        this.pret = pret;
        this.model = model;
        this.anulFabricatiei = anulFabricatiei;
        this.culoare = culoare;
    }

    // GET and SET
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCapacitateMotor() {
        return capacitateMotor;
    }

    public void setCapacitateMotor(int capacitateMotor) {
        this.capacitateMotor = capacitateMotor;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAnulFabricatiei() {
        return anulFabricatiei;
    }

    public void setAnulFabricatiei(int anulFabricatiei) {
        this.anulFabricatiei = anulFabricatiei;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    // METHODS
    public void schimbaCuloarea(String culoareCititaTastatura) {
        culoare = culoareCititaTastatura;
    }
}







