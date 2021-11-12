public class Animale {
    private String caracteristici;
    private String nume;
    private int varsta;



    @Override public String toString(){
        return "Animal{" + nume + ", " + varsta + ", " + caracteristici + '\'' + '}';
    }

    public Animale(String nume, int varsta, String caracteristici){


        this.nume = nume;
        this.varsta = varsta;
        this.caracteristici = caracteristici;
    }

    public int getVarsta() {return varsta;}
    public void setVarsta(int varsta){this.varsta = varsta;}

    public String getNume() {return nume;}
    public void setNume(String nume){this.nume = nume;}

    public String getCaracteristici(){ return caracteristici;}
    public void setCaracteristici(String caracteristici){this.caracteristici = caracteristici;}


}

