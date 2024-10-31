package pewarisan;

public class Main {
    public static void main(String[] args) {
        Mobil mobilku = new Mobil ("Toyota", "avanza", 2022, 4, "Bensin");
        Motor motorku = new Motor("Honda", "CBR250RR", 2023, 250, "Manual");

        mobilku.infoKendaraan();
        motorku.infoKendaraan();
    }
}
