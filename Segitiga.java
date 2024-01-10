public class Segitiga extends ObjekGeometri {
    private double alas;
    private double tinggi;

    public Segitiga() {
        this.alas = 1.0; // Nilai default alas jika tidak diinisialisasi
        this.tinggi = 1.0; // Nilai default tinggi jika tidak diinisialisasi
    }

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double getAlas() {
        return alas;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    public double hitungKeliling() {
        // Untuk menghitung keliling segitiga, perlu informasi tambahan
        // Misalnya, jika segitiga adalah segitiga siku-siku, kita dapat menggunakan
        // Teorema Pythagoras untuk menghitung panjang sisi miring.
        // Untuk contoh sederhana, mari asumsikan ini adalah segitiga sembarang
        // dan kelilingnya adalah penjumlahan ketiga sisi.
        // Anda mungkin perlu menyesuaikan logika sesuai kebutuhan kasus.
        return alas + tinggi + Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
    }
}
