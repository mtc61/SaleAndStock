package com.talhacelik.dal;

import com.talhacelik.core.ObjectHelper;
import com.talhacelik.interfaces.DALInterfaces;
import com.talhacelik.types.KategoriContract;

import java.util.List;

public class YetkilerDAL<YetkilerContract> extends ObjectHelper implements DALInterfaces<YetkilerContract> {

    @Override
    public void Insert(YetkilerContract entity) {

    }

    @Override
    public List<YetkilerContract> GetAll() {
        return List.of();
    }

    @Override
    public YetkilerContract Delete(YetkilerContract entity) {
        return null;
    }

    @Override
    public YetkilerContract Update(YetkilerContract entity) {
        return null;
    }

    @Override
    public List<YetkilerContract> GetByID(int id) {
        return List.of();
    }

    @Override
    public List<KategoriContract> GetAllParentId() {
        return List.of();
    }
}
