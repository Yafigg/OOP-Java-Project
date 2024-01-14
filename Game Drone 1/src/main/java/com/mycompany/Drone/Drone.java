/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.drone;
import java.util.Scanner;
/**
 *
 * @author Yafig
 */
class Drone {
    // atribut
    static int energi = 20;
    static int ketinggian;
    static int kecepatan;
    static String merek;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Drone func = new Drone();

        System.out.println("=== Operasikan drone ini ===");
        while (energi != 0) {
            System.out.println("Energi drone = " + energi);
            System.out.println("1. Terbang" +
            "\n2. Matikan Mesin" +
            "\n3. Turun" +
            "\n4. Belok" +
            "\n5. Maju" +
            "\n6. Mundur");
            System.out.print("Pilihan : ");
            int  pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    func.terbang();
                    break;
            
                case 2:
                    func.matikanMesin();
                    break;

                case 3:
                    func.turun();
                    break;

                case 4:
                    func.belok();
                    break;

                case 5:
                    func.maju();
                    break;

                case 6:
                    func.mundur();
                    break;
                
                default:
                    break;
            }
            if (energi == 0) {
                System.out.println("Drone kehabisan energi, drone jatuh");
                return;
            }
        }

        System.out.print("Energi drone habis");

    }

    // method
    void terbang(){
        energi--;
        if(energi > 10){
            // terbang berarti nilai ketinggian bertambah
            ketinggian++;
            System.out.println("Dorne terbang...");
        } else {
            System.out.println("Energi lemah: Drone nggak bisa terbang");
        }
    }

    void matikanMesin(){
        if(ketinggian > 0){
            System.out.println("Mesin tidak bisa dimatikan karena sedang terbang");
        } else {
            System.out.println("Mesin dimatikan...");
        }
    }

    void turun(){
        // ketinggian berkurang, karena turun
        if (ketinggian == 0) {
            System.out.println("Drone sudah di tanah");
            return;
        }
        ketinggian--;
        energi--;
        System.out.println("Drone turun");
    }

    void belok(){
        energi--;
        System.out.println("Drone belok");
        // belok ke mana? perlu dicek :)
    }

    void maju(){
        energi--;
        System.out.println("Drone maju ke depan");
        kecepatan++;
    }

    void mundur(){
        energi--;
        System.out.println("Drone mundur");
        kecepatan++;
    }
}
