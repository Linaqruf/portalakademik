package com.linaqruf.portalakademik.ihs;

public class SetterGetterIHS {
    String kodematkul;
    String matkul;
    String nilai;

    public SetterGetterIHS(String kodematkul, String matkul, String nilai) {
        this.kodematkul = kodematkul;
        this.matkul = matkul;
        this.nilai = nilai;
    }

    public String getKodematkul() {
        return kodematkul;
    }

    public void setKodematkul(String kodematkul) {
        this.kodematkul = kodematkul;
    }

    public String getMatkul() {
        return matkul;
    }

    public void setMatkul(String matkul) {
        this.matkul = matkul;
    }

    public String getNilai() {
        return nilai;
    }

    public void setNilai(String nilai) {
        this.nilai = nilai;
    }
}
