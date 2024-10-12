package com.talhacelik.dal;

import com.talhacelik.core.ObjectHelper;
import com.talhacelik.interfaces.DALInterfaces;
import com.talhacelik.types.KategoriContract;

import java.util.List;

public class MusteriDAL<MusteriContract> extends ObjectHelper implements DALInterfaces<MusteriContract> {

    @Override
    public void Insert(MusteriContract entity) {

    }

    @Override
    public List<MusteriContract> GetAll() {
        return List.of();
    }

    @Override
    public MusteriContract Delete(MusteriContract entity) {
        return null;
    }

    @Override
    public MusteriContract Update(MusteriContract entity) {
        return null;
    }

    @Override
    public List<MusteriContract> GetByID(int id) {
        return List.of();
    }

    @Override
    public List<KategoriContract> GetAllParentId() {
        return List.of();
    }
}
