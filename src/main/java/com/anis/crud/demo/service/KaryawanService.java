package com.anis.crud.demo.service;

import com.anis.crud.demo.model.Karyawan;

import java.util.List;

/**
 * Created By Anis
 * created on 3/25/2020 - 8:54 AM on demo
 */


public interface KaryawanService {
    List getAllKaryawan();

    Karyawan saveOrUpdate(Karyawan karyawan);

    Karyawan findKaryawanById(Integer id);

    void delete(Integer id);
}
