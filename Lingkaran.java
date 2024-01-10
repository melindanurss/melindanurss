public class Lingkaran extends ObjekGeometri {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    public double hitungLuas() {
        return Math.PI * Math.pow(jariJari, 2);
    }

    public double hitungKeliling() {
        return 2 * Math.PI * jariJari;
    }

    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran(5.0);

        System.out.println("Warna awal: " + lingkaran.getColor());
        lingkaran.setColor("blue");
        System.out.println("Warna setelah diubah: " + lingkaran.getColor());

        System.out.println("Jari-jari Lingkaran: " + lingkaran.getJariJari());
        System.out.println("Luas Lingkaran: " + lingkaran.hitungLuas());
        System.out.println("Keliling Lingkaran: " + lingkaran.hitungKeliling());
    }
}
