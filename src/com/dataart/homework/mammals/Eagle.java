package com.dataart.homework.mammals;

import com.dataart.homework.listenum.*;
import com.dataart.homework.parentClases.Mammals;

public class Eagle extends Mammals {

    {
        maxWeight = 7;
        needForLife = 100;
        kindAnimal = KindAnimal.MEATEATING;
        whereLive = KindLive.FLYING;
        kindFamily = KindFamily.EAGLE;
    }

    public Eagle(String name, String dateBorn) {
        super(name, dateBorn);
    }

}
