package pewarisan;

public class Mobil extends Kendaraan {
    private int jumlahPintu;
    private String jenisBahanBakar;

    public Mobil(final String merek, final String model, final int tahunProduksi, final int jumlahpintu, final String jenisBahanBakar){
        super(merek, model, tahunProduksi);
        this.jumlahPintu = jumlahpintu;
        this.jenisBahanBakar = jenisBahanBakar;
    }

    public void infoMobil(){
        super.infoKendaraan();
        System.out.println("Jumlah pintu: " + jumlahPintu);
        System.out.println("Jenis bahan bakar : " + jenisBahanBakar);
    }
}
