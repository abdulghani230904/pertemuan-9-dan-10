/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan.pkg9;

import java.util.ArrayList;

/**
 *
 * @author Irzi Rhmtllh
 */
public class InputDataMhs {
    ArrayList<Mahasiswa> listMahasiswa;

    public InputDataMhs() {
        listMahasiswa = new ArrayList();
    };
    
    public void insertData(String nim, String name, String address, String mataKuliah, double[] arrNilai) {
        Mahasiswa newMhs = new Mahasiswa(nim, name, name, mataKuliah, arrNilai);
        listMahasiswa.add(newMhs);
    };
    
    public void deleteData(int idx) {  
      listMahasiswa.remove(idx);
    };
    
    public ArrayList<Mahasiswa> getAllData() {
        return listMahasiswa;
    };
}
