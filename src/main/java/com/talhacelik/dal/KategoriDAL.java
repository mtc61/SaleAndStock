package com.talhacelik.dal;

import com.talhacelik.core.ObjectHelper;
import com.talhacelik.interfaces.DALInterfaces;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class KategoriDAL<KategoriContract> extends ObjectHelper implements DALInterfaces<com.talhacelik.types.KategoriContract> {

    @Override
    public void Insert(com.talhacelik.types.KategoriContract entity) {
        Connection connection = getConnection();
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO Kategori (Adi, ParentId) VALUES ('"
                    + entity.getAdi() + "'," + entity.getParentId() + ")");
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public List<com.talhacelik.types.KategoriContract> GetAll() {
        return List.of();
    }

    @Override
    public List<com.talhacelik.types.KategoriContract> GetAllParentId() {
        List<com.talhacelik.types.KategoriContract> datacontract = new ArrayList<com.talhacelik.types.KategoriContract>();
        Connection connection = getConnection();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Kategori WHERE parentId=0");
            while (resultSet.next()) {
                com.talhacelik.types.KategoriContract contract = new com.talhacelik.types.KategoriContract();
                contract.setId(resultSet.getInt("Id"));
                contract.setAdi(resultSet.getString("Adi"));
                contract.setParentId(resultSet.getInt("ParentId"));
                datacontract.add(contract); // Listeye ekleme


            }
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return datacontract;
    }


    @Override
    public com.talhacelik.types.KategoriContract Delete(com.talhacelik.types.KategoriContract entity) {
        return null;
    }

    @Override
    public com.talhacelik.types.KategoriContract Update(com.talhacelik.types.KategoriContract entity) {
        return null;
    }

    @Override
    public List<com.talhacelik.types.KategoriContract> GetByID(int id) {
        return List.of();
    }
}
