package com.talhacelik.interfaces;

import java.util.List;

public interface DALInterfaces<T> {

    void Insert(T entity);

    List<T> GetAll();

    T Delete(T entity);

    T Update(T entity);

    List<T> GetByID(int id);


}
