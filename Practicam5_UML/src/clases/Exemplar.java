package clases;

public class Exemplar {
    private String codiExemplar;
    private String estat;

    public Exemplar(String codiExemplar, String estat) {
        this.codiExemplar = codiExemplar;
        this.estat = estat;
    }

    public String getCodiExemplar() {
        return codiExemplar;
    }

    public String getEstat() {
        return estat;
    }

    public void setCodiExemplar(String codiExemplar) {
        this.codiExemplar = codiExemplar;
    }

    public void setEstat(String estat) {
        this.estat = estat;
    }
    
}
