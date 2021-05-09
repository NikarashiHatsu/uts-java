// Aghits Nidallah - 190511038
public class Sawah extends Lahan {
    String kategori_lahan = "Sawah";
    public int panjang;
    public int lebar;

    public void tampil_kategori_lahan() {
        System.out.println("Kategori lahan: " + kategori_lahan);
    }

    public void tampil_rumus_sawah() {
        int rumus_sawah = panjang * lebar;

        System.out.println("Luas sawah: " + rumus_sawah + "m^2 \n");
    }
}
