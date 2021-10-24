/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekly2;

import java.util.Scanner;

/**
 *
 * @author Wawan Indrawan
 */
public class Weekly2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double luas, r, phi = 3.14;
        System.out.print("Masukan Nilai jari jari = ");
        r = input.nextDouble();
        luas = phi * r * r;
        System.out.println("Luas Lingkaran = " +luas);
    }
    
}
