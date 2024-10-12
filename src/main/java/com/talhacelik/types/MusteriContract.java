package com.talhacelik.types;

public class MusteriContract {

    private int id;
    private String adiSoyadi;
    private String telefon;
    private String adres;
    private String sehirId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdiSoyadi() {
        return adiSoyadi;
    }

    public void setAdiSoyadi(String adiSoyadi) {
        this.adiSoyadi = adiSoyadi;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getSehirId() {
        return sehirId;
    }

    public void setSehirId(String sehirId) {
        this.sehirId = sehirId;
    }

    @Override
    public String toString() {
        return "MusteriContract{" +
                "id=" + id +
                ", adiSoyadi='" + adiSoyadi + '\'' +
                ", telefon='" + telefon + '\'' +
                ", adres='" + adres + '\'' +
                ", sehirId='" + sehirId + '\'' +
                '}';
    }
}
