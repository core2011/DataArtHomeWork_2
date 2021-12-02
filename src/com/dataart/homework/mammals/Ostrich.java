package com.dataart.homework.mammals;

import com.dataart.homework.parentClases.Mammals;

import static com.dataart.homework.listenum.KindAnimal.HERBIVORE;
import static com.dataart.homework.listenum.KindFamily.OSTRICH;

// straus
public class Ostrich extends Mammals {

    {
        maxWeight = 140;
        needForLife = 150;
        kindAnimal = HERBIVORE;
        kindFamily = OSTRICH;
    }

    public Ostrich(String name, String dateBorn) {
        super(name, dateBorn);
    }

}
