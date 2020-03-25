package com.anis.crud.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created By Anis
 * created on 3/25/2020 - 9:02 AM on demo
 */
@Entity
public class Karyawan {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id ;

    private String nama ;
    private String jumlahGaji ;
    private String tahunMasuk ;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJumlahGaji() {
        return jumlahGaji;
    }

    public void setJumlahGaji(String jumlahGaji) {
        this.jumlahGaji = jumlahGaji;
    }

    public String getTahunMasuk() {
        return tahunMasuk;
    }

    public void setTahunMasuk(String tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }
}
