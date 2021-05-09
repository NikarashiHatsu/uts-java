// Aghits Nidallah - 190511038
public class KolamIkan extends Lahan {
    String kategori_lahan = "Kolam Ikan";
    public int radius_kolam;
    
    public void tampil_kategori_lahan() {
        System.out.println("Kategori lahan: " + kategori_lahan);
    }
    
    public void tampil_rumus_kolam() {
        var rumus_kolam = Math.round(Math.PI * Math.pow(radius_kolam, 2));

        System.out.println("Luas kolam: " + rumus_kolam + "m^2 \n");
    }
}
