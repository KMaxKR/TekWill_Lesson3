package angajat;

import person.*;

public class Angajat extends Person {
    public static int count = 3;
    private double salariu;
    public double getSalariu() {
        return salariu;
    }

    public void setSalariu(double salariu) {
        this.salariu = salariu;
    }
    public int getCount(){
        return count;
    }
}
