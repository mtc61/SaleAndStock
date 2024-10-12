package com.talhacelik.core;

import com.talhacelik.interfaces.CoreInterfaces;
import com.talhacelik.types.KategoriContract;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public abstract class ObjectHelper extends CoreFields implements CoreInterfaces {

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {

        Connection connection = null;

        try {
            connection = DriverManager.getConnection(getUrl(),getUserName(),getPassword());
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return connection;
    }

    public abstract List<KategoriContract> GetAllParentId();
}
