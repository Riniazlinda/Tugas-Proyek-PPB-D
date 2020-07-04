package cobanavigasi.com;

public class itemQuest {

    private String pertanyaan;
    private String jawaban;
    private String tanggal;
    private String bulan;

    public itemQuest(String tanggal, String bulan, String pertanyaan, String jawaban) {
        this.pertanyaan = pertanyaan;
        this.jawaban = jawaban;
        this.tanggal = tanggal;
        this.bulan = bulan;
    }

    //getter

    public String getPertanyaan() {
        return pertanyaan;
    }

    public String getJawaban() {
        return jawaban;
    }

    public String getTanggal() {
        return tanggal;
    }

    public String getBulan() {
        return bulan;
    }

    //setter

    public void setPertanyaan(String pertanyaan) {
        this.pertanyaan = pertanyaan;
    }

    public void setJawaban(String jawaban) {
        this.jawaban = jawaban;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public void setBulan(String bulan) {
        this.bulan = bulan;
    }
}
