/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1;

/**
 *
 * @author WINDOWS 10
 */
public class UjiBus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Membuat objek busMini dari kelas Bus
        Bus busMini = new Bus();
        //Memasukan nilai jumlah penumpang dan penumpang maksimal ke
        //dalam objek busMini
        busMini.penumpang = 5;
        busMini.maxPenumpang = 15;
        //Memanggil method cetak pada kelas Bus
        busMini.cetak();
        
        //Menambahkan penumpang pada busMini
        busMini.penumpang = busMini.penumpang + 5;
        //memanggil method cetak pada kelas Bus
        busMini.cetak();
        
        //Mengurangi jumlah penumpang pada busMini
        busMini.penumpang = busMini.penumpang - 2;
        busMini.cetak();
        
        //Menambahkan jumlah penumpang pada busMini
        busMini.penumpang = busMini.penumpang + 8;
        busMini.cetak();
    }
    
}
