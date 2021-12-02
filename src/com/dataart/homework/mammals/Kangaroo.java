package com.dataart.homework.mammals;

import com.dataart.homework.parentClases.Mammals;

import static com.dataart.homework.listenum.KindAnimal.HERBIVORE;
import static com.dataart.homework.listenum.KindFamily.KANGAROO;

public class Kangaroo extends Mammals {

    {
        maxWeight = 85;
        needForLife = 300;
        kindAnimal = HERBIVORE;
        kindFamily = KANGAROO;

    }

    public Kangaroo(String name, String dateBorn) {
        super(name, dateBorn);
    }

}
