package com.talhacelik.types;

public class PersonelContract {

    private int id;
    private String adiSoyadi;
    private String email;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "PersonelContract{" +
                "id=" + id +
                ", adiSoyadi='" + adiSoyadi + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
