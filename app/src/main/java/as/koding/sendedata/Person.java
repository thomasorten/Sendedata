package as.koding.sendedata;

/**
 * Created by thomasorten on 23.01.2018.
 */

public class Person {

    private String fornavn;
    private String etternavn;
    private String adresse;
    private  int telefonNummer;

    public Person() {
        this.fornavn = "Ola";
        this.etternavn = "Nordmann";
        this.adresse = "Norge";
        this.telefonNummer = 113;
    }

    public Person(String fornavn, String etternavn, String adresse, int telefonNummer) {
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.adresse = adresse;
        this.telefonNummer = telefonNummer;
    }

    public String getFornavn() {
        return fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getTelefonNummer() {
        return telefonNummer;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setTelefonNummer(int telefonNummer) {
        this.telefonNummer = telefonNummer;
    }
}
