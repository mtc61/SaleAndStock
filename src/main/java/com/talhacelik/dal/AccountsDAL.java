package com.talhacelik.dal;

import com.talhacelik.core.ObjectHelper;
import com.talhacelik.interfaces.DALInterfaces;
import com.talhacelik.types.KategoriContract;

import java.util.List;

public class AccountsDAL <AccountsContract> extends ObjectHelper implements DALInterfaces<AccountsContract> {
    @Override
    public void Insert(AccountsContract entity) {

    }

    @Override
    public List<AccountsContract> GetAll() {
        return List.of();
    }

    @Override
    public AccountsContract Delete(AccountsContract entity) {
        return null;
    }

    @Override
    public AccountsContract Update(AccountsContract entity) {
        return null;
    }

    @Override
    public List<AccountsContract> GetByID(int id) {
        return List.of();
    }

    @Override
    public List<KategoriContract> GetAllParentId() {
        return List.of();
    }
}
