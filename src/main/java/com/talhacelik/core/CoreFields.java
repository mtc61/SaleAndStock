package com.talhacelik.core;

public class CoreFields {

    private String userName = "root";
    private String password = "";
    private String url = "jdbc:mysql://localhost/SaleAndStock?useUnicode=true&characterEncoding=utf8";

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getUrl() {
        return url;
    }

}