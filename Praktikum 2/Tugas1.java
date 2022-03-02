public class Tugas1 {
    String namaBarang;
    int hargaSatuan, hargaTotal, diskon;

    void tampilBarang(){  
        System.out.println("==============================");
        System.out.println("Nama Barang = " +namaBarang);
        System.out.println("Harga Satuan = " +hargaSatuan);
        System.out.println("Diskon = " +diskon);

        }

    int hitungHargaTotal(int jumlah){
        hargaTotal = jumlah*hargaSatuan;
        return hargaTotal; 
    }

    int hitungDiskon(int n){
        if(hargaTotal>100000){
            diskon = hargaTotal * 10/100;
            return diskon;
        }else if(hargaTotal>=50000 && hargaTotal<=100000){
            diskon = hargaTotal * 5/100;
            return diskon;
        }else if(hargaTotal <50000){
            diskon=0;
        }
        return diskon;
    }

    int hitungHargaBayar(int Bayar){
        Bayar =  hargaTotal - (int) diskon;
        return Bayar;
    }
}


