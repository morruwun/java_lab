package com.company;

import building.*;
import defence.*;
import human.*;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int minfood = 300;
        int maxfood = 1000;
        int difffood = maxfood - minfood;
        Random randomfood = new Random();
        int food = randomfood.nextInt(difffood + 1);
        food += minfood;

        Castle castle = new Castle(300, 500, 30);
        Castle.Door door = castle.new Door();
        door.openDoor();

        House houses = new House(20, 20, 3, 60);
        Workshop mason = new Workshop(15, 20, 7, WorkshopType.MASON);
        Citizen citizen = new Citizen(200);

        Government lord1 = new Government(50, "Lord ", "Brown", GovernType.LORD.toString());
        Government lord2 = new Government(50, "Lord ", "Brown", GovernType.LORD.toString());
        lord1.getName();
        lord1.showHuman();
        Servant maid1 = new Servant(40, "Annie White", ServantType.MAID);
        Servant maid2 = new Servant(40, "Annie White", ServantType.MAID);
        Servant nanny = new Servant(55, "Laura Green", ServantType.NANNY);
        String[] nannyName = nanny.getName();
        for (String name : nannyName) {
            System.out.println(name);
        }

        Soldier knight = new Soldier(200, SoldierType.KNIGHT);
        Weapon knightwep = new Weapon(200, WeaponType.SWORD);
        knight.setWeapon(knightwep);

        Alert alert = new Alert(false);
        Wall wall = new Wall(700, 7, 20, 300);
        Weapon wep = new Weapon(150, WeaponType.CATAPULT);

        boolean boo = maid1.equals(maid2);
        System.out.println("not overrided equals(): " + boo);
        boo = lord1.equals(lord2);
        System.out.println("overrided equals(): " + boo);

        castle.setCastle();
        castle.setCastle(300, 500, 30);
    }
}
