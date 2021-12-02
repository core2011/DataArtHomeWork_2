package com.dataart.homework.parentClases;


import com.dataart.homework.interfaces.SkillEat;
import com.dataart.homework.listenum.KindAnimal;
import com.dataart.homework.listenum.KindFamily;
import com.dataart.homework.listenum.KindLive;

import java.time.LocalDate;

import static com.dataart.homework.listenum.KindAnimal.*;

public abstract class Animal implements SkillEat {
    private String name;
    private LocalDate dateBorn;
    public int maxWeight;
    public int needForLife;
    public KindAnimal kindAnimal;
    public KindFamily kindFamily;
    public KindLive whereLive;

    public Animal(String name, String dateBorn) {
        this.name = name;
        this.dateBorn = initDate(dateBorn);
    }

    private LocalDate initDate(String dateBorn) {
        String[] strArr = dateBorn.split("-");
        return LocalDate.of(Integer.parseInt(strArr[2]), Integer.parseInt(strArr[1]), Integer.parseInt(strArr[0]));
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateBorn() {
        return dateBorn;
    }

    public KindLive getWhereLive() {
        return whereLive;
    }

    public void eat(String giveFood) {
        if ((kindAnimal == OMNIVOROUS) ||
                (kindAnimal == MEATEATING && giveFood.equalsIgnoreCase("meat")) ||
                (kindAnimal == HERBIVORE && giveFood.equalsIgnoreCase("grass"))) {
            System.out.println("I am " + getName() + " and I will eat " + giveFood);
        } else {
            System.out.println("I am " + getName() + " and I willn't eat " + giveFood);
        }
    }

    @Override
    public String toString() {
        return "My name is " + name +
                ", date of my born is " + dateBorn +
                ", my max weigth is " + maxWeight +
                ", I need for life " + needForLife + " square meters" +
                ", I am " + kindAnimal +
                ", I am " + whereLive;
    }
}
