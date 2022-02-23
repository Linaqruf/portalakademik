package com.linaqruf.portalakademik.irs;

public class SetterGetterIRS {
    String mataKuliah;
    String jadwal;
    String dosen;
//


    public SetterGetterIRS(String mataKuliah, String jadwal, String dosen) {
        this.mataKuliah = mataKuliah;
        this.jadwal = jadwal;
        this.dosen = dosen;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public String getJadwal() {
        return jadwal;
    }

    public void setJadwal(String jadwal) {
        this.jadwal = jadwal;
    }

    public String getDosen() {
        return dosen;
    }

    public void setDosen(String dosen) {
        this.dosen = dosen;
    }
}
