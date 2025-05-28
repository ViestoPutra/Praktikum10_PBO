package THT;

public class main {
    public static void main(String[] args) {
        Transportasi[] daftarTransportasi = new Transportasi[3];

        daftarTransportasi[0] = new Bus("Bus Pariwisata", 40, "Bandung");
        daftarTransportasi[1] = new Kereta("Kereta Argo", 100, "Yogyakarta");
        daftarTransportasi[2] = new Pesawat("Garuda", 180, "Bali");

        for (Transportasi t : daftarTransportasi) {
            System.out.println("[" + t.getNama() + " ke " + t.getTujuan() + "]");
            System.out.println("Harga Tiket (default): Rp " + t.hitungHargaTiket());

            if (t instanceof Bus) {
                System.out.println("Harga Tiket (VIP): Rp " + ((Bus) t).hitungHargaTiket("VIP"));
            } else if (t instanceof Kereta) {
                System.out.println("Harga Tiket (Bisnis): Rp " + ((Kereta) t).hitungHargaTiket("Bisnis"));
            } else if (t instanceof Pesawat) {
                System.out.println("Harga Tiket (Ekonomi): Rp " + ((Pesawat) t).hitungHargaTiket("Ekonomi"));
            }

            System.out.println();
        }
    }
}
