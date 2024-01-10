public class Kotak extends ObjekGeometri {
    private double panjang;
    private double lebar;
    private double tinggi;

    public Kotak(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double hitungVolume() {
        return panjang * lebar * tinggi;
    }

    public double hitungLuasPermukaan() {
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }

    public static void main(String[] args) {
        Kotak kotak = new Kotak(3.0, 4.0, 5.0);

        System.out.println("Warna awal: " + kotak.getColor());
        kotak.setColor("green");
        System.out.println("Warna setelah diubah: " + kotak.getColor());

        System.out.println("Panjang Kotak: " + kotak.getPanjang());
        System.out.println("Lebar Kotak: " + kotak.getLebar());
        System.out.println("Tinggi Kotak: " + kotak.getTinggi());
        System.out.println("Volume Kotak: " + kotak.hitungVolume());
        System.out.println("Luas Permukaan Kotak: " + kotak.hitungLuasPermukaan());
    }
}
