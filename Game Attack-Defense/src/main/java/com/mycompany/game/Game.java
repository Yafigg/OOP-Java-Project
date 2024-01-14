package com.mycompany.game;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
    
        //objek hero
        Player Hero = new Player();
        Hero.speed = 5;
        Hero.healthPoin = 100;
        Hero.damage = 60;
        Hero.defense = 50;
        //objek enemy
        
        Player Enemy = new Player();
        Enemy.nameM = "Davin";
        Enemy.speedM = 5;
        Enemy.healthPoinM = 100;
        Enemy.damageM = 40;
        Enemy.defenseM = 10;
        
        Hero.run();
        Enemy.runM();
        Hero.attack(Enemy.nameM);
        Enemy.deffends(Enemy.defenseM,Hero.damage,Enemy.healthPoinM);
        if(Enemy.isDead()){
            System.out.println("Game over");
        }
    }
}