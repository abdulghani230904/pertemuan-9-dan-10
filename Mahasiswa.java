/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan.pkg9;

/**
 *
 * @author Irzi Rhmtllh
 */
public class Mahasiswa {
    private String nim, name, address, mataKuliah;
    double[] nilai = new double[5];
    double nilaiAkhir = 0.0;
    
    public Mahasiswa(String nim, String nama, String alamat, String mataKuliah, double[] nilai) {
        this.nim = nim;
        name = nama;
        address = alamat;
        this.mataKuliah = mataKuliah;
        this.nilai = nilai;
    };
    
    public String getNim() {
        return nim;
    };
    
    public String getName() {
        return name;
    };
    
    public String getAddress() {
        return address;
    };
    
    public String getMataKuliah() {
        return mataKuliah;
    };
    
    public double getNilaiAkhir() {
        return generateNilaiAkhir(nilai);
    };
    
    private double generateNilaiAkhir(double[] nilai) {
        for(int i = 0; i < nilai.length; i++){
            System.out.println(nilai[i]);
            System.out.println(nilaiAkhir);
            if(i == 0 ) {
                nilaiAkhir +=  nilai[i] * 0.10;
            };
            if(i == 1 || i == 3) {
                nilaiAkhir += nilai[i] * 0.15;
            };
            if(i == 2) {
                nilaiAkhir += nilai[i] * 0.25;
            };
            if(i == 4) {
                nilaiAkhir += nilai[i] * 0.35;
            };
        };
        return nilaiAkhir;    
    };
};