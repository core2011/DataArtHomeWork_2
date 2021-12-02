package com.dataart.homework.fishs;

import com.dataart.homework.parentClases.Fishes;

import static com.dataart.homework.listenum.KindAnimal.OMNIVOROUS;
import static com.dataart.homework.listenum.KindFamily.CARP;

public class Carp extends Fishes {

    {
        maxWeight = 4;
        needForLife = 8;
        kindAnimal = OMNIVOROUS;
        kindFamily = CARP;
    }

    public Carp(String name, String dateBorn) {
        super(name, dateBorn);
    }


}
