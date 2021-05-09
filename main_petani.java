// Aghits Nidallah - 190511038
public class main_petani {
    public static void main(String[] args) {
        Lahan lhn = new Lahan();
        Sawah swh = new Sawah();
        KolamIkan klik = new KolamIkan();
        
        // Print jenis lahan
        lhn.tampil_jenis_lahan();
        System.out.println("\n");
        
        // Print jenis dan kategori lahan sawah
        swh.tampil_jenis_lahan();
        swh.tampil_kategori_lahan();
        
        // Hitung luas sawah
        swh.panjang = 7;
        swh.lebar = 8;
        swh.tampil_rumus_sawah();

        // Print jenis dan kategori kolam ikan
        klik.tampil_jenis_lahan();
        klik.tampil_kategori_lahan();

        // Hitung luas kolam ikan
        klik.radius_kolam = 7;
        klik.tampil_rumus_kolam();
    }
}
