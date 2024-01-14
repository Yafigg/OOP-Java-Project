package com.mycompany.game;

import java.util.Scanner;

public class Player {

    Scanner iU = new Scanner(System.in);

    //atribut
    String name, nameM, namaLu, pilihan;
    int speed, healthPoin, damage, defense, speedM, healthPoinM, damageM, defenseM;

    //method run
    void run() {
        System.out.print("Masukkan Nama Player : ");
        namaLu = iU.nextLine();
        System.out.println(namaLu + " is running...");
        System.out.println("==================================");
        System.out.println("Spesifikasi Player Kamu Adalah : ");
        System.out.println("Speed       : " + speed);
        System.out.println("Health Poin : " + healthPoin);
        System.out.println("Damage      : " + damage);
        System.out.println("Defense     : " + defense);
        System.out.println("==================================");
    }

    void runM() {
        System.out.println("Ada Musuh Didepan mu");
        System.out.println(nameM + " is running...");
        System.out.println("Speed       : " + speedM);
        System.out.println("Health Poin : " + healthPoinM);
        System.out.println("Damage      : " + damageM);
        System.out.println("Defense     : " + defenseM);
    }
    

//method attack dan Defense

    void attack(String nameM) {
        System.out.println("===================================");
        System.out.print("Serang Atau Defense ? (S/D) : ");
        String pilihan = iU.nextLine();

        switch (pilihan) {         
            case "s":
            System.out.println(namaLu + " is attacking " + nameM);
            System.out.println("damage : " + damage);
            break;
            
            case "d":
            System.out.println(nameM + " is deffending...");
            System.out.println("damage reduction : " + defenseM);
            System.out.println("damage masuk : " + (damage - defenseM));
            System.out.println("Sisa Healthpoin : " + (healthPoinM - (damage - defenseM)));
            break;
        }

        

    }
    //method deffends

    void deffends(int shieldM,
            int damage,
            int healthPM
    ) {

    }
    //method isDead

    boolean isDead() {
        if (healthPoinM <= 0) {
            return true;
        }
        return false;
    }
}
