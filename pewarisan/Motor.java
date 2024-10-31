package pewarisan;

public class Motor extends Kendaraan {
    private int kapasitasMesin;
    private String jenisTransmisi;

    public Motor(final String merek, final String model, final int tahunProduksi, final int kapasitasMesin, final String jenisTransmisi){
        super(merek, model, tahunProduksi);
        this.kapasitasMesin = kapasitasMesin;
        this.jenisTransmisi = jenisTransmisi;
    }

    public void infoMotor(){
        super.infoKendaraan();
        System.out.println("Kapasitas mesin: " + kapasitasMesin);
        System.out.println("Jenis transmisi: " + jenisTransmisi);
    }

}
