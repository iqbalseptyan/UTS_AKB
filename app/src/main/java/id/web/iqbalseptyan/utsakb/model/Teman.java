package id.web.iqbalseptyan.utsakb.model;


/*
    NIM : 10116120
    NAMA : MOCHAMAD IQBAL SEPTYAN
    TGL : 21-05-2019
 */
public class Teman {
    private String nim;
    private String nama;
    private String kelas;
    private String telepon;
    private String email;
    private String sosmed;
    private int gambar;


    public Teman(String nim, String nama, String kelas, String telepon, String email, String sosmed, int gambar) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.telepon = telepon;
        this.email = email;
        this.sosmed = sosmed;
        this.gambar = gambar;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
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

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSosmed() {
        return sosmed;
    }

    public void setSosmed(String sosmed) {
        this.sosmed = sosmed;
    }
}