package com.dataart.homework.mammals;

import com.dataart.homework.listenum.*;
import com.dataart.homework.parentClases.Mammals;

// straus
public class Ostrich extends Mammals  {

    {
        maxWeight = 140;
        needForLife = 150;
        kindAnimal = KindAnimal.HERBIVORE;
        kindFamily = KindFamily.OSTRICH;
    }

    public Ostrich(String name, String dateBorn) {
        super(name, dateBorn);
    }

}
