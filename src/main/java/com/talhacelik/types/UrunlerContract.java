package com.talhacelik.types;

import java.sql.Date;

public class UrunlerContract {

    private int id;
    private String adi;
    private String kategoriId;
    private Date tarih;
    private float fiyat;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getKategoriId() {
        return kategoriId;
    }

    public void setKategoriId(String kategoriId) {
        this.kategoriId = kategoriId;
    }

    public Date getTarih() {
        return tarih;
    }

    public void setTarih(Date tarih) {
        this.tarih = tarih;
    }

    public float getFiyat() {
        return fiyat;
    }

    public void setFiyat(float fiyat) {
        this.fiyat = fiyat;
    }

    @Override
    public String toString() {
        return id + " " + adi + " " + kategoriId + " " + tarih + " " + fiyat;
    }
}
