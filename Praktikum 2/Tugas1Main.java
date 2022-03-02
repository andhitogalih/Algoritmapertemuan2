public class Tugas1Main {
        public static void main(String[] args) {
           Tugas1 a1 = new Tugas1(); 
            a1.namaBarang = "Keyboard Gaming";
            a1.hargaSatuan = 500000;
            a1.hitungHargaTotal(1);
            a1.hitungDiskon(0);
            a1.tampilBarang();
            int hargaTotal = a1.hitungHargaBayar(0);
            System.out.println("Harga Akhir = "+hargaTotal);

            Tugas1 a2 = new Tugas1();
            a2.namaBarang = "Headphone";
            a2.hargaSatuan = 350000;
            a2.hitungHargaTotal(2);
            a2.hitungDiskon(0);
            a2.tampilBarang();
            hargaTotal = a2.hitungHargaBayar(0);
             System.out.println("Harga Akhir = "+hargaTotal);
        }
}
