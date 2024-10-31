package contohkelaspertama;

public class Mobil {
    String warna;
    String merek;
    int kecepatanMaks;

    public Mobil(final String warna, final String merek, final int kecepatanMaks) {
        this.warna = warna;
        this.merek = merek;
        this.kecepatanMaks = kecepatanMaks;
    }

    public void tampilkanInfo(){
        System.out.println("warna: " + warna);
        System.out.println("merek: " + merek);
        System.out.println("Kecepatan Maks : " +kecepatanMaks );
    }

    public void berhenti(){
        System.out.println("Mobil " + merek + "Berhenti");
    }

    public void berjalan (){
        System.out.println("Mobil " + merek + "Berjalan");
    }
}
