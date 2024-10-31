package abstraksi;

public class Perahu extends Kendaraan {

    public Perahu(final String warna){
        super(warna);
    }

    @Override
    void bergerak() {
        System.out.println("Perahu bergerak di air");
    }
}
