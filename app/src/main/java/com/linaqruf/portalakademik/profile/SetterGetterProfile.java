package com.linaqruf.portalakademik.profile;

public class SetterGetterProfile {
    String nim;
    String nama;
    String alamat;
    String lahir;
    String agama;
    String jenis_kelamin;
    String status;
    String level_ukt;
    String besar_ukt;

    public SetterGetterProfile(String nim, String nama, String alamat, String lahir, String agama, String jenis_kelamin, String status, String level_ukt, String besar_ukt) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.lahir = lahir;
        this.agama = agama;
        this.jenis_kelamin = jenis_kelamin;
        this.status = status;
        this.level_ukt = level_ukt;
        this.besar_ukt = besar_ukt;

    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getLahir() {
        return lahir;
    }

    public void setLahir(String lahir) {
        this.lahir = lahir;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public String getJenis_kelamin() {
        return jenis_kelamin;
    }

    public void setJenis_kelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLevel_ukt() {
        return level_ukt;
    }

    public void setLevel_ukt(String level_ukt) {
        this.level_ukt = level_ukt;
    }

    public String getBesar_ukt() {
        return besar_ukt;
    }

    public void setBesar_ukt(String besar_ukt) {
        this.besar_ukt = besar_ukt;
    }
}
