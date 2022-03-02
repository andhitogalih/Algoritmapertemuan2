public class Barang {
    String namaBarang, jenisBarang;
    int stok, hargaSatuan;

    void tampilBarang(){  
    System.out.println("Nama Barang = " +namaBarang);
    System.out.println("Jenis Barang = " +jenisBarang);
    System.out.println("Stok = " +stok);
    System.out.println("Harga Satuan = " +hargaSatuan);
    }

    Barang(){
    }
    Barang(String nm, String jn, int st, int hs){
        namaBarang = nm;
        jenisBarang = jn;
        stok = st;
        hargaSatuan = hs;
    }

    void tambahStok(int n){
        stok = stok +n;
    }
    
    void kurangStok(int n){
        stok = stok - n;
    }
    int hitungHargaTotal (int jumlah){
        return jumlah*hargaSatuan;
    }

    public void hitungDiskon(int i) {
    }

    public int hitungHargaBayar(int i) {
        return 0;
    }
}
