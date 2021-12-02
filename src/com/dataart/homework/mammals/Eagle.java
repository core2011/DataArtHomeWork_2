package com.dataart.homework.mammals;

import com.dataart.homework.parentClases.Mammals;

import static com.dataart.homework.listenum.KindAnimal.MEATEATING;
import static com.dataart.homework.listenum.KindFamily.EAGLE;
import static com.dataart.homework.listenum.KindLive.FLYING;

public class Eagle extends Mammals {

    {
        maxWeight = 7;
        needForLife = 100;
        kindAnimal = MEATEATING;
        whereLive = FLYING;
        kindFamily = EAGLE;
    }

    public Eagle(String name, String dateBorn) {
        super(name, dateBorn);
    }

}
