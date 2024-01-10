public class Tabung extends ObjekGeometri {
    private double jariJari;
    private double tinggi;

    public Tabung() {
        this.jariJari = 1.0; // Nilai default jari-jari jika tidak diinisialisasi
        this.tinggi = 1.0; // Nilai default tinggi jika tidak diinisialisasi
    }

    public Tabung(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double hitungVolume() {
        return Math.PI * Math.pow(jariJari, 2) * tinggi;
    }

    public double hitungLuasPermukaan() {
        return 2 * Math.PI * jariJari * (jariJari + tinggi);
    }
}
