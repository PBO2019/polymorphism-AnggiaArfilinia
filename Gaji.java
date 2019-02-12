public class Gaji {
    private int jumlah;

    public void hitungGaji(int tarif){
        this.jumlah = 30*tarif;
        System.out.println("Gaji anda sebesar " + jumlah);
    }
}
