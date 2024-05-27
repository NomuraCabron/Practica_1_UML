package clases;

public class Soci {
    private String nom;
    private String dni;
    private String telefon;
    private String correuElectronic;

    public Soci(String nom, String dni, String telefon, String correuElectronic) {
        this.nom = nom;
        this.dni = dni;
        this.telefon = telefon;
        this.correuElectronic = correuElectronic;
    }

    public String getNom() {
        return nom;
    }

    public String getDni() {
        return dni;
    }

    public String getTelefon() {
        return telefon;
    }

    public String getCorreuElectronic() {
        return correuElectronic;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public void setCorreuElectronic(String correuElectronic) {
        this.correuElectronic = correuElectronic;
    }

}
