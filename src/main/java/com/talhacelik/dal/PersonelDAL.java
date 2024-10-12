package com.talhacelik.dal;

import com.talhacelik.core.ObjectHelper;
import com.talhacelik.interfaces.DALInterfaces;
import com.talhacelik.types.KategoriContract;

import java.util.List;

public class PersonelDAL <PersonelConrtact> extends ObjectHelper implements DALInterfaces <PersonelConrtact> {

    @Override
    public void Insert(Object entity) {

    }

    @Override
    public List GetAll() {
        return List.of();
    }

    @Override
    public Object Delete(Object entity) {
        return null;
    }

    @Override
    public Object Update(Object entity) {
        return null;
    }

    @Override
    public List GetByID(int id) {
        return List.of();
    }

    @Override
    public List<KategoriContract> GetAllParentId() {
        return List.of();
    }
}
