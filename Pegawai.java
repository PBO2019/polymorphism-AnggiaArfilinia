public class Pegawai {
    protected int tarif;

    public static void main(String[]args){
        Supervisor a = new Supervisor();
        Staff b = new Staff();
        Gaji c = new Gaji();

        c.hitungGaji(a.tarif);
        c.hitungGaji(b.tarif);
    }
}
