package com.dataart.homework.fishs;

import com.dataart.homework.listenum.*;
import com.dataart.homework.parentClases.Fishes;

//тарань
public class Ram extends Fishes {

    {
        maxWeight = 2;
        needForLife = 5;
        kindAnimal = KindAnimal.MEATEATING;
        kindFamily = KindFamily.RAM;
    }

    public Ram(String name, String dateBorn) {
        super(name, dateBorn);
    }



}
