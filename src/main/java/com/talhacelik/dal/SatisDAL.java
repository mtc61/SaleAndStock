package com.talhacelik.dal;

import com.talhacelik.core.ObjectHelper;
import com.talhacelik.interfaces.DALInterfaces;
import com.talhacelik.types.KategoriContract;

import java.util.List;

public class SatisDAL<SatisContract> extends ObjectHelper implements DALInterfaces<SatisContract> {
    @Override
    public void Insert(SatisContract entity) {

    }

    @Override
    public List<SatisContract> GetAll() {
        return List.of();
    }

    @Override
    public SatisContract Delete(SatisContract entity) {
        return null;
    }

    @Override
    public SatisContract Update(SatisContract entity) {
        return null;
    }

    @Override
    public List<SatisContract> GetByID(int id) {
        return List.of();
    }

    @Override
    public List<KategoriContract> GetAllParentId() {
        return List.of();
    }
}
