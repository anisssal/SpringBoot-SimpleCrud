package com.anis.crud.demo.dao;

import com.anis.crud.demo.model.Karyawan;
import com.anis.crud.demo.service.KaryawanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;

/**
 * Created By Anis
 * created on 3/25/2020 - 9:12 AM on demo
 */
@Service
public class KaryawanDAO implements KaryawanService {

    private EntityManagerFactory entityManagerFactory;

    @Autowired
    public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }

    @Override
    public List getAllKaryawan() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        return entityManager.createQuery("from Karyawan" , Karyawan.class).getResultList() ;
    }

    @Override
    public Karyawan saveOrUpdate(Karyawan karyawan) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Karyawan karyawanSaved = entityManager.merge(karyawan);
        entityManager.getTransaction().commit();
        return karyawanSaved;
    }

    @Override
    public Karyawan findKaryawanById(Integer id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        return entityManager.find(Karyawan.class, id);
    }

    @Override
    public void delete(Integer id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.remove(entityManager.find(Karyawan.class, id));
        entityManager.getTransaction().commit();
    }
}
