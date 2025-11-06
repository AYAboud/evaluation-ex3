package ma.projet.dao;

import java.util.List;

public interface IDao<T> {
<<<<<<< HEAD
    void save(T o);
    void update(T o);
    void delete(T o);
    T getById(int id);
    List<T> getAll();
}
=======
    void create(T o);
    void update(T o);
    void delete(T o);
    T findById(int id);
    List<T> findAll();
}


>>>>>>> 7ac17156348b47e3811e6279a4813c211d9c4318
