package com.talhacelik.dal;

import com.talhacelik.core.ObjectHelper;
import com.talhacelik.interfaces.DALInterfaces;
import com.talhacelik.types.KategoriContract;

import java.util.List;

public class StokDAL <StokContract> extends ObjectHelper implements DALInterfaces<StokContract> {
    @Override
    public void Insert(StokContract entity) {

    }

    @Override
    public List<StokContract> GetAll() {
        return List.of();
    }

    @Override
    public StokContract Delete(StokContract entity) {
        return null;
    }

    @Override
    public StokContract Update(StokContract entity) {
        return null;
    }

    @Override
    public List<StokContract> GetByID(int id) {
        return List.of();
    }

    @Override
    public List<KategoriContract> GetAllParentId() {
        return List.of();
    }
}
