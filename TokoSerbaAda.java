package pertemuan.pkg9;

import java.util.Scanner;

public class TokoSerbaAda {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Daftar barang
        String[] kodeBarang = {"A001", "A002", "A003"};
        String[] namaBarang = {"Buku", "Pensil", "Pulpen"};
        int[] hargaBarang = {3000, 2000, 5000};

        // Variabel untuk menyimpan data pembelian
        int jumlahItem, totalBayar = 0;

        System.out.println("TOKO SERBA ADA");
        System.out.println("*********************");

        System.out.print("Masukkan Item Barang: ");
        jumlahItem = input.nextInt();

        String[] kodeBeli = new String[jumlahItem];
        int[] jumlahBeli = new int[jumlahItem];
        int[] jumlahBayar = new int[jumlahItem];

        // Input data barang yang dibeli
        for (int i = 0; i < jumlahItem; i++) {
            System.out.println("Data ke-" + (i + 1));
            System.out.print("Masukkan Kode: ");
            kodeBeli[i] = input.next();
            System.out.print("Masukkan Jumlah Beli: ");
            jumlahBeli[i] = input.nextInt();

            // Menentukan harga dan nama barang berdasarkan kode
            for (int j = 0; j < kodeBarang.length; j++) {
                if (kodeBeli[i].equalsIgnoreCase(kodeBarang[j])) {
                    jumlahBayar[i] = hargaBarang[j] * jumlahBeli[i];
                    totalBayar += jumlahBayar[i];
                    break;
                }
            }
        }

        // Menampilkan hasil
        System.out.println("\nTOKO SERBA ADA");
        System.out.println("***************************************");
        System.out.println("No\tKode Barang\tNama Barang\tHarga\tJumlah Beli\tJumlah Bayar");
        System.out.println("-----------------------------------------------------------");

        for (int i = 0; i < jumlahItem; i++) {
            for (int j = 0; j < kodeBarang.length; j++) {
                if (kodeBeli[i].equalsIgnoreCase(kodeBarang[j])) {
                    System.out.printf("%d\t%s\t\t%s\t\t%d\t%d\t\t%d\n", 
                                      (i + 1), kodeBarang[j], namaBarang[j], hargaBarang[j], jumlahBeli[i], jumlahBayar[i]);
                }
            }
        }

        System.out.println("===========================================================");
        System.out.println("Total Bayar\t\t\t\t\t\t" + totalBayar);
    }
}
