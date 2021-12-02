package com.dataart.homework.mammals;

import com.dataart.homework.listenum.*;
import com.dataart.homework.parentClases.Mammals;

public class Lynx extends Mammals {

    {
        maxWeight = 30;
        needForLife = 200;
        kindAnimal = KindAnimal.MEATEATING;
        kindFamily = KindFamily.LYNX;

    }

    public Lynx(String name, String dateBorn) {
        super(name, dateBorn);
    }

}
