package com.officelibrary.library.exposure.service;

import java.util.List;

public interface LibraryService<T> {

    List<T> getObjects();
    T create(T object);
    T findById(int id);
    T update(T obj);

}
