package polimorfisme;

public class Main {
    public static void main(String[] args) {
        BangunDatar bangunDatar;

        bangunDatar = new Persegi(4);
        tampilkanPerhitungan(bangunDatar.hitungLuas(), bangunDatar.hitungKeliling(),"Persegi");

        bangunDatar = new SegitigaSamaSisi(4,5);
        tampilkanPerhitungan(bangunDatar.hitungLuas(), bangunDatar.hitungKeliling(), "Segitiga Sama Sisi");

        bangunDatar = new Lingkaran(4);
        tampilkanPerhitungan(bangunDatar.hitungLuas(), bangunDatar.hitungKeliling(), "Lingkaran");
    }

    public static void tampilkanPerhitungan(double luas,double kelilng, String namaBangunDatar){
        System.out.println("Luas bangun datar "+ namaBangunDatar + ": " + luas);
        System.out.println("Keliling bangun datar "+ namaBangunDatar + ": " + kelilng);
    }
}