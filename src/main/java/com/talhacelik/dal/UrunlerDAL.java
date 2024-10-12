package com.talhacelik.dal;

import com.talhacelik.core.ObjectHelper;
import com.talhacelik.interfaces.DALInterfaces;
import com.talhacelik.types.KategoriContract;

import java.util.List;

public class UrunlerDAL<UrunlerContract> extends ObjectHelper implements DALInterfaces<UrunlerContract> {

    @Override
    public void Insert(UrunlerContract entity) {

    }

    @Override
    public List<UrunlerContract> GetAll() {
        return List.of();
    }

    @Override
    public UrunlerContract Delete(UrunlerContract entity) {
        return null;
    }

    @Override
    public UrunlerContract Update(UrunlerContract entity) {
        return null;
    }

    @Override
    public List<UrunlerContract> GetByID(int id) {
        return List.of();
    }

    @Override
    public List<KategoriContract> GetAllParentId() {
        return List.of();
    }
}
