package clases;

import java.util.Date;

public class Prestec {
    private Date dataPrestec;
    private Date dataRetorn;
    private Soci soci;
    private Exemplar exemplar;

    public Prestec(Date dataPrestec, Date dataRetorn, Soci soci, Exemplar exemplar) {
        this.dataPrestec = dataPrestec;
        this.dataRetorn = dataRetorn;
        this.soci = soci;
        this.exemplar = exemplar;
    }

    public Date getDataPrestec() {
        return dataPrestec;
    }

    public Date getDataRetorn() {
        return dataRetorn;
    }

    public Soci getSoci() {
        return soci;
    }

    public Exemplar getExemplar() {
        return exemplar;
    }

    public void setDataPrestec(Date dataPrestec) {
        this.dataPrestec = dataPrestec;
    }

    public void setDataRetorn(Date dataRetorn) {
        this.dataRetorn = dataRetorn;
    }

    public void setSoci(Soci soci) {
        this.soci = soci;
    }

    public void setExemplar(Exemplar exemplar) {
        this.exemplar = exemplar;
    }
    
}
