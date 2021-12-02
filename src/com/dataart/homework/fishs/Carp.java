package com.dataart.homework.fishs;

import com.dataart.homework.listenum.*;
import com.dataart.homework.parentClases.Fishes;

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


}
