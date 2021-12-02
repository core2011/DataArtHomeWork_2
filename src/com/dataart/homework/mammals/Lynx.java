package com.dataart.homework.mammals;

import com.dataart.homework.parentClases.Mammals;

import static com.dataart.homework.listenum.KindAnimal.MEATEATING;
import static com.dataart.homework.listenum.KindFamily.LYNX;

public class Lynx extends Mammals {

    {
        maxWeight = 30;
        needForLife = 200;
        kindAnimal = MEATEATING;
        kindFamily = LYNX;

    }

    public Lynx(String name, String dateBorn) {
        super(name, dateBorn);
    }

}
