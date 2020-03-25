package com.anis.crud.demo.model;

import javax.persistence.*;

/**
 * Created By Anis
 * created on 3/25/2020 - 9:02 AM on demo
 */
@Entity
public class Karyawan {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id ;

    @Version
    @Column (name = "opt_version" , columnDefinition = "integer default 0")
    private Integer version ;
    private String nama ;
    private String jumlahGaji ;
    private String tahunMasuk ;

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

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
