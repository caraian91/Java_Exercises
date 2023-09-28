package Mouse;

public class Mouse {
    // FIELDS
    private String nume;
    private int varsta;
    private double greutate;
    private String culoare;
    private double lungime;
    private double latime;

    // CONSTRUCTOR Default
    public Mouse(){
    }

    // CONSTRUCTOR Parameterized
    public Mouse(String nume, int varsta, double greutate, String culoare, double lungime, double latime) {
        this.nume = nume;
        this.varsta = varsta;
        this.greutate = greutate;
        this.culoare = culoare;
        this.lungime = lungime;
        this.latime = latime;
    }

    //GETTERS and SETTERS
    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public double getGreutate() {
        return greutate;
    }

    public void setGreutate(double greutate) {
        this.greutate = greutate;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public double getLungime() {
        return lungime;
    }

    public void setLungime(double lungime) {
        this.lungime = lungime;
    }

    public double getLatime() {
        return latime;
    }

    public void setLatime(double latime) {
        this.latime = latime;
    }

    // METHODS
    public void schimbaNume(String nume){
        this.nume = nume;
    }

    public void mananca(int cantitate){
        if (cantitate == 1){
            greutate += 0.1;
            System.out.println("Mouse-ul " + nume + " sa ingrasat +0.1kg!." + " Greutatea totala este acuma: " + greutate + "kg");
        } else if (cantitate == 2) {
            greutate += 0.2;
            System.out.println("Mouse-ul " + nume + " sa ingrasat +0.2kg!." + " Greutatea totala este acuma: " + greutate + "kg");
        } else if (cantitate == 3) {
            greutate += 0.3;
            System.out.println("Mouse-ul " + nume + " sa ingrasat +0.3kg!." + " Greutatea totala este acuma: " + greutate + "kg");
        } else if (cantitate > 3) {
            System.out.println("Soricelul " + nume + " nu poate manca mai mult de 3 bucati la o masa si greutatea lui va ramane aceeasi");
        }else{
            System.out.println("Oferai o cantitate de soricelului! NU 0!");
        }

    }
}
