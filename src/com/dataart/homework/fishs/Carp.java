package com.dataart.homework.fishs;

import com.dataart.homework.listenum.KindFamily;
import com.dataart.homework.parentClases.Fishes;
import com.dataart.homework.listenum.KindAnimal;

public class Carp extends Fishes {

    {
        maxWeight = 4;
        needForLife = 8;
        kindAnimal = KindAnimal.OMNIVOROUS;
        kindFamily = KindFamily.CARP;
    }

    public Carp(String name, String dateBorn) {
        super(name, dateBorn);
    }


    @Override
    public void eat(String giveFood) {
        super.likeFood(giveFood,kindAnimal);
    }

}
