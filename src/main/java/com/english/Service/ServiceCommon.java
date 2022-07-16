package com.english.Service;

import java.util.List;

public interface ServiceCommon<T,K> {
    public abstract T save(T t);
    public abstract T update (T t);
    public abstract boolean delete (K[] t);
    public abstract List<T>  findAll();
}
