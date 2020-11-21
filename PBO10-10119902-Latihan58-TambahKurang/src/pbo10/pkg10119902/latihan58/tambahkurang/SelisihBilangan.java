/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10.pkg10119902.latihan58.tambahkurang;

/**
 *
 * @author korik
 */
public class SelisihBilangan extends Bilangan{

    public SelisihBilangan(int x, int y) {
        super(x, y);
    }

    public void tampilSelisih(){
        System.out.println("Hasil Selisih 3 - 4 = " + (getX() - getY()));
    }
}
