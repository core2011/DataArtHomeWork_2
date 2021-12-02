package com.dataart.homework.mammals;

import com.dataart.homework.parentClases.Mammals;

import static com.dataart.homework.listenum.KindAnimal.MEATEATING;
import static com.dataart.homework.listenum.KindFamily.RACCOON;

//enot
public class Raccoon extends Mammals {

    {
        maxWeight = 9;
        needForLife = 50;
        kindAnimal = MEATEATING;
        kindFamily = RACCOON;

    }

    public Raccoon(String name, String dateBorn) {
        super(name, dateBorn);
    }

}
