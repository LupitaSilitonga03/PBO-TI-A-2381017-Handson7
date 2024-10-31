package pewarisan;

public class Kendaraan {
    private String merek;
    private String model;
    private int tahunProduksi;

    public Kendaraan(final String merek, final String model, final int tahunProduksi){
        this.merek = merek;
        this.model = model;
        this.tahunProduksi = tahunProduksi;
    }

    public void infoKendaraan(){
        System.out.println("Merek : " + merek);
        System.out.println("Modek : " + model);
        System.out.println("Tahun produksi : " + tahunProduksi);
    }
}
