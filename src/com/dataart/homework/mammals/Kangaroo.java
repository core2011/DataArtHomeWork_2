package com.dataart.homework.mammals;

import com.dataart.homework.listenum.*;
import com.dataart.homework.parentClases.Mammals;

public class Kangaroo extends Mammals {

    {
        maxWeight = 85;
        needForLife = 300;
        kindAnimal = KindAnimal.HERBIVORE;
        kindFamily = KindFamily.KANGAROO;

    }

    public Kangaroo(String name, String dateBorn) {
        super(name, dateBorn);
    }

}
